//package Example;

public class Sudoku {
        private static final int SIZE = 9;

        private static void printTopic(int[][] matrix) {
            for (int i = 0; i < matrix.length; i++) {
                if (i%3 == 0 && i != 0) {
                    System.out.println("---------------------");
                }
                              
                for (int j = 0; j < matrix[0].length; j++) {
                    if (j%3 == 0 && j != 0) {
                        System.out.print("| ");
                    }

                    if (j == 8) {
                        System.out.print(matrix[i][j]);
                    } else {
                        System.out.print(matrix[i][j] + " ");
                    }
                }
                System.out.println();
            }
        }

        private static boolean isNumberInRow(int[][] matrix, int number, int row) {
            for (int i = 0; i < SIZE; i++) {
                if (matrix[row][i] == number) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isNumberInColumn(int[][] matrix, int number, int col) {
            for (int i = 0; i < SIZE; i++) {
                if (matrix[i][col] == number) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isNumberInBox(int[][] matrix, int number, int row, int col) {
            int localBoxRow = row - row % 3;
            int localBoxColumn = col - col % 3;

            for (int i = localBoxRow; i < localBoxRow + 3; i++) {
                for (int j =  localBoxColumn; j < localBoxColumn + 3; j++) {
                    if (matrix[i][j] == number) {
                        return true;
                    }
                }
            }
            return false;
        }

        private static boolean isValidPlacement(int[][] matrix, int number, int row, int col) {
            return !isNumberInRow(matrix, number, row) &&
                !isNumberInColumn(matrix, number, col) &&
                !isNumberInBox(matrix, number, row, col);
        }
        
        private static boolean solvetMatrix(int[][] matrix) {
            for (int row = 0; row < SIZE; row++) {
                for (int col = 0; col < SIZE; col++) {
                    if (matrix[row][col] == 0) {
                        for (int numberToTry = 1; numberToTry <= SIZE; numberToTry++) {
                            if (isValidPlacement(matrix, numberToTry, row, col)) {
                                matrix[row][col] = numberToTry;

                                if (solvetMatrix(matrix)) {
                                    return true;
                                } else {
                                    matrix[row][col] = 0;
                                }
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[][] matrix = {
                              {6,0,5,7,4,0,0,0,0},
                              {7,0,4,6,0,2,0,5,8},
                              {2,0,0,0,0,0,6,7,0},
                              {0,2,0,4,0,5,7,8,0},
                              {0,0,0,0,0,0,5,2,6},
                              {0,0,0,0,7,6,0,3,0},
                              {5,6,8,0,9,0,0,4,0},
                              {0,4,0,0,6,7,0,9,5},
                              {0,9,7,5,0,0,0,6,0}
                    };
            printTopic(matrix);
            if (solvetMatrix(matrix)) {
                System.out.println("\nCo duoc 1 trong nhung cach giai Sudoku\n");
                printTopic(matrix);
            } else {
                System.out.println("Khong the giai duoc Sudoku");
            }
        }
}
