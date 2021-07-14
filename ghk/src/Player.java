public class Player {
    private String fullName;
    private int number;
    private Position position;

    
    public Player(int number, String fullName, Position position) {
        this.fullName = fullName;
        this.number = number;
        this.position = position;
    }


    public String getFullName() {
        return fullName;
    }


    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getNumber() {
        return number;
    }


    public void setNumber(int number) {
        this.number = number;
    }


    public Position getPosition() {
        return position;
    }


    public void setPosition(Position position) {
        this.position = position;
    }


    @Override
    public String toString() {
        return "Player [number=" + number + ", fullName=" + fullName + ", position=" + position + "]";
    }

   
}
