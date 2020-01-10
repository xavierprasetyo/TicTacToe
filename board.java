import java.util.Scanner;

public class board{
    private boolean end = false;
    private char[] arr = {'1','2','3','4','5','6','7','8','9'};
    private char currplay = 'O';

    public void printgiliran(){
        System.out.println("Giliran pemain " + currplay);
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
                System.out.println(count + ". " + arr[i]);
                count++;
            }
        }
    }

    public boolean check(){
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
        System.out.println("Game selesai");
        System.out.println("Pemenangnya pemain " + currplay );
    }


}