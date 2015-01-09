

public class King extends Piece
{
  
    public King(int x, int y, int z, Tribe t )
    {
        t_type = Piece.Token_Type.King;
        coordinates.set_Coordinates(x,y,z);
        color = t;
        coordinateArray = new CoordinateArray(26,1);
        update_Empty_Board_Reachable(coordinates);
    }
    
    //this is a stub
    public boolean Is_Valid_Move(Coordinates c)
    {
        
        return true;
    }
    
    public boolean is_Way_Piece_Captures(Coordinates c)   //will be changed to fit  this piece
    {return true;}
    public boolean is_Way_Piece_Moves(Coordinates c)     //will be changed to fit  this piece
    {return true;} 
    
  public void update_Empty_Board_Reachable(Coordinates c)
  {
      int i = 0;
      
      Outer_Loop: while (i<26)
      {
          for(int x=-1; x<2; x++)
          {
              for(int y=-1; y<2 ;y++)
              {
                  for(int z=-1; z<2; z++)
                  {
                      if (i > 25) { break Outer_Loop;}
                      if((x != 0 || y != 0 )|| (0 != z))
                      {
                        coordinateArray.set_Coordinates(i,0, coordinates.getX()+x, coordinates.getY()+y, coordinates.getZ()+z);
                        i++;
                      }
                      
                    }
                }
          }
      
    }
    
}


     public CoordinateArray empty_Board_Reachable_Squares()      
    {
        return coordinateArray;
    }
    
}