public class Main {
    public static void main(String[] args) {
        int[] sales = {300,200,100000,20000,12000};
        SalesManager manager = new SalesManager(sales);
        System.out.println("Максимальная продажа: " + manager.max());
        System.out.println("Минимальная продажа: " + manager.min());
        System.out.println("Среднее обрезанное: " + manager.arithmeticMean());
    }
}