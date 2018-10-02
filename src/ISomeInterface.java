interface ISomeInterface extends IOtherInterface {
    public static final int SOME_VARIABLE = 5;

    public abstract void addTwoDigits(int one, int two);
}

interface IOtherInterface {
    void someMethod();
}

interface Bouncable {
    void bounce();
}

class Example implements ISomeInterface, Bouncable {
    @Override
    public void addTwoDigits(int one, int two) {
        SOME_VARIABLE = 7; // already defined as public static final
    }

    @Override
    public void someMethod() {
        System.out.println("Some printing");
    }

    @Override
    public void bounce() {
        System.out.println("Bounce!!");
    }
}