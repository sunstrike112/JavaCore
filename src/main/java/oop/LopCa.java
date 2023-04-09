package oop;

public abstract class LopCa {
	
	protected String colorEye;
	protected String colorSkin;
	
	public String getColorEye() {
		return colorEye;
	}

	public String getColorSkin() {
		return colorSkin;
	}

/*	protected void boi() {
		System.out.println("Cá nào mà chả biết bơi");
	}*/
	
	protected abstract void boi();
	
	protected void boi(String style) {
		System.out.println(style);
	}
}
