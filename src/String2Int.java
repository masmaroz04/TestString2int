import java.util.Scanner;

public class String2Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        AllCharacter allCharacter = new AllCharacter(input);

        String[] charc = allCharacter.getAllChar().split("");
        String[] fixNumber = allCharacter.getFixNumber().split(" ");

        int num = 0;
        for(int i = 0 ; i < charc.length ; i++){
            for(int j = 0 ; j < fixNumber.length; j++) {
                if(fixNumber[j].equals(charc[i]+"")){
                    num = num*10+fixNumber[j].charAt(0) - '0';
                }
            }
        }
        System.out.println(num);

    }
}

class AllCharacter{
    String allChar;
    String fixNumber;

    public AllCharacter(String allChar) {
        this.allChar = allChar;
        this.fixNumber = "0 1 2 3 4 5 6 7 8 9";
    }

    public String getAllChar() {
        return allChar;
    }

    public void setAllChar(String allChar) {
        this.allChar = allChar;
    }

    public String getFixNumber() {
        return fixNumber;
    }

    public void setFixNumber(String fixNumber) {
        this.fixNumber = fixNumber;
    }
}
