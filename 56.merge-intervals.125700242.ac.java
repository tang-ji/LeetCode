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
    public List<Interval> merge(List<Interval> intervals) {
        if(intervals.size() <= 1) return intervals;
        
        // Sort by ascending starting point using an anonymous Comparator
        intervals.sort((i1, i2) -> Integer.compare(i1.start, i2.start));
        
        List<Interval> result = new ArrayList<Interval>();
        int s = intervals.get(0).start, e = intervals.get(0).end;
        
        for(Interval i : intervals) {
            if(i.start <= e) e = Math.max(e, i.end);
            else {
                result.add(new Interval(s, e));
                s = i.start;
                e = i.end;
            }
        }
        result.add(new Interval(s, e));
        return result;
    }
}