package casas;

import personajes.Hacha;
import personajes.Pulmones;
import personajes.TaladroRotopercutor;

public class CasaDelChanchitoDeMadera extends CasaDelChanchito{


	@Override
	public void serAtacadaCon(Pulmones pulmones) {

	}

	@Override
	public void serAtacadaCon(Hacha hacha) {

		this.estadoCasa = new Destruida();
	}

	@Override
	public void serAtacadaCon(TaladroRotopercutor taladroRotopercutor) {
		this.estadoCasa = new Destruida();
	}
}
