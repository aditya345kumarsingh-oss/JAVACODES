package abstraction;

interface Animal {
    void fly();
    void eat();
}

class Bird implements Animal {
    public void fly() {
        System.out.println("Bird is flying");
    }
    public void eat() {
        System.out.println("Bird is eating");
    }
}

public class main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        bird.eat();
    }
}
