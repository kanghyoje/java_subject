package polymorphsim.animal;

public class AnimalTest {
    public static void main(String[] args) {
//        AnimalTest aTest = new AnimalTest();
//        aTest.moveAnimal(new Human());
//        aTest.moveAnimal(new Tiger());
//        aTest.moveAnimal(new Eagle());
        Animal ani = new Tiger();
        if(ani instanceof Human h) {
            h.move();
        } else if(ani instanceof Tiger t) {
            t.move();
        }
    }

    public void moveAnimal(Animal ani) {
        ani.move();
    }
}
