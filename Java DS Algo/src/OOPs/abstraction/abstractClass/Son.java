package OOPs.abstraction.abstractClass;

public class Son extends Parent{


    public Son(int age) {
        super(age);
    }

    @Override
    void familyBusiness() {
        System.out.println("I will carry forward my dad business -- Son" + age);
    }

    @Override
    void ownBusiness() {
        System.out.println("Well I am planning to open the business");
    }
}
