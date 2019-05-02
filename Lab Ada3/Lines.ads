PACKAGE Lines is
    TYPE Point IS PRIVATE;
    TYPE Line IS PRIVATE;

    FUNCTION Distance(L1 : in Line) RETURN Float;
    FUNCTION Slope(L1 : in Line) RETURN Float;
    PROCEDURE SetLine( X1, Y1, X2, Y2 : Float; L : out Line);
    PROCEDURE PrintLine(L : Line);
    PROCEDURE PrintPoint( P : Point);
    PRIVATE
    TYPE Point is RECORD
        X, Y : Float;
    END RECORD;

    TYPE Line is RECORD
        P1, P2 : Point;
    END RECORD;
END Lines;
