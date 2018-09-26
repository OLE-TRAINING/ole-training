package Rovers;

public class Rover extends Plateau {
    private int x;
    private int y;
    private char direction;

    @Override
    public int getLimitX() {
        return super.getLimitX();
    }

    @Override
    public void setLimitX(int limitX) {
        super.setLimitX(limitX);
    }

    @Override
    public int getLimitY() {
        return super.getLimitY();
    }

    @Override
    public void setLimitY(int limitY) {
        super.setLimitY(limitY);
    }

    public char getDirection() {
        return direction;
    }

    public void setDirection(char direction) {
        this.direction = direction;
    }

    public Rover(int limitX, int limitY, int x, int y, char direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
        setLimitX(limitX);
        setLimitY(limitY);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void defineLimits() {
        if (getX() > getLimitX()) {
            System.out.println("Esse rover caiu da plataforma");
        } else if (getY() > getLimitY()) {
            System.out.println("Esse rover caiu da plataforma");
        }
    }

    public void move() {
        if (getDirection() == 'N') {
            setY(getY() + 1);
        } else if (getDirection() == 'S') {
            setY(getY() - 1);
        } else if (getDirection() == 'E') {
            setX(getX() + 1);
        } else if (getDirection() == 'W') {
            setX(getX() - 1);
        }
    }

    public void turn(char left) {
        if (getDirection() == 'N') {
            setDirection('W');
        } else if (getDirection() == 'S') {
            setDirection('E');
        } else if (getDirection() == 'E') {
            setDirection('N');
        } else if (getDirection() == 'W') {
            setDirection('S');
        }
    }

    public void turn(int right) {
        if (getDirection() == 'N') {
            setDirection('E');
        } else if (getDirection() == 'S') {
            setDirection('W');
        } else if (getDirection() == 'E') {
            setDirection('S');
        } else if (getDirection() == 'W') {
            setDirection('N');
        }
    }
}