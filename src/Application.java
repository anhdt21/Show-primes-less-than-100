public class Application {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Cac so nguyen to nho hon 100 la: ");
        for (int i = 2; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
                if (count == 2 && i == j) {
                    System.out.println(i);
                    count = 0;
                }
                if (i == j) {
                    count = 0;
                }
            }
        }
    }
}
