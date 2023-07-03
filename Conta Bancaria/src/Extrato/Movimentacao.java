package Extrato;

public class Movimentacao {
	
	private String descricao;
	
	private double saldo = 8000;
	 	
	public void somar100Reais() {
		saldo =+ 100;
	}
	
	public void diminui100Reais() {
		saldo -= 100;
	}
	
	public void sacarDinheiro(double saque) {
		saldo -= saque;

	}
	
	public void depositarDinheiro (double deposito) {
		saldo =+ deposito;
	}
		
	

}
