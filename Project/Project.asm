;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;@author:Sotheanith Sok                                                                                 ;
;@school: CSULB                                                                                         ;
;@class: CECS-524                                                                                       ;
;@instructor:  Michael A. Hoffman, Ph.D                                                                 ;
;@description:  The first project for CECS-524. The goal is the write recursive functions to calculate  ;
;               Fibonacci number and Ackerman function                                                 ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
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
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ;;                             ;;
    ;;Starting point of the program;;
    ;;                             ;;
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    main proc
        mov ax, @data           ;move data segment to ax
        mov ds, ax              ;move ax to ds
        
        push bp                 ;save base pointer
        mov bp,sp               ;setup local stack frame
        
        call input              ;call input procedure
        
        mov sp, bp              ;destroy local variables
        pop bp                  ;restore base pointer
        sExit 0                 ;exit the program
    main endp
    
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ;;                                                                                             ;;
    ;;Input Procedure: Get users' input, call Fibonacci or Ackerman function, and print out result;;
    ;;                                                                                             ;;
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    input proc
        push bp                 ;save base pointer
        mov bp, sp              ;setup stack frame
        
        sub sp, 4               ;allocate two slot for local variables
        
    prompts:                    ;Prompts: Menu
        sPutStr p1              ;print first prompt
        call getDec             ;get input
        
    opt1:                       ;Option 1: Fibonacci 
    
        cmp ax, 1               ;check if user enters 1
        jne opt2                ;if not, jump to option2
        
        sPutStr p2              ;print second prompt
        call getDec             ;get user's input and save it to ax
        mov word ptr[bp-2], ax  ;move ax to the first local variable slot
        
        push word ptr[bp-2]     ;save the first local variable onto stack (Pass by value)
        mov ax, 0               ;set ax to 0 because it will be used as a return register
        call fibonacci          ;call Fibonacci function
        
        push ax                 ;save return value in ax onto the stack
        sPutStr p3              ;print third prompt
        mov ax, word ptr[bp-2]  ;move the first local variable to ax
        call putDec             ;print number in ax
        sPutStr p4              ;print fourth prompt
        pop ax                  ;restore return value back to ax
        call putDec             ;print return value
        sPutCh 10               ;move to the next-line
        jmp prompts             ;jump back to prompts
        
    opt2:                       ;Option 2: Ackerman 
    
        cmp ax, 2               ;check if user enters 2
        jne opt3                ;if not, jump to option 3
        
        sPutStr p5              ;print fifth prompt
        call getDec             ;get user's input and save it into ax
        mov word ptr[bp-2], ax  ;move ax into the first local variable slot
        sPutStr p6              ;print sixth prompt
        call getDec             ;get user's input and save it into ax
        mov word ptr[bp-4],ax   ;move ax to the second local variable slot
        
        push word ptr[bp-2]     ;save the first local variable onto the stack (Pass by value)
        push word ptr[bp-4]     ;save the second local variable onto the stack (Pass by value)
        mov ax, 0               ;set ax to 0 because it will be used as a return register
        call ackerman           ;call Ackerman function
        
        push ax                 ;save the return value onto the stack
        sPutStr p7              ;print seventh prompt
        mov ax, word ptr [bp-2] ;move the first local variable to ax
        call putDec             ;print the first local variable
        sPutCh ","              ;print comma
        mov ax, word ptr [bp-4] ;move the second local variable to ax
        call putDec             ;print the second local variable
        sPutStr p8              ;print eighth prompt
        pop ax                  ;restore the return value onto ax
        call putDec             ;print the return value
        sPutCh 10               ;move to the next-line
        jmp prompts             ;jump back to prompts
        
    opt3:                       ;Option 3: Exit
    
        cmp ax, 0               ;check if user enters 0
        je done40               ;if equal, jump to done40    
        jmp prompts             ;else, jump to prompts
        
    done40:                     ;Done40: Ready to exit this stack-frame
        mov sp, bp              ;destroy local variables
        pop bp                  ;restore base pointer
        ret 0                   ;return and clear 0 bytes (We didn't pass into any variable)
    input endp
    
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ;;                                                                                             ;;
    ;;Ackerman Function: Take in two inputs and return ackerman result resulted from the two inputs;;
    ;;                                                                                             ;;
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ackerman proc
        push bp                 ;save base pointer
        mov bp, sp              ;setup stack-frame
        
        mov cx, word ptr [bp+6] ;move first parameter to cx
        mov dx, word ptr [bp+4] ;move second parameter to dx
        
        cmp cx, 0               ;check if the first parameter is 0
        je case1                ;if true, jump to case1
        
        cmp dx, 0               ;check if the second parameter is 0
        je case2                ;if true jump to case 2
        
        mov cx, word ptr [bp+6] ;move first parameter to cx
        mov dx, word ptr [bp+4] ;move second parameter to dx
        dec dx                  ;decrement the second parameter by one
        push cx                 ;save the first parameter onto the stack
        push dx                 ;save the second parameter onto the stack
        call ackerman           ;call Ackerman function
        
        mov cx, word ptr [bp+6] ;move first parameter to cx
        mov dx, word ptr [bp+4] ;move second parameter to dx
        dec cx                  ;decrement the first parameter by one
        push cx                 ;save the first parameter onto the stack
        push ax                 ;save the return value onto the stack
        call ackerman           ;call Ackerman function
        jmp done30              ;jump to done30
        
    case1:                      ;Case 1: the first parameter is 0
        add dx, 1               ;increment the second parameter by one
        mov ax, dx              ;save the second parameter into return register
        jmp done30              ;jump done30
        
    case2:                      ;Case 2: the first parameter is not equal 0 and the second parameter is 0
        dec cx                  ;decrement the first parameter by one 
        push cx                 ;save the first parameter onto the stack
        push 1                  ;save one onto the stack
        call ackerman           ;call Ackerman function
        
    done30:                     ;Done30: Ready to exit this stack-frame 
        mov sp, bp              ;destroy local variables
        pop bp                  ;restore base pointer
        ret 4                   ;return and clear 4 bytes (2 parameters)
    ackerman endp
    
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ;;                                                                    ;;
    ;;Fibonacci Function: Take in an input,n, and return the nth Fibonacci;;
    ;;                                                                    ;;
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    fibonacci proc
        push bp                 ;save base pointer
        mov bp,sp               ;setup stack-frame
        
        mov dx, word ptr[bp+4]  ;move the first parameter to dx 
        
        cmp dx, 0               ;check if the first parameter is 0
        je done10               ;if true, jump to done10
        
        cmp dx, 1               ;check if the second parameter is 1
        je done20               ;if true, jump to done20
        
        mov dx, word ptr[bp+4]  ;move the first parameter to dx
        sub dx, 1               ;decrement the first parameter by 1
        push dx                 ;save the first parameter onto the stack
        call fibonacci          ;call Fibonacci function
        
        mov dx, word ptr[bp+4]  ;move the first parameter to dx 
        sub dx, 2               ;decrement the first parameter by 2
        push dx                 ;save the first parameter onto the stack
        call fibonacci          ;call Fibonacci function
        
    done10:                     ;Done10: The first base-case
        add ax, 0               ;add 0 onto the return register
        mov sp, bp              ;destroy local variables
        pop bp                  ;restore base pointer
        ret 2                   ;return and clear 2 bytes (1 parameter)
        
    done20:                     ;Done20: The second base-case
        add ax,1                ;add 1 onto the return register
        mov sp, bp              ;destroy local variables
        pop bp                  ;restore base pointer
        ret 2                   ;return and clear 2 byte (1 parameter)
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



