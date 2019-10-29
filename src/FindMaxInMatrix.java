import java.util.Random;
import java.util.Scanner;

public class FindMaxInMatrix {
    public static void main(String[] args) {
//        Random matrixElement = new Random();
//        double[][] arr = new double[5][5];
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                arr[i][j] = matrixElement.nextDouble();
//            }
//        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Row Array");
        int row = scanner.nextInt();
        System.out.println("Column Array");
        int column = scanner.nextInt();
        double arr[][] = new double[row][column];
        System.out.println("Element in array");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        System.out.println("Max la: " + findmaxMatrix(arr));
    }


    public static double findmaxMatrix(double[][] arr) {
        double max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
