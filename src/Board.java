
import java.util.ArrayList;
public class Board
{

private Coordinates temp_cord;
private Square[][][] anArray;
private Pawn[]  White_Pawns, Black_Pawns;
private King White_King, Black_King;
private Queen White_Queen, Black_Queen, White_Queen_B, Black_Queen_B;
private Rook White_Rook_A, White_Rook_B, Black_Rook_A, Black_Rook_B;
private Bishop White_Bishop_A, White_Bishop_B, Black_Bishop_A, Black_Bishop_B;
private Knight White_Knight_A, White_Knight_B, Black_Knight_A, Black_Knight_B;
private Griffon White_Griffon_A, White_Griffon_B, Black_Griffon_A, Black_Griffon_B;
private Piece.Tribe Player_1, Player_2;
private Piece.Tribe turn_To_Play = Piece.Tribe.White;  // shows whose turn it is;

public void switch_Turn_To_Play()
{
    if  (turn_To_Play == Piece.Tribe.White) { turn_To_Play = Piece.Tribe.Black;}
    else { turn_To_Play = Piece.Tribe.White;}
}
public void set_Turn_To_Play(Piece.Tribe x)
{
    turn_To_Play = x;
}
public Piece.Tribe get_Turn_To_Play()
{
    return turn_To_Play;
}

public Pawn get_White_Pawn(int x) {    return White_Pawns[x];}

public Square[][][] get_Squares()
{
    return anArray;
}
public Square get_Square( int x, int y, int z) { return anArray[x][y][z];}

public Square get_Square(Coordinates c) { return anArray[c.getX()][c.getY()][c.getZ()];}

public Piece get_White_King(){ return White_King;}                                          // gets for all pieces
public Piece get_Black_King(){ return Black_King;}
public Piece get_White_Queen(){ return White_Queen;}
public Piece get_Black_Queen(){ return Black_Queen;}
public Piece get_White_Queen_B(){return White_Queen_B;}
public Piece get_Black_Queen_B(){return Black_Queen_B;}     // these exist for if pawn is promoted;
public Piece get_White_Rook_A(){ return White_Rook_A;}
public Piece get_Black_Rook_A(){ return Black_Rook_A;}
public Piece get_White_Rook_B(){ return White_Rook_B;}
public Piece get_Black_Rook_B(){ return Black_Rook_B;}
public Piece get_White_Bishop_A(){ return White_Bishop_A;}
public Piece get_Black_Bishop_A(){ return Black_Bishop_A;}
public Piece get_White_Bishop_B(){ return White_Bishop_B;}
public Piece get_Black_Bishop_B(){ return Black_Bishop_B;}
public Piece get_White_Knight_A(){ return White_Knight_A;}
public Piece get_Black_Knight_A(){ return Black_Knight_A;}
public Piece get_White_Knight_B(){ return White_Knight_B;}
public Piece get_Black_Knight_B(){ return Black_Knight_B;}
public Piece get_White_Griffon_A(){ return White_Griffon_A;}
public Piece get_Black_Griffon_A(){ return Black_Griffon_A;}
public Piece get_White_Griffon_B(){ return White_Griffon_B;}
public Piece get_Black_Griffon_B(){ return Black_Griffon_B;}
public Piece[] get_White_Pawns(){ return White_Pawns;}
public Piece[] get_Black_Pawns(){ return Black_Pawns;}

// this sets the piece up with an identifier so that we can track pieces across other boards
public ArrayList<Piece> white_Major_Pieces;
public ArrayList<Piece> black_Major_Pieces;



public void update_Board()   // makes sure that all pieces have accurate reachable squares
{

     Black_King.update_Empty_Board_Reachable(Black_King.get_Coordinates());
     White_King.update_Empty_Board_Reachable(White_King.get_Coordinates());
     White_Queen.update_Empty_Board_Reachable(White_Queen.get_Coordinates());
     Black_Queen.update_Empty_Board_Reachable(Black_Queen.get_Coordinates());
     White_Rook_A.update_Empty_Board_Reachable(White_Rook_A.get_Coordinates());
     White_Rook_B.update_Empty_Board_Reachable(White_Rook_B.get_Coordinates());
     Black_Rook_A.update_Empty_Board_Reachable(Black_Rook_A.get_Coordinates());
     Black_Rook_B.update_Empty_Board_Reachable(Black_Rook_B.get_Coordinates());
     White_Bishop_A.update_Empty_Board_Reachable(White_Bishop_A.get_Coordinates());
     White_Bishop_B.update_Empty_Board_Reachable(White_Bishop_B.get_Coordinates());
     Black_Bishop_A.update_Empty_Board_Reachable(Black_Bishop_A.get_Coordinates());
     Black_Bishop_B.update_Empty_Board_Reachable(Black_Bishop_B.get_Coordinates());
     White_Griffon_A.update_Empty_Board_Reachable(White_Griffon_A.get_Coordinates());
     White_Griffon_B.update_Empty_Board_Reachable(White_Griffon_B.get_Coordinates());
     Black_Griffon_A.update_Empty_Board_Reachable(Black_Griffon_A.get_Coordinates());
     Black_Griffon_B.update_Empty_Board_Reachable(Black_Griffon_B.get_Coordinates());
     White_Knight_A.update_Empty_Board_Reachable(White_Knight_A.get_Coordinates());
     White_Knight_B.update_Empty_Board_Reachable(White_Knight_B.get_Coordinates());
     Black_Knight_A.update_Empty_Board_Reachable(Black_Knight_A.get_Coordinates());
     Black_Knight_B.update_Empty_Board_Reachable(Black_Knight_B.get_Coordinates());
     
     for( int i=0; i<9; i++)
     {
    	 Black_Pawns[i].update_Empty_Board_Reachable(Black_Pawns[i].get_Coordinates());
    	 White_Pawns[i].update_Empty_Board_Reachable(White_Pawns[i].get_Coordinates());
     }
     
     for( int i=0; i<9; i++)
     {
    	 Black_Pawns[i].update_Empty_Board_Reachable(Black_Pawns[i].get_Coordinates());
    	 White_Pawns[i].update_Empty_Board_Reachable(White_Pawns[i].get_Coordinates());
     }
     
     Black_King.update_Empty_Board_Reachable(Black_King.get_Coordinates());
     White_King.update_Empty_Board_Reachable(White_King.get_Coordinates());
     White_Queen.update_Empty_Board_Reachable(White_Queen.get_Coordinates());
     Black_Queen.update_Empty_Board_Reachable(Black_Queen.get_Coordinates());
     White_Rook_A.update_Empty_Board_Reachable(White_Rook_A.get_Coordinates());
     White_Rook_B.update_Empty_Board_Reachable(White_Rook_B.get_Coordinates());
     Black_Rook_A.update_Empty_Board_Reachable(Black_Rook_A.get_Coordinates());
     Black_Rook_B.update_Empty_Board_Reachable(Black_Rook_B.get_Coordinates());
     White_Bishop_A.update_Empty_Board_Reachable(White_Bishop_A.get_Coordinates());
     White_Bishop_B.update_Empty_Board_Reachable(White_Bishop_B.get_Coordinates());
     Black_Bishop_A.update_Empty_Board_Reachable(Black_Bishop_A.get_Coordinates());
     Black_Bishop_B.update_Empty_Board_Reachable(Black_Bishop_B.get_Coordinates());
     White_Griffon_A.update_Empty_Board_Reachable(White_Griffon_A.get_Coordinates());
     White_Griffon_B.update_Empty_Board_Reachable(White_Griffon_B.get_Coordinates());
     Black_Griffon_A.update_Empty_Board_Reachable(Black_Griffon_A.get_Coordinates());
     Black_Griffon_B.update_Empty_Board_Reachable(Black_Griffon_B.get_Coordinates());
     White_Knight_A.update_Empty_Board_Reachable(White_Knight_A.get_Coordinates());
     White_Knight_B.update_Empty_Board_Reachable(White_Knight_B.get_Coordinates());
     Black_Knight_A.update_Empty_Board_Reachable(Black_Knight_A.get_Coordinates());
     Black_Knight_B.update_Empty_Board_Reachable(Black_Knight_B.get_Coordinates());
     // for if pawn has been promoted
    // White_Queen_B.update_Empty_Board_Reachable(White_Queen_B.get_Coordinates());
  //   Black_Queen_B.update_Empty_Board_Reachable(Black_Queen_B.get_Coordinates());
}

public boolean should_Be_Promoted(Piece p)   /// returns true if piece is a pawn and should be promoted to a queen
{
	if (p.get_Type() == Piece.Token_Type.Pawn)
	{
		if(p.get_Tribe() == Piece.Tribe.White)
		{
			if(p.get_Coordinates().getY() == 4 && p.get_Coordinates().getZ() == 4)
				return true;
			else
				return false;
		}
		else
		{
			if(p.get_Coordinates().getY() == 0 && p.get_Coordinates().getZ() ==0 )
				return true;
			else
				return false;
		}
	}
	else
	{
		return false;
	}
}









public boolean coordinates_In_List(Coordinates coordinates,ArrayList<Coordinates> list_Of_Coordinates) // stub
{
    for(int i =0; i<list_Of_Coordinates.size(); i++)
    {
        if((coordinates.getX() == list_Of_Coordinates.get(i).getX())&& 
            (coordinates.getY() == list_Of_Coordinates.get(i).getY())&&
            coordinates.getZ() == list_Of_Coordinates.get(i).getZ())
            return true;
    }
    return false;
}





public boolean in_Danger(Piece p)   // tells wheter piece can be killed by another piece on the board next turn
{
    boolean danger = false;
    update_Board();

        for(int x=0; x<5; x++)   // goes through each square on board
        {
            for(int y=0; y<5; y++)
            {
                for(int z=0; z<5; z++)
                {
                    if (anArray[x][y][z].has_Piece())  // checks if square has piece, ignored if it does not
                    {
                        if(!(anArray[x][y][z].get_Current_Piece().get_Tribe()== p.get_Tribe())) //checks if piece on square is friend of foe
                        {
                        	
                        	p.update_Empty_Board_Reachable(p.get_Coordinates()); //update pawn coords.
                        					if(coordinates_In_List(                                            // checks if p's square is in list of attackable squares;
                        							p.get_Coordinates(), 
                        							reachable_Squares(anArray[x][y][z].get_Current_Piece().empty_Board_Reachable_Squares(),
                        							anArray[x][y][z].get_Current_Piece().get_Tribe())))
                        					   {
                        							System.out.println("P"+p.get_Tribe());
                        							System.out.println(x+","+y+','+z);
                        							danger = true;
                        							return danger;
                            			        }
                        			
                        }
                    }
                    
                }
            }
        }
        return false;
    }




public boolean owns_Piece(Piece.Tribe player, Piece p)   // gurantees player is not moving opponents pieces
{
    if (p == null)
    return false;
    if (player == p.color)
    return true;
    else return false;
}

public boolean is_On_Board(Coordinates c)   // gurantess target location exists
{
    if (c.getX() <5 && c.getX() >=0 && c.getY() <5 && c.getY() >=0 &&c.getZ() <5 && c.getZ() >=0)
    return true;
    else
    return false;
}

public boolean target_Not_Owned(Piece.Tribe player, Square S)   //verifies move does not take own piece
{ 
    if (player == S.piece_Color())
    return true;
    else return false;
}

public boolean king_Is_Safe(Piece.Tribe player, Piece p, int x, int y, int z)
{
    
    boolean safety;
    Board scen = scenario(p,x,y,z);
 
    if (player == Piece.Tribe.White)
    {   
        safety = !scen.in_Danger(scen.get_White_King());   // checks that if moove is made king will still be safe
     
    }
    else
    {
        safety = !scen.in_Danger(scen.get_Black_King());  // checks that if move is made king will still be safe
        
        
    }
    
    System.out.println("SAFETY"+safety);    
    return safety;
        
      
}





public ArrayList<Coordinates> get_Legal_Pawn_Moves(Piece p)  // returns array list of the moves any given pawn can make.
{
    ArrayList<Coordinates> legal_Moves = new ArrayList<Coordinates>();
    for (int x = p.get_Coordinates().getX()-1; x<=p.get_Coordinates().getX()+1; x++)
    {
        for (int y = p.get_Coordinates().getY()-1; y<=p.get_Coordinates().getY()+1; y++)
        {
            for (int z = p.get_Coordinates().getZ()-1; z<=p.get_Coordinates().getZ()+1; z++)
            {
                if(  (x>-1 && x<5) && (y>-1 && y<5) && (z>-1 && z<5)  )
                {
                	if(p.is_Way_Piece_Captures(x,y,z)   &&  anArray[x][y][z].has_Piece())
                	{
                		if(anArray[x][y][z].get_Current_Piece().get_Tribe() != p.get_Tribe())
                		{
                			Coordinates coord = new Coordinates(x,y,z);  // 
                			legal_Moves.add(coord);
                		}
                	}
                
                	if(p.is_Way_Piece_Moves(x,y,z) && !(anArray[x][y][z].has_Piece()))
                	{
                		Coordinates coord = new Coordinates(x,y,z);
                		legal_Moves.add(coord);
                    
                	}
                }

            }
        }
    }
    
    return legal_Moves;
}



public ArrayList<ArrayList<Coordinates>> get_Possible_Moves()  // this method will return a list of legal moves based on the boards current situation
//
{
    ArrayList<ArrayList<Coordinates>> turn_coordinates = new ArrayList<ArrayList<Coordinates>>();

    if(turn_To_Play == Piece.Tribe.White)
    {
        for(int i =0; i< white_Major_Pieces.size(); i++)   // go through all white_Pieces
        {
           turn_coordinates.add(reachable_Squares(
                white_Major_Pieces.get(i).empty_Board_Reachable_Squares(), turn_To_Play));  //add the moves that can be made by each piece i to this list of 
        }
        
        for(int i=0; i< 10; i++)
        {
            turn_coordinates.add(get_Legal_Pawn_Moves(White_Pawns[i]));
        }

    }
    else
    {
        for(int i =0; i< black_Major_Pieces.size(); i++)   // go through all white_Pieces
        {
            turn_coordinates.add(reachable_Squares(
                black_Major_Pieces.get(i).empty_Board_Reachable_Squares(), turn_To_Play));
        }
        
        for(int i=0; i< 10; i++)
        {
            
            
           // get_Legal_Pawn_Moves(Black_Pawns[9]);
            turn_coordinates.add(get_Legal_Pawn_Moves(Black_Pawns[i]));
            
            
        }
    }
    
        return turn_coordinates; 
       
}






public ArrayList<Coordinates> reachable_Squares(CoordinateArray coordinateArray,Piece.Tribe tribe)  // takes in array of pieces available moves on empty board and calculates new list of 
                                                    //plausible moves factoring in board conditions
                                                    // these are reachable squares for killing not moving in the case of pawns.
{
    int index = coordinateArray.get_Index();
    int direction = coordinateArray.get_Direction();
    boolean blocked = false;
    
    ArrayList<Coordinates> reachable = new ArrayList<Coordinates>();
    
    for (int d=0; d<direction; d++)    // for the number of directions each piece moves
    {
        Line_Loop : for (int i=0; i<index; i++)   // for number of plausible moves in said direction
        {
            if (is_On_Board(coordinateArray.get_Coordinates(d,i)))  // verifies coordinate is on the board
            { 
                    
                    if(get_Square(coordinateArray.get_Coordinates(d,i)).has_Piece())  
                    {
                        if(    (get_Square(coordinateArray.get_Coordinates(d,i)).get_Current_Piece()).get_Tribe() == tribe)  // true means players piece is there and cannot be moved to
                        {
                            break Line_Loop;      // means your own piece is there
                        }
                        
                    blocked = true;        // means opponent piece is there and this is the last in that direction that can be moved to
                  }
                 
                reachable.add(coordinateArray.get_Coordinates(d,i));
                if (blocked) {break Line_Loop;}              // break loop if blocked
            }
        }
        blocked = false;
    }
    return reachable;
    
}









public boolean valid_Move(Piece.Tribe player, Piece p, Coordinates c)
// tests whether move is doable under a list of conditions testing in order
//1. do you own the piece
//2. is the piece you selected on the board( this is only relevant to the terminal not the GUI or APPlet
//3. is the king in check/ will this move put the king in check
//4. does the square being moved to have a piece currently

{
	update_Board();
Square s = anArray[c.getX()][c.getY()][c.getZ()]; 
 if(owns_Piece(player, p))
 {      if (is_On_Board(c)){
            if (king_Is_Safe(player, p, c.getX(), c.getY(), c.getZ())) {
                    if (s.has_Piece()){
                         if(!owns_Piece(player,s.get_Current_Piece())){
                                if(p.is_Way_Piece_Captures(s.get_Coordinates()))
                                  { 
                                      return true;
                                    }
                                else{System.out.println("is not how piece captures");
                                     return false;}
                                                  }
                                                  

                          else{
                              System.out.println("your own pieces is there");
                                return false;}
                         }else{
                               if (p.is_Way_Piece_Moves(s.get_Coordinates()))
                               {return true;}
                               else{System.out.println("p.get_coord"+p.get_Coordinates());
                                   System.out.println("s.get_coord"+s.get_Coordinates());
                                   System.out.println("is not how piece moves");
                                   return false;}}}
              else{System.out.println("King is in danger"); return false;}}
      else{System.out.println("That is not on the boards"); return false;}}
 else{System.out.println("That is not your piece"); return false;}     
}




public String toString()
{
    String s = "{";
   for ( int z=0; z<5; z++)
    {
        //if(z == 1 || z== 3){
           for( int y=0; y<5; y++)
           {
              for (int x=0; x<5; x++)
              {
               
               s = s+anArray[x][y][z].toString();
               
              }
            s= s+ "\n";
           }
        s= s+ "\n";
       //}
}
    s = s+ '}';
    return s;
}


public  void god_Move(Piece p, int x, int y, int z)   // move designed for testing, weird board play, does not consider legality of mov
{
if (p.get_Coordinates().getX() != -9){  // means that piece is not on the board yet
anArray[p.get_Coordinates().getX()][p.get_Coordinates().getY()][p.get_Coordinates().getZ()].Remove_Piece();
anArray[x][y][z].Remove_Piece();}
Coordinates c = new Coordinates(x,y,z);
p.set_Coordinates(x,y,z);
anArray[x][y][z].recieve_Piece(p);
Piece.Specific_Piece temp_id = p.get_Specific_Piece();


                            //switch finds the piece using the identifying enum Specific_Piece so that it can be manipulated in the way necessary
                            //after finding piece it assigns it to the correct array
switch(temp_id){
    case Black_King: Black_King.set_Coordinates(c);  anArray[x][y][z].recieve_Piece(Black_King); break;
    case White_King: White_King.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_King); break;
    case White_Queen: White_Queen.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Queen); break;
    case Black_Queen: Black_Queen.set_Coordinates(c);anArray[x][y][z].recieve_Piece(Black_Queen); break;
    case White_Rook_A: White_Rook_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Rook_A); break;
    case White_Rook_B: White_Rook_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Rook_B); break;
    case Black_Rook_A: White_Rook_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Rook_A);break;
    case Black_Rook_B: Black_Rook_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Rook_B); break;
    case White_Bishop_A: White_Bishop_A.set_Coordinates(c);anArray[x][y][z].recieve_Piece(White_Bishop_A); break;
    case White_Bishop_B: White_Bishop_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Bishop_B);break;
    case Black_Bishop_A: Black_Bishop_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Bishop_A);break;
    case Black_Bishop_B:  Black_Bishop_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Bishop_B);break;
    case White_Griffon_A:  White_Griffon_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Griffon_A);break;
    case White_Griffon_B:  White_Griffon_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Griffon_B);break;
    case Black_Griffon_A:  Black_Griffon_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Griffon_A);break;
    case Black_Griffon_B:  Black_Griffon_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Griffon_B);break;
    case White_Knight_A:   White_Knight_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Knight_A);break;
    case White_Knight_B:   White_Knight_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Knight_A);break;
    case Black_Knight_A:   Black_Knight_A.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Knight_A);break;
    case Black_Knight_B:   Black_Knight_B.set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Knight_B);break;
    case wp0: White_Pawns[0].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[0]); System.out.println(anArray[x][y][z].get_Current_Piece()); break;
    case wp1: White_Pawns[1].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[1]);break;
    case wp2: White_Pawns[2].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[2]);break;
    case wp3: White_Pawns[3].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[3]);break;
    case wp4: White_Pawns[4].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[4]);break;
    case wp5: White_Pawns[5].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[5]);break;
    case wp6: White_Pawns[6].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[6]);break;
    case wp7: White_Pawns[7].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[7]);break;
    case wp8: White_Pawns[8].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[8]);break;
    case wp9: White_Pawns[9].set_Coordinates(c); anArray[x][y][z].recieve_Piece(White_Pawns[9]);break;
    case bp0: Black_Pawns[0].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[0]);break;
    case bp1: Black_Pawns[1].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[1]);break;
    case bp2: Black_Pawns[2].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[2]);break;
    case bp3: Black_Pawns[3].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[3]);break;
    case bp4: Black_Pawns[4].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[4]);break;
    case bp5: Black_Pawns[5].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[5]);break;
    case bp6: Black_Pawns[6].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[6]);break;
    case bp7: Black_Pawns[7].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[7]);break;
    case bp8: Black_Pawns[8].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[8]);break;
    case bp9: Black_Pawns[9].set_Coordinates(c); anArray[x][y][z].recieve_Piece(Black_Pawns[9]);break;


}

