package com.Lee;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Run extends Application{
	
	@Override
	public void start(Stage stage) throws Exception {
		// TODO Auto-generated method stub
		StackPane stackPane = new StackPane();
	    ChessBoard chessBoard = new ChessBoard();
	    
	    stackPane.getChildren().add(chessBoard.addRectangle());
	    stackPane.getChildren().add(chessBoard.chess());
	    Scene scene = new Scene(stackPane);
	    stage.setScene(scene);
	    stage.show();
	}
	public static void main(String[] args) {
		Application.launch(args);
	}
	
}

