.model small
INCLUDE pcmac.inc
.stack 100h
.data
    p0 db "This program adds a sequence of integers from n to 1",13,10,"$"
    p1 db "Enter a number: ","$"
    p2 db "Sum is ","$"
    
    M32768  db  '-32768$'
.code
    main proc
        mov ax, @data
        mov ds, ax
        push bp
        mov bp,sp
        sub sp,2
        
        sPutStr p0
        sPutStr p1
        mov cx,0
        call getDec
        mov word ptr[bp-2], ax
        push ax
        
        call recadd
        
        sPutCh 10
        mov ax, cx
        sPutStr p2
        call putDec
        sPutCh 10
        
        sExit 0
    main endp
    
    
    recadd proc
        push bp
        mov bp,sp
        mov ax, word ptr [bp+4]
        
        add cx, word ptr [bp+4]


        cmp ax, 0
        je done1
        dec ax
        push ax
        call recadd
        
  
        done1:  
                pop bp
                ret 2
    recadd endp
    
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



