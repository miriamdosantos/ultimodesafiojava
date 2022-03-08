package one.digitalknovation.gof;

import one.digitalknovation.gof.singleton.SingletonEager;
import one.digitalknovation.gof.singleton.SingletonLazy;

public class test {
public static void main ( String [] args) {
	SingletonLazy lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	lazy = SingletonLazy.getInstancia();
	System.out.println(lazy);
	
	SingletonEager eager = SingletonEager.getInstancia();
	System.out.println(eager);
	eager = SingletonEager.getInstancia();
	System.out.println(eager);
}
}
