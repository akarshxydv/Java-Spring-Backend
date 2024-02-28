package OOPs.classAndObject.abstraction.abstractClass;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }

    @Override
    void familyBusiness() {
        System.out.println("No I am into my family business - Daughter");
    }

    @Override
    void ownBusiness() {
        System.out.println("Yeah will start my own business -- Daughter" + age);
    }
}
