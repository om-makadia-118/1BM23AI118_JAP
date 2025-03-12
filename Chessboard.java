public class Chessboard {
    public static void main(String[] args) {
        for (int i=0; i<8; i++){
            for (int j=0; j<8; j++){
                if ((i+j)%2==0){
                    System.out.print(" W ");
                }
                else{
                    System.out.print(" B ");
                }
            }
            System.out.print('\n');
        }
    }
}

/*
Output:

 W  B  W  B  W  B  W  B
 B  W  B  W  B  W  B  W
 W  B  W  B  W  B  W  B
 B  W  B  W  B  W  B  W
 W  B  W  B  W  B  W  B
 B  W  B  W  B  W  B  W
 W  B  W  B  W  B  W  B
 B  W  B  W  B  W  B  W
 */