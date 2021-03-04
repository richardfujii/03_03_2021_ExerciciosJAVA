package Heranca1;

import java.text.NumberFormat;

public class Operario extends Pessoa{
	private double valorProducao;
	private double comissao;
	private double salario;
	
	public Operario(String nome, double valorProducao, double comissao, double salario)
	{
		super(nome);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
		this.salario=salario;
	}
	
	public Operario(String nome, String endereco, double valorProducao, double comissao, double salario)
	{
		super(nome,endereco);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
		this.salario=salario;
	}
	
	public Operario(String nome, String endereco, String telefone, double valorProducao, double comissao, double salario)
	{
		super(nome,endereco,telefone);
		this.valorProducao=valorProducao;
		this.comissao=comissao;
		this.salario=salario;
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double comissaoSalarial()
	{
		double sal = salario + valorProducao*(comissao/100);
		return sal;
	}
	
	public String formatarComissaoSalarial()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String moedaFormatada = nf.format(comissaoSalarial());
		return moedaFormatada;
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
