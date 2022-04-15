package KontrolnoCycleLinkedList;

class CCLNode<T> {
	private T data;
	private CCLNode<T> next;

	public void setData(T newData) {
		this.data = newData;
	}

	public void setNext(CCLNode<T> newNext) {
		this.next = newNext;
	}

	public T getData() {
		return data;
	}

	public CCLNode<T> getNext() {
		return next;
	}

	public CCLNode(T data, CCLNode<T> next) {
		setData(data);
		setNext(next);
	}

	public CCLNode() {

	}
}

public class CycleLinkedList<T> {

	private CCLNode<T> first;
	private CCLNode<T> last;
	private int size;
	
	public boolean isEmpty() {
		return first == null;
	}

	public int size() {
		return size;
	}

	public void add(T element) {
		if (isEmpty()) {
			first = new CCLNode<T>(element, null);
			last = new CCLNode<T>(null, first);
			first.setNext(last);
			last.setNext(first);
		} else if (first.getData() != null && last.getData() == null) {
			last = new CCLNode<T>(element, first);
			first.setNext(last);
			last.setNext(first);
		} else if (first.getData() != null && last.getData() != null) {
			CCLNode<T> n = new CCLNode<T>();
			n.setData(element);
			n.setNext(first);
			last.setNext(n);
			last = n;
			last.setNext(first);
		}
		size++;
	}

	public void add(int index, T element) {
		if (index > size() || index < 0)
			throw new IndexOutOfBoundsException();

		CCLNode<T> currentCCLNode = first;
		CCLNode<T> previousCCLNode = null;
		while (index > 0) {
			previousCCLNode = currentCCLNode;
			currentCCLNode = currentCCLNode.getNext();
			index--;
		}
		if (previousCCLNode != null) {
			previousCCLNode.setNext(new CCLNode<T>(element, currentCCLNode));
		} else {
			first = new CCLNode<T>(element, first);
		}
		size++;
	}

	public T get(int index) {
		if (index > size) {
			while (index > size) {
				index = index - size;
			}
		}
		if (index < size) {
			while (index < size) {
				index = index + size;
			}
		}
		CCLNode<T> currentCCLNode = first;
		CCLNode<T> previousCCLNode = null;

		while (index > 0) {
			previousCCLNode = currentCCLNode;
			currentCCLNode = currentCCLNode.getNext();
			index--;
		}
		return currentCCLNode.getData();
	}

	public void clear() {
		first = null;
		last = null;
		size = 0;
	}

}