package main;

public class TimeFrames {

    static String [][] person1 = new String[][]{{"9:00", "10:30"}, {"12:00", "13:00"}, {"16:00", "18:00"}};
    static String [] person1bounds = new String[]{"9:00", "20:00"};

    static String [][] person2 = new String[][]{{"10:00", "11:30"}, {"12:30", "14:30"}, {"14:30", "15:00"}, {"16:00", "17:00"}};
    static String [] person2bounds = new String[]{"1:00", "18:30"};

    public static void main(String[] args) {
    }

    static int[][] getIntTime(String[] time) {
        String[] fromS = time[0].split(":");
        String[] toS = time[1].split(":");
        int[] from = new int[]{Integer.parseInt(fromS[0]), Integer.parseInt(fromS[1])};
        int[] to = new int[]{Integer.parseInt(toS[0]), Integer.parseInt(toS[1])};
        return new int[][]{from, to};
    }

    static int [][] getSlots(int[][] meets, int[] bounds) {
        int start = bounds[0];
        int end = bounds[1];
        int[][] slots = new int[10][2];
        int slotIndex = 0;
        for(int x=1; x<meets.length; x++) {
            if (bounds[0] > meets[x-1][0]) {
                slots[slotIndex++] = new int[]{bounds[0], meets[x-1][0]};
            }
        }
        return new int[][]{};
    }
}
