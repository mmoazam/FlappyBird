package com.fossilhead;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {

        int boardWidth = 360;
        int boardHeight = 640;

        JFrame jframe = new JFrame("Flappy Bird");
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setSize(boardWidth, boardHeight);
        jframe.setLocationRelativeTo(null);
        jframe.setResizable(false);
        jframe.setVisible(true);


    }
}