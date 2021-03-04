package Heranca1;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa harris = new Pessoa("Peter Jordan", "Avenida Paulista, S�o Paulo, Brasil", "88888-8888");
		System.out.println("Nome: "+harris.getNome());
		System.out.println("Endere�o: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		System.out.println("\n--------------------------");
		//"Inserindo informa��es nos argumentos de Pessoa() e, em seguida, imprimindo essas informa��es.
		
		
		harris.setNome("Henrique");
		harris.setEndereco("Avenida Brigadeiro Faria Lima, S�o Paulo, Brasil");
		harris.setTelefone("99999-9999");
		System.out.println("\nNome: "+harris.getNome());
		System.out.println("Endere�o: "+harris.getEndereco());
		System.out.println("Telefone: "+harris.getTelefone());
		System.out.println("\n--------------------------");
		//Dando SET nos atributos Private de Pessoa() e imprimindo essas informa��es para se verificar se realmente foi "SETado".
		
		
		Fornecedor sadia = new Fornecedor("Eduardo",1000,900);
		System.out.printf("\nCr�dito: R$ %.2f", sadia.getValorCredito());
		System.out.printf("\nD�vida: R$ %.2f", sadia.getValorDivida());
		System.out.printf("\nA diferen�a entre o seu cr�dito e a sua d�vida � de: "+sadia.formatarObterSaldo());
		System.out.println("\n\n--------------------------");
		//Verificando se o m�todo formatarObterSaldo() funciona.
		
		
		Empregado eduardo = new Empregado(null,null,null,0,0,0);
		eduardo.setNome("Eduardo");
		eduardo.setEndereco("Avenida dos Estados, S�o Paulo, Brasil");
		eduardo.setTelefone("77777-7777");
		eduardo.setCodigosetor(123);
		eduardo.setSalariobase(4500);
		eduardo.setImposto(30);
		System.out.println("\nNome:"+eduardo.getNome());
		System.out.println("Endere�o: "+eduardo.getEndereco());
		System.out.println("Telefone: "+eduardo.getTelefone());
		System.out.println("C�digo do setor: "+eduardo.getCodigosetor());
		System.out.println("Vencimento base: R$ "+eduardo.getSalariobase());
		System.out.println("Imposto: R$ "+eduardo.getImposto());
		System.out.println("\nSeu sal�rio l�quido (isto �, ap�s descontar os impostos) �: "+eduardo.formatarCalcularSalario());
		System.out.println("\n--------------------------");
		//Dando SET nos atributos PRIVATE de Empregado(). Em seguida, estou verificando se os SET's funcionaram. Por fim, verifico se o m�todo formatarCalcularSalario() funciona. 
		
		
		Administrador admin = new Administrador("Daniel","Avenida Paulista, S�o Paulo, Brasil","55555-5555",3000);
		System.out.println("\nVoc� possui ajuda de custo de: "+admin.formatarAjudaDeCusto());
		System.out.println("\n--------------------------");
		//Chamando m�todo formatarAjudaDeCusto() e verificando seu funcionamento.
		
		
		Operario torneiro = new Operario("Bartolomeu", null, null, 0, 0, 4000);
		torneiro.setEndereco("Avenida Brigadeiro Faria Lima");
		torneiro.setTelefone("44444-4444");
		torneiro.setValorProducao(35500);
		torneiro.setComissao(3);
		System.out.println("Nome: "+torneiro.getNome());
		System.out.println("Endereco: "+torneiro.getEndereco());
		System.out.println("Telefone: "+torneiro.getTelefone());
		System.out.println("Valor momet�rio produzido pelo oper�rio: "+torneiro.getValorProducao());
		System.out.println("Comiss�o: "+torneiro.getComissao()+" %");
		System.out.println("Sal�rio: "+torneiro.getSalario());
		System.out.println("Seu sal�rio com a comiss�o de "+torneiro.getComissao()+" % � de: "+torneiro.formatarComissaoSalarial());
		System.out.println("\n--------------------------");
		//"SETando"  par�metros em Operario() e verificando se o met�do formatarComissaoSalarial() funciona.
		
		Vendedor vend = new Vendedor ("Peter Tim", "Avenida Brigadeiro Faria Lima, S�o Paulo, Brasil", "22222-2222", 0, 0, 0);
		vend.setValorVendas(45900);
		vend.setComissao(5.5);
		vend.setSalario(2900);
		System.out.println("Nome: "+vend.getNome());
		System.out.println("Endere�o: "+vend.getEndereco());
		System.out.println("Telefone: "+vend.getTelefone());
		System.out.println("Sal�rio: "+vend.getSalario());
		System.out.println("Valor monet�rio dos artigos vendidos: "+vend.getValorVendas());
		System.out.println("Comiss�o: "+vend.getComissao()+" %");
		
		
		System.out.println("Seu sal�rio com a comiss�o � de: "+vend.formatarComissaoSalarial());
		
	}

}
