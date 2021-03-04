package Heranca1;

import java.text.NumberFormat;

public class Vendedor extends Pessoa{
	private double valorVendas;
	private double comissao;
	private double salario;
	
	public Vendedor(String nome, double valorVendas, double comissao, double salario)
	{
		super(nome);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	public Vendedor(String nome, String endereco, double valorVendas, double comissao, double salario)
	{
		super(nome,endereco);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	public Vendedor(String nome, String endereco, String telefone, double valorVendas, double comissao, double salario)
	{
		super(nome,endereco,telefone);
		this.valorVendas = valorVendas;
		this.comissao = comissao;
		this.salario = salario;
	}
	
	public double comissaoSalarial()
	{
		salario = salario + (comissao/100)*valorVendas;
		return salario;
	}
	
	public String formatarComissaoSalarial()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String salarioFormatado = nf.format(comissaoSalarial());
		return salarioFormatado;
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
