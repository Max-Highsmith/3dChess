
public class Pawn extends Piece
{
  
    public Pawn(Coordinates c, Tribe t )
    {
        t_type = Piece.Token_Type.Pawn;
        coordinates = c;
        color = t;
        coordinateArray = new CoordinateArray(4,1);
       update_Empty_Board_Reachable(coordinates); // checks where piece could go
    }
    
    public Pawn(int x, int y, int z, Tribe t)
    {
        t_type = Piece.Token_Type.Pawn;
        coordinates = new Coordinates(x,y,z);
        color = t;
        coordinateArray = new CoordinateArray(4,1);
        update_Empty_Board_Reachable(coordinates); 
    }
    
public boolean is_Way_Piece_Moves(int x, int y, int z)
{
    Coordinates c = new Coordinates(x,y,z);
    return is_Way_Piece_Moves(c);
}
    
   public boolean is_Way_Piece_Moves(Coordinates c)
   {
       if (Piece.Tribe.White == color)
       {
            if(      (    (c.getZ() == coordinates.getZ()+1)   ||   (c.getY() == coordinates.getY()+1))   &&  (c.getX() == coordinates.getX()))  // checks if moving up or forward
            { 
              if(   (c.getZ() == coordinates.getZ())   ||   (c.getY() == coordinates.getY() )  )  //ensure not doing both
                {
                 return true;
                }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }
    else                // if color = black
    {
        
        if(((c.getZ() == coordinates.getZ()-1)||(c.getY() == coordinates.getY()-1))&&(c.getX() == coordinates.getX()))  // checks if moving down or backward
            { 
        	   if(   (c.getZ() == coordinates.getZ())   ||   (c.getY() == coordinates.getY() )  )  //ensure not doing both
                {
                 return true;
                }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
        
        
}
    


    public boolean is_Way_Piece_Captures(Coordinates c)
    {
        if(Piece.Tribe.White == color)
        {
        
                if(((c.getZ()== coordinates.getZ()+1)||(c.getY() == coordinates.getY()+1)) &&  // gurantess moving up or forward
                ((c.getX()== coordinates.getX()+1)||c.getX()== coordinates.getX()-1)&&  // checks that it goes to side
                (!(coordinates.getZ() - c.getZ()  == coordinates.getY() - c.getY())))    // ensures not moving both direction
                {
                    return true; 
                }
                
        else
        {
            return false;
        }
    }
        
        else {
              if(((c.getZ()== coordinates.getZ()-1)||(c.getY() == coordinates.getY()-1)) &&  // gurantess moving up or forward
              ((c.getX()== coordinates.getX()-1)||c.getX()== coordinates.getX()+1)&&  // checks that it goes to side
              (!(coordinates.getZ() - c.getZ()  == coordinates.getY() - c.getY())))    // ensures not moving both direction
              {
                  return true; 
           
              }
              else
              {
                  return false;
              }
    }
    }
  
    
    
  public void update_Empty_Board_Reachable(Coordinates c)  // shows where pawns could kill, not where can move
  {
      int increase;   //  describes direction of pawn attack
      if( color == Piece.Tribe.White){
      increase = 1;}
      else
      increase = -1;
      coordinateArray.set_Coordinates(0,0,coordinates.getX()+1, coordinates.getY()+ increase, coordinates.getZ());
      coordinateArray.set_Coordinates(1,0,coordinates.getX()-1, coordinates.getY()+ increase, coordinates.getZ());
      coordinateArray.set_Coordinates(2,0,coordinates.getX()+1, coordinates.getY(), coordinates.getZ() + increase);
      coordinateArray.set_Coordinates(3,0,coordinates.getX()-1, coordinates.getY(), coordinates.getZ() + increase);
    }
    
    
    
    
    
     public CoordinateArray empty_Board_Reachable_Squares()      
    {
        return coordinateArray;
    }
    
    
}

