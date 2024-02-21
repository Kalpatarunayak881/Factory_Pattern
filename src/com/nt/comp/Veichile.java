package com.nt.comp;
import java.util.Random;
import java.util.Arrays;
public class Veichile {
private Engine engine;
public void setEngine(Engine engine) {
	System.out.println("Veichile.setEngine()");
	this.engine=engine;
}
	public String Automobile(String items[],double price[]) {
		double Paying=0.0;
		for(double p:price) {
			Paying=Paying+p;
		}
		int regno=new Random().nextInt(10000);
		String msg=engine.choose(regno);
		return Arrays.toString(items)+"items with PayingPrice:::"+Paying+"----"+msg;
	}
}
