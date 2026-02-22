public class classwork {
    public static void main(String[] args) {

        int base = 16;

        for (int i = 1; i <= 3; i++) {
            int stars = 2 * i - 1;
            int spaces = (base - stars) / 2;  // FIXED CENTERING

            for (int s = 0; s < spaces; s++) System.out.print(" ");
            for (int j = 0; j < stars; j++) System.out.print("*");

            System.out.println();
        }

        for (int i = 0; i < 4; i++) {

            for (int s = 0; s < i; s++) System.out.print(" ");
            for (int j = 0; j < base - 2 * i; j++) System.out.print("*");
            System.out.println();
        }
    }
}
