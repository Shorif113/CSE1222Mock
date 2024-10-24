package q2;

import java.util.ArrayList;

public class Matrix {
     String[][] grid;

     public Matrix(int numRows,int numColumns){
         grid =new String[numRows][numColumns];
     }
     public void set(int row,int column,String description){
         grid[row][column]=description;
     }
     public String get(int row,int column){
         return grid[row][column];
     }

     public ArrayList<Cell>getDescribedCells(){
         ArrayList<Cell>describedCells=new ArrayList<>();
         for(int i=0;i<grid.length;i++){
             for(int j=0;j<grid[i].length;j++){
                 if(grid[i][j]!=null){
                     describedCells.add(new Cell(i,j));
                 }
             }
         }
         return describedCells;
     }
    public class Cell {
        int row, col;

        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
        }

        public String toString() {
            return "Row: " + row + ", Column: " + col; // Returns row and column details
        }
    }
}


