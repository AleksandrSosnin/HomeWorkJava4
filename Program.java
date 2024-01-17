public class Program {
    public static void main(String[] args) {
        
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());

        
        System.out.println("Вес коробки с яблоками 1: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами 1: " + orangeBox1.getWeight());

        
        System.out.println("Сравнение коробки с яблоками 1 и яблоками 2: " + appleBox1.compare(appleBox2));
        System.out.println("Сравнение коробки с яблоками 1 и апельсинами 1: " + appleBox1.compare(orangeBox1));

        
        System.out.println("Пересыпаем фрукты из коробки с яблоками 1 в коробку с яблоками 2");
        appleBox1.transferFruitsTo(appleBox2);

        
        System.out.println("Вес коробки с яблоками 1 после пересыпки: " + appleBox1.getWeight());
        System.out.println("Вес коробки с яблоками 2 после пересыпки: " + appleBox2.getWeight());
    }
}
