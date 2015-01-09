public class CoordinateArray{
 
 Coordinates[][] coordinate_Array;
 int direction;
 int index;
 
 public CoordinateArray(int d, int i)
 {
     index = i;
     direction = d;
     coordinate_Array = new Coordinates[d][i];
     
     for(int x =0; x<direction; x++)
     {
        for(int y=0; y<index; y++)
        {
            coordinate_Array[x][y] = new Coordinates(-9,-9,-9);
        }
     }
 }
  
 public void set_Coordinates(int d, int i, Coordinates c)
 {
    coordinate_Array[d][i] = new Coordinates (c.getX(),c.getY(),c.getZ());    

 }
 
 public void set_Coordinates(int d, int i, int x, int y, int z)
 {
     coordinate_Array[d][i] = new Coordinates (x,y,z);
     
    }

 public Coordinates get_Coordinates(int d, int i)
 {
    return coordinate_Array[d][i];    
 }
 
 public int get_Index() { return index;}
 public void set_Index(int i){ index = i;}
 public int get_Direction() { return direction;}
 public void set_Direction(int d) { direction = d;}
 
 
 public String toString()
 {
     String s = "{";
     for (int i=0; i<direction; i++)
     {
        for (int j=0; j<index; j++)
        {
            s = s + coordinate_Array[i][j].toString();
        }
        s = s+"\n";
    }
    s = s+'}';
    return s;
}

}
