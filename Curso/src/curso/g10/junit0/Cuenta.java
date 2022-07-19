package curso.g10.junit0;

import java.util.Vector;

public class Cuenta {
	protected String mNumero;
	protected String mTitular;
	protected Vector<Movimiento> mMovimientos;

	public Cuenta(String numero, String titular) {
		mNumero = numero;
		mTitular = titular;
		mMovimientos = new Vector<Movimiento>();
	}

	

	public void retirar(double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (getSaldo() < x)
			throw new Exception("Saldo insuficiente");
		Movimiento m = new Movimiento();
		m.setConcepto("Retirada de efectivo");
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
	}
	public void ingresar(double x) throws Exception {		
		ingresar("Ingreso en efectivo", x);
	}
	public void ingresar(String concepto, double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede ingresar una cantidad negativa");
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(x);
		addMovimiento(m);
	}

	public void retirar(String concepto, double x) throws Exception {
		if (x <= 0)
			throw new Exception("No se puede retirar una cantidad negativa");
		if (getSaldo() < x)
			throw new Exception("Saldo insuficiente");
		Movimiento m = new Movimiento();
		m.setConcepto(concepto);
		m.setImporte(-x);
		this.mMovimientos.addElement(m);
	}

	public double getSaldo() {
		double r = 0.0;
		for (int i = 0; i < this.mMovimientos.size(); i++) {
			Movimiento m =  mMovimientos.elementAt(i);
			r += m.getImporte();
		}
		return r;
	}

	public void addMovimiento(Movimiento m)
		{
		mMovimientos.addElement(m);
		}
	public void verMovimientos() {
		double r=0;
		for (int i = 0; i < this.mMovimientos.size(); i++) {
			Movimiento m = (Movimiento) mMovimientos.elementAt(i);
			r+=m.mImporte;
			System.out.println(m.mConcepto+ "\t\t\t\t\t"+m.mImporte + "\t" + r);
		}
		
	}
}