package Heranca1;

import java.text.NumberFormat;

public class Administrador extends Pessoa{
	
	private double ajudaDeCusto;
	
	public Administrador(String nome, double ajudaDeCusto)
	{
		super (nome);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public Administrador(String nome, String endereco, double ajudaDeCusto)
	{
		super (nome,endereco);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public Administrador(String nome, String endereco, String telefone, double ajudaDeCusto)
	{
		super (nome,endereco,telefone);
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
	public String formatarAjudaDeCusto()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String moedaFormatado=nf.format(getAjudaDeCusto());
		return moedaFormatado;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	
}
