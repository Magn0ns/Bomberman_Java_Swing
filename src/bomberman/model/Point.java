package bomberman.model;

import java.util.Objects;

public class Point { //coordinate

    int i;
    int j;
    int speed;

    public Point(int i, int j,int speed) {
        this.i = i;
        this.j = j;
        this.speed=speed;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getSpeed(){return speed;}

    public void setSpeed(int speed){this.speed=speed;}

    @Override
    public String toString() {
        return "Point{" +
                "i=" + i +
                ", j=" + j +
                ", speed=" + speed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return getI() == point.getI() && getJ() == point.getJ() && getSpeed()==point.getSpeed();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getI(), getJ(),getSpeed());
    }
}
