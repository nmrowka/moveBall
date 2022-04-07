package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Board board = new Board();
        Scanner scanner = new Scanner(System.in);
        String key =new String();

        board.setBoardEmpty();
        while(true){
            board.drawBoard();
            key = scanner.next();
            key.toUpperCase(Locale.ROOT); //to nie działa
            switch (key) {
                case "W" -> board.moveUp();
                case "S" -> board.moveDown();
                case "A" -> board.moveLeft();
                case "D" -> board.moveRight();
            }
        }

    }
}
