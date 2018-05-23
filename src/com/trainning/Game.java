package com.trainning;

import java.util.List;

public class Game {
	private Map map;
	private List<Player> player;

	public Game(Map map, List<Player> player) {
		super();
		this.map = map;
		this.player = player;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	public List<Player> getPlayer() {
		return player;
	}

	public void setPlayer(List<Player> player) {
		this.player = player;
	}

}
