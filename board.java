import java.util.Scanner;
import java.util.ArrayList;

public class board{
    private boolean end = false;
    private boolean seri = false;
    private char[] arr = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
    private char currplay = 'O';
    ArrayList<Integer> kosong = new ArrayList<Integer>();


    public void initKosong(){
        kosong.add(0);
        kosong.add(1);
        kosong.add(2);
        kosong.add(3);
        kosong.add(4);
        kosong.add(5);
        kosong.add(6);
        kosong.add(7);
        kosong.add(8);
    }



    public void printgiliran(){
        System.out.println("  Giliran pemain " + currplay);
        System.out.println("");
    }


    public void printBoard(){
        System.out.println("    A   B   C  ");
        System.out.println("  +---+---+---+");
        System.out.println("1 | " + arr[0] +" | " + arr[1] + " | " + arr[2] + " |");
        System.out.println("  +---+---+---+");
        System.out.println("2 | " + arr[3] +" | " + arr[4] + " | " + arr[5] + " |");
        System.out.println("  +---+---+---+");
        System.out.println("3 | " + arr[6] +" | " + arr[7] + " | " + arr[8] + " |");
        System.out.println("  +---+---+---+");
    }

    public void addVal(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nomor kotak yang dituju : ");
        int d = input.nextInt();
        int idx = kosong.get(d-1);
        arr[idx] = currplay;

        kosong.remove(d-1);
    }

    String cvt(int a){
        String s = "";
        switch(a){
            case 0:
                s = "A1";
                break;
            case 1:
                s = "B1";
                break;
            case 2:
                s = "C1";
                break;
            case 3:
                s = "A2";
                break;
            case 4:
                s = "B2";
                break;
            case 5:
                s = "C2";
                break;
            case 6:
                s = "A3";
                break;
            case 7:
                s = "B3";
                break;
            case 8:
                s = "C3";
                break;
        }
        return s;
    }
    public void printEmpty(){
        System.out.println("Kotak yang tersedia : ");
        for (int i = 0; i <kosong.size();i++){
            System.out.println((i+1) + ". " + cvt(kosong.get(i)));
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
        if (kosong.size() == 0){
            check2();
            if (!end){
                seri = true;
                end = true;   
            }
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