package edu.esprit.integration.demo.services;

public class CalculatorService {

	public float addition(float x,float y){
		return x+y;
		
	}
	public float soustraction(float x,float y){
		return x-y;
		
	}
	
	public float multiplication(float x,float y){
		return x*y;
		
	}
	public float division(float x,float y){
		if(x>y)
		return x/y;
		else
			return 0;
		
	}
}
