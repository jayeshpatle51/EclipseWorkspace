package seleniumscripts;

public enum Colors {

	blue("#007bff"),

	indigo("#6610f2"),

	purple("#6f42c1"),

	pink("#e83e8c"),

	red("#dc3545"),
    
	lightgreen("#e2ebed"),
	
	orange("#fd7e14"),

	yellow("#ffc107"),

	green("#28a745"),

	teal("#20c997"),

	cyan("#17a2b8"),

	white("#fff"),

	gray("#6c757d"),

	gray_dark("#343a40"),

	primary("#007bff"),

	secondary("#6c757d"),

	success("#28a745"),

	info("#17a2b8"),

	warning("#ffc107"),

	danger("#dc3545"),

	light("#f8f9fa"),

	dark("#343a40");



	private String color;

	Colors(String color) {
		this.color = color;
	}

	public String getColour() {

		return color;
	}


}
