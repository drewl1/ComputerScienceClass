public class findthesmall {
    public static int findSmallest(int num1,int num2,int num3) {
        int smallnum = num1;
        if (num2 < smallnum) {
            smallnum = num2;
        }
        if (num3 < smallnum) {
            smallnum = num3;
        }
        return smallnum;
    }
    public static void main(String[] args) {
        System.out.println(findSmallest(65,27,143));
    }
}
