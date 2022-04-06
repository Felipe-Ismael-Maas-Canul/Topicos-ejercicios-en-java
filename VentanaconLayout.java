package TopicosAP;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.CardLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaconLayout extends Frame implements ActionListener {
    Button btn;
    Button btn2;
    Button btn3;
    Panel p1;
    Panel p2;
    Panel p3;
    Panel p4;
    TextArea text;
    Button btns[];

    public VentanaconLayout(){
        btn = new Button("Cerrar");
        btn2 = new Button("55");
        btn3 = new Button("5");
        btns = new Button [10];
        for (int i=0; i<btns.length; i++){
        	btns[i] = new Button(i+" ");
            btns[i].addActionListener(this);
        } 
        
        btn.addActionListener(this);
        p1 = new Panel();
        p2 = new Panel();
        p3 = new Panel();
        p4 = new Panel();
        text = new TextArea();
        
        this.setLayout(new BorderLayout());
        p1.setLayout(new GridLayout(3,2));
        for (int i=0; i<6;i++){

            p1.add(btns[i]);
        }
        
        p2.setLayout(new FlowLayout());
        for (int i=6; i<btns.length;i++){

            p2.add(btns[i]);
        }
        
        p3.setLayout(new CardLayout());
        p3.add(btns[9]);
        p4.setLayout(null);
        this.add(p1,BorderLayout.NORTH);
        this.add(p2,BorderLayout.SOUTH);
        this.add(p3,BorderLayout.CENTER);
        this.add(btn, BorderLayout.WEST);
        this.add(p4, BorderLayout.EAST);
        btn2.setBounds(5,5, 20, 20);

        p4.setSize(200,100);
        p4.add(btn);
        p4.add(btn2);
        btn.addActionListener(this);
        btn2.addActionListener(this);
        p4.setVisible(true);
        this.setSize(400,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
    	VentanaconLayout e = new VentanaconLayout();
        
    }
    
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn){ 
	        System.exit(0);
	        }
	        else {
	            System.out.println("ningún otro botón tiene funcionalidad");
	        }
	}
}