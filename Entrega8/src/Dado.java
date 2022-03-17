import java.util.Random;

public class Dado {

	int caras;
	int ultimaCara;

	public Dado(int caras) {
		this.caras = caras;
	}

	public Dado() {
		this.caras = 6;
	}

	public int getCaras() {
		return this.caras;
	}

	public int getUltima() {
		return this.ultimaCara;
	}

	public void lanzarDado() {
		Random r = new Random();
		this.ultimaCara = r.nextInt(caras + 1);
		if (ultimaCara == 0) {
			lanzarDado();
		}
		
	}
	
}