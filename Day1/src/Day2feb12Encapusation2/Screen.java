package Day2feb12Encapusation2;

public class Screen {
	private int length;
	private float weight;
	private String materila;
	public Screen(int length,float weight,String materila) {
		this.length=length;
		this.weight=weight;
		this.materila=materila;
	}
	public String toString() {
		return "Screen [length=" + length + ", weight=" + weight + ", materila=" + materila + "]";
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length=length;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight=weight;
	}

public String getMaterila() {
	return materila;
}
public void setmaterila(String materila) {
	this.materila=materila;
}

}
