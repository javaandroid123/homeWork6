package com.trainning;

import java.util.List;

public class Map {
	private String data;
	private float width;
	private float height;
	private List<Enemy> enemy;

	public Map(String data, float width, float height, List<Enemy> enemy) {
		super();
		this.data = data;
		this.width = width;
		this.height = height;
		this.enemy = enemy;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void contain() {

	}

	public void update() {

	}

	public void draw() {

	}

	public void reset() {

	}

	public List<Enemy> getEnemy() {
		return enemy;
	}

	public void setEnemy(List<Enemy> enemy) {
		this.enemy = enemy;
	}

}
