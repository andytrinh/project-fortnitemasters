package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {
	private int size;
	private String name;
	private int length;
	@JsonProperty
	private List<Square> occupiedSquares;

	//initialize the ship types
	public Ship(String kind) {
		this.name = kind.toUpperCase();
		//name = name.toUppercase();
		if (name.equals("BATTLESHIP")) {
			this.occupiedSquares = new ArrayList<>(4);
			this.length = 4;
		} else if (name.equals("DESTROYER")) {
			this.occupiedSquares = new ArrayList<>(3);
			this.length = 3;
		} else if (name.equals("MINESWEEPER")) {
			this.occupiedSquares = new ArrayList<>(2);
			this.length = 2;
		} else {
			throw new IllegalArgumentException("This is not a valid ship!");
		}
	}

	public Ship() {
		occupiedSquares = new ArrayList<>();
	}

	public List<Square> getOccupiedSquares() {
		return occupiedSquares;
	}

	public void setOccupiedSquares(List<Square> occupiedSquares) {
		this.occupiedSquares = occupiedSquares;
	}

	public int getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public int getLength() {
		return length;
	}

}