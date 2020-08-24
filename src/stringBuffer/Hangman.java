package stringBuffer;

import java.util.Scanner;

public class Hangman {
    static String[] string = new String[10];
    static StringBuffer[] answer = new StringBuffer[10];
    static Boolean flag = false;
    static int[] attempts = {6, 6, 6, 6, 1, 1, 6, 6, 6, 6};
    public static void main(String[] args) {
        string[0] = "Ques 1: Where you can store data and pay for what you use?";
        string[1] = "cloud";
        string[2] = "Ques 2: I'm a markup language, you don't know. ";
        string[3] = "latex";
        string[4] = "Ques 3: Binary value of 132. ";
        string[5] = "10000100";
        string[6] = "Ques 4: ASCII value of Q";
        string[7] = "81";
        string[8] = "Ques 5: Command to clear output screen in java?";
        string[9] = "i don't know";
        for (int i = 0; i < string.length; i+=2){
            answer[i] = new StringBuffer();
            playGame(i);
        }
        scoreBoard();
    }
    public static void playGame(int number){
        drawHangman(number);
        System.out.println(string[number]);
        System.out.print("Ans:\t");
        if(!flag)
            answer[number].replace(0, answer[number].length(), ("_ ".repeat(string[number + 1].length())));
        System.out.println(answer[number]);
        Scanner sc = new Scanner(System.in);
        if(attempts[number] > 0) {
            String input = sc.nextLine();
            for (int i = 0; i < string[number + 1].length(); i++) {
                try {
                    if (!(input.charAt(i) == '_') && answer[number].charAt(i * 2) == '_') {
                        if (input.charAt(i) == string[number + 1].charAt(i)) {
                            answer[number].replace(i * 2, (i * 2) + 1, String.valueOf(input.charAt(i)));
                        } else if(attempts[number] > 0)
                                attempts[number]--;
                    }
                } catch (Exception e) {
                }
            }
            if (attempts[number] == 0) {
                flag = true;
                playGame(number);
                System.out.println("you lost, Correct answer is : " + string[number + 1]);
                flag = false;
                if (number == 8)
                    System.out.println("Game Ended.");
                System.out.print("Press Enter to continue..");
                sc.nextLine();
            } else if (!(answer[number].indexOf("_") == -1)) {
                flag = true;
                playGame(number);
            } else {
                System.out.println("Correct Answer: " + string[number + 1]);
                flag = false;
                if (number == 8)
                    System.out.println("Game Ended.");
                System.out.print("Press Enter to continue..");
                sc.nextLine();
            }
        }
    }
    public static void scoreBoard(){
        System.out.println("Scoreboard");
        System.out.println("\nQues no.\tlife bonus\tTotal Score");
        int j = 0, totalScore = 0;
        for (int i = 0; i < string.length; i+=2) {
            if(attempts[i] != 0) {
                System.out.println("   " + (j + 1) + "\t\t\t" + attempts[i] + "\t\t\t" + ((attempts[i] * 2) + string[i + 1].length()));
                totalScore += (attempts[i] * 2) + string[i + 1].length();
            }
            else{
                int count = 0;
                for (int k = 0; k < answer[i].length(); k+=2) {
                    if(answer[i].charAt(k) != '_')
                        count += 1;
                }
                System.out.println("   " + (j + 1) + "\t\t\t" + attempts[i] + "\t\t\t" + count);
                totalScore += attempts[i] * 2 + count;

            }
            j++;
        }
        System.out.print("Your total score is: " + totalScore);
    }
    public static void drawHangman(int i){
        switch(attempts[i]) {
            case 6:System.out.println("|`````| \t\t\t" + "Lives remaining : " + attempts[i]);
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 5:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                System.out.println("|");
                break;
            case 4:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|     |    ");
                System.out.println("|     |");
                System.out.println("|     |");
                System.out.println("|");
                System.out.println("|");
                break;
            case 3:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|     |    ");
                System.out.println("|    /|");
                System.out.println("|   / |");
                System.out.println("|");
                System.out.println("|");
                break;
            case 2:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|     |    ");
                System.out.println("|    /|\\  ");
                System.out.println("|   / | \\ ");
                System.out.println("|");
                System.out.println("|");
                break;
            case 1:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|     |    ");
                System.out.println("|    /|\\  ");
                System.out.println("|   / | \\ ");
                System.out.println("|    / ");
                System.out.println("|   /  ");
                break;
            case 0:System.out.println("|`````| \t\t\t" + "lives remaining : " + attempts[i]);
                System.out.println("|   |```|");
                System.out.println("|   |...|");
                System.out.println("|     |    ");
                System.out.println("|    /|\\  ");
                System.out.println("|   / | \\ ");
                System.out.println("|    / \\  ");
                System.out.println("|   /   \\ ");
        }
    }
}
