package practica5;

import java.util.Arrays;


public class CollectionCustom<T> {

	protected T[] array;

	private static final int DEFAULT_CAPACITY = 10;

	private int size = 0;


	public CollectionCustom() {
		Object[] newArray = new Object[DEFAULT_CAPACITY];
		this.array = (T[])newArray;
	}

	public int size() {
		return size;
	}

	public void addFirst(T object) {
		Object[] newArray = new Object[array.length + 1];
		newArray[0] = object;
		for (int i = 0; i < array.length; i++) {
			newArray[i+1] = array[i];
		}
		this.array = (T[]) newArray;
		size++;

	}

	public void addLast(T object) {
		Object[] newArray = new Object[array.length + 1];
		int lastIndex = lastIndexNotNull(array);
		newArray[lastIndex + 1] = object;
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				
				newArray[i] = array[i];
			}
		}
		this.array = (T[]) newArray;
		size++;

	}

	public void add(T object) {
		if (size == this.array.length) {
			ensureCapacity();
		}
		this.array[size++] = object;

	}

	public T remove(T object) {
		if (size == 0) {
			return object;
		}
		if (object != null) {

			int index = indexOf(array, object);
			Object[] copyObjects = new Object[this.array.length -1];
			System.arraycopy(array, 0, copyObjects, 0, index);

			if(array.length != index) {
				 System.arraycopy(array, index + 1, copyObjects, index, array.length - index - 1);
			}
			
			this.array = (T[]) copyObjects;

			size--;
		}
		return object;
	}

	public void removeAll(T object) {

		if (object != null) {

			Object[] copyObjects = new Object[array.length - 1];

			int capacityOfCopy = 0;
			for (int i = 0; i < this.array.length; i++) {
				if (this.array[i] != object) {
					copyObjects[capacityOfCopy++] = this.array[i];
				}
			}
			this.array = (T[]) copyObjects;
			int cont = 0;
			for (int i = 0; i < this.array.length; i++) {
				if(array[i] != null) {
					cont++;
				}
			}
			size = cont;
		}

	}

	public boolean empty() {
		return size == 0;
	}

	private void ensureCapacity() {
		int newCapacity = this.array.length * 2;
		this.array = Arrays.copyOf(this.array, newCapacity);
	}

	public int indexOf(T[] array, T valueToFind) {
		if (array == null) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (valueToFind == array[i]) {
				return i;
			}
		}
		return -1;
	}
	
	private int lastIndexNotNull(T[] array) {
		if (array == null) {
			return -1;
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i] == null) {
				return i - 1;
			}
		}
		return -1;
	}

	@Override
	public String toString() {
		String auxString = "";
		for (int i = 0; i < array.length; i++) {
			if(array[i] != null) {
				auxString +=  array[i] + ", "; 
			}
		}
		return "Lista [array=" + auxString + "]";
	}

}
