public class LongestStreak {
    public static void main(String[] args) {
        Streak("CCAAAAATTT!"); //Should print out "A 5"
    }

    public static void Streak(String str) {
        //HOW TO LOOP OVER CHARACTERS IN A STRING?
        //HOW TO IDENTIFY A STREAK OF CHARACTERS?
        //HOW TO TRACK THE LONGEST STREAK?
        
        int high = 0;
        char ch, chAfter;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int k = i; k < str.length(); k++) {
                ch = str.charAt(i);
                chAfter = str.charAt(k);
                if (ch == chAfter) {
                count++;
                } else {
                    break;
                }
            }
            if (count > high) {
                high = count;
            }
        }
        System.out.println(high);
    }
}
