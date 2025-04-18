import java.util.Scanner;

public class GeneratePasswords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("How many random passwords want to generate: ");
        int total = in.nextInt();
        System.out.print("How many characters long do you want: ");
        int length = in.nextInt();

        String[] randomPasswords = new String[total];     
        for(int i=0; i<length; i++){
            String randompassword = "";
            for(int j=0; j<length; j++){
                randompassword += randomCharacter();
            }
            randomPasswords[i] = randompassword;
        }

        printPasswords(randomPasswords);
    }

    public static void printPasswords(String[] arr){
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static char randomCharacter() {
        int rand = (int)(Math.random()*62);

        if(rand <= 9) {
            int ascii = rand + 48;
            return (char)(ascii);
        }else if(rand <= 35) {
            int ascii = rand + 55;
            return(char)(ascii);
        }else {
            int ascii = rand + 61;
            return(char)(ascii);
        }
    }
}