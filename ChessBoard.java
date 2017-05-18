package com.Lee;

import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
public class ChessBoard {
	private final Image WHITEPAWN = new Image("Image/white_pawn.png");
    private final Image BLACKPAWN = new Image("Image/black_pawn.png");
    private final Image WHITEKING = new Image("Image/white_king.png");
    private final Image BLACKKING = new Image("Image/black_king.png");
    private final Image WHITEQUEEN = new Image("Image/white_queen.png");
    private final Image BLACKQUEEN = new Image("Image/black_queen.png");
    private final Image WHITEROOK = new Image("Image/white_rook.png");
    private final Image BLACKROOK = new Image("Image/black_rook.png");
    private final Image WHITEKNIGHT = new Image("Image/white_knight.png");
    private final Image BLACKKNIGHT = new Image("Image/black_knight.png");
    private final Image WHITEBISHOP = new Image("Image/white_bishop.png");
    private final Image BLACKBISHOP = new Image("Image/black_bishop.png");
    private final Image OPENFIELD = new Image("Image/open_field.png");
	private Piece[][] piece = new Piece[8][8];
	private Rectangle[][] rectangle = new Rectangle[8][8];
	//建立棋盘
	public ChessBoard(){
		
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{	
				if(i % 2 == 0)
				{
					if(j % 2 == 0)
					{
						rectangle[i][j] = new Rectangle();
						rectangle[i][j].setFill(Color.GOLD);
						rectangle[i][j].setHeight(100);
						rectangle[i][j].setWidth(100);
					}
					else
					{
						rectangle[i][j] = new Rectangle();
						rectangle[i][j].setFill(Color.GRAY);
						rectangle[i][j].setHeight(100);
						rectangle[i][j].setWidth(100);
					}
				}
				else if(i % 2 == 1)
				{
					if(j % 2 == 1)
					{
						rectangle[i][j] = new Rectangle();
						rectangle[i][j].setFill(Color.GOLD);
						rectangle[i][j].setHeight(100);
						rectangle[i][j].setWidth(100);
					}
					else
					{
						rectangle[i][j] = new Rectangle();
						rectangle[i][j].setFill(Color.GRAY);
						rectangle[i][j].setHeight(100);
						rectangle[i][j].setWidth(100);
					}
				}
				
			}
		}
		
	}
	//将棋盘放入GridPane 并返回该GridPane
	public GridPane addRectangle(){
		GridPane gridPane = new GridPane();
		gridPane.setAlignment(Pos.CENTER);
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j ++)
			{
				gridPane.add(rectangle[i][j], j, i);
			}
		}
		return gridPane;
	}
	
	public GridPane chess(){
		GridPane chessPane = new GridPane();
		for(int i = 0; i < 8; i++) {
	        ColumnConstraints column = new ColumnConstraints(100);
	        chessPane.getColumnConstraints().add(column);
	    }

	    for(int i = 0; i < 8; i++) {
	        RowConstraints row = new RowConstraints(100);
	        chessPane.getRowConstraints().add(row);
	    }
	    chessPane.setMaxHeight(800);
	    chessPane.setMaxWidth(800);
		for (int i = 0; i < 8; i++)
        {
            piece[i][1] = new Pawn("bPawn", false);
            piece[i][1].setImage(BLACKPAWN);
            chessPane.add(piece[i][1].getImageView(), i, 1);
            piece[i][6] = new Pawn("wPawn", true);
            piece[i][6].setImage(WHITEPAWN);
            chessPane.add(piece[i][6].getImageView(), i, 6);
        }
        piece[0][0] = new Rook("bRook", false, false);//车
        piece[0][0].setImage(BLACKROOK);
        chessPane.add(piece[0][0].getImageView(), 0, 0);
        piece[7][0] = new Rook("bRook", false, false);
        piece[7][0].setImage(BLACKROOK);
        chessPane.add(piece[7][0].getImageView(), 7, 0);
        piece[0][7] = new Rook("wRook", true, false);
        piece[0][7].setImage(WHITEROOK);
        chessPane.add(piece[0][7].getImageView(), 0, 7);
        piece[7][7] = new Rook("wRook", true, false);
        piece[7][7].setImage(WHITEROOK);
        chessPane.add(piece[7][7].getImageView(), 7, 7);
        piece[1][0] = new Knight("bKnight", false);//ma
        piece[1][0].setImage(BLACKKNIGHT);
        chessPane.add(piece[1][0].getImageView(), 1, 0);
        piece[6][0] = new Knight("bKnight", false);
        piece[6][0].setImage(BLACKKNIGHT);
        chessPane.add(piece[6][0].getImageView(), 6, 0);
        piece[1][7] = new Knight("wKnight", true);
        piece[1][7].setImage(WHITEKNIGHT);
        chessPane.add(piece[1][7].getImageView(), 1, 7);
        piece[6][7] = new Knight("wKnight", true);
        piece[6][7].setImage(WHITEKNIGHT);
        chessPane.add(piece[6][7].getImageView(), 6, 7);
        piece[2][0] = new Bishop("bBishop", false);//xiang
        piece[2][0].setImage(BLACKBISHOP);
        chessPane.add(piece[2][0].getImageView(), 2, 0);
        piece[5][0] = new Bishop("bBishop", false);
        piece[5][0].setImage(BLACKBISHOP);
        chessPane.add(piece[5][0].getImageView(), 5, 0);
        piece[2][7] = new Bishop("wBishop", true);
        piece[2][7].setImage(WHITEBISHOP);
        chessPane.add(piece[2][7].getImageView(), 2, 7);
        piece[5][7] = new Bishop("wBishop", true);
        piece[5][7].setImage(WHITEBISHOP);
        chessPane.add(piece[5][7].getImageView(), 5, 7);
        piece[3][0] = new Queen("bQueen", false);
        piece[3][0].setImage(BLACKQUEEN);
        chessPane.add(piece[3][0].getImageView(), 3, 0);
        piece[3][7] = new Queen("wQueen", true);
        piece[3][7].setImage(WHITEQUEEN);
        chessPane.add(piece[3][7].getImageView(), 3, 7);
        piece[4][0] = new King("bKing", false, false);
        piece[4][0].setImage(BLACKKING);
        chessPane.add(piece[4][0].getImageView(), 4, 0);
        piece[4][7] = new King("wKing", true, false);
        piece[4][7].setImage(WHITEKING);
        chessPane.add(piece[4][7].getImageView(), 4, 7);
        for(int a = 0; a < 7; a++)
        {
        	for(int b = 2; b < 6; b++)
        	{
                piece[a][b] = new King();
        		piece[a][b].setImage(OPENFIELD);
        		chessPane.add(piece[a][b].getImageView(), a, b);
        	}
        }
        return chessPane;
	}
	
	
	
	
}
