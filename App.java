package GearApp;

class Gear {
	private int chainRing;
	private int cog;
	private int rim;
	private float tire;

	public Gear(int chainRing, int cog, int rim, float tire) {
		this.chainRing = chainRing;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public float getRatio() {
		return chainRing/cog;
	}
	public float getGearInches() {
		return (rim+(tire*2))*this.getRatio();
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

public class App {
	public static void main(String[] args) {
		Gear gear1 = new Gear(52, 11, 26, 1.5f);
		Gear gear2 = new Gear(52, 11, 24, 1.25f);
		System.out.println("Gearing Ratio Calculator");
		System.out.println(gear1);
		System.out.println(gear2);
	}
}