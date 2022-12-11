
package neu.edu.csye6200;

import neu.edu.csye6200.controller.MainController;
import neu.edu.csye6200.userInterface.LoginJFrame;
import neu.edu.csye6200.userInterface.MainJFrame;

public class App {
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginJFrame view = new LoginJFrame();
                view.setVisible(true);
                //MainController controller = new MainController(view);
            }
        });
    }
    
}
