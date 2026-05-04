public class SquarePattern {
    public static void solidSquare(int n, int m) {
        for(int i=1; i<=m; i++) {
            for(int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        solidSquare(5, 5);
    }
}
