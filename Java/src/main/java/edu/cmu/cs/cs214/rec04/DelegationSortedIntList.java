package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    private final SortedIntList sortedList = new SortedIntList();
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++;
        return sortedList.add(num);
    }

    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return sortedList.addAll(list);
    }

    @Override
    public int get(int index) {
        return sortedList.get(index);
    }

    @Override
    public int size() {
        return sortedList.size();
    }

    public int getTotalAdded() {
        return totalAdded;
    }

    @Override
    public boolean remove(int num) {
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean removeAll(IntegerList list) {
        throw new UnsupportedOperationException("Unimplemented method 'removeAll'");
    }
}