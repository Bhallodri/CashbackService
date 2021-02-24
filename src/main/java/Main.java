public class Main {
    public static void main(String[] args) {
        CashbackService service = new CashbackService();
        int cashback = service.calculate(1000, 3);
        System.out.println(cashback);
    }
}
