// I used online compiler
import java.io.*;
import java.util.*;
class CamelCase {
    public static int Outstanding(int [] hours,int target){
        int index = 0;
        
        for (int i = 0; i < hours.length; i++){
            if (hours[i] >= target){
                index++;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        int [] hours = {7, 8 , 10, 5, 7, 8, 12};
        int target = 8;
        System.out.println("Employees' Hours: "+ Arrays.toString(hours));
        System.out.println("Target: " + target);
        int result = Outstanding(hours, target);
        System.out.println("Total Employees who met the target time is: " + result);
    }
}
