import org.junit.Test;

import java.util.TreeMap;

public class Bins {

    static TreeMap<Integer,Integer> bins = new TreeMap<Integer, Integer>();
    public Bins(int lowerBound, int upperBound) {

        for(int i = lowerBound; i<= upperBound; i++){
            bins.put(i,0);
        }
    }

    public  void binEntry(int result){

        bins.put(result, bins.get(result)+1);
    }

    public  int getBin(int binNumber){

        return bins.get(binNumber);
    }

}
