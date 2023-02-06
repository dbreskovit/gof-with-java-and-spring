package edu.dio;

import edu.dio.facade.Facade;
import edu.dio.singleton.SingletonEager;
import edu.dio.singleton.SingletonLazy;
import edu.dio.singleton.SingletonLazyHolder;
import edu.dio.strategy.Comportamento;
import edu.dio.strategy.ComportamentoAgressivo;
import edu.dio.strategy.ComportamentoDefensivo;
import edu.dio.strategy.ComportamentoNormal;
import edu.dio.strategy.Robo;

public class Test {

	public static void main(String[] args) {

		// Singleton

		SingletonLazy lazy = SingletonLazy.getInstance();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstance();
		System.out.println(lazy);

		SingletonEager eager = SingletonEager.getInstance();
		System.out.println(eager);
		eager = SingletonEager.getInstance();
		System.out.println(eager);

		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(lazyHolder);

		// Strategy

		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();

		Robo robo = new Robo();
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();

		// Facade
		Facade facade = new Facade();
		facade.migrarCliente("Diego", "12345-678");

	}

}
