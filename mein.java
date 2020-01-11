public class mein {
    public static void main(String[] args){
        System.out.println("Selamat datang di Tic Tac Toe !");
        System.out.println("");

        board bd = new board();
        bd.initKosong();
        while(! bd.check()){
            bd.printgiliran();
            bd.printBoard();
            bd.printEmpty();
            bd.addVal();
            bd.ganti();
        }
        bd.printBoard();
        bd.ganti();
        bd.result();
    }
}