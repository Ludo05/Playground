package BTS;

public class EmptyBST<D extends  Comparable> implements TreeI<D>{

    public EmptyBST(){


    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int cardinality() {
        return 0;
    }

    @Override
    public boolean member(D element) {
        return false;
    }

    @Override
    public NonEmptyBST<D> add(D element) {
        return null;
    }
}
