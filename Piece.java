package com.Lee;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public abstract class Piece {
	protected String piece;
	protected boolean isWhite;
	protected boolean hasMoved;
	private ImageView imgView;
	
	public abstract String getPieceName();
	public Piece(){
	}
	public Piece(String piece, boolean isWhite)
	{
		this(piece, isWhite, false);
	}
	
	public Piece(String piece, boolean isWhite, boolean hasMoved)
	{
		this.piece = piece;
		this.isWhite = isWhite;
		this.hasMoved = hasMoved;
	}
	
	public String getPiece()
	{
		return piece;
	}
	
	public boolean getIsWhite()
	{
		return isWhite;
	}
	
	public void setHasMoved(boolean hasMoved)
	{
		this.hasMoved = hasMoved;
	}
	
	public boolean getHasMoved()
	{
		return hasMoved;
	}
	
	public boolean hasMoved(int x ,int y, int i, int j){
		if(x != i || y != j )
		{
			return hasMoved = true;
		}
		else
			return hasMoved = false;
	}
	
	
	public void setImage(Image img)
	{
		this.imgView = new ImageView(img);
		imgView.setFitWidth(100);
		imgView.setFitHeight(100);
		
	}
	
	public ImageView getImageView()
	{
		return imgView;
	}
}

