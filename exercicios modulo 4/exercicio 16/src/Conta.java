public class Conta {
              Pessoa pessoa = new Pessoa("Bruno",13,"1122222123");
              private int numero=0;  
              private int saldo=0;
              private int limite=0;
              
              public Conta(int numero,int saldo,int limite) {
            	  this.numero=numero;
            	  this.saldo=saldo;
            	  this.limite=limite;
              }
              
              public boolean sacar(int grana) {
            	  if(this.saldo<grana) {
            		  return false;
            	  }
            	  return true;
              }
              
              public int saldoAtual() {
            	  return saldo;
              }
}
