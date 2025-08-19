package Arrays;
import java.util.*;

public class SetMatrixZero {
    public static void MatrixZero(ArrayList<ArrayList<Integer>> matrix){
        int m = matrix.size();
        int n = matrix.get(0).size();
        boolean firstRowZero = false;
        boolean firstColZero = false;

        for(int i = 0; i < n; i++){
            if(matrix.get(0).get(i) == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i = 0; i < m; i++){
            if(matrix.get(i).get(0) == 0){
                firstColZero = true;
                break;
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix.get(i).get(j) == 0){
                    matrix.get(i).set(0, 0);
                    matrix.get(0).set(j, 0);
                }
            }
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0){
                    matrix.get(i).set(j, 0);
                }
            }
        }

        if(firstRowZero){
            for(int i = 0; i < n; i++){
                matrix.get(0).set(i, 0);
            }
        }

        if(firstColZero){
            for(int i = 0; i < m; i++){
                matrix.get(i).set(0, 0);
            }
        }
    }

    public static void printMatrix(ArrayList<ArrayList<Integer>> matrix){
        for(ArrayList<Integer> row : matrix){
            for(Integer ele :  row){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(2, 0, 1)));
        matrix.add(new ArrayList<>(Arrays.asList(3, 1, 4)));

        MatrixZero(matrix);
        printMatrix(matrix);
    }
}
