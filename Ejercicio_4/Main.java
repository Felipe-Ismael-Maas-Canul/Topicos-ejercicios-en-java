package TopicosAP.Ejercicio_4;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main extends Frame implements MouseListener, MouseMotionListener, KeyListener {
	
	Panel p;
	Mundo mundo;
	public Main(){
		
		p= new Panel();
		this.setLayout(new BorderLayout ());
		p.setLayout(new BorderLayout());
		mundo = new Mundo();
		p.add(mundo);
		mundo.addMouseListener(this);
		mundo.addMouseMotionListener(this);
		mundo.addKeyListener(this);
		this.add(p, BorderLayout.CENTER);
		this.setSize (500,400);
		this.setVisible(true);
	}
		
		public static void main(String []args){
			
			new Main().addWindowListener(new WindowAdapter(){
				
				public void windowClosing(WindowEvent e){
					System.exit(0);
				}
			});
	}

		@Override
		public void mouseDragged(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Dragged");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Moved");
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Clicked");
			mundo.setX(e.getX());
			mundo.setY(e.getY());
			mundo.repaint();
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Entered");
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Exited");
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Pressed");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Relased");
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Pressed");
			switch(e.getKeyCode()){
			case 'a':
			case KeyEvent.VK_A:
				mundo.setX(mundo.getX()-1);
			break;
			case 's':
			case KeyEvent.VK_S:
				mundo.setY(mundo.getY()+1);
			break;
			case 'd':
			case KeyEvent.VK_D:
				mundo.setX(mundo.getX()+1);
			break;
			case 'w':
			case KeyEvent.VK_W:
				mundo.setY(mundo.getY()-1);
			break;
			}
			mundo.repaint();
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Released");
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			System.out.print("Typed");
			
		}
}