package capgemini.concurrent;

public class Item {
	private int itemid;
	private String name; 
	private float cost;
	
	
	public Item(){
		super();
	}

	public Item(int itemid, String name, float cost) {
		super();
		this.itemid = itemid;
		this.name = name;
		this.cost = cost;
	}

	public int getItemid() {
		return itemid;
	}


	public void setItemid(int itemid) {
		this.itemid = itemid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getCost() {
		return cost;
	}


	public void setCost(float cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", name=" + name + ", cost=" + cost + "]";
	}



	
	
}
