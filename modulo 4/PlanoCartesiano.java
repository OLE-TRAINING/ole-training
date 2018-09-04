package ExerciciosChapter4;

public class PlanoCartesiano{
    private double x;
    private double y;

    public PlanoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public PlanoCartesiano() {
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}