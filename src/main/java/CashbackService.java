public class CashbackService {
    int calculate(int sum, int rate) {
        int cashback = (sum * rate / 100);
        return cashback;
    }
}
