package ua.procamp.streams.implementation;

public class IntKeeper implements Keeper{

    int [] ints;


    public IntKeeper(int[] ints) {
        this.ints = ints;
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
}
