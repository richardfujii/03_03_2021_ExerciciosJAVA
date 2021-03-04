package Heranca1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa harris = new Pessoa("Peter Jordan", "Avenida Paulista, São Paulo, Brasil", "88888-8888");
		System.out.println("Nome: "+harris.getNome());
		System.out.println("Endereço: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		System.out.println("\n--------------------------");
		//"Inserindo informações nos argumentos de Pessoa() e, em seguida, imprimindo essas informações.
		
		
		harris.setNome("Henrique");
		harris.setEndereco("Avenida Brigadeiro Faria Lima, São Paulo, Brasil");
		harris.setTelefone("99999-9999");
		System.out.println("\nNome: "+harris.getNome());
		System.out.println("Endereço: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		System.out.println("\n--------------------------");
		//Dando SET nos atributos Private de Pessoa() e imprimindo essas informações para se verificar se realmente foi "SETado".
		
		
		Fornecedor sadia = new Fornecedor("Eduardo",1000,900);
		System.out.printf("\nCrédito: R$ %.2f", sadia.getValorCredito());
		System.out.printf("\nDívida: R$ %.2f", sadia.getValorDivida());
		System.out.printf("\nA diferença entre o seu crédito e a sua dívida é de: "+sadia.formatarObterSaldo());
		System.out.println("\n\n--------------------------");
		//Verificando se o método formatarObterSaldo() funciona.
		
		
		Empregado eduardo = new Empregado(null,null,null,0,0,0);
		eduardo.setNome("Eduardo");
		eduardo.setEndereco("Avenida dos Estados, São Paulo, Brasil");
		eduardo.setTelefone("77777-7777");
		eduardo.setCodigosetor(123);
		eduardo.setSalariobase(4500);
		eduardo.setImposto(30);
		System.out.println("\nNome:"+eduardo.getNome());
		System.out.println("Endereço: "+eduardo.getEndereco());
		System.out.println("Telefone: "+eduardo.getTelefone());
		System.out.println("Código do setor: "+eduardo.getCodigosetor());
		System.out.println("Vencimento base: R$ "+eduardo.getSalariobase());
		System.out.println("Imposto: R$ "+eduardo.getImposto());
		System.out.println("\nSeu salário líquido (isto é, após descontar os impostos) é: "+eduardo.formatarCalcularSalario());
		System.out.println("\n--------------------------");
		//Dando SET nos atributos PRIVATE de Empregado(). Em seguida, estou verificando se os SET's funcionaram. Por fim, verifico se o método formatarCalcularSalario() funciona. 
		
		
		Administrador admin = new Administrador("Daniel","Avenida Paulista, São Paulo, Brasil","55555-5555",3000);
		System.out.println("\nVocê possui ajuda de custo de: "+admin.formatarAjudaDeCusto());
		System.out.println("\n--------------------------");
		//Chamando método formatarAjudaDeCusto() e verificando seu funcionamento.
		
		
		Operario torneiro = new Operario("Bartolomeu", null, null, 0, 0, 4000);
		torneiro.setEndereco("Avenida Brigadeiro Faria Lima");
		torneiro.setTelefone("44444-4444");
		torneiro.setValorProducao(35500);
		torneiro.setComissao(3);
		System.out.println("Nome: "+torneiro.getNome());
		System.out.println("Endereco: "+torneiro.getEndereco());
		System.out.println("Telefone: "+torneiro.getTelefone());
		System.out.println("Valor mometário produzido pelo operário: "+torneiro.getValorProducao());
		System.out.println("Comissão: "+torneiro.getComissao()+" %");
		System.out.println("Salário: "+torneiro.getSalario());
		System.out.println("Seu salário com a comissão de "+torneiro.getComissao()+" % é de: "+torneiro.formatarComissaoSalarial());
		System.out.println("\n--------------------------");
		//"SETando"  parâmetros em Operario() e verificando se o metódo formatarComissaoSalarial() funciona.
		
		Vendedor vend = new Vendedor ("Peter Tim", "Avenida Brigadeiro Faria Lima, São Paulo, Brasil", "22222-2222", 0, 0, 0);
		vend.setValorVendas(45900);
		vend.setComissao(5.5);
		vend.setSalario(2900);
		System.out.println("Nome: "+vend.getNome());
		System.out.println("Endereço: "+vend.getEndereco());
		System.out.println("Telefone: "+vend.getTelefone());
		System.out.println("Salário: "+vend.getSalario());
		System.out.println("Valor monetário dos artigos vendidos: "+vend.getValorVendas());
		System.out.println("Comissão: "+vend.getComissao()+" %");
		
		
		System.out.println("Seu salário com a comissão é de: "+vend.formatarComissaoSalarial());
		
	}

}
