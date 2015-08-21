package com.headfirst.project;

import com.headfirst.project.interfaces.FlyBehaviour;
import com.headfirst.project.interfaces.QuackBehaviour;

public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public void swim() {
		System.out.println("Swim");
	}

	public abstract void display();

	public void performQuack() {

		quackBehaviour.quack();
	}

	public void performFly() {
		flyBehaviour.fly();
	}

	public void setFlyBehaviour(FlyBehaviour fb) {
		this.flyBehaviour = fb;

	}

	public void setQuackBehaviout(QuackBehaviour qb) {
		this.quackBehaviour = qb;
	}
}
