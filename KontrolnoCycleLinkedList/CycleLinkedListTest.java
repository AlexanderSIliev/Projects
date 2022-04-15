package KontrolnoCycleLinkedList;

public class CycleLinkedListTest {

	public static void main(String[] args) {
		CycleLinkedList<Integer> c = new CycleLinkedList<>();
		c.add(5);
		c.add(7);
		c.add(8);
		c.add(2, 6);
		System.out.println(c.get(10));
		System.out.println(c.get(-10));
		System.out.println(c.isEmpty());
		c.clear();
		System.out.println(c.isEmpty());
	}

}
