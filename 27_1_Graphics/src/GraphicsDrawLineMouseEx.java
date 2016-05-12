import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class GraphicsDrawLineMouseEx extends JFrame {
	Container contentPane;

	GraphicsDrawLineMouseEx() {
		setTitle("Drawing Line by Mouse ¿¹Á¦");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new GridLayout(1, 2));
		MyPanel panel = new MyPanel();
		MyPanel2 panel2 = new MyPanel2();
		panel.setPanel(panel2);
		
		contentPane.add(panel);
		contentPane.add(panel2);
		ImageIcon image = new ImageIcon("image/a.jpg");
		System.out.println(image.getIconWidth() * 2 + " " + image.getIconHeight());
		setSize(image.getIconWidth() * 2, image.getIconHeight());
		setVisible(true);
	}

	public static void main(String[] args) {
		new GraphicsDrawLineMouseEx();
	}

	class MyPanel extends JPanel {
		ImageIcon imageIcon = new ImageIcon("image/a.jpg");
		Image image = imageIcon.getImage();
		Point startP = null;
		Point endP = null;
		MyPanel2 panel=null;
		
		public void setPanel(MyPanel2 panel){
			this.panel=panel;
		}
		public MyPanel() {
			// TODO Auto-generated constructor stub
			addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					startP = e.getPoint();
					System.out.println("Start : "+startP.x+" "+startP.y);
					//repaint();
				}

				public void mouseReleased(MouseEvent e) {
					panel.setPointXY(startP, endP);
					startP = null;
					endP = null;
					System.out.println("release");
					
					//repaint();
				}

				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					endP = e.getPoint();
					//System.out.println("End : "+endP.x+" "+endP.y);
					repaint();
				}

				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
			addMouseMotionListener(new MouseMotionListener() {
				
				@Override
				public void mouseMoved(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseDragged(MouseEvent e) {
					// TODO Auto-generated method stub
					endP = e.getPoint();
					System.out.println("End : "+endP.x+" "+endP.y);
					repaint();
				}
			});
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
			g.setColor(Color.white);
			//if(startP!=null)g.drawRect(startP.x,startP.y,startP.x+20,startP.y+20);
			if(startP!=null && endP!=null) g.drawRect(startP.x,startP.y,endP.x-startP.x,endP.y-startP.y);

		}
	}

	class MyPanel2 extends JPanel {
		ImageIcon imageIcon = new ImageIcon("image/a.jpg");
		Image image = imageIcon.getImage();
		Point startP = null;
		Point endP = null;
		
		public MyPanel2() {
			
		}
		
		public void setPointXY(Point startP,Point endP){
			this.startP=startP;
			this.endP=endP;
			repaint();
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//if(startP!=null && endP!=null) g.drawImage(image, 0,0,this.getWidth(), this.getHeight(),endP.x,startP.y,startP.x,endP.y, this);
			//if(startP!=null && endP!=null) g.drawImage(image, 0,0,this.getWidth(), this.getHeight(),endP.x-startP.x,startP.y,startP.x,endP.y-startP.y, this);
			if(startP!=null && endP!=null) g.drawImage(image, 0,0,this.getWidth(), this.getHeight(),startP.x,startP.y,endP.x,endP.y,this);
			
		}
	}
}
