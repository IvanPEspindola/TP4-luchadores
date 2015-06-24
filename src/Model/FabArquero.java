package Model;

public class FabArquero implements FabLuchador {
	
	public Armadura ponerArmadura() {
		
		return new Ligera();
	}
	public Arma ponerArma() {
		
		return new Arco();
	}
}
