/*
This program lists all the odd numbers from 1 to 20
 */
public class LoopsOddNumbers {
    public static void main(String[] args) {

        System.out.println("Here is list of odd numbers from 1 to 20: ");
        for(int i = 1; i <= 20; i++){
            if(i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
