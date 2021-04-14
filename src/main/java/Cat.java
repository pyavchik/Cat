public class Cat extends Animal {
    private String name;
    private String color;
    private double weight;
    private int age;
    private boolean isWise;

    public Cat(String name, String color, double weight, int age, boolean isWise) {
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.age = age;
        this.isWise = isWise;
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating... \n", this);
    }

    @Override
    public void sleep() {
        System.out.printf("%s is sleeping...\n", this);
    }

    @Override
    public String toString() {
        return "Cat " + name
                + ", color " + color
                + ", weight " + weight
                + ", age " + age + ","
                + (isWise ? " wise " : " silly");
    }
}
