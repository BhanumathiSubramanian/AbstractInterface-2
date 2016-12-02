abstract class Instrument
{
	public  int number;
	public abstract void play();
}

class StringInstrument extends Instrument
{
	int numberOfStrings;
	public void play()
	{	
		System.out.println("This is an String Instrument");
	}
	
}
class ElectricalGuitar extends StringInstrument
{
	 public void play()
	 {
		 System.out.println("This is an ElectricalGuitar");
	 }
	
}
class ElectricBassGuitar extends StringInstrument
{
	 public void play()
	 {
		 System.out.println("This is an ElectricBassGuitar");
	 }
}

public class AbstractDemo {

	public static void main(String[] args) {
		StringInstrument obj1 = new StringInstrument();
		obj1.play();
		ElectricalGuitar obj2 = new ElectricalGuitar();
		obj2.play();
		ElectricBassGuitar obj3 = new ElectricBassGuitar();
		obj3.play();
	}

}
