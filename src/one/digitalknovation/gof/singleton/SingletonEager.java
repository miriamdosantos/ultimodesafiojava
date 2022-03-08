package one.digitalknovation.gof.singleton;

/**
 * Singleton "apressado"
 * @author miriamsantos
 */
public class SingletonEager{

	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager () {
		super ();
	}
	public static SingletonEager getInstancia () {
		
		return instancia;
	}
}
