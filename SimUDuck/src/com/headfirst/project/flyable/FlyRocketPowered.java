package com.headfirst.project.flyable;

import com.headfirst.project.interfaces.FlyBehaviour;

public class FlyRocketPowered implements FlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I'm flying with rocket");
		
	}

}
