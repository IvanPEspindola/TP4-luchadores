package Model;

public class HandlerLuchador {

	public void crearLuchador(Utils tipo)
	{
		FabLuchador fl = null;
		Luchador l=null;
		switch(tipo)
		{
		case GLADIADOR:
			fl= new FabGladiador();
			l = new Gladiador(fl);
			break;
		case ARQUERO:
			fl= new FabArquero();
			l= new Arquero(fl);
		break;
		}
	}
}
