import java.util.*;

class QueueSetOperation{
    public static void main(String[] args){
        //creat priority queue
        java.util.PriorityQueue<String> queue1 = new PriorityQueue<>(Arrays.asList("George","Jim","John","Blake","Kevin", "Michael"));
        
        java.util.PriorityQueue<String> queue2 = new PriorityQueue<>(Arrays.asList("George", "Katie", "Kevin", "Michelle", "Ryan"));
        
        System.out.println("The union of the two priority queue is [" + union(queue1,queue2));
        System.out.println("The differance of the two priority queue is[" + differance(queue1, queue2));
        System.out.println("The intersection of the two queue is [" + intersection(queue1, queue2));
        
    }
    private static <T> PriorityQueue<T> union(PriorityQueue<T> set1, PriorityQueue<T> set2){
        PriorityQueue<T> union = new PriorityQueue<T>(set1);
        union.addAll(set2);
        return union;
    }
    private static <T> PriorityQueue<T> differance(PriorityQueue<T> set1, PriorityQueue<T> set2){
        PriorityQueue<T> differance = new PriorityQueue<T>(set1);
        differance.removeAll(set2);
        return differance;
    }
    private static <T> PriorityQueue<T> intersection(PriorityQueue<T> set1, PriorityQueue<T> set2){
        PriorityQueue<T> intersection = new PriorityQueue<T>(set1);
        intersection.retainAll(set2);
        return intersection;
    }
}