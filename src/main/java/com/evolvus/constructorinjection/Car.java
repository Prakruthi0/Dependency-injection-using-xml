package com.evolvus.constructorinjection;

public class Car{
  
	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}
	
	public void start()
	{
		engine.run();
		System.out.println("car started");
	}
	
}
