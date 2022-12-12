package src.pn;

public class PaletteBase {

	public String col;
	
	public PaletteBase(){}

	public PaletteBase(String col) {
		super();
		this.col = col;
	}
	
	
	public void setToRouge(){
		this.col = "rouge";
	}
	
	public void SetToBlue(){
		this.col="blue";
	}

	public String getCol() {
		return col;
	}

	public void setCol(String col) {
		this.col = col;
	}
	
	
}
