package racing;

public class Car implements Comparable<Car>{
    static final char POSITION_IMAGE = '-';
    static final int STOP_STANDARD = 4;
    private String name;
    private int carPosition = 0;

    public Car(String name) {
        this.name = name;
    }

    public void move(int randNum) {
        carPosition = randNum > STOP_STANDARD ? carPosition + 1 : carPosition;
    }

    public String getCarDistance() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" : ");
        for (int i = 0; i < carPosition; i++)
            sb.append(POSITION_IMAGE);

        return sb.toString();
    }

    public String getWinner(Car c) {
        return c.carPosition == this.carPosition ? name + "," : "";
    }

    @Override
    public int compareTo(Car c) {
        if(this.carPosition > c.carPosition) return -1;
        else if (this.carPosition < c.carPosition) return 1;
        else return 0;
    }
}