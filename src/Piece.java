
import java.util.ArrayList;
public abstract class Piece {

public enum Tribe  {Black, White};
public enum Token_Type {King, Queen, Rook, Bishop, Griffon, Knight, Pawn}
public enum Specific_Piece {Black_King, White_King, White_Queen, Black_Queen, White_Rook_A, White_Rook_B,
Black_Rook_A, Black_Rook_B, White_Bishop_A, White_Bishop_B, Black_Bishop_A, Black_Bishop_B, White_Griffon_A, White_Griffon_B, Black_Griffon_A, Black_Griffon_B,
White_Knight_A, White_Knight_B, Black_Knight_A, Black_Knight_B,  wp0, wp1 ,wp2, wp3, wp4, wp5, wp6, wp7, wp8, wp9, bp0, bp1, bp2, bp3, bp4, bp5, bp6, bp7, bp8,
bp9}

Coordinates coordinates; 
protected Tribe color;
protected CoordinateArray coordinateArray;
protected Token_Type t_type; 
protected Specific_Piece identifierr;

public Specific_Piece get_Specific_Piece() {return identifierr;}
public void set_Specific_Piece(Specific_Piece x) {identifierr = x;}


public Piece()
{
coordinates = new Coordinates(-9,0,0);
}
public String toString()
{
    return ""+identifierr;
}

public Token_Type get_Type() {return t_type;}


public Coordinates get_Coordinates()
{ return coordinates;}
public void set_Coordinates(Coordinates c)
{ coordinates = c;}
public void set_Coordinates(int x, int y, int z)
{ coordinates.setX(x);  coordinates.setY(y); coordinates.setZ(z);}

public Tribe get_Tribe()
{ return color;}
public void set_Tribe(Tribe c)
{ color = c;}  
     
     
 abstract public boolean is_Way_Piece_Captures(Coordinates c);
 abstract public boolean is_Way_Piece_Moves(Coordinates c);  
 
 public boolean is_Way_Piece_Captures(int x, int y, int z)
{
    Coordinates c = new Coordinates(x,y,z);
    return is_Way_Piece_Captures(c);
}

public boolean is_Way_Piece_Moves(int x, int y, int z)
{
    Coordinates c = new Coordinates(x,y,z);
    return is_Way_Piece_Moves(c);
}

 abstract public CoordinateArray empty_Board_Reachable_Squares();
 abstract public void update_Empty_Board_Reachable(Coordinates c);



}