import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Manager {
    public static void main(String[] args){
     final RegsisterForm regsisterForm = new RegsisterForm();
     final LoginForm loginForm = new LoginForm();
     loginForm.setFrameLoginVisible(true);
     loginForm.getRegisterButton().addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             regsisterForm.setFrameLoginVisible(true);
             loginForm.setFrameLoginVisible(false);
         }
     });
     regsisterForm.getBackButton().addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
             loginForm.setFrameLoginVisible(true);
             regsisterForm.setFrameLoginVisible(false);
         }
     });
    }
}
