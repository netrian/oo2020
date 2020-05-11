public class Cat implements AnimalInterface{
    
    public void voice(){
        System.out.println("Meow");
    }

    public void sleep(int hours){
        System.out.println("This cat sleeps "+hours+" hours a day");
    }

    public void attack(boolean kill){
        if(kill == true){
            System.out.println("This cat will try to kill you");
        } else {
            System.out.println("This cat is friendly");
        }
    }
}