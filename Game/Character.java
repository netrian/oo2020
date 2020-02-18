/**
 * Character
 */
public class Character {

    public int x;
    public int y;

    String slogan = "";

    private String name;
    private CharacterType characterType;
    public Direction direction;

    public Character(String name, CharacterType characterType){
        this.name = name;
        this.characterType = characterType;

        this.x = 30;
        this.y = 30;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and I am at x:" + x + " y:" + y + " and my slogan is: " + slogan;
    }

    void changeDirection(Direction direction){
        this.direction = direction;
    }

    void  move(){
        switch (this.direction) {
            case UP:
                this.y++;
                break;
            case RIGHT:
                this.x++;
                break;
            case DOWN:
                this.y--;
                break;
            case LEFT:
                this.x--;
                break;
        
            default:
                break;
        }
    }

}