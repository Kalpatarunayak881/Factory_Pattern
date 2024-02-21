package com.nt.factory;
import com.nt.comp.Veichile;
import com.nt.comp.PetrolEngine;
import com.nt.comp.DiselEngine;
import com .nt.comp.ElectricEngine;
import com.nt.comp.Engine;
public class VeichileFactory {
public static Veichile getInstance(String engineType) {
	//create Dependent class obj
	Engine engine=null;
	if(engineType.equalsIgnoreCase("petrol"))
	engine=new PetrolEngine();
	else if(engineType.equalsIgnoreCase("disel"))
	engine=new DiselEngine();
	else if(engineType.equalsIgnoreCase("electric"))
	engine=new ElectricEngine();
	else
		throw new IllegalArgumentException("invalid Engine type");
	//create target class obj
	Veichile ve=new Veichile();
	//assign dependent class object to target class obj
	ve.setEngine(engine);
	return ve;
}
}
