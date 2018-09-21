package ExerciciosChapter4;

public class Triangulo {
    private PlanoCartesiano decartesPlan [] = new PlanoCartesiano[3];

    public PlanoCartesiano[] getDecartesPlan() {
        return decartesPlan;
    }

    public void setDecartesPlan(PlanoCartesiano[] decartesPlan) {
        this.decartesPlan = decartesPlan;
    }

    public boolean ehTriangulo(PlanoCartesiano[] pc){
        setDecartesPlan(pc);
        double x1 = getDecartesPlan()[0].getX();
        double y1 = getDecartesPlan()[0].getY();
        double x2 = getDecartesPlan()[1].getX();
        double y2 = getDecartesPlan()[1].getY();
        double x3 = getDecartesPlan()[2].getX();
        double y3 = getDecartesPlan()[2].getY();
        double diagPri01 = x1 * y2 * 1;
        double diagPri02 = y1 * 1 * x3;
        double diagPri03 = 1 * x2 * y3;
        double diagSec01 = x3 * y2 * 1;
        double diagSec02 = y3 * 1 * x1;
        double diagSec03 = 1 * x2 * y1;

        double det = -(diagSec01 + diagSec02 + diagSec03) + (diagPri01 + diagPri02 + diagPri03);

        if (getDecartesPlan()[0] != getDecartesPlan()[1] && getDecartesPlan()[0] !=getDecartesPlan()[2]
                && getDecartesPlan()[1]!=getDecartesPlan()[2] && det != 0 && getDecartesPlan().length==3){
            return true;
        }
        return false;
    }

    public void criaTriangulo(PlanoCartesiano p1, PlanoCartesiano p2, PlanoCartesiano p3){
        this.decartesPlan[0] = p1;
        this.decartesPlan[1] = p2;
        this.decartesPlan[2] = p3;
    }
}