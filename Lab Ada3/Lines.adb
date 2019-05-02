WITH Ada.Float_Text_IO;
WITH Ada.Text_IO;
WITH Ada.Numerics.Elementary_Functions;
Use Ada.Numerics.Elementary_Functions;
PACKAGE BODY Lines IS

    --Distance of a line
    FUNCTION Distance (L1: in Line) RETURN Float IS
    BEGIN 
        RETURN Sqrt((L1.P1.X-L1.P2.X) ** 2 + (L1.P1.Y-L1.P2.Y) ** 2);
    END Distance;

    --Slope of a line
    FUNCTION Slope (L1: in Line) RETURN Float IS
    BEGIN
        RETURN ((L1.P2.Y-L1.P1.Y)/(L1.P2.X-L1.P1.X));
    END Slope;

    --Update values in the line
    PROCEDURE setLine(X1, Y1, X2, Y2 :Float; L : out Line) IS
    BEGIN
        L.P1.X:=X1;
        L.P1.Y:=Y1;
        L.P2.X:=X2;
        L.P2.Y:=Y2;
    END setLine;

    --Print line
    PROCEDURE PrintLine ( L:Line) IS
    BEGIN
        Ada.Text_IO.Put(Item => "(");
        PrintPoint(L.P1);
        Ada.Text_IO.Put(Item => ",");
        PrintPoint(L.P2);
        Ada.Text_IO.Put(Item => ")");
    END PrintLine;

    --Print points
    PROCEDURE PrintPoint( P: Point) IS
    BEGIN
        Ada.Text_IO.Put(Item => "(");
        Ada.Float_Text_IO.Put(Item => P.X, Fore=>1, Aft=>2,Exp=>0);
        Ada.Text_IO.Put(Item => ",");
        Ada.Float_Text_IO.Put(Item => P.Y, Fore=>1, Aft=>2,Exp=>0);
        Ada.Text_IO.Put(Item => ")");
    END PrintPoint;

END Lines;