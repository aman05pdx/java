public class QuickQuiz_2 {
    public static void main(String[] args) {
        float x = 10, y = 4, z = 2;
        float avg = (x - y) / 2f;
        System.out.println(avg);

        float quad = ((x * x) - 4 * y * z) / 2 * y;
        System.out.println(quad);

        float pow = (x * x) - (y * y);
        System.out.println(pow);

        float third = x * y - z;
        System.out.println(third);
//both will give the same output as multiplication and subtraction occurs left to right.
        float fourth = (x * y) - z;
        System.out.println(fourth);
    }
}
