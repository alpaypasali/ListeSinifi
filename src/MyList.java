public class MyList<T> {

    private T[] array;
    private int size = 0;
    private int capacity;

    public MyList(){

        this.capacity =10;
        this.array =(T[]) new Object[capacity];
    }
    public MyList(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be greater than zero.");
        }
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    public T getIndex(int index){

        if (index < 0 || index >= size) {
            return null;
        }
        return  array[index];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize(){

        return  size;

    }
    public void add(T data){

        if(size == capacity){
            resize();
        }
        array[size++] = data;
    }
    public T set(int index , T data){
        index = index-1;
        if (index < 0 || index >= size) {
            return null; // Invalid index
        }
        T setedElement = array[index];
        array[index] = data;

        return setedElement;
    }
    public T remove(int index) {
        index = index-1;
        if (index < 0 || index >= size) {
            return null; // Invalid index
        }

        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null; // Clear the last element
        size--;
        if(size > capacity){

            backResize();

        }
        return removedElement;
    }
    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void backResize(){
        capacity = capacity / 2;
        T[] newarray =(T[]) new Object[capacity];
        for (int i =0; i < size ; i++){
            newarray[i] = array[i];

        }
        array = newarray;


    }


    private void resize(){

        capacity = capacity*2;
        T[] newarray =(T[]) new Object[capacity];
        for (int i =0; i < size ; i++){
            newarray[i] = array[i];

        }
        array = newarray;

    }


}
