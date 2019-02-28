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

	void setQmax(int qmax) {
		this.qmax = qmax;
	}

	void setDistance(int distance) {
		this.distance = distance;
	}

	void setName(String name) {
		this.name = name;
	}

	void setFactory(String factory) {
		this.factory = factory;
	}

	void setType(String type) {
		this.type = type;
	}

	void setCustomer(String customer) {
		this.customer = customer;
	}

	void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}

	int getQmax() {
		return qmax;
	}

	int getDistance() {
		return distance;
	}

	String getName() {
		return name;
	}

	String getFactory() {
		return factory;
	}

	String getType() {
		return type;
	}

	String getCustomer() {
		return customer;
	}

	int getSerialNumber() {
		return serialNumber;
	}

	static int getNumber() {
		return number;
	}

	public int Number() {
		number++;
		return number;
	}
	public GasMeter(){
		
	}

	public GasMeter(int qmax, int distance, String name, String factory) {
		this.qmax = qmax ;
		this.distance = distance;
		this.name = name ;
		this.factory = factory;

	}

	public GasMeter(int qmax, int distance, String name, String factory, String type, String customer, int serialNumber)

	{

		this(qmax, distance , name , factory);
		this.type=type;
		this.customer=customer;
		this.serialNumber=serialNumber;

	}



	public String toString() {
		return " Qmax: " + qmax + "\n Distaance: " + distance + "Name: "
		+ name;

	}

	static void printStaticNumber() {
		System.out.println(number);
	}
	
	static void printNumber() {
		System.out.println(number);
	}

	

	public static void main(String[] args) {

		GasMeter metriG12 = new GasMeter(4, 5, "Q","GsFacrory");
		System.out.println("Qmax = " + metriG12.getQmax());
		System.out.println("Distance = " + metriG12.getDistance());
		System.out.println("Name = " + metriG12.getName() + "\n");

		GasMeter elster = new GasMeter(1, 3, "W" ,"LvivFacrory");
		System.out.println("Qmax = " + elster.getQmax());
		System.out.println("Distance = " + elster.getDistance());
		System.out.println("Name = " + elster.getName() + "\n");

		GasMeter vizard = new GasMeter(222, 33, "E" ,"MetrixFacrory");
		System.out.println("Qmax = " + vizard.getQmax());
		System.out.println("Distance = " + vizard.getDistance());
		System.out.println("Name = " + vizard.getName() + "\n");

		GasMeter samGas = new GasMeter(11, 55, "R" ,"VizarFacrory");
		System.out.println("Qmax = " + samGas.getQmax());
		System.out.println("Distance = " + samGas.getDistance());
		System.out.println("Name = " + samGas.getName() + "\n");

		GasMeter metrixUG1 = new GasMeter(66, 7, "T" ,"ElsterFacrory");
		System.out.println("Qmax = " + metrixUG1.getQmax());
		System.out.println("Distance = " + metrixUG1.getDistance());
		System.out.println("Name = " + metrixUG1.getName() + "\n");
	}

}

