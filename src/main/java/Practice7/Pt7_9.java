/*package Practice7;

import java.awt.*;
import java.awt.event.*;

class Pt7_9 {
    public static void main(String[] args){
        Frame f = new Frame();
        f.addWindowListener(new EventHandler());
    }
}

class EventHandler extends WindowAdapter{
    public void windowClosing(WindowEvent e){
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
*/
package Practice7;

import java.awt.*;
import java.awt.event.*;

class Pt7_9{
    public static void main(String[] args){
        Frame f = new Frame();
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }
}


//익명 클래스로 바꾼거