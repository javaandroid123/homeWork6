package com.trainning;

public class Bullet {
	private float cx;
	private float cy;
	private float speed;

	public Bullet(float cx, float cy, float speed) {
		super();
		this.cx = cx;
		this.cy = cy;
		this.speed = speed;
	}

	public float getCx() {
		return cx;
	}

	public void setCx(float cx) {
		this.cx = cx;
	}

	public float getCy() {
		return cy;
	}

	public void setCy(float cy) {
		this.cy = cy;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public void draw() {

	}

	public void update() {

	}
}
