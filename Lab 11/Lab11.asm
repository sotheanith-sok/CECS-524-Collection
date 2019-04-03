.model small
INCLUDE pcmac.inc
.stack 100h
.data
    prompt0 db "CECS 524 Pay Calculator.",13,10,"$"
    prompt1 db "Enter hours worked:$"
    prompt2 db "Enter rate of pay:$"
    prompt3 db "Enter insurance deduction:$"
    prompt4 db "Gross pay:","$"
    prompt5 db "Tax:$"
    prompt6 db "Insurance:$"
    prompt7 db "Net pay: $"
    
    hours dw ?
    rateOfPay dw ?
    deduction dw ?
    grossPay dw ?
    tax dw ?
    netPay dw ?
    
    M32768  db  '-32768$'
.code
    main proc
        mov ax, @data
        mov ds, ax
        
        sPutStr prompt0
        
        sPutStr prompt1
        call getDec
        mov hours, ax
        
        sPutStr prompt2
        call getDec
        mov rateOfPay, ax
        
        sPutStr prompt3
        call getDec
        mov deduction, ax
        
        
        call calculateGrossPay
        call calculateTax
        call calculateNetPay
        
        sPutStr prompt4
        mov ax, grossPay
        call putDec
        
        sPutCh 13,10
        
        sPutStr prompt5
        mov ax, tax
        call putDec
        
        sPutCh 13,10
        
        sPutStr prompt6
        mov ax, deduction
        call putDec
        
        sPutCh 13,10
        
        sPutStr prompt7
        mov ax, netPay
        call putDec
        
        sExit 0
    main endp
    
    CalculateGrossPay PROC
        mov ax, hours
        mul rateOfPay
        mov grossPay, ax
        ret
    CalculateGrossPay ENDP
        
    CalculateTax PROC
        mov ax, grossPay
        mov bx,12
        
        mul bx
        mov tax,ax
        
        cwd
        mov bx, 100
        idiv bx
        
        mov tax, ax
        ret
    CalculateTax ENDP
    
    CalculateNetPay PROC
        mov bx, grossPay
        sub bx, tax
        sub bx, deduction
        mov netPay,bx
        ret
    CalculateNetPay ENDP
    
    PutDec  PROC
        push    ax
        push    bx
        push    cx
        push    dx
        cmp ax, -32768 ;    -32768 is a special case as there
        jne TryNeg ;      is no representation of +32768
        _PutStr M32768
        jmp Done
    TryNeg:
        cmp ax, 0 ;     If number is negative ...
        jge NotNeg
        mov bx, ax ;      save from it from _PutCh
        neg bx ;          make it positive and...
        _PutCh  '-' ;         display a '-' character
        mov ax, bx ;    To prepare for PushDigs
    NotNeg:
        mov cx, 0 ;     Initialize digit count
        mov bx, 10 ;    Base of displayed number
    PushDigs:
        sub dx, dx ;    Convert ax to unsigned double-word
        div bx
        add dl, '0' ;   Compute the Ascii digit...
        push    dx ;        ...push it (can push words only)...
        inc cx ;        ...and count it
        cmp ax, 0   ;   Don't display leading zeroes
        jne PushDigs
    ;
    PopDigs:    ;       Loop to display the digits
        pop dx ;          (in reverse of the order computed)
        _PutCh  dl
        loop    PopDigs
    Done:
        pop dx ;    Restore registers
        pop cx
        pop bx
        pop ax
        ret
    PutDec  ENDP
        .DATA
    Sign    DB  ?
        .CODE
        
    GetDec  PROC
        push    bx ;        Don't need to save ax, but bx, cx, ...
        push    cx ;        ...dx must be saved and restored
        push    dx
        mov bx, 0 ;     accumulated NumberValue in bx := 0
        mov cx, 10
        mov Sign, '+' ; Guess that sign will be '+'
        _GetCh  ;       Read character ==> al
        cmp al, '-' ;   Is first character a minus sign?
        jne AfterRead
        mov Sign, '-' ;   yes
    ReadLoop:
        _GetCh
    AfterRead:
        cmp al, '0' ;   Is character a digit?
        jl  Done2 ;        No
        cmp al, '9'
        jg  Done2 ;        No
        sub al, '0' ;     Yes, cvt to DigitValue and extend to a
        mov ah, 0 ;        word (so we can add it to NumberValue)
        xchg    ax, bx ;    Save DigitValue
            ;          and set up NumberValue for mul
        mul cx ;        NumberValue * 10 ...
        add ax, bx ;      + DigitValue ...
        mov bx, ax ;      ==> NumberValue
        jmp ReadLoop
        Done2:
        cmp al, 13 ;    If last character read was a RETURN...
        jne NoLF
        _PutCh 10 ;     ...echo a matching line feed
    NoLF:
        cmp Sign, '-'
        jne Positive
        neg bx ;        Final result is in bx
    Positive:
        mov ax, bx ;    Returned value --> ax
        pop dx ;        restore registers
        pop cx
        pop bx
        ret
    GetDec  ENDP
    
end main



