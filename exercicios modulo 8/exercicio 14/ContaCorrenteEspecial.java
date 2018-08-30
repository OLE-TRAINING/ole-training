
public class ContaCorrenteEspecial extends ContaCorrente{
        private float limiteExtra=0;
       
        public ContaCorrenteEspecial(float saldo,float limite) {
        	super(saldo,limite);
        	this.limiteExtra=limite;
        }
        //getter
        public float getLimiteExtra() {
        	return this.limiteExtra;
        }
        
        //setters
        public void setLimiteExtra(float valor) {
        	this.limiteExtra=valor;
        }
        
        public void saqueEspecial(float valor) {
        	if(valor<=getSaldoTotal()) {
        		sacar(valor);
        	}else if(valor<=getSaldoTotal()+getChequeEspecial()) {
        		sacar(getSaldoTotal());
        		valor=valor-getSaldoTotal();
        		 sacarChequeEspecial(valor);
        	}else {
        		throw new IllegalArgumentException("Valor passa do limite!!!");
        	}
        }
        
        public void depositoEspecial(float valor) {
        	if(getChequeEspecial()<limiteExtra&&valor>(limiteExtra-getChequeEspecial())) {
        		depositarChequeEspecial(valor-(limiteExtra-getChequeEspecial()));
        		valor=valor-(limiteExtra-getChequeEspecial());
        		depositar(valor);
        	}
        	depositar(valor);
        }
}
