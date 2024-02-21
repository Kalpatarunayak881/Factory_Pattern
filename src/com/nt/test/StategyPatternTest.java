package com.nt.test;
import com.nt.comp.Veichile;
import com.nt.factory.VeichileFactory;
public class StategyPatternTest {

	public static void main(String[] args) {
		//use Statergy pattern to target class obj
		Veichile ve=VeichileFactory.getInstance("Disel");
		//invoke the b.method
		String resultMsg=ve.Automobile(new String[] {"Toyota_fotuner","Mahindra Scrpio"},new double[] {4800000.0,6500000.0});
		System.out.println(resultMsg);
		
	}

}
