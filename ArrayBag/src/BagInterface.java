public interface BagInterface<T> {

    public int getCurrentSize();
    /* the num of elements currently in bag

    @return - (int) number of elements
     */

    public boolean isEmpty();
    /* test for an empty bag

    @return - (boolean) true if the number of elements is zero, false otherwise
     */

    public boolean addNewEntry(T newEntry);
    /*
    @param (T) newEntry - the item to be added to the bag

    @return - (boolean) true if the item is added false otherwise
     */

    public T remove();
    /*

    @return - (T) the element removed from the bag, or null
     */

    public boolean remove(T anEntry);

    public void clear();

    public int getFrequencyOf(T anEntry);

    public boolean contains(T anEntry);

    public T[] toArray();
    /* Find all elements in the bag  */


}
