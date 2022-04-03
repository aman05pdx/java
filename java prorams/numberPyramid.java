public class numberPyramid {
    public static void main(String argsp[]) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
