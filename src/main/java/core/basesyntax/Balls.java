package core.basesyntax;

public class Balls {
    private String color;
    private int number;

    public Balls(String color,int number) {
        this.color = color;
        this.number = number;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
