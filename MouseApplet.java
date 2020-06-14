import java.applet.Applet;
import java.awt.*;	// 1．画像を格納するオブジェクトを作成

public class MouseApplet extends Applet{
	Image img;
	public void init(){
		setBackground(Color.yellow);

		img = getImage(getDocumentBase(), "img.gif");	// 2．中身をいれる
	}

	public void paint(Graphics g){	// 描画
		g.drawImage(img,50,50,this);	// 3．描画する
	}
}
