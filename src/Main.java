import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int[] row : calculateArrSum(scanner)) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] calculateArrSum(Scanner scanner) {
        System.out.println("Mời bạn nhập số hàng ma trận A: ");
        int rowA = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số cột ma trận A: ");
        int columnA = Integer.parseInt(scanner.nextLine());
        System.out.println("MỜi bạn nhập số hàng ma trận B:");
        int rowB = Integer.parseInt(scanner.nextLine());
        System.out.println("MỜi bạn nhập số cột ma trận B:");
        int columnB = Integer.parseInt(scanner.nextLine());

        int arrA[][] = new int[rowA][columnA];
        int arrB[][] = new int[rowB][columnB];

        int[][] arrSum = new int[0][];
        if (rowA != rowB || columnA != columnB) {
            System.out.println("KHông thể hiển thị được");
        } else {
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.println("Nhập hàng thứ " + (i + 1) + " cột thứ " + (j + 1) + " của ma trận A");
                    arrA[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.println("Nhập hàng thứ " + (i + 1) + " cột thứ " + (j + 1) + "= của ma trận B");
                    arrB[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            System.out.println("Ma trận A là:");
            for (int i = 0; i < rowA; i++) {
                for (int j = 0; j < columnA; j++) {
                    System.out.print(arrA[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("Ma trận B là:");
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    System.out.print(arrB[i][j] + "\t");
                }
                System.out.println();
            }

            arrSum = new int[rowB][columnB];
            for (int i = 0; i < rowB; i++) {
                for (int j = 0; j < columnB; j++) {
                    arrSum[i][j] = arrA[i][j] + arrB[i][j];
                }
            }
            System.out.println("Tổng 2 ma trận là:");
        }
        return arrSum;
    }
}
