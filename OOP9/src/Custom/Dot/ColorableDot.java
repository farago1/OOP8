package Custom.Dot;

import java.awt.Color;

import Custom.Colorable;

public abstract class ColorableDot extends Dot implements Colorable {

	private Color color;

	public ColorableDot(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorableDot [color=" + color + "]";
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	

}
