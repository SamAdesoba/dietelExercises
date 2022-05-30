package TicTacToe;

import java.util.Scanner;

public class Console {
	Scanner scanner = new Scanner(System.in);
	TicTacToe ticTacToe = new TicTacToe();
	public void playTicTacToe(){
		int plays = prompter();
		switch(plays){
			case 1 : {	ticTacToe.playAt(0,0);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 2 : {	ticTacToe.playAt(0,1);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 3 : {	ticTacToe.playAt(0,2);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 4 : {	ticTacToe.playAt(1,0);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 5 : {	ticTacToe.playAt(1,1);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 6 : {	ticTacToe.playAt(1,2);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 7 : {	ticTacToe.playAt(2,0);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 8 : {	ticTacToe.playAt(2,1);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
			case 9 : {	ticTacToe.playAt(2,2);
							if(winChances()) break;
							if(draw()) break;
							playTicTacToe();
							break;
			}
		}

	}
	private int prompter(){
		print("""
				There are 9 moves in this game.
				Enter any digit from 1 to 9 play.
				Player 1 plays first""");

		print(" ");
		String display = ticTacToe.display();
		print(display);
		print(" ");
		return input(ticTacToe.getPlayer());
	}

	private int input(String input) {
		print(input);
		return scanner.nextInt();
	}

	private void print(String display) {
		System.out.println(display);
	}

	private boolean draw() {
		if (ticTacToe.isDraw()){
			print("The game ended draw");
			print(ticTacToe.display());
			return true;
		}
		return false;
	}

	private boolean winChances() {
		if (ticTacToe.player1Won()){
			print("Player 1 has won");
		print(ticTacToe.display());
		return true;
		}else if(ticTacToe.player2Won()){
			print("Player 2 has won");
			print(ticTacToe.display());
			return true;
		}
		return false;
	}
}