p.set_Coordinates(c);
update_Board();
switch_Turn_To_Play();    
}

public void god_Move(Piece p, Coordinates c)
{
    god_Move(p,c.getX(), c.getY(), c.getZ());
}



public boolean move(Piece.Tribe player, Piece piece,Coordinates c)
{
    return move(player, piece, c.getX(), c.getY(), c.getZ());
}

public boolean move(Piece.Tribe player, Piece piece, int x, int y, int z)
 {
    
     

     
     
   Coordinates c = new Coordinates(x,y,z);
    if (valid_Move(player,piece,c))
    {
        if(piece.get_Type()==Piece.Token_Type.Pawn)          // checks if is pawn, if not we do not have to worry about promotion or move vs kill
        {   
        
        god_Move(piece,x,y,z);                                //move actually made
        
        if (should_Be_Promoted(piece))
 		{
 	        System.out.println(" make me a queen please");
 		}
        piece.update_Empty_Board_Reachable(piece.get_Coordinates());
        return true;
        }
        else
        { 
            if(coordinates_In_List(
            c, reachable_Squares(
            piece.empty_Board_Reachable_Squares(), piece.get_Tribe())))
            {
                god_Move(piece,x,y,z);
                       
                return true;
            }
            
        }
   }
    return false;

 }





 
 public Board scenario(Piece p, int x, int y, int z)     // constructs an alternate board in which suggested move is performed so as to calculate what would occur in that situation
 {
     Board posibility = theoretical_World(this);
     Piece temp = posibility.get_Square(p.get_Coordinates()).get_Current_Piece();
     posibility.god_Move(temp,x,y,z);
     return posibility;
 }
 
 public boolean will_Put_King_In_Check(Piece p, int x, int y, int z)
 {   
     return scenario(p,x,y,z).king_Is_Safe(p.get_Tribe(),p,x,y,z);
      
 }





