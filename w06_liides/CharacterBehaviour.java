/**
 * CharacterBehaviour
 */
public interface CharacterBehaviour {

    public void move();
    public void changeDirection();
    public void speak();
    public String getName();
    int[] getXY();
}

