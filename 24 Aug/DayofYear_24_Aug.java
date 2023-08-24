// leetcode-1154-day of the year

class Solution {
    public int dayOfYear(String date) {
        int days = 0;
        // date format is yyyy-mm-dd
        days += Integer.parseInt(date.substring(8));
        int month = Integer.parseInt(date.substring(5, 7));
        int year = Integer.parseInt(date.substring(0, 4));
        for(int mon = 1; mon < month; mon++) {
            if(mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10)
                days += 31;
            else if(mon == 4 || mon == 6 || mon == 9 || mon == 11)
                days += 30;
            else
                days += (isLeap(year) == true) ? 29 : 28;
        }
        return days;
    }
    public boolean isLeap(int year) {
        if(year % 4 == 0) {
            if(year % 100 == 0) {
                if(year % 400 == 0) return true;
                else return false;
            }
            return true;
        }
        return false;
    }
}