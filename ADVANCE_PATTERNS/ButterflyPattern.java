public class ButterflyPattern {
    public static void makeButterfly(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            int m = (2*(n-i));
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            int m = (2*(n-i));
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        makeButterfly(4);
    }
}