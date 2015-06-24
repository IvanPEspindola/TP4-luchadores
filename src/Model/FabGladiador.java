package Model;

public class FabGladiador implements FabLuchador{

	public Armadura ponerArmadura() {
		return new Pesada();
	}
	public Arma ponerArma() {
		return new Espada();
	}
}
