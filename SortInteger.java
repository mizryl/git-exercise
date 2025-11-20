public class SortInteger {
    public static void main(String[] args) {
        int[] num = {5,3,1,6,8,29};
        int tempNum;

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j+1]) {
                    tempNum = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = tempNum;
                } 
            }
        }
        for (int n : num) {
            System.out.print(n + " ");
        }
    }
}
