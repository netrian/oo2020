public class Dog implements AnimalInterface{

    @Override
    public void sleep(int hours) {
        System.out.println("This dog sleeps for "+hours+" hours a day");
    }

    @Override
    public void voice() {
        System.out.println("Woof");

    }

    @Override
    public void attack(boolean agro) {
        if(agro == true){
            System.out.println("This dog will most likely eat you alive");
            } else {
                System.out.println("This puppy will lick your face a lot");
            }
    }

}