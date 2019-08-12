package capgemini.concurrent;

import java.util.function.Supplier;

public class ConstructorReference_Test {
	public static void main(String[] args) {
		//Constructor Reference
		Supplier<Item> supplierItem=Item::new;
		System.out.println(supplierItem.get());
		Item item= supplierItem.get();
		item.setItemid(101);
		item.setName("Laptop");
		item.setCost(55555.50f);
		System.out.println(item);
		
	}

}
