public class App {
    public static void main(String[] args) throws Exception {
        double euros = 1;
        double valordepesos = 166.386;

        System.out.printf("%.2f euros son %.2f pesetas.", (float)euros, (euros * valordepesos));
    }
}
