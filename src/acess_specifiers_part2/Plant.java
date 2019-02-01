package acess_specifiers_part2;

public class Plant {
	public String name;
	private String family;
	protected String size;

	// default access specifier
	int height;

	public String getSize() {
		return size;
	}

	public final static int ID = 1;

	public Plant() {
		this.name = "Anthurium";
		this.family = "Shurb";
		this.size = "medium";
		this.height = 10;

	}

	public String getFamily() {
		return family;
	}

}