// initializes pieces and sets up board






























public Board theoretical_World(Board b) // this Board is a theoretical seperate world which is a direct duplicate of the actual main running board
{
Board theoretical = new Board(true);    
theoretical.set_Turn_To_Play(b.get_Turn_To_Play());
theoretical.god_Move(theoretical.get_White_King(), b.get_White_King().get_Coordinates());                     
theoretical.god_Move(theoretical.get_Black_King(), b.get_Black_King().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Queen(), b.get_White_Queen().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Queen(), b.get_Black_Queen().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Rook_A(), b.get_White_Rook_A().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Rook_A(), b.get_Black_Rook_A().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Rook_B(), b.get_White_Rook_B().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Rook_B(), b.get_Black_Rook_B().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Bishop_A(), b.get_White_Bishop_A().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Bishop_A(), b.get_Black_Bishop_A().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Bishop_B(), b.get_White_Bishop_B().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Bishop_B(), b.get_Black_Bishop_B().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Knight_A(), b.get_White_Knight_A().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Knight_A(), b.get_Black_Knight_A().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Knight_B(), b.get_White_Knight_B().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Knight_B(), b.get_Black_Knight_B().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Griffon_A(), b.get_White_Griffon_A().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Griffon_A(), b.get_Black_Griffon_A().get_Coordinates());
theoretical.god_Move(theoretical.get_White_Griffon_B(), b.get_White_Griffon_B().get_Coordinates());
theoretical.god_Move(theoretical.get_Black_Griffon_B(), b.get_Black_Griffon_B().get_Coordinates());
for(int i =0; i<10; i++) { theoretical.god_Move(theoretical.get_White_Pawns()[i], b.get_White_Pawns()[i].get_Coordinates()); }
for(int i =0; i<10; i++) { theoretical.god_Move(theoretical.get_Black_Pawns()[i], b.get_Black_Pawns()[i].get_Coordinates());}

               

return theoretical;
  
}


















