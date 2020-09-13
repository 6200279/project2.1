

public class gameBoard {

	protected Stack[] stacks;
	public Stack[] stacks_2;
	private int[] die;
	private int[] die_2;
	private int turn;
	
	
	public static final int P1 = -1;
	public static final int P2 = 1;

	
	public static final int FINAL_P2 = 26;
	public static final int FINAL_P1 = 27;
	private Stack selectSTACK;
	
	public void setDie(int[] die){
		this.die = die;
	}
	
	public int[] getDie(){
		return die;
	}
	
	public void setDie_2(int[] die_2){
		this.die_2 = die_2;
	}
	
	public int[] getDie_2(){
		return die_2;
	}
	
	public gameBoard(int turn){
		stacks = new Stack[26];
		stacks_2 = new Stack[2];
		this.turn = turn;
	}
	
	public void changeTurn(){
		if (turn == P1){
			turn = P2;
		} else {
			turn = P1;
		}
	}
	
	public int getTurn(){
		return turn;
	}
	
	public Stack getSelected(){
		return selectSTACK;
	}

	public Stack[] getAll(){
		return stacks;
	}

	public Stack getFinal(int color){
		if (color == Stack.P1){
			return stacks_2[0];
		} else {
			return stacks_2[1];
		}
	}
	
	public void init (){
		for (int i = 0; i < stacks.length; i++){
			stacks[i] = new Stack(i,this);
		}

		for (int i = 0; i < stacks_2.length; i++){
			stacks_2[0] = new Stack(FINAL_P1,this);
			stacks_2[1] = new Stack(FINAL_P2,this);
		}
	}
	
	public void addPieces(){

		stacks[1].addPiece(Piece.WHITE); stacks[1].addPiece(Piece.WHITE);

		stacks[12].addPiece(Piece.WHITE); stacks[12].addPiece(Piece.WHITE);
		stacks[12].addPiece(Piece.WHITE); stacks[12].addPiece(Piece.WHITE);
		stacks[12].addPiece(Piece.WHITE);

		stacks[17].addPiece(Piece.WHITE); stacks[17].addPiece(Piece.WHITE);
		stacks[17].addPiece(Piece.WHITE);

		stacks[19].addPiece(Piece.WHITE); stacks[19].addPiece(Piece.WHITE);
		stacks[19].addPiece(Piece.WHITE); stacks[19].addPiece(Piece.WHITE);
		stacks[19].addPiece(Piece.WHITE);
		
		stacks[6].addPiece(Piece.BLACK); stacks[6].addPiece(Piece.BLACK);
		stacks[6].addPiece(Piece.BLACK); stacks[6].addPiece(Piece.BLACK);
		stacks[6].addPiece(Piece.BLACK);
		
		stacks[8].addPiece(Piece.BLACK); stacks[8].addPiece(Piece.BLACK);
		stacks[8].addPiece(Piece.BLACK);

		stacks[13].addPiece(Piece.BLACK); stacks[13].addPiece(Piece.BLACK);
		stacks[13].addPiece(Piece.BLACK); stacks[13].addPiece(Piece.BLACK);
		stacks[13].addPiece(Piece.BLACK);

		stacks[24].addPiece(Piece.BLACK); stacks[24].addPiece(Piece.BLACK);

	}
	
