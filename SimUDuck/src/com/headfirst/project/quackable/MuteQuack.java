package com.headfirst.project.quackable;

import com.headfirst.project.interfaces.QuackBehaviour;

public class MuteQuack implements QuackBehaviour {

	@Override
	public void quack() {
		
		System.out.println("<< Silence >>");
		
	}

}
