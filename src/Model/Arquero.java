package Model;

public class Arquero extends Luchador{
	
	
	public Arquero(FabLuchador fl) {
		super(fl);
		setear();
	}

	public void setear()
{
	this.arma= fl.ponerArma();
	this.armadura= fl.ponerArmadura();
}
}
