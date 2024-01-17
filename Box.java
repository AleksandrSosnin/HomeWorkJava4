import java.util.ArrayList;

public class Box<T extends Weighable> {
    private ArrayList<T> fruits = new ArrayList<>();

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }

    public boolean compare(Box<?> anotherBox) {
        return Math.abs(this.getWeight() - anotherBox.getWeight()) < 0.0001;
    }

    public void transferFruitsTo(Box<T> anotherBox) {
        if (this == anotherBox) {
            return;
        }

        if (this.fruits.get(0).getClass() != anotherBox.fruits.get(0).getClass()) {
            System.out.println("Нельзя пересыпать фрукты разных типов!");
            return;
        }

        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}