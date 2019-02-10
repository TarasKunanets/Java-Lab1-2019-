
import java.awt.TextArea;
import java.util.Scanner;
public class GasMeter {
	public int Qmax;
	public int Distance;
	public String Name;
	private String Factory;
	private String Type;
	protected String Customer;
	protected int SerialNumber;
	static int Number=0;
	
	
		void SetQmax (int _Qmax) 
		{
		Qmax= _Qmax;
		}
		
		void SetDistance(int _Distance)
		{
		Distance = _Distance;
		}
	
		void SetName(String _Name)
		{
		Name = _Name;
		}
		
		void SetFactory(String _Factory)
		{
		Factory= _Factory;
		}
		
		void SetType(String _Type)
		{
		Type = _Type;
		}
		
		void SetCustomer(String _Customer) 
		{
		Customer=_Customer;
		}
		
		void SetSerialNumber (int _SerialNumber) 
		{
	   SerialNumber= _SerialNumber;	
		}
	
			int GetQmax () 
			{
				return Qmax;
	  		}
	
			int GetDistance() 
			{
				return Distance;
			}
	
			String GetName()
			{
				return Name;
			}
			
			String GetFactory() 
			{
				return Factory;
			}
			
			String GetType() 
			{
				return Type;
			}
			
			String GetCustomer()
			{
				return Customer;
			}
			
			int GetSerialNumber() 
			{
				return SerialNumber;
			}
			
		    static int GetNumber() 
		    {
		    	return Number;
		    }
   
   public GasMeter() {
	Number++;
} 
	public  GasMeter(int Qmax, int Distance, String Name,String Factory)
	{
		this.SetQmax(Qmax);
		this.SetDistance(Distance);
		this.SetName(Name);
		this.SetFactory(Factory);
		
	}
	
	public GasMeter(int Qmax, int Distance, String Name,String Factory ,String Type ,String Customer ,int SerialNumber  )
	
	{
		
		SetQmax(Qmax);
		SetDistance(Distance);
		SetName(Name);
		SetFactory(Factory);
		SetType(Type);
		SetCustomer(Customer);
		SetSerialNumber(SerialNumber);
		
	}
	
	public GasMeter(int Qmax, int Distance, String Name)
	{
		SetQmax(Qmax);
		SetDistance(Distance);
		SetName(Name);
	}
	
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		 System.out.println("Qmax = " + GetQmax());
		 System.out.println("Distance = " + GetDistance());
			System.out.println("Name = " + GetName() + "\n");
		return super.toString();
		
	}
	static void printStaticNumber() {
		 System.our.println(Number);
	 }
 
		// TODO Auto-generated method stub

	
	
	
		
	public static void main(String[] args) {
		
	GasMeter A = new GasMeter(4, 5, "Q");
	System.out.println("Qmax = " + A.toString());
	
		
	System.out.println("Qmax = " + A.GetQmax());
	System.out.println("Distance = " + A.GetDistance());
	System.out.println("Name = " + A.GetName() + "\n");
	
	GasMeter B = new GasMeter(1, 3, "W");
	System.out.println("Qmax = " + B.toString());
	System.out.println("Qmax = " + B.GetQmax());
	System.out.println("Distance = " + B.GetDistance());
	System.out.println("Name = " + B.GetName() + "\n");
	
	GasMeter S = new GasMeter(222, 33, "E");
	
	System.out.println("Qmax = " + S.GetQmax());
	System.out.println("Distance = " + S.GetDistance());
	System.out.println("Name = " + S.GetName() + "\n");
	
	GasMeter D = new GasMeter(11, 55, "R");
	
	System.out.println("Qmax = " + D.GetQmax());
	System.out.println("Distance = " + D.GetDistance());
	System.out.println("Name = " + D.GetName() + "\n");
	
	GasMeter F = new GasMeter(66, 7, "T");
	
	System.out.println("Qmax = " + F.GetQmax());
	System.out.println("Distance = " + F.GetDistance());
	System.out.println("Name = " + F.GetName() + "\n");
	}

}
