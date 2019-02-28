package breu.autohealer;

import javax.swing.JFrame;

public class Control {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        gui.setVisible(true);
    }
}
