package SparesApp;

abstract class Bicycle {
	protected char size;
	protected int chainTeeth;

	protected Bicycle(char size, int chainTeeth) {
		this.size = size;
		this.chainTeeth = chainTeeth;
	}
}

class RoadBike extends Bicycle {
	private String tapeColor;

	public RoadBike(char size, int chainTeeth, String tapeColor) {
		super(size, chainTeeth);
		this.tapeColor = tapeColor;
	}

	public String getSpares() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nROADBIKE SPARES")
			.append("\nSize\t\t: ").append(size)
			.append("\nChain Ring Teeth: ").append(chainTeeth)
			.append("\nTape Color\t: ").append(tapeColor);
		return sb.toString();
	}
}

class MountainBike extends Bicycle {
	private String frontShock;
	private String rearShock;

	public MountainBike(char size, int chainTeeth, 
		String frontShock, String rearShock) {
		super(size, chainTeeth);
		this.frontShock = frontShock;
		this.rearShock = rearShock;
	}

	public String getSpares() {
		StringBuilder sb = new StringBuilder("");
		sb.append("\nMOUNTAINBIKE SPARES")
			.append("\nSize\t\t: ").append(size)
			.append("\nChain Ring Teeth: ").append(chainTeeth)
			.append("\nront Shock\t: ").append(frontShock)
			.append("\nRear Shock\t: ").append(rearShock);
		return sb.toString();
	}
}

public class SparesApp {
	public static void main(String[] args) {
		MountainBike mtb = new MountainBike('S', 10, "Manitou", "Fox");
		RoadBike rtb = new RoadBike('M', 10, "Blue");
		System.out.println(mtb.getSpares());
		System.out.println(rtb.getSpares());
	}
}