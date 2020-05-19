public class Cat implements AnimalInterface{

    @Override
    public void sleep(int hours) {
        System.out.println("This cat sleeps "+hours+" hours a day");

    }

    @Override
    public void voice() {
        System.out.println("Meow");

    }

    @Override
    public void attack(boolean agro) {
        if(agro == true){
            System.out.println("This cat will try to kill you");
        } else {
            System.out.println("This cat is friendly");
        }
    }
    

}