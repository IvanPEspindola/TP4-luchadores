package Model;

public abstract class Luchador {

	protected Arma arma;
	protected Armadura armadura;
	protected FabLuchador fl;
	
	public Luchador(FabLuchador fl) {
		super();
		this.fl=fl;
	}

	protected abstract void setear();
}
