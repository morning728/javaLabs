package org.example.exercise3;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class MySet<E> implements Set {
    private Set<E> set;
    private Semaphore semaphore;
    public MySet(Set<E> set, Semaphore semaphore){
        this.set = set;
        this.semaphore = semaphore;
    }
    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean add(Object o) {
        try{
            semaphore.acquire();
            set.add((E)o);
            semaphore.release();
            return true;
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }
        return false;
    }
    @Override
    public boolean remove(Object o) {
        try{
            semaphore.acquire();
            set.remove((E)o);
            semaphore.release();
            return true;
        } catch (InterruptedException e) {
            System.out.println("ERROR");
        }
        return false;
    }









    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }





    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
