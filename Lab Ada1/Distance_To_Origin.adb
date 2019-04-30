WITH Ada.Text_IO;
WITH Ada.Float_Text_IO;
WITH Ada.Numerics.Elementary_Functions;
USE  Ada.Numerics.Elementary_Functions;

PROCEDURE Distance_to_Origin IS
	TYPE Point IS RECORD
		X : Float;
		Y : Float;
	END RECORD;

	Point1 : Point;
	Distance : Float;
	
	BEGIN
		Ada.Text_IO.Put(Item => "Enter X Coordinate >");
		Ada.Float_Text_IO.Get(Item => Point1.X);
		Ada.Text_IO.Put(Item => "Enter Y Coordinate >");
		Ada.Float_Text_IO.Get(Item => Point1.Y);
		Distance := Sqrt(Point1.X ** 2 + Point1.Y ** 2);
		Ada.Text_IO.Put(Item => "Distance to the origin is ");
		Ada.Float_Text_IO.Put(Item => Distance, Fore=>1, Aft=>2,Exp=>0);
		Ada.Text_IO.New_Line;
	END Distance_to_Origin;
