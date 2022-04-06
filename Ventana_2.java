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

public class Ventana_2 extends Frame implements ActionListener {
		
		Button aceptar;
		Button igual;
		Button vaciar;
		TextField text;
		Panel centro;
		TextArea resultado;
		
		public Ventana_2(){
			aceptar = new Button("Aceptar");
			text = new TextField("");
			centro = new Panel();
			resultado = new TextArea("");
			igual = new Button(" = ");
			vaciar = new Button("Vaciar ");
			
			aceptar.addActionListener(this);
			igual.addActionListener(this);
			vaciar.addActionListener(this);
			
			centro.setLayout(new BorderLayout());
			centro.add(text, BorderLayout.NORTH);
			centro.add(aceptar, BorderLayout.CENTER);
			centro.add(igual, BorderLayout.EAST);
			centro.add(vaciar, BorderLayout.AFTER_LAST_LINE);
			
			this.setLayout(new BorderLayout());
			this.add(centro, BorderLayout.NORTH);
			this.add(resultado, BorderLayout.CENTER);
			resultado.setBackground(Color.BLUE);
			
			igual.setFocusable(false);
		    igual.setBackground(Color.DARK_GRAY);
		    igual.setForeground(Color.BLACK); 
		  
		    aceptar.setFocusable(false);
		    aceptar.setBackground(Color.GREEN); 
		    aceptar.setForeground(Color.WHITE); 

		    vaciar.setFocusable(false);
		    vaciar.setForeground(Color.BLACK);
		    
		    text.setBackground(Color.BLUE); 
		    text.setForeground(Color.RED);
		    
			setSize(700, 500); 
	        setVisible(true); 
	       
	        cerrarVentana(); 
		}
		
		public static void main(String args[]){
			Ventana_2 v= new Ventana_2();
		}
		public void cerrarVentana() {
			addWindowListener((WindowListener) new WindowAdapter() {
				public void windowClosing(WindowEvent e) {
					System.exit(0);
				}
			});
		}
		private void num(TextField a) {
			a.addKeyListener(new KeyAdapter() {
				public void KeyTyped (KeyEvent e) {
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
				 
		 	}else if (e.getSource() == igual){
				 String Texto= resultado.getText();
				 Texto = Texto.trim();
				 String[] Arreglo= Texto.split("\n");
				 int n=  Arreglo.length;
				 int aux, Suma=0;
				 for(int i=0; i<n; i++) {
					 aux = Integer.parseInt(Arreglo[i]);
					 Suma += aux;
				 }
				 
				 resultado.append("\n La suma total es de " + Suma);
				 
			 }else {
				
				 
				 resultado.setText("");
		 }
		}	
	}
