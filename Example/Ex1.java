//package Example;

// Đề bài: Đặt N quân hậu trên bàn cờ NxN

public class Ex1 {
          private static int N = 5;

          private static boolean isSave(int[][] board , int row, int col) {
                    // kiểm tra hàng hiện thời hàng bên trái đã có quân hậu nào chưa?
                    for (int i = 0; i < col; i++) {
                              if (board[row][i] == 1) {
                                        return false;
                              }
                    }
                    // kiểm tra đường chéo trên của ô đã có quân hậu nào chưa
                    for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                              if (board[i][j] == 1) {
                                        return false;
                              }
                    }
                    // kiểm tra đường chéo dưới của ô đã có quân hậu nào chưa
                    for (int i = row, j = col; i < N && j >= 0 ; i++, j--) {
                              if (board[i][j] == 1) {
                                        return false;
                              }
                    }                          
                    return true;
          }

          private static boolean sovleQueen(int[][] board, int col) {
                    if (col >= N) {
                              return true;
                    }
                    // kiểm tra hàng hiện tại và đặt đúng vị trí
                    for (int i = 0; i < N; i++) {
                              if (isSave(board, i, col)) {
                                        board[i][col] = 1;
                                        if (sovleQueen(board, col + 1)) {
                                                  return true;
                                        } else {
                                                  board[i][col] = 0;
                                        }
                              }
                    }
                    return false;
          }

          private static void showResult(int[][] board) {
                    for (var row : board) {
                              for (var col : row ) {
                                        System.out.printf("%3d", col);
                              }
                              System.out.println();
                    }
          }

          public static void main(String[] args) {
                    int[][] board = new int[N][N];
                    boolean result = sovleQueen(board, 0);
                    if (result) {
                              System.out.println("Mot trong cac loi giai la");
                              showResult(board);
                    } else {
                              System.out.println("Khong tim thay loi giai nao");
                    }
          }
}