public Board(boolean garbage)   // this is a hypothetical board with no pieces placed on squares.  pieces are given the x coordinate of -9 so that they 
//can be recognized by method god_Move() as not being on board yet
{
        anArray = new Square[5][5][5];
    
    
    for ( int x=0; x<5; x++)
    {
       for( int y=0; y<5; y++)
       {
           for (int z=0; z<5; z++)
           {
               temp_cord = new Coordinates(x,y,z);
               anArray[x][y][z] = new Square (temp_cord);      /// this assigns each square its correct coordinates
               
            }
        }     
    }
   

    
    
    Player_1 = Piece.Tribe.White;
    Player_2 = Piece.Tribe.Black;
    White_Pawns = new Pawn[10];
    Black_Pawns = new Pawn[10];
    
    
       for( int z = 0; z<2; z++)   // adds white pawns to board
   {
         for (int x =0 ; x<5; x++)
         {
        White_Pawns[x+(z*5)] = new Pawn(-9,1,z,Piece.Tribe.White);
        White_Pawns[x+(z*5)].set_Specific_Piece(Piece.Specific_Piece.values()[20+x+(z*5)]);
         }
    } 
    
    
    
    
       for( int z = 0; z<2; z++)   // adds back pawns to board
   {
         for (int x =0 ; x<5; x++)
         {
        Black_Pawns[x+(z*5)] = new Pawn(-9,3,4-z,Piece.Tribe.Black);
        Black_Pawns[x+(z*5)].set_Specific_Piece(Piece.Specific_Piece.values()[30+x+(z*5)]);
         }
    } 
    
    
 White_King = new King(-9,0,0,Piece.Tribe.White);   // places all primary pieces onto board            // ensures pieces know where they are and places know which pieces they have
 Black_King = new King(-9,4,4,Piece.Tribe.Black);                                                                     
 White_Queen = new Queen(-9,0,1, Piece.Tribe.White);
 Black_Queen = new Queen(-9,4,3, Piece.Tribe.Black);
 White_Rook_A = new Rook(-9,0,0, Piece.Tribe.White);
 White_Rook_B = new Rook(-9,0,0, Piece.Tribe.White);
 Black_Rook_A = new Rook(-9,4,4, Piece.Tribe.Black);
 Black_Rook_B = new Rook(-9,4,4, Piece.Tribe.Black);
 White_Bishop_A = new Bishop(-9,0,1, Piece.Tribe.White);
 White_Bishop_B = new Bishop(-9,0,1, Piece.Tribe.White);
 Black_Bishop_A = new Bishop(-9,4,3, Piece.Tribe.Black);
 Black_Bishop_B = new Bishop(-9,-9,-9, Piece.Tribe.Black);
 White_Knight_A = new Knight(-9,0,0, Piece.Tribe.White);
 White_Knight_B = new Knight(-9,0,0, Piece.Tribe.White);
 Black_Knight_A = new Knight(-9,4,4, Piece.Tribe.Black);
 Black_Knight_B = new Knight(-9,4,4, Piece.Tribe.Black);
 White_Griffon_A = new Griffon(-9,0,1, Piece.Tribe.White);
 White_Griffon_B = new Griffon(-9,0,1, Piece.Tribe.White);
 Black_Griffon_A = new Griffon(-9,4,3, Piece.Tribe.Black);
 Black_Griffon_B = new Griffon(-9,4,3, Piece.Tribe.Black);

    
 White_King.set_Specific_Piece(Piece.Specific_Piece.White_King);
 Black_King.set_Specific_Piece(Piece.Specific_Piece.Black_King);
 White_Queen.set_Specific_Piece(Piece.Specific_Piece.White_Queen);
 Black_Queen.set_Specific_Piece(Piece.Specific_Piece.Black_Queen);
 White_Rook_A.set_Specific_Piece(Piece.Specific_Piece.White_Rook_A);
 Black_Rook_A.set_Specific_Piece(Piece.Specific_Piece.Black_Rook_A);
 White_Rook_B.set_Specific_Piece(Piece.Specific_Piece.White_Rook_B);
 Black_Rook_B.set_Specific_Piece(Piece.Specific_Piece.Black_Rook_B);
 White_Bishop_A.set_Specific_Piece(Piece.Specific_Piece.White_Bishop_A);
 Black_Bishop_A.set_Specific_Piece(Piece.Specific_Piece.Black_Bishop_A);
 White_Bishop_B.set_Specific_Piece(Piece.Specific_Piece.White_Bishop_B);
 Black_Bishop_B.set_Specific_Piece(Piece.Specific_Piece.Black_Bishop_B);
 White_Griffon_A.set_Specific_Piece(Piece.Specific_Piece.White_Griffon_A);
 Black_Griffon_A.set_Specific_Piece(Piece.Specific_Piece.Black_Griffon_A);
 White_Griffon_B.set_Specific_Piece(Piece.Specific_Piece.White_Griffon_B);
 Black_Griffon_B.set_Specific_Piece(Piece.Specific_Piece.Black_Griffon_B);
 White_Knight_A.set_Specific_Piece(Piece.Specific_Piece.White_Knight_A);
 Black_Knight_A.set_Specific_Piece(Piece.Specific_Piece.Black_Knight_A);
 White_Knight_B.set_Specific_Piece(Piece.Specific_Piece.White_Knight_B);
 Black_Knight_B.set_Specific_Piece(Piece.Specific_Piece.Black_Knight_B);

 
 
 white_Major_Pieces = new ArrayList<Piece>();
 black_Major_Pieces = new ArrayList<Piece>();
 
 white_Major_Pieces.add(White_King);        // posibly being used for scenarios, open to revision, if kept it will probably reduce code in other areas, to be messed with when ready to add to github
 black_Major_Pieces.add(Black_King);
 white_Major_Pieces.add(White_Queen);
 black_Major_Pieces.add(Black_Queen);
 white_Major_Pieces.add(White_Rook_A);
 black_Major_Pieces.add(Black_Rook_A);
 white_Major_Pieces.add(White_Rook_B);
 black_Major_Pieces.add(Black_Rook_B);
 white_Major_Pieces.add(White_Bishop_A);
 black_Major_Pieces.add(Black_Bishop_A);
 white_Major_Pieces.add(White_Bishop_B);
 black_Major_Pieces.add(Black_Bishop_B);
 white_Major_Pieces.add(White_Griffon_A);
 black_Major_Pieces.add(Black_Griffon_A);
 white_Major_Pieces.add(White_Griffon_B);
 black_Major_Pieces.add(Black_Griffon_B);
 white_Major_Pieces.add(White_Knight_A);
 black_Major_Pieces.add(Black_Knight_A);
 white_Major_Pieces.add(White_Knight_B);
 black_Major_Pieces.add(Black_Knight_B);
 


}



