import java.util.Scanner;

public class board{
    private boolean end = false;
    private char[] arr = {' ',' ',' ',' ',' ',' ',' ',' ',' '};

    enum idx {
        A1,A2,A3,B1,B2,B3,C1,C2,C3
    }

    class player{
        int num;
        char simbol;

        public player(char c){
            simbol = c;
            if (c == 'O'){
                num = 1;
            } else {
                num = 2;
            }
        }

        public char getChar(){
            return simbol;
        }
    }

    public void printBoard(){
        System.Out
    }

}