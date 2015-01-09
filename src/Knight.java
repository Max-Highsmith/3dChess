
public class Knight extends Piece
{
  
    public Knight(int x, int y, int z, Tribe t )
    {
        t_type = Piece.Token_Type.Knight;
        coordinates.set_Coordinates(x,y,z);
        color = t;
        coordinateArray = new CoordinateArray(24,1);
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
 int d =0;   
      Outer_Loop: while (d<24)
      {
          for(int x=-2; x<3; x++)
          {
              for(int y=-2; y<3 ;y++)
              {
                  for(int z=-2; z<3; z++)
                  {
                      if (d > 23) { break Outer_Loop;}
                      if((Math.abs(x)+Math.abs(y)+Math.abs(z) ==3) && ((x==0 || y==0) || z==0)   )// gurantees only 2u+v moves pass
                      {

                               coordinateArray.set_Coordinates(d,0, 
                               coordinates.getX() +  x,
                               coordinates.getY() + y,
                               coordinates.getZ() + z);
                               
                            

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
