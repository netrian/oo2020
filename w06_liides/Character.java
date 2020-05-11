import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Character
 */
// Override Overload
public class Character implements CharacterBehaviour{

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        Character c = new Character();
        System.out.println(c.isEmpty());
    }

    @Override
    public void move() {
        System.out.println("I moved");
    }

    @Override
    public void changeDirection() {
        //TODO Auto-Generated method stub
    }

    @Override
    public void speak() {
        //TODO Auto-Generated method stub
    }

    @Override
    public String getName() {
        //TODO Auto-Generated method stub
        return null;
    }
    
    @Override
    public int[] getXY() {
        //TODO Auto-Generated method stub
        return null;
    }

    @Override
    public int size() {
        //TODO
        return null;
    }   

    

}