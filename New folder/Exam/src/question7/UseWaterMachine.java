package question7;

public class UseWaterMachine {

	public static void main(String[] args) {
   WaterTampSwitch w1=new WaterTampSwitch("senseire","plastic","round");
   WaterTampSwitch w2=new WaterTampSwitch("manule","steel","sqare");
   WaterTampSwitch w3=new WaterTampSwitch("botenconer","iron","centre");
   WaterTampSwitch []w= {w1,w2,w3};
   WaterStorageSump s=new WaterStorageSump("Steel","4th",1000);
   WaterMachine wm=new WaterMachine("sony",15000,3.5f,w,s);
   System.out.println(wm);
   
	}

}
