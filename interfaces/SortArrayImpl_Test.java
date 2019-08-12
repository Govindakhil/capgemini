package capgemini.interfaces;

import java.util.Arrays;

interface Arraysort
{
	void sortAsc();
	void sortDesc();
}
class ArraySortImpl implements Arraysort
{
	int[] nums;
	public ArraySortImpl(int[] nos) {
		this.nums=nos;
		}
	@Override
	public void sortAsc() {
		// asc sort algo..
	}
	
	@Override
	public void sortDesc() {
		// desc sort algo..
	}
	//own method of ArraySortImpl class....
	public void print () {
		System.out.println(Arrays.toString(nums));
	}

	
}

public interface SortArrayImpl_Test {
	public static void main(String[] args) {
		int[] nums = {1,3,2,5,4,6,8,7,9,10};
		ArraySortImpl arraySortImpl = new ArraySortImpl (nums);
		arraySortImpl.sortAsc();
		arraySortImpl.print();
		
	}
}
