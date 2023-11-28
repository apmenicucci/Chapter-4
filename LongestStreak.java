public class LongestStreak {
    public static void main(String[] args) {
        Streak("CCAAAAATTT!"); //Should print out "A 5"
    }

    public static void Streak(String str) {
        //HOW TO LOOP OVER CHARACTERS IN A STRING?
        //HOW TO IDENTIFY A STREAK OF CHARACTERS?
        //HOW TO TRACK THE LONGEST STREAK?
        int curTracker = 0;
        int highTracker = 0;
        for (int i = 0; i > str.length(); i++) {
            char ch = str.charAt(i);
            char chAfter = str.charAt(i+1);
            if (ch == chAfter) {
                curTracker++;
            } else {
                curTracker = 0;
            }
            if (curTracker == highTracker) {
                
            }
        }
        System.out.println(highTracker);
    }
}
