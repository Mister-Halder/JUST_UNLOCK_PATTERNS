public class PascalsTrianglePattern {
     public static int fact(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }
     public static int nCr(int n, int r) {
        return fact(n) / (fact(r) * fact(n - r));
    }
    public static void makepascalTriangle(int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for(int j = 0; j <= i; j++) {
                System.out.print(nCr(i, j) + "   ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        makepascalTriangle(5);
    }
}
