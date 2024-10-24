package q2;

import java.util.ArrayList;

public class MatrixRunner {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);

        matrix.set(0, 0, "Top-left");
        matrix.set(1, 1, "Center");
        matrix.set(2, 2, "Bottom-right");

        System.out.println("Cell (1, 1): " + matrix.get(1, 1)); // Expected Output: "Center"

        ArrayList<Matrix.Cell> describedCells = matrix.getDescribedCells();
        System.out.println("Described Cells:");
        for (Matrix.Cell cell : describedCells) {
            System.out.println(cell); // Print the row and column of each described cell
        }
    }
}

