public class HollowButterflyPattern {
    public static void makehollowButterfly(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || i==j) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            int m = (2*(n-i));
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || i==j) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || i==j) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            int m = (2*(n-i));
            for(int j=1; j<=m; j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++) {
                if(i==1 || j==1 || i==j) {
                    System.out.print("*"+" ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        makehollowButterfly(4);
    }
}