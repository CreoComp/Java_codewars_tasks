//6 kuy
public class Reverse {
    public static void main(String[] args)
    {
        for(int i : DataReverse(new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0})) {
            System.out.print(i);
        }
        System.out.print("          ");

        for(int i : new int[] {1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0}) {
            System.out.print(i);
        }
    }

    public static int[] DataReverse(int[] data) {
        for(int i = 1; i < (data.length / 16) + 1; i++) {
            for(int j = 0; j < 8; j++) {
                int x = data[8 * (i - 1) + j];
                int y = data[data.length - (8 * i) + j];
                System.out.print(x + " " + y);
                data[8 * (i - 1) + j] = y;
                data[data.length - (8 * i) + j] = x;
            }
        }
        return data;
    }
}