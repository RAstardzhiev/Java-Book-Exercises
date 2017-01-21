package Chapter_9;

import java.util.Date;

public class StopWatch {
    
     private Date startTime, endTime;
     
     StopWatch() {
         startTime = new Date();
     }
     void start() {
         startTime = new Date();
     }
     void stop() {
         endTime = new Date();
     }
     long getElapsedTime() {
         long start = this.startTime.getTime();
         long end = this.endTime.getTime();
         return end - start;
     }
    
}
