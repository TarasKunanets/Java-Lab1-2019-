package ua.lviv.iot.lab1;

public class GasMeter {
	private int qmax;
	private int distance;
	private String name;
	private String factory;
	private String type;
	protected String customer;
	protected int serialNumber;
	static int number = 0;

	public GasMeter() {

	}

	public GasMeter(int qmax, int distance, String name, String factory) {
		this(qmax, distance, name, factory, null, null, 0);
	}

	public GasMeter(int qmax, int distance, String name, String factory, String type, String customer, int serialNumber) {
		this.type = type;
		this.customer = customer;
		this.serialNumber = serialNumber;
		this.qmax = qmax;
		this.distance = distance;
		this.name = name;
		this.factory = factory;
	}

	public int getQmax() {
		return qmax;
	}

	public void setQmax(int qmax) {
		this.qmax = qmax;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFactory() {
		return factory;
	}

	public void setFactory(String factory) {
		this.factory = factory;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String toString() {
		return " Qmax: " + qmax + "\n Distaance: " + distance + "Name: " + name;

	}

	public static void printStaticNumber() {
		System.out.println(number);
	}

	public void printNumber() {
		System.out.println(number);
	}

	public static void main(String[] args) {

		GasMeter metriG12 = new GasMeter(4, 5, "Q", "GsFacrory");
		System.out.println("Qmax = " + metriG12.getQmax());
		System.out.println("Distance = " + metriG12.getDistance());
		System.out.println("Name = " + metriG12.getName() + "\n");

		GasMeter elster = new GasMeter(1, 3, "W", "LvivFacrory");
		System.out.println("Qmax = " + elster.getQmax());
		System.out.println("Distance = " + elster.getDistance());
		System.out.println("Name = " + elster.getName() + "\n");

		GasMeter vizard = new GasMeter(222, 33, "E", "MetrixFacrory");
		System.out.println("Qmax = " + vizard.getQmax());
		System.out.println("Distance = " + vizard.getDistance());
		System.out.println("Name = " + vizard.getName() + "\n");

		GasMeter samGas = new GasMeter(11, 55, "R", "VizarFacrory");
		System.out.println("Qmax = " + samGas.getQmax());
		System.out.println("Distance = " + samGas.getDistance());
		System.out.println("Name = " + samGas.getName() + "\n");

		GasMeter metrixUG1 = new GasMeter(66, 7, "T", "ElsterFacrory");
		System.out.println("Qmax = " + metrixUG1.getQmax());
		System.out.println("Distance = " + metrixUG1.getDistance());
		System.out.println("Name = " + metrixUG1.getName() + "\n");
	}

}
