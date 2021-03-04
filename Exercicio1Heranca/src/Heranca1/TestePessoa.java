package Heranca1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa harris = new Pessoa("Peter Jordan", "Avenida Paulista, S�o Paulo, Brasil", "88888-8888");
		System.out.println("Nome: "+harris.getNome());
		System.out.println("Endere�o: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		//"Inserindo informa��es nos argumentos de Pessoa() e, em seguida, imprimindo essas informa��es.
		System.out.println("\n--------------------------");
		
		harris.setNome("Henrique");
		harris.setEndereco("Avenida Brigadeiro Faria Lima, S�o Paulo, Brasil");
		harris.setTelefone("99999-9999");
		System.out.println("\nNome: "+harris.getNome());
		System.out.println("Endere�o: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		//Dando SET nos atributos Private de Pessoa() e imprimindo essas informa��es para se verificar se realmente foi "SETado".
		System.out.println("\n--------------------------");
		
		Fornecedor sadia = new Fornecedor("Sadia",1000,900);
		System.out.printf("\nCr�dito: R$ %.2f", sadia.getValorCredito());
		System.out.printf("\nD�vida: R$ %.2f", sadia.getValorDivida());
		System.out.printf("\nA diferen�a entre o seu cr�dito e a sua d�vida com a "+sadia.getNome()+" � de: "+sadia.formatarObterSaldo());
		//Verificando se o m�todo obterSaldo() funciona.
		System.out.println("\n\n--------------------------");
		
		
	}

}
