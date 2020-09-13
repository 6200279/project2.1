
import java.util.ArrayList;

public class Stack {


        public static final int EMPTY = 0;
        public static final int P1= -1;
        public static final int P2 = 1;

        ArrayList<Puck> pucks ;
        int n;
        boolean isCHOZEN;
        public gameBoard board;

        public Stack(int i, gameBoard board) {
            pucks = new ArrayList<>();
            this.n = i;
            this.board = board;
        }

        public ArrayList<Puck> getPucks(){
            return pucks;
        }

        public void addPuck(boolean b){
            this.pucks.add(new Puck(b));
        }

        public boolean RemovePuck(){
            if (this.pucks.size() > 0){
                boolean b = this.pucks.get(0).getColor();
                this.pucks.remove(this.pucks.get(0));
                return b;
            }
            return false;
        }

        public int getN() {
            if (this.n == gameBoard.P1){
                return 25;
            } else if (this.n == gameBoard.P2){
                return 0;
            } else {
                return n;
            }
        }

        public boolean hasPucks(){
            return !pucks.isEmpty();
        }


        public int getColor(){
            if (this.pucks.isEmpty()){
                return EMPTY;
            } else {
                if (this.pucks.get(0).getColor() == Puck.BLACK){
                    return P1;
                } else {
                    return P2;
                }
            }
        }

        public boolean matchesColor(){
            return board.getSelected().getColor() == this.getColor();
        }

        public boolean isEmpty(){
            return (this.getColor() == Stack.EMPTY);
        }
        }
        
