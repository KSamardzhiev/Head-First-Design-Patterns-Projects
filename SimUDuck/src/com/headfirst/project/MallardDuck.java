package com.headfirst.project;

import com.headfirst.project.flyable.FlyWithWings;
import com.headfirst.project.quackable.Quack;

public class MallardDuck extends Duck {

	public MallardDuck() {
		super.quackBehaviour = new Quack();
		super.flyBehaviour = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("I'm real Mallard duck");

	}

}
