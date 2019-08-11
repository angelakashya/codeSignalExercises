/*
    Given a year, return the century it is in.
    The first century spans from the year 1 up to and including the year 100,
    the second- from the year 101 up to and including the year 200, etc.
*/

public class CenturyFromYear {

    public static int centuryFromYear(int year) {
        int sec = year / 100;
        
        if(year % 100 != 0) {
            sec++;
        }
        return sec;
    }
       
    public static void main(String[] args) {
     System.out.println(centuryFromYear(1905));
     System.out.println(centuryFromYear(1700));
     System.out.println(centuryFromYear(1988));
     System.out.println(centuryFromYear(2000));   
    } 
}