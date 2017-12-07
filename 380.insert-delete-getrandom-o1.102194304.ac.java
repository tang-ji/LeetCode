import java.util.*;
public class RandomizedSet {
    Set<Integer> RS;
    /** Initialize your data structure here. */
    public RandomizedSet() {
        RS = new HashSet<Integer>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (!RS.contains(val)) {
            RS.add(val);
            return true;
        }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        return RS.remove(val);
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int i = (int)(Math.random() * RS.size());
        return (int)RS.toArray()[i];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */