.model small
INCLUDE pcmac.inc
.stack 100h
.data
    p0 db "CECS 524 Function Solver",13,10,"$"
    p1 db "1. Fibonacci",13,10,"2. Ackerman",13,10,"0. Quit",13,10,"Enter choice:","$"
    p2 db "Enter n:","$"
    p3 db "Fib(","$"
    p4 db ")=","$"
    p5 db "Enter x:","$"
    p6 db "Enter y:","$"
    p7 db "Ack(","$"
    p8 db ")=","$"
    
    
    M32768  db  '-32768$'
.code
    main proc
        mov ax, @data
        mov ds, ax
        push bp ;save base pointer
        mov bp,sp ;setup local stackframe
        
        call input
        
        mov sp, bp ;Destroy local variable
        pop bp; reset base pointer
        sExit 0
    main endp
    
    
    input proc
        push bp ;save base pointer
        mov bp, sp ;setup stack frame
        sub sp, 4 ; allocate two slot for local variables
     
        
    prompts:
        sPutStr p1
        call getDec
        
    opt1:   
        cmp ax, 1
        jne opt2
        
        sPutStr p2 ;prompt for input
        call getDec
        mov word ptr[bp-2], ax ; save to first local variable
        
        push word ptr[bp-2] ; a single parameter
        mov ax, 0   ; set ax to 0 because it will be use to accumulate result
        call fibonacci ; call fibonacci function
        
        push ax ; save return value onto the stack
        
        sPutStr p3 ;print prompts
        mov ax, word ptr[bp-2]
        call putDec
        sPutStr p4
        
        pop ax ; restore return value back to ax
        call putDec ;print return value
        sPutCh 10
        jmp prompts
        
    opt2:   
        cmp ax, 2
        jne opt3
        
        sPutStr p5
        call getDec
        mov word ptr[bp-2], ax ; save to first local variable.
        
        sPutStr p6
        call getDec
        mov word ptr[bp-4],ax ;save to second local variable.
        
        push word ptr[bp-2] ; first parameter
        push word ptr[bp-4] ; second parameter
        mov ax, 0 ;set return register to 0
        call ackerman
        
        jmp prompts
    opt3:   
        cmp ax, 0
        jne prompts
        
        
        mov sp, bp ;Destroy local variables
        pop bp ;Restore base pointer
        ret 0 ; return and clear 0 bytes
    input endp
    
    
    ackerman proc
        push bp ; save base pointer
        mov bp, sp; set bp to sp
        
        mov cx, word ptr [bp+6] ; save first parameter to cx
        mov dx, word ptr [bp+4] ; save second parameter to dx
    
    ackerman endp
    
    
    fibonacci proc
        push bp ; save base pointer
        mov bp,sp ; set bp to sp
        
        mov dx, word ptr[bp+4] ; move a single pass in parameter to dx 
        
        cmp dx, 0   ; 1st base case when n == 0
        je done10
        
        cmp dx, 1   ; 2nd base case when n == 1
        je done20
        
        mov dx, word ptr[bp+4] ; first recursive call
        sub dx, 1
        push dx
        call fibonacci
        
        mov dx, word ptr[bp+4] ; second recursive call 
        sub dx, 2
        push dx
        call fibonacci
        
        
    done10: 
        add ax, 0
        mov sp, bp
        pop bp
        ret 2
    done20:
        add ax,1
        mov sp, bp
        pop bp
        ret 2
        
    fibonacci endp
    
    
    
    
    
    
    
    
    
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



