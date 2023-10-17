
interface Animal{
    public void animalSound();
    public void sleep();
}

class  Pig implements Animal{
    public void animalSound(){
        System.out.println("WEE WEE");
    }
    public void sleep(){
        System.out.println("Zzz");

    }
}
class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}
