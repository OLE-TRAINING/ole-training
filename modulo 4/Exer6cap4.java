package ExerciciosChapter4;

public class Exer6cap4 {

    public static void main (String args[]) {
        Triangulo tri = new Triangulo();
        tri.setDecartesPlan(tri.getDecartesPlan());
        PlanoCartesiano hp = new PlanoCartesiano();
        PlanoCartesiano catOp = new PlanoCartesiano();
        PlanoCartesiano catAdj = new PlanoCartesiano();
        hp.setX(2.0);
        hp.setY(5.0);
        catOp.setX(3.0);
        catOp.setY(7.0);
        catAdj.setX(5.0);
        catAdj.setY(11.0);
        tri.criaTriangulo(hp,catOp,catAdj);
        boolean resp = tri.ehTriangulo(tri.getDecartesPlan());
        System.out.println(resp);
    }
}