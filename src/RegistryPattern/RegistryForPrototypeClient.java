package RegistryPattern;

import java.util.HashMap;
import java.util.Map;

interface Prototype {
	public abstract Prototype clonePrototype();
    public abstract void display();
}
class concretePrototype1 implements Prototype{
	// suppose few common attributes for all objects
	int commonAttribute1 = 120;
	int commonAttribute2 = 220;
	int commonAttribute3 = 320;
	// suppose few unique attributes for each object
	int uniqueAttribute1 = 55;
	int uniqueAttribute2 = 77;
	
	concretePrototype1(){
		
	}

	concretePrototype1(concretePrototype1 cp) {
		this.commonAttribute1 = cp.commonAttribute1;
		this.commonAttribute2 = cp.commonAttribute2;
		this.commonAttribute3 = cp.commonAttribute3;
		this.uniqueAttribute1 = cp.uniqueAttribute1;
		this.uniqueAttribute2 = cp.uniqueAttribute2;
	}
	
	@Override
	public Prototype clonePrototype() {
		return new concretePrototype1(this);
	}

	@Override
	public void display() {
		System.out.println("attributes "+commonAttribute1+" "+commonAttribute2+" "+commonAttribute3+" "+uniqueAttribute1+" "+uniqueAttribute2);
	}
	
}
class concretePrototype2 implements Prototype{
	// suppose few common attributes for all objects
	int commonAttribute1 = 999;
	int commonAttribute2 = 888;
	// suppose few unique attributes for each object
	int uniqueAttribute1 = 505;
	int uniqueAttribute2 = 707;
	
	concretePrototype2(){
		
	}
	
	concretePrototype2(concretePrototype2 cp) {
		this.commonAttribute1 = cp.commonAttribute1;
		this.commonAttribute2 = cp.commonAttribute2;
		this.uniqueAttribute1 = cp.uniqueAttribute1;
		this.uniqueAttribute2 = cp.uniqueAttribute2;
	}
	
	@Override
	public Prototype clonePrototype() {
		return new concretePrototype2(this);
	}

	@Override
	public void display() {
		System.out.println("attributes "+commonAttribute1+" "+commonAttribute2+" "+uniqueAttribute1+" "+uniqueAttribute2);
	}
	
}
class PrototypeRegistry {
	private static volatile PrototypeRegistry instance = null;
	private Map<String,Prototype> registry = new HashMap<String,Prototype>();
	private PrototypeRegistry() {
		
	}
	//singleton implementation
	public static PrototypeRegistry getInstance() {
		if(instance == null) {
			synchronized (PrototypeRegistry.class) {
				if(instance==null)
					instance = new PrototypeRegistry();
			}
		}
		return instance;
	}

	void registerObject(String str,Prototype obj) {
		registry.put(str, obj);
	}
	Prototype getObject(String str) {
		if(registry.containsKey(str)) 
			return registry.get(str);
		return null;
	}
	boolean isPresentInRegistry(String str) {
		if(registry.containsKey(str))
			return true;
		else
			return false;
	}
}
public class RegistryForPrototypeClient {
	public static void main(String[] args) {
		PrototypeRegistry registryObj = PrototypeRegistry.getInstance();
		//regiser a prototoype for CP1
		concretePrototype1 cp1= new concretePrototype1();
		registryObj.registerObject("concretePrototype1", cp1);
		
		//get the prototype
		concretePrototype1 cp1new = (concretePrototype1)registryObj.getObject("concretePrototype1").clonePrototype();
		System.out.println(cp1);
		System.out.println(cp1new);
		cp1new.uniqueAttribute1=10000;
		cp1new.uniqueAttribute2=50000;
		cp1.display();
		cp1new.display();
		
		
		concretePrototype2 cp2= new concretePrototype2();
		registryObj.registerObject("concretePrototype2", cp2);
		//get the prototype
		concretePrototype2 cp2new = (concretePrototype2)registryObj.getObject("concretePrototype2").clonePrototype();
		cp2new.uniqueAttribute1 = 101;
		cp2new.uniqueAttribute2 = 102;
		System.out.println(cp1);
		System.out.println(cp1new);
		cp2.display();
		cp2new.display();
	}
}
