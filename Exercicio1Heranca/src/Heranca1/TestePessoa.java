package Heranca1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa harris = new Pessoa("Peter Jordan", "Avenida Paulista, São Paulo, Brasil", "88888-8888");
		System.out.println("Nome: "+harris.getNome());
		System.out.println("Endereço: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		//"Inserindo informações nos argumentos de Pessoa() e, em seguida, imprimindo essas informações.
		System.out.println("\n--------------------------");
		
		harris.setNome("Henrique");
		harris.setEndereco("Avenida Brigadeiro Faria Lima, São Paulo, Brasil");
		harris.setTelefone("99999-9999");
		System.out.println("\nNome: "+harris.getNome());
		System.out.println("Endereço: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		//Dando SET nos atributos Private de Pessoa() e imprimindo essas informações para se verificar se realmente foi "SETado".
		System.out.println("\n--------------------------");
		
		Fornecedor sadia = new Fornecedor("Sadia",1000,900);
		System.out.printf("\nCrédito: R$ %.2f", sadia.getValorCredito());
		System.out.printf("\nDívida: R$ %.2f", sadia.getValorDivida());
		System.out.printf("\nA diferença entre o seu crédito e a sua dívida com a "+sadia.getNome()+" é de: "+sadia.formatarObterSaldo());
		//Verificando se o método obterSaldo() funciona.
		System.out.println("\n\n--------------------------");
		
		
	}

}
