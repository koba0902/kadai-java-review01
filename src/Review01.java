public class Review01 {
    public static void main(String[] args) {
        int price = 1500;
        double taxRate = 0.1;
        int tax = tax(price, taxRate);
        int includedPrice = price + tax;
        System.out.println(price + "円の商品の税込価格は" + includedPrice + "円（消費税は" + tax + "円）です。");
    }

    public static int tax(int price, double taxRate) {
        double tax = price * taxRate;
        int intTax = (int) tax; // 切り捨て
        return intTax;
    }
}