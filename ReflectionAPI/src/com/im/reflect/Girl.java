package com.im.reflect;

public class Girl extends Person implements Danceble, Fightable
{
	Boy boy;

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		System.out.println("Fight...");
	}

	@Override
	public void dance() {
		// TODO Auto-generated method stub
		System.out.println("Dance...");
	}
}
