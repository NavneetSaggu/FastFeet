package GearApp;

class Gear {
	private int chainRing;
	private int cog;
	private Wheel wheel;

	public Gear(int chainRing, int cog, Wheel wheel) {
		this.chainRing = chainRing;
		this.cog = cog;
		this.wheel = wheel;
	}

	public float getRatio() {
		return chainRing/cog;
	}
	public float getGearInches() {
		return wheel.getDiameter()*this.getRatio();
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nChain Ring Teeth: ").append(chainRing)
			.append("\nCog Teeth\t: ").append(cog)
			.append("\nGear Ratio\t: ").append(this.getRatio())
			.append("\nGear Inches\t: ").append(this.getGearInches());
		return sb.toString();
	}
}

class Wheel {
	private int rim;
	private float tire;
	final private float PI = 3.14f;

	public Wheel(int rim, float tire) {
		this.rim = rim;
		this.tire = tire;
	}

	public float getDiameter() {
		return rim + (2*tire);
	}

	public float getCircumference() {
		return PI*this.getDiameter();
	}
}

public class App {
	public static void main(String[] args) {
		Wheel wheel1 = new Wheel(26, 1.5f);
		Gear gear1 = new Gear(52, 11, wheel1);
		System.out.println("Gearing Ratio Calculator");
		System.out.println(gear1);
	}
}