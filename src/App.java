public class App {
    public String name = "Singa";
    public int age = 4;
    public String furcolor = "orange";
    public String sound = "raawrr";   

    public void speak() {
        System.out.println("My singa sound: " + sound);
    }

    public void getName() {
        System.out.println("My singa name: " + name);
    }

    public void getAge() {
        System.out.println("My singa age: " + age + " years old");
    }

    public void getFurcolor() {
        System.out.println("The fur color of my singa is: " + furcolor);
    }

    public static void main(String[] args){
        App hewan = new App();
        hewan.speak();
        hewan.getName();
        hewan.getAge();
        hewan.getFurcolor();
    }
}
