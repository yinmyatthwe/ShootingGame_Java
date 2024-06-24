
public class PlayerBullet extends Character {
	public PlayerBullet(double x, double y, double vx, double vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
		f.setColor(200,200,100);
		f.fillRect(x+5, y, 20 , 20);
	}

}
