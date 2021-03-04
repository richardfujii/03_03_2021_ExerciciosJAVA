package Heranca1;

import java.text.NumberFormat;

public class Empregado extends Pessoa{
	private int codigosetor;
	private double salariobase;
	private double imposto;
	
	public Empregado(String nome, int codigosetor, double salariobase, double imposto)
	{
		super(nome);
		this.codigosetor=codigosetor;
		this.salariobase=salariobase;
		this.imposto=imposto;
	}
	
	public Empregado(String nome, String endereco, int codigosetor, double salariobase, double imposto)
	{
		super(nome,endereco);
		this.codigosetor=codigosetor;
		this.salariobase=salariobase;
		this.imposto=imposto;
	}
	
	public Empregado(String nome, String endereco, String telefone, int codigosetor, double salariobase, double imposto)
	{
		super(nome,endereco,telefone);
		this.codigosetor=codigosetor;
		this.salariobase=salariobase;
		this.imposto=imposto;
	}
	
	public double calcularSalario()
	{
		double salario = salariobase*(1-(imposto/100));
		return salario;
	}
	public String formatarCalcularSalario()
	{
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2);
		String formatado = nf.format(calcularSalario());
		return formatado;
	}

	public int getCodigosetor() {
		return codigosetor;
	}

	public void setCodigosetor(int codigosetor) {
		this.codigosetor = codigosetor;
	}

	public double getSalariobase() {
		return salariobase;
	}

	public void setSalariobase(double salariobase) {
		this.salariobase = salariobase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
}
