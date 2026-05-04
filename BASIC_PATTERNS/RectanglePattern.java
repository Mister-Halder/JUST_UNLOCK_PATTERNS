public class RectanglePattern {
    public static void solidRectangle(int n, int m) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        solidRectangle(4, 8);
    }
}