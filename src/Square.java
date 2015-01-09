
public class Square{

   public enum COLOR { blacck, whitte};
   Piece current_piece;
   COLOR color;
   Coordinates coordinates;
   
   public Coordinates get_Coordinates()
   {
       return coordinates;
    }
   
   public Square(Coordinates c)
   {
       coordinates = c;
       if((coordinates.getX()+coordinates.getY()+coordinates.getZ()) % 2 == 0)
       {  color = COLOR.whitte;}
        else
        { color = COLOR.blacck; }
        
        current_piece = null;
    }
    
    public boolean has_Piece()
    {
        if (current_piece == null) 
        return false;
        else
        return true;
    }
    
    public Piece.Tribe piece_Color()
    {
        return current_piece.get_Tribe();
    }
    
    public void recieve_Piece( Piece p)
    {
        current_piece = p;
    }
    
    public void Remove_Piece()
    {
        current_piece = null;
    }
    public Piece get_Current_Piece(){ return current_piece;}
    
    
    
    public String toString()
    { 
        if (has_Piece())
        return '('+ coordinates.toString() + ':'+ current_piece.toString()+ ')' ;
        else
        return '('+ coordinates.toString() + ':'+ "EMPTY" + ')';
    }
    
    
    
    
}
