
public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 50;
		segundaConta.agencia = 585;
		
		
		System.out.println("Primeira conta tem R$ " + primeiraConta.saldo);
		System.out.println("Segunda conta tem R$ " + segundaConta.saldo);
		System.out.println(primeiraConta.agencia);
		System.out.println(segundaConta.agencia);
	}
}