public Board()
{

    anArray = new Square[5][5][5];
    
    
    for ( int x=0; x<5; x++)
    {
       for( int y=0; y<5; y++)
       {
           for (int z=0; z<5; z++)
           {
               temp_cord = new Coordinates(x,y,z);
               anArray[x][y][z] = new Square (temp_cord);      /// this assigns each square its correct coordinates
               
            }
        }     
    }
    
    
   // initialize all pieces
    Player_1 = Piece.Tribe.White;
    Player_2 = Piece.Tribe.Black;
    White_Pawns = new Pawn[10];
    Black_Pawns = new Pawn[10];
    

    
   for( int z = 0; z<2; z++)   // adds white pawns to board
   {
         for (int x =0 ; x<5; x++)
         {
        White_Pawns[x+(z*5)] = new Pawn(x,1,z,Piece.Tribe.White);
        anArray[x][1][z].recieve_Piece(White_Pawns[x+(z*5)]);
        White_Pawns[x+(z*5)].set_Specific_Piece(Piece.Specific_Piece.values()[20+x+(z*5)]);
         }
    } 
    
    
    
    
       for( int z = 0; z<2; z++)   // adds back pawns to board
   {
         for (int x =0 ; x<5; x++)
         {
        Black_Pawns[x+(z*5)] = new Pawn(x,3,4-z,Piece.Tribe.Black);
        anArray[x][3][4-z].recieve_Piece(Black_Pawns[x+(z*5)]);
        Black_Pawns[x+(z*5)].set_Specific_Piece(Piece.Specific_Piece.values()[30+x+(z*5)]);
         }
    } 
    
    
    
    
  
 
 White_King = new King(2,0,0,Piece.Tribe.White);          // places all primary pieces onto board
 anArray[2][0][0].recieve_Piece(White_King);              // ensures pieces know where they are and places know which pieces they have
 Black_King = new King(2,4,4,Piece.Tribe.Black);  
 anArray[2][4][4].recieve_Piece(Black_King);             
                                                         
 
 White_Queen = new Queen(2,0,1, Piece.Tribe.White);
 anArray[2][0][1].recieve_Piece(White_Queen);
 Black_Queen = new Queen(2,4,3, Piece.Tribe.Black);
 anArray[2][4][3].recieve_Piece(Black_Queen);
 White_Rook_A = new Rook(0,0,0, Piece.Tribe.White);
 anArray[0][0][0].recieve_Piece(White_Rook_A);
 White_Rook_B = new Rook(4,0,0, Piece.Tribe.White);
 anArray[4][0][0].recieve_Piece(White_Rook_B);
 Black_Rook_A = new Rook(4,4,4, Piece.Tribe.Black);
 anArray[4][4][4].recieve_Piece(Black_Rook_A);
 Black_Rook_B = new Rook(0,4,4, Piece.Tribe.Black);
 anArray[0][4][4].recieve_Piece(Black_Rook_B);
 White_Bishop_A = new Bishop(0,0,1, Piece.Tribe.White);
 anArray[0][0][1].recieve_Piece(White_Bishop_A);
 White_Bishop_B = new Bishop(3,0,1, Piece.Tribe.White);
 anArray[3][0][1].recieve_Piece(White_Bishop_B);
 Black_Bishop_A = new Bishop(1,4,3, Piece.Tribe.Black);
 anArray[1][4][3].recieve_Piece(Black_Bishop_A);
 Black_Bishop_B = new Bishop(4,4,3, Piece.Tribe.Black);
 anArray[4][4][3].recieve_Piece(Black_Bishop_B);
 White_Knight_A = new Knight(1,0,0, Piece.Tribe.White);
 anArray[1][0][0].recieve_Piece(White_Knight_A);
 White_Knight_B = new Knight(3,0,0, Piece.Tribe.White);
 anArray[3][0][0].recieve_Piece(White_Knight_B);
 Black_Knight_A = new Knight(1,4,4, Piece.Tribe.Black);
 anArray[1][4][4].recieve_Piece(Black_Knight_A);
 Black_Knight_B = new Knight(3,4,4, Piece.Tribe.Black);
 anArray[3][4][4].recieve_Piece(Black_Knight_B);
 White_Griffon_A = new Griffon(1,0,1, Piece.Tribe.White);
 anArray[1][0][1].recieve_Piece(White_Griffon_A);
 White_Griffon_B = new Griffon(4,0,1, Piece.Tribe.White);
 anArray[4][0][1].recieve_Piece(White_Griffon_B);
 Black_Griffon_A = new Griffon(0,4,3, Piece.Tribe.Black);
 anArray[0][4][3].recieve_Piece(Black_Griffon_A);
 Black_Griffon_B = new Griffon(3,4,3, Piece.Tribe.Black);
 anArray[3][4][3].recieve_Piece(Black_Griffon_B);
  
    
 
 
 White_King.set_Specific_Piece(Piece.Specific_Piece.White_King);
 Black_King.set_Specific_Piece(Piece.Specific_Piece.Black_King);
 White_Queen.set_Specific_Piece(Piece.Specific_Piece.White_Queen);
 Black_Queen.set_Specific_Piece(Piece.Specific_Piece.Black_Queen);
 White_Rook_A.set_Specific_Piece(Piece.Specific_Piece.White_Rook_A);
 Black_Rook_A.set_Specific_Piece(Piece.Specific_Piece.Black_Rook_A);
 White_Rook_B.set_Specific_Piece(Piece.Specific_Piece.White_Rook_B);
 Black_Rook_B.set_Specific_Piece(Piece.Specific_Piece.Black_Rook_B);
 White_Bishop_A.set_Specific_Piece(Piece.Specific_Piece.White_Bishop_A);
 Black_Bishop_A.set_Specific_Piece(Piece.Specific_Piece.Black_Bishop_A);
 White_Bishop_B.set_Specific_Piece(Piece.Specific_Piece.White_Bishop_B);
 Black_Bishop_B.set_Specific_Piece(Piece.Specific_Piece.Black_Bishop_B);
 White_Griffon_A.set_Specific_Piece(Piece.Specific_Piece.White_Griffon_A);
 Black_Griffon_A.set_Specific_Piece(Piece.Specific_Piece.Black_Griffon_A);
 White_Griffon_B.set_Specific_Piece(Piece.Specific_Piece.White_Griffon_B);
 Black_Griffon_B.set_Specific_Piece(Piece.Specific_Piece.Black_Griffon_B);
 White_Knight_A.set_Specific_Piece(Piece.Specific_Piece.White_Knight_A);
 Black_Knight_A.set_Specific_Piece(Piece.Specific_Piece.Black_Knight_A);
 White_Knight_B.set_Specific_Piece(Piece.Specific_Piece.White_Knight_B);
 Black_Knight_B.set_Specific_Piece(Piece.Specific_Piece.Black_Knight_B);
 
 
 
 white_Major_Pieces = new ArrayList<Piece>();
 black_Major_Pieces = new ArrayList<Piece>();
 
 white_Major_Pieces.add(White_King);        // posibly being used for scenarios, open to revision, if kept it will probably reduce code in other areas, to be messed with when ready to add to github
 black_Major_Pieces.add(Black_King);
 white_Major_Pieces.add(White_Queen);
 black_Major_Pieces.add(Black_Queen);
 white_Major_Pieces.add(White_Rook_A);
 black_Major_Pieces.add(Black_Rook_A);
 white_Major_Pieces.add(White_Rook_B);
 black_Major_Pieces.add(Black_Rook_B);
 white_Major_Pieces.add(White_Bishop_A);
 black_Major_Pieces.add(Black_Bishop_A);
 white_Major_Pieces.add(White_Bishop_B);
 black_Major_Pieces.add(Black_Bishop_B);
 white_Major_Pieces.add(White_Griffon_A);
 black_Major_Pieces.add(Black_Griffon_A);
 white_Major_Pieces.add(White_Griffon_B);
 black_Major_Pieces.add(Black_Griffon_B);
 white_Major_Pieces.add(White_Knight_A);
 black_Major_Pieces.add(Black_Knight_A);
 white_Major_Pieces.add(White_Knight_B);
 black_Major_Pieces.add(Black_Knight_B);
 

 
}


}