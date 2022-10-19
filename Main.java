import java.util.*;

// Given an array of intervals representing ‘N’ appointments, find out if a person can attend all the appointments.

// Example 1:

// Appointments: [[1,4], [2,5], [7,9]]
// Output: false
// Explanation: Since [1,4] and [2,5] overlap, a person cannot attend both of these appointments.
// Example 2:

// Appointments: [[6,7], [2,4], [8,12]]
// Output: true
// Explanation: None of the appointments overlap, therefore a person can attend all of them.
// Example 3:

// Appointments: [[4,5], [2,3], [3,6]]
// Output: false
// Explanation: Since [4,5] and [3,6] overlap, a person cannot attend both of these appointments.

class Interval {
  int start;
  int end;

  public Interval(int start, int end) {
    this.start = start;
    this.end = end;
  }
}

class Main {

  public static boolean conflictAppointment(Interval[] arr1) {
    Arrays.sort(arr1, (a,b) -> (Integer.compare(a.start, b.start)));
    
    for(int i = 1; i< arr1.length; i++){
      if(arr1[i].start < arr1[i-1].end)
        return false;
    }
  
    return true;
  }

  public static void main(String[] args) {
    Interval[] interval = new Interval[] { new Interval(1, 4), new Interval(2, 5), new Interval(7, 9) };
    System.out.println(" " + Main.conflictAppointment(interval));

        Interval[] interval2 = new Interval[] { new Interval(6, 7), new Interval(2, 4), new Interval(8, 12) };
    System.out.println(" " + Main.conflictAppointment(interval2));
  }
}