WITH Lines;
USE Lines;
WITH Ada.Text_IO;
WITH Ada.Float_Text_IO;

PROCEDURE CalcLine IS
   MyLine : Line;
BEGIN
   Ada.Text_IO.Put("Setting the line's points..."); 
   Ada.Text_IO.New_Line;
   SetLine(1.0, 2.0,3.0,4.0, MyLine);
   Ada.Text_IO.Put("The line is ... "); 
   PrintLine(MyLine);
   Ada.Text_IO.New_Line;
   Ada.Text_IO.Put("The distance of this line is ");
   Ada.Float_Text_IO.Put(Distance(MyLine), AFT=>4, EXP=>0);
   Ada.Text_IO.New_Line;
   Ada.Text_IO.Put("The slope of this line is ");
   Ada.Float_Text_IO.Put(Slope(MyLine), AFT=>4, EXP=>0);
   Ada.Text_IO.New_Line;
end CalcLine;
