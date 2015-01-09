
public class Coordinates
{

private int x,y,z;   // z is the board number, x and y are how typical axis would be seen

public Coordinates(int xx, int yy, int zz)
{
    x = xx;
    y= yy;
    z= zz;
}

public Coordinates()
{
    x =0; 
    y =0;
    z =0;
}

public String toString()
{
    return "("+x+','+y+','+z+')';
}

// gets, puts and increments
public int getX(){return x;}
public void setX(int xx)  {x= xx;}
public void incX(int xx)  { x = x+xx;}
public int getY() {return y;}
public void setY(int yy){y= yy;}
public void incY(int yy){y= y+yy;}
public int getZ(){return z;}
public void setZ(int zz){z= zz;}
public void incZ(int zz){z = z+zz;}
public void set_Coordinates(int xx, int yy, int zz)
{
    x = xx;
    y = yy;
    z = zz;
    
}


}