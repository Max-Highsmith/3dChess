

public class Rook extends Piece
{
  
    public Rook(int x, int y, int z, Tribe t )
    {
        t_type = Piece.Token_Type.Rook;
        coordinates.set_Coordinates(x,y,z);
        color = t;
        coordinateArray = new CoordinateArray(6,4);
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
  {  int d =0;   
      Outer_Loop: while (d<6)
      {
          for(int x=-1; x<2; x++)
          {
              for(int y=-1; y<2 ;y++)
              {
                  for(int z=-1; z<2; z++)
                  {
                      if (d > 6) { break Outer_Loop;}
                      if(Math.abs(x)+Math.abs(y)+Math.abs(z) ==1 )         // gurantees only 2d moves pass
                      {
                           for(int i=0; i<4; i++)                          // loop follows path for 4 steps
                           {
                               coordinateArray.set_Coordinates(d,i, 
                               coordinates.getX() + ((i+1)* (x)),
                               coordinates.getY() + ((i+1)* (y)),
                               coordinates.getZ() + ((i+1)* (z)));
                               
                            }

                       d++;
                      }
                      
                    }
                }
          }
      
    }
    
  }
    
     public CoordinateArray empty_Board_Reachable_Squares()      // this is a stub method
    {
        return coordinateArray;
    }
}
