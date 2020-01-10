import java.util.Scanner;

public class board{
    private boolean end = false;
    private boolean seri = false;
    private char[] arr = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private char currplay = 'O';
    private int count = 0;

    public void printgiliran(){
        System.out.println("Giliran pemain " + currplay);
        count ++;
    }


    public void printBoard(){
        System.out.println("+---+---+---+");
        System.out.println("| " + arr[0] +" | " + arr[1] + " | " + arr[2] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + arr[3] +" | " + arr[4] + " | " + arr[5] + " |");
        System.out.println("+---+---+---+");
        System.out.println("| " + arr[6] +" | " + arr[7] + " | " + arr[8] + " |");
        System.out.println("+---+---+---+");
    }

    public void addVal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor kotak yang dituju : ");
        int d = input.nextInt();
        
        arr[d-1] = currplay;
    }

    public void printEmpty(){
        System.out.println("Kotak yang tersedia : ");

        int count = 1;
        for (int i = 0; i<9; i++){
            if (arr[i] != 'O' && arr[i] != 'X'){
                System.out.println(count + ". " + (i+1));
                count++;
            }
        }
    }


    void check2(){
        if ((arr[0] == arr[1]) && (arr[1] == arr[2]) && (arr[2] != ' ')){
            end = true;
        } else if ((arr[3] == arr[4]) && (arr[4] == arr[5]) && (arr[5] != ' ')){
            end = true;
        } else if ((arr[6] == arr[7]) && (arr[7] == arr[8]) && (arr[8] != ' ')){
            end = true;
        } else if ((arr[0] == arr[3]) && (arr[3] == arr[6]) && (arr[6] != ' ')){
            end = true;
        } else if ((arr[1] == arr[4]) && (arr[4] == arr[7]) && (arr[7] != ' ')){
            end = true;
        } else if ((arr[2] == arr[5]) && (arr[5] == arr[8]) && (arr[8] != ' ')){
            end = true;
        }else if ((arr[0] == arr[4]) && (arr[4] == arr[8]) && (arr[8] != ' ')){
            end = true;
        } else if ((arr[2] == arr[4]) && (arr[4] == arr[6]) && (arr[6] != ' ')){
            end = true;
        }
    }
    public boolean check(){
        if (count == 9){
            check2();
            if (!end){
                seri = true;
            }
            end = true;   
        } else {
            check2();
        }
        return end;
    }

    public void ganti(){
        if(currplay == 'O'){
            currplay = 'X';
        } else {
            currplay = 'O';
        }
    }

    public void result(){
        if (seri) {
            System.out.println("Game berakhir seri");
        } else {
            System.out.println("Game selesai");
        System.out.println("Pemenangnya pemain " + currplay );
        }
    }


}