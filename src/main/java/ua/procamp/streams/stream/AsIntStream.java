package ua.procamp.streams.stream;

import ua.procamp.streams.function.*;
import ua.procamp.streams.implementation.IntKeeper;
import ua.procamp.streams.implementation.Iterator;
import ua.procamp.streams.implementation.Keeper;

public class AsIntStream implements IntStream, Keeper {

    int [] ints;

    private AsIntStream(int[] ints) {
        this.ints = ints;
    }


    public static IntStream of(int... values) {
        AsIntStream.
       /* IntKeeper intKeeper = new IntKeeper(values);
        Iterator i = intKeeper.geiIterator();

        while (i.hasNext()){
            System.out.println(i.next());
        }
        return null; //todo change*/
    }

    @Override
    public Iterator geiIterator() {
        return new IntKeeperIterator();
    }

    class IntKeeperIterator implements Iterator {

        int index ;

        /*
         * Simplified design of:
         * return (index < objects.length) ? true : false
         * */
        @Override
        public boolean hasNext() {
            return (index < ints.length);
        }

        @Override
        public Object next() {
            if (hasNext()){
                return ints[index++];
            }
            return null;
        }
    }

    @Override
    public Double average() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer max() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer min() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Integer sum() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IntStream filter(IntPredicate predicate) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void forEach(IntConsumer action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IntStream map(IntUnaryOperator mapper) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IntStream flatMap(IntToIntStreamFunction func) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int reduce(int identity, IntBinaryOperator op) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
