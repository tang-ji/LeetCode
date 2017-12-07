/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public int minMeetingRooms(Interval[] intervals) {
        if(intervals.length == 0) return 0;
        List<List<Interval>> L = new ArrayList<>();
        L.add(new ArrayList<Interval>());
        for(int j = 0; j < intervals.length; j++) {
            boolean o = false;
            for(List<Interval> l : L) {
                if(isV(l, intervals[j])) {
                    l.add(intervals[j]);
                    o = true;
                }
            }
            if(o == false) {
                List<Interval> l1 = new ArrayList<Interval>();
                l1.add(intervals[j]);
                L.add(l1);
            }
        }
        return L.size();
    }
    
    public boolean isV(Interval i1, Interval i2) {
        if((i1.start < i2.end && i1.start >= i2.start) || (i2.start < i1.end && i2.start >= i1.start)) return false;
        return true;
    }
    
    public boolean isV(List<Interval> l, Interval i2) {
        for(Interval i : l) {
            if(!isV(i2, i)) return false;
        }
        return true;
    }
}