public class LongestStreak {
    public static void main(String[] args) {
        Streak("CCAAAAATTT!"); //Should print out "A 5"
    }
    public static void Streak(String str) {
        //HOW TO LOOP OVER CHARACTERS IN A STRING?
        //HOW TO IDENTIFY A STREAK OF CHARACTERS? 
        //HOW TO TRACK THE LONGEST STREAK?
        int high = 0;
        int tracker = 0;
        char maxChar = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            char ch = str.charAt(i);
            char chMinus = str.charAt(i-1);
            if (ch == chMinus) {
                tracker++;
            } else {
                if (tracker > high) {
                    high = tracker;
                    maxChar = chMinus;
                }
                tracker = 1;
            }
        }
        if (tracker > high) {
            high = tracker;
            maxChar = str.charAt(str.length()-1);
        }
        System.out.println(maxChar + " " + high);
    }
}