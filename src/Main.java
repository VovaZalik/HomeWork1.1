public class Main {
    public static void main(String[] args) {
        long[] sales = {100,123,423423,1212312,4324234};
        SalesManager manager = new SalesManager(sales);
        System.out.println(manager.max());
    }
}