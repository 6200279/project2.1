public class PossibleMove implements Cloneable
{
	private int t,f,dice;

	public PossibleMove(int t, int f, int dice ){
		this.t = t;
		this.f = f;
		this.dice = dice;
	}

	public int getT() {
		return t;
	}

	public int getf() {
		return f;
	}

	public int getdice() {
		return dice;
	}
	
	public PossibleMove clone(){
		return new PossibleMove(this.t, this.f, this.dice);
	}
	
}

