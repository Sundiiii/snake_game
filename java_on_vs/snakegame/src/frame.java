import javax.swing.JFrame;
// import java.awt.event.KeyListener;
public class frame extends JFrame {
   panel p1=new panel();
    frame(){
        this.add(p1);
        this.setSize(300,300);
        this.pack();
        this.setVisible(true);
    }
   
}
