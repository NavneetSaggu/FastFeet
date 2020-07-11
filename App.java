package GearApp;

class Gear {
	private int chainRing;
	private int cog;

	public Gear(int chainRing, int cog) {
		this.chainRing = chainRing;
		this.cog = cog;
	}

	public float getRatio() {
		return chainRing/cog;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nChain Ring Teeth: ").append(chainRing).append("\n")
			.append("Cog Teeth\t: ").append(cog).append("\n")
			.append("Ratio\t\t: ").append(this.getRatio());
		return sb.toString();
	}
}

public class App {
	public static void main(String[] args) {
		Gear gear1 = new Gear(52, 11);
		Gear gear2 = new Gear(30, 27);
		System.out.println("Gearing Ration Calculator");
		System.out.println(gear1);
		System.out.println(gear2);
	}
}