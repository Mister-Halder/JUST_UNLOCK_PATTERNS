public class NewInvertedHalfPyramidWithNumbersPattern {
    public static void makeinvertedhalfpyramidwithNumbers(int n) {
         for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= (n - i + 1); j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        makeinvertedhalfpyramidwithNumbers(5);
    }
}
