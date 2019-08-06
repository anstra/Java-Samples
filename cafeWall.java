// Andy Straavaldson
// 1371913
// Section AM
// Program produces the Wall Illusion

import java.awt.*;
public class cafeWall {
   public static final int GAP = 2;
   public static void main (String[] args){
      DrawingPanel panel = new DrawingPanel (650, 400);
      Graphics g = panel.getGraphics();
      g.setColor(Color.GRAY);
      g.fillRect(0,0,650,400);
      pair(g, 0 , 0 , 20 , 4);
      pair(g, 50 , 70 , 30 , 5);
      grid(g, 10 , 150 , 25 , 4 , 4, 0);
      grid(g, 250 , 200 , 25, 3 , 3, 10);
      grid(g, 425 , 180 , 20 , 5 , 5, 10);
      grid(g, 400 , 20 , 35 , 2 , 2, 35);

   }
   
// method creates the base pair of squares and the Blue X on the
//black square
   
 public static void pair (Graphics g ,int x, int y, int size, int
sets){
      for (int i = 1; i <= sets; i ++){
         g.setColor(Color.BLACK);
         
 g.fillRect(x + ((2* size) * i - (2 * size)), y , size , size);
         g.setColor(Color.BLUE);
         
 g.drawLine(x + ((2* size) * i - (2 * size)) , y , x +(2 * size) * i -
size , y + size);
 
 g.drawLine(x + ((2* size) * i - (2 * size)), y + size ,x +(2 * size)
* i - size, y);
 
         g.setColor(Color.WHITE);
 g.fillRect(x + size + ((2* size) * i - (2 * size)) , y , size, size);
      	}
  }
   
 // method creates the grid function and rows with the gap between 
 //each row and the offset
   
 	public static void grid(Graphics g, int x, int y, int size, int sets,
 			int rows, int offset) {
 				for(int i = 1; i <= rows; i++){
         
    	  pair(g , x +offset, y + size + ((2 * size) * i - (2 * size)) + (GAP *(i-1)) , size, sets);
    	  pair(g , x , y +((2 * size) * i - (2 * size)) + (GAP *(i-1)), size , sets);}
         
   }

   
}   
  
