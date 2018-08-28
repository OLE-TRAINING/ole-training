public class exer7cap2 {

    public static void main (String args []){
        int soma = 0;
        long multiplica = 1;
        for (int i=1; i<=30; i++){
            if(i%2!=0){
                soma += i;
                System.out.println("Soma["+ i +"] = "+soma);
            } else {
                multiplica *= i;
                System.out.println("Multiplicação["+ i +"] = "+ multiplica);
            }
        }
    }
}