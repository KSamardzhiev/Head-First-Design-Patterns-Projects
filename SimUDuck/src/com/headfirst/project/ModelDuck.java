package com.headfirst.project;

import com.headfirst.project.flyable.FlyNoWay;
import com.headfirst.project.quackable.Quack;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super.flyBehaviour = new FlyNoWay();
		super.quackBehaviour = new Quack();
	}

	@Override
	public void display() {
		System.out.println("I'm a model duck");

	}

}
