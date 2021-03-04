package Heranca1;

import java.text.NumberFormat;

public class Fornecedor extends Pessoa{
	private double valorCredito;
	private double valorDivida;
	
	public Fornecedor(String nome, double credito, double divida)
	{
		super (nome);
		this.valorCredito=credito;
		this.valorDivida=divida;
	}
	public Fornecedor(String nome, String endereco, double credito, double divida)
	{
		super (nome,endereco);
		this.valorCredito=credito;
		this.valorDivida=divida;
	}
	
	public Fornecedor(String nome, String endereco, String telefone, double credito, double divida)
	{
		super (nome,endereco,telefone);
		this.valorCredito=credito;
		this.valorDivida=divida;
	}
	
	public double obterSaldo()
	{
		double diferenca = this.valorCredito - this.valorDivida;
		return diferenca;
	}
	
	public String formatarObterSaldo()
	{
		NumberFormat form = NumberFormat.getCurrencyInstance();
		form.setMinimumFractionDigits(2);
		String moedaFormatada = form.format(obterSaldo());
		return moedaFormatada;
	}
	
	public double getValorCredito() {
		return valorCredito;
	}
	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}
	public double getValorDivida() {
		return valorDivida;
	}
	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
}
