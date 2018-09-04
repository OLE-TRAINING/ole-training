package ExerciciosChapter4;

public class Exer16cap4 {

    public static void main (String args[]){
        Conta cc [] = new Conta [1];
        cc[0] = new Conta("1234",1543.0,2000.0);
        cc[0].cadastrarCliente(cc);
        cc[0].verCadastro(cc,0);
        cc[0].sacar(323.0);
        cc[0].verSaldo(cc,0);
        System.out.println("Após saque!");
        cc[0].depositar(30.0);
        cc[0].verSaldo(cc,0);
        System.out.println("Após depósito!");
    }
}
