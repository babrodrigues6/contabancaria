package Extrato;

public class executando {
	
	public static void main(String[] args) {
		
		Movimentacao movimentacao = new Movimentacao();
		movimentacao.setDescricao("Conta da Babi");
		
		System.out.println(movimentacao);
		
		movimentacao.depositarDinheiro(100);
		System.out.println(movimentacao);
		
		movimentacao.sacarDinheiro(500);
		System.out.println(movimentacao);
		
		movimentacao.diminui100Reais();
		System.out.println(movimentacao);
		
		movimentacao.depositarDinheiro(1500);
		System.out.println(movimentacao);
		
		
	}

}
