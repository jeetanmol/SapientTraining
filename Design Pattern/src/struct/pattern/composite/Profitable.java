package struct.pattern.composite;

public interface Profitable {

	
	public double getProfit();
	public void addLeaf(Profitable child);
	public void removeLeaf(Profitable child);
}
