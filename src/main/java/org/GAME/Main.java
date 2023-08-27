package com;

import java.awt.EventQueue;

import javax.swing.JFrame;
/*
 * My training for the Java course 
 * An old-fashioned game from your youth ^_^
 * 27-8-2023
 * Huda BM 
 */

public class Main extends JFrame{
	
	// create a private variable.
	private final int OFFSET = 30;
	//initialize user interface
	public Main() {
		initUI();
	}
	
	private void initUI() {
		
		Board board = new Board();
		add(board);
		
		setTitle("SBall");
		
		setSize(board.getBoardWidth() + OFFSET,
				board.getBoardHeight() + 2*OFFSET);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//square built with the initial function.
		setLocationRelativeTo(null);	
	}
	
	
	public static void main(String[] args) {
	//  inside the brackets, let's write our brackets and let's do into this stream.
		EventQueue.invokeLater(() -> {
			
			Main game = new Main();
			game.setVisible(true);
		});
	}

}
