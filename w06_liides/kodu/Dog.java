public class Dog implements AnimalInterface{
    
    public void sleep(int hours){
        System.out.println("This dog sleeps for "+hours+"hours a day");
    }

    public void voice(){
        System.out.println("Woof");
    }

    public void attack(boolean kill){
        if(kill == true){
            System.out.println("This dog will most likely eat you alive");
            } else {
                System.out.println("This puppy will lick your face a lot");
            }
    }

}