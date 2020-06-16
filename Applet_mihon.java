import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;

public class Applet_mihon extends Applet implement ActionListener,Runnable{
	int x,y;
	Button btn;

	public void init(){	// 初期設定
		x=0;
		y=50;
		btn = new Button("スタート");
		setLayout(new BorderaLayout());
		add("South",btn);
		btn.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
		if(th== null){
			th = new Thread(this);
			th.start();
		}
	}
	public void run(){
		while(true){
			x+=5;
			repaint();
			try{
				th.sleep(50);
			}catch(InterruptedException er){}
		}
	}
	public void paint(Graphics g){
		Color iro=new Color(255,0,0);
		g.setColor(iro);

		g.fillOval(x,y,20,20);

	}
}
