public class DiamondPattern {
    public static void createDiamond(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }
            int m = ((2*i)-1);
            for(int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=(n-i); j++) {
                System.out.print("  ");
            }
            int m = ((2*i)-1);
            for(int j=1; j<=m; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        createDiamond(4);
    }
}