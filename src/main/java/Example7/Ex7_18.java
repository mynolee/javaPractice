package Example7;

import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

class Ex7_18 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("ActionEvent occured!!!");

    }
}
