public class Nested {
    public static void main(String[] args) {
        nested();
    }

    public static void nested() {
        String[] bowlingList = {"ball", "pins", "lane", "shoes", "scoreboard", "alley"};
        for (int i = 0; i < bowlingList.length; i++) {
            for (int l = 0; l < bowlingList[i].length(); l++) {
                System.out.println(bowlingList[i].substring(l, l + 1));
            }
        }
    }
}