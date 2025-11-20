package src.main;
public class SortInteger {
    public static void sort(int[] num){
        
        int tempNum; //temporay variable to store the number

        //outer loop to ctrl how many passes we make
        for (int i = 0; i < num.length - 1; i++) {
            //inner loop that deals w/ swapping
            for (int j = 0; j < num.length - 1 - i; j++) {
                //if number is < the next num in the next index
                if (num[j] > num[j+1]) {
                    tempNum = num[j]; //store current value
                    num[j] = num[j + 1]; //move small value to the left
                    num[j + 1] = tempNum; //larger value to the right
                } 
            }
        }
        for (int n : num) {
            System.out.print(n + " "); //prints out sorted numbers
        }
    }

    //run code :D
    public static void main(String[] args) {
        int[] num = {3,2,20,32};
        sort(num);
    }
}
