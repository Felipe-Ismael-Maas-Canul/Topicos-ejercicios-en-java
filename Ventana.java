package TopicosAP;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ventana extends Frame implements ActionListener {
    Button aceptar;
    TextField text;
    Panel central;
    TextArea resultado;

    public Ventana(){

        aceptar = new Button ("Aceptar");
        aceptar.addActionListener(this);
        
        text = new TextField("");
        central = new Panel();
        central.setLayout(new BorderLayout());
        central.add(aceptar, BorderLayout.CENTER);
        central.add(text, BorderLayout.NORTH);
        
        this.setLayout(new BorderLayout());
        this.add(resultado, BorderLayout.CENTER);
        this.add(central, BorderLayout.NORTH);
        
        aceptar.setFocusable(false);
	    aceptar.setBackground(Color.GREEN); 
	    aceptar.setForeground(Color.BLACK);
        
        text.setBackground(Color.BLUE); 
	    text.setForeground(Color.WHITE);
	    
	    setSize(600, 400);
        setVisible(true);
        
        cerrarVentana();
    }

    public static void main(String[] args) {
         Ventana v = new Ventana();

    }
    
    public void cerrarVentana(){
    	addWindowListener((WindowListener)new WindowAdapter(){
    		
    		public void windowClosing(WindowEvent e){
    			System.exit(0);
    		}
    	});
   	}
    
    private void num(TextField a){
    	a.addKeyListener(new KeyAdapter(){
    		public void KeyTyped(KeyEvent e){
    			char c= e.getKeyChar();
    			if(!Character.isDigit(c) && c!='.') {
					e.consume();
				}
				if(c== '.' && text.getText().contains(".")) {
					e.consume();
				}
			}
		});
	}
    public void actionPerformed(ActionEvent e) {
		String c= text.getText();
	 	if (e.getSource() == aceptar) {
			 resultado.append(c + "\n");
    			
    	}
    }
}