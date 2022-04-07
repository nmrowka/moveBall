package com.company;

public class Board {
    private int x=40;
    private int y=20;
    private String board[][] = new String[x][y];
    private Ball ball = new Ball();

    public void setBoardEmpty(){
        for(int i=0 ; i < y ; i++){
            for(int j=0 ; j<x ; j++){
                board[j][i]=" ";
            }
        }
        ball.setxPosition(0);
        ball.setyPosition(0);
        drawBall();
    }

    public void drawBall(){
        board[ball.getxPosition()][ball.getyPosition()]="*";
    }

    public void removeOldBallPosition(){
        board[ball.getxPosition()][ball.getyPosition()]=" ";
    }

    public void moveUp(){
        removeOldBallPosition();
        ball.setyPosition(ball.getyPosition()-1);
        drawBall();
    }

    public void moveDown(){
        removeOldBallPosition();
        ball.setyPosition(ball.getyPosition()+1);
        drawBall();
    }

    public void moveLeft(){
        removeOldBallPosition();
        ball.setxPosition(ball.getxPosition()-1);
        drawBall();
    }

    public void moveRight(){
        removeOldBallPosition();
        ball.setxPosition(ball.getxPosition()+1);
        drawBall();
    }

    public void drawBoard(){
        for(int i=0 ; i < y ; i++){
            for(int j=0 ; j<x ; j++){
                System.out.print(board[j][i]);
            }
            System.out.println();
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
