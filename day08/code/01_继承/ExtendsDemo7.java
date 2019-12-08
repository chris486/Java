class Bird {
    public void fly() {
        System.out.println("Hello, I can fly.");
    }
}

class Hen extends Bird {
    public void fly() {
        System.out.println("Sorry, I can't fly.");
    }
    public static void main(String[] args) {
        Hen yellowhen = new Hen();
        yellowhen.fly();
    }
}