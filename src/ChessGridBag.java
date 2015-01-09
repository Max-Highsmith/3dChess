


import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;



public class ChessGridBag {


Coordinates in_coord = new Coordinates(-8,0,0);
Coordinates out_coord = new Coordinates(-8,0,0);
Square[][][] squares;
boolean moveMade = false;
Board theBoard;
JLabel whitesturn, blacksturn;
JLabel movingsquare;    // used to show which piece is selected
JLabel endingsquare;    // used to show viewer where they will move selected piece
JLabel inCheck;



private class GamePanel extends JPanel implements MouseListener 
{
    Square s;
    ImageIcon image = new ImageIcon("sampple.jpg");
    
    
    
    public GamePanel(Square square)
    {
        s = square;
    }
    
    public void update(Square ss)
    {
      s = ss;   
    }
    
    public Coordinates get_Coordnates()
    {
        return s.get_Coordinates();
    }
    
    public void paintComponent(Graphics g)
    {
        
     
        
        if(s.get_Current_Piece() != null)
    {
        
          if (s.get_Current_Piece().get_Tribe() == Piece.Tribe.White)
          {
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.King){ image = new ImageIcon("Piece_Images/White_King.jpg"); }
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Queen){  image = new ImageIcon("Piece_Images/White_Queen.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Rook){  image = new ImageIcon("Piece_Images/White_Rook.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Bishop){  image = new ImageIcon("Piece_Images/White_Bishop.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Knight){  image = new ImageIcon("Piece_Images/White_Knight.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Griffon){  image = new ImageIcon("Piece_Images/White_Griffon.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Pawn){  image = new ImageIcon("Piece_Images/White_Pawn.jpg");}

          }
            else
          {
                            if(s.get_Current_Piece().get_Type() == Piece.Token_Type.King){  image = new ImageIcon("Piece_Images/Black_King.jpg"); }
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Queen){  image = new ImageIcon("Piece_Images/Black_Queen.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Rook){  image = new ImageIcon("Piece_Images/Black_Rook.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Bishop){  image = new ImageIcon("Piece_Images/Black_Bishop.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Knight){  image = new ImageIcon("Piece_Images/Black_Knight.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Griffon){  image = new ImageIcon("Piece_Images/Black_Griffon.jpg");}
              if(s.get_Current_Piece().get_Type() == Piece.Token_Type.Pawn){  image = new ImageIcon("Piece_Images/Black_Pawn.jpg");}
          }
    }
    else
    {
        image = new ImageIcon("THIS_IS_A_GHOST_ADRESS_IT_LEADS_TO_NOTHING.jpg");     /// this sets no image for when there is no piece on the square
    }
    
    
        super.paintComponent(g);
        g.setColor(Color.red);
        int x = (getWidth() - image.getIconWidth())/ 2;
        int y = (getHeight() - image.getIconHeight())/ 2;
        image.paintIcon(this, g, x, y);
        addMouseListener(this);
    
    
    
    }
    
    
 
     
    public void mousePressed(MouseEvent e) {                         

    }
     
    public void mouseReleased(MouseEvent e) {


    }
     
    public void mouseEntered(MouseEvent e) {

    }
     
    public void mouseExited(MouseEvent e) {

    }
     
    public void mouseClicked(MouseEvent e) {     
        
            
        if(in_coord.getX() == -8)
        {

           in_coord.setX(s.get_Coordinates().getX());
           in_coord.setY(s.get_Coordinates().getY());
           in_coord.setZ(s.get_Coordinates().getZ());
           movingsquare.setText(in_coord.toString());
        }
        else{
            if(s.get_Coordinates().getX() != in_coord.getX() || s.get_Coordinates().getY() != in_coord.getY() || s.get_Coordinates().getZ() != in_coord.getZ())   // some mouses are inaccurate and read 1 click as 2, this prevents error
            // of having the same coord read twice
            {

              out_coord.setX(s.get_Coordinates().getX());
              out_coord.setY(s.get_Coordinates().getY());
              out_coord.setZ(s.get_Coordinates().getZ());
              endingsquare.setText(out_coord.toString());

            }
        }
    
    }
    
    
   }
    
    
   
   
   
   
   
   private class MoveButton extends JButton implements ActionListener
   {
       public MoveButton(String t)
       {
           super(t);
           addActionListener(this);
        }

        
      public void actionPerformed(ActionEvent e)
      {
          try{
          if(in_coord.getX()!= -8 && out_coord.getX()!= 8)
          {
            theBoard.move(theBoard.get_Turn_To_Play(), squares[in_coord.getX()][in_coord.getY()][in_coord.getZ()].get_Current_Piece(), out_coord);
            in_coord.setX(-8);
            out_coord.setX(-8);
            System.out.println(" reachable squares?"+theBoard.reachable_Squares(theBoard.get_White_Pawns()[6].empty_Board_Reachable_Squares(), Piece.Tribe.White));
        
        
            if(theBoard.get_Turn_To_Play() == Piece.Tribe.White)
            {
                whitesturn.setText("WHITE'S TURN");
                blacksturn.setText("black");
            }
            else
            {
            	blacksturn.setText("BLACK'S TURN");
            	whitesturn.setText("white");
            }
            
            movingsquare.setText("unselected");
            endingsquare.setText("unselected");
            if(theBoard.get_Turn_To_Play() == Piece.Tribe.White)
            {
                if(theBoard.in_Danger(theBoard.get_White_King()))
                inCheck.setText("WHITE YOU ARE IN CHECK");
            }
            
            if(theBoard.get_Turn_To_Play() == Piece.Tribe.Black)
            {
                if(theBoard.in_Danger(theBoard.get_Black_King()))
                inCheck.setText("BLACK YOU ARE IN CHECK");
            }
            
           
            theBoard.get_Possible_Moves();  // to be removed, this checks whether possible moves method is working
          }
          else
          {
              System.out.println("RUT ROW TRY AGAIN");
            }
        }
    
        catch(Exception exception)
        {
            System.out.println("i don't understand");
        }
    }
    }
   
   
   
   
   
   
   
   
   
   



    public JPanel createContentPane (){

        JPanel totalGUI = new JPanel();

        // We create a JPanel with the GridBagLayout.
        // We also create a GridBagConstraints Object.
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
         theBoard = new Board();
        System.out.println(theBoard.toString());
         squares = theBoard.get_Squares();
        GamePanel[][][] Visual_Squares = new GamePanel[5][5][5];
        MoveButton movebutton = new MoveButton("Move");
        whitesturn = new JLabel("WHITE'S TURN");
        blacksturn = new JLabel("black");
        movingsquare = new JLabel("Unselected");
        endingsquare = new JLabel("Unselected");
        inCheck = new JLabel("In Check");
        
         for(int z=4; z>-1; z--)
         {
              for(int x =4; x>-1; x--)
              {
                  for(int y=4; y>-1; y--)
                  {
               Visual_Squares[x][y][z] = new GamePanel(squares[x][y][z]);
               if((x+y+z)%2 ==0)
               Visual_Squares[x][y][z].setBackground(Color.black);
               
               else
               Visual_Squares[x][y][z].setBackground(Color.white);
                   }
              }
         }
        
        
        c.gridx = 5;
        c.gridy = 5;
        JLabel[] fil = new JLabel[15];
        JLabel blank1 = new JLabel("");
        JLabel blank2 = new JLabel("");
        for(int i =0; i<5 ;i++)
        {
        	fil[i] = new JLabel(""+i);
            fil[i].setBackground(Color.blue);
        }
        
        
         for(int x=0; x<5; x++)
        {
            
            for(int y=0; y<5; y++)
            {
                    
                    c.gridx =  5 + x;
                    c.gridy =  5+ (4-y);
                    c.weightx = 1;
                    c.weighty = 1;
                    c.ipadx = 30;
                    c.ipady = 30;
                    c.fill=GridBagConstraints.BOTH;
                    mainPanel.add(Visual_Squares[x][y][4],c);
                                       
                    c.gridx = 5 + x;
                    c.gridy = 14 + (4-y);
                    mainPanel.add(Visual_Squares[x][y][3],c);
                    
                    c.gridy = 21 + (4-y);
                    c.gridx = 5+ x;
                    mainPanel.add(Visual_Squares[x][y][2],c);
                    
                    
                    c.gridx = 14 + x;
                    c.gridy = 14+ (4-y);
                    mainPanel.add(Visual_Squares[x][y][1],c);
                    
                    c.gridx = 14 + x;
                    c.gridy = 21 + (4-y);
                    mainPanel.add(Visual_Squares[x][y][0],c);
                    
                    
            }
            
        }
         
         

         c.gridx = 5;
         c.gridy =12;
         c.weightx =.2;
         c.weighty =.2;
         c.ipady = 2;
         mainPanel.add(fil[4],c);
         c.gridy = 19;
         mainPanel.add(fil[3],c);
         c.gridy = 26;
         mainPanel.add(fil[2],c);
         c.gridy =19;
         c.gridx = 14;
         mainPanel.add(fil[1],c);
         c.gridy = 26;
         mainPanel.add(fil[0],c);
         c.gridx = 12;
         c.gridy = 16;
         mainPanel.add(blank1,c);
         c.gridy = 22;
         mainPanel.add(blank2,c);
         
         
         
         
         c.gridy = 6;
         c.gridx = 30;
         mainPanel.add(whitesturn, c);
         c.gridx = 36;
         mainPanel.add(blacksturn,c);
         c.gridy = 8;
         c.gridx = 33;
         mainPanel.add(movebutton,c);
         c.gridy = 7;
         c.gridx = 30;
         mainPanel.add(movingsquare,c);
         c.gridx = 36;
         mainPanel.add(endingsquare,c);
         c.gridx = 33;
         c.gridy = 9;
         mainPanel.add(inCheck,c);

        totalGUI.add(mainPanel);
        totalGUI.setOpaque(true);
        return totalGUI;
    }




    //private static
    void createAndShowGUI() {

        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("CHESSBOARD GRIDBAG");

        ChessGridBag demo = new ChessGridBag();
        frame.setContentPane(demo.createContentPane());    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        
        
        
    }
    
    void checkGUI()
    {
      /*          while(true)
        {
            System.out.println(moveMade);
            if(moveMade)
            {
                System.out.println("move made");
                in_coord.setX(-8);
                out_coord.setX(-8);
                moveMade = false;
            }
        }
        */
    }

    

    
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
              //  createAndShowGUI();

            }
        });
    }
    
    
   
  
}