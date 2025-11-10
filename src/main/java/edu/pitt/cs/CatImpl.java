package edu.pitt.cs;

public class CatImpl implements Cat {

	// TODO: Fill in with member variables
	final private int ID;
	private String name;
	private boolean isRented;

	public CatImpl(int id, String name) {
		ID = id;
		this.name = name;
		isRented = false;
	}

	@Override
	public void rentCat() {
		isRented = true;
	}

	@Override
	public void returnCat() {
		isRented = false;
	}

	@Override
	public void renameCat(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getId() {
		return ID;
	}

	@Override
	public boolean getRented() {
		return isRented;
	}

	@Override
	public String toString() {
		return "ID " + ID + ". " + name;
	}

}
