WITH Ada.Text_IO;
WITH Ada.Float_Text_IO;
WITH Ada.Numerics.Elementary_Functions;
USE  Ada.Numerics.Elementary_Functions;

PROCEDURE Distance_between_Points IS
	TYPE Point IS RECORD
		X : Float;
		Y : Float;
	END RECORD;

	Point1 : Point;
    Point2 : Point;
	Distance : Float;
	
	BEGIN
		Ada.Text_IO.Put(Item => "Enter X Coordinate for Point 1 >");
		Ada.Float_Text_IO.Get(Item => Point1.X);
		Ada.Text_IO.Put(Item => "Enter Y Coordinate for Point 1 >");
		Ada.Float_Text_IO.Get(Item => Point1.Y);
        Ada.Text_IO.Put(Item => "Enter X Coordinate for Point 2 >");
		Ada.Float_Text_IO.Get(Item => Point2.X);
		Ada.Text_IO.Put(Item => "Enter Y Coordinate for Point 2 >");
		Ada.Float_Text_IO.Get(Item => Point2.Y);
		Distance := Sqrt((Point1.X-Point2.X) ** 2 + (Point1.Y-Point2.Y) ** 2);
		Ada.Text_IO.Put(Item => "The distance between the points is ");
		Ada.Float_Text_IO.Put(Item => Distance, Fore=>1, Aft=>2,Exp=>0);
		Ada.Text_IO.New_Line;
	END Distance_between_Points;
