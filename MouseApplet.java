import java.applet.Applet;
import java.awt.*;	// 1�D�摜���i�[����I�u�W�F�N�g���쐬

public class MouseApplet extends Applet{
	Image img;
	public void init(){
		setBackground(Color.yellow);

		img = getImage(getDocumentBase(), "img.gif");	// 2�D���g�������
	}

	public void paint(Graphics g){	// �`��
		g.drawImage(img,50,50,this);	// 3�D�`�悷��
	}
}
