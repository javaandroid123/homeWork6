package com.trainning;

import java.util.List;

public class Tank {
	private List<Bullet> bullets;
	private float direction;
	private String isAutoMoving;
	private float left;
	private float size;
	private float speed;
	private String top;

	public Tank(List<Bullet> bullets, float direction, String isAutoMoving, float left, float size, float speed,
			String top) {
		super();
		this.bullets = bullets;
		this.direction = direction;
		this.isAutoMoving = isAutoMoving;
		this.left = left;
		this.size = size;
		this.speed = speed;
		this.top = top;
	}

	public float getDirection() {
		return direction;
	}

	public void setDirection(float direction) {
		this.direction = direction;
	}

	public String getIsAutoMoving() {
		return isAutoMoving;
	}

	public void setIsAutoMoving(String isAutoMoving) {
		this.isAutoMoving = isAutoMoving;
	}

	public float getLeft() {
		return left;
	}

	public void setLeft(float left) {
		this.left = left;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	public String getTop() {
		return top;
	}

	public void setTop(String top) {
		this.top = top;
	}

	public void autoMove() {

	}

	public void update() {

	}

	public void fire() {

	}
}
