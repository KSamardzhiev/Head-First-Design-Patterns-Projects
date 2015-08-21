package com.headfirst.project.flyable;

import com.headfirst.project.interfaces.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{

	@Override
	public void fly() {
		
		System.out.println("I can't fly");
		
	}

}
