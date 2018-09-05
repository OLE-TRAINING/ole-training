public class Execute {

	public static void main(String[] args) {
		ContaCorrenteEspecial conta = new ContaCorrenteEspecial(100000, 55000);
		show(conta);

		for (int i = 0; i < 500000; i = i + 50000) {
			System.out.println("\nSacando: " + i);
			conta.saqueEspecial(i);
			show(conta);
		}
	}

	public static void show(ContaCorrenteEspecial conta) {
		System.out.println("Limite Extra:" + conta.getLimiteExtra());
		System.out.println("Saldo Total:" + conta.getSaldoTotal());
		System.out.println("Limite Cheque:" + conta.getChequeEspecial());
	}
}
