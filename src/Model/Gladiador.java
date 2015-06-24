package Model;

public class Gladiador extends Luchador{

	
	public Gladiador(FabLuchador fl) {
		super(fl);
		setear();
	}

	public void setear()
	{
		this.arma= fl.ponerArma();
		this.armadura= fl.ponerArmadura();
	}

}
