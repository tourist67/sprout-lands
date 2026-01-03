package tile;
 
import main.Gamepanel;
import java.awt.Graphics2D;

public class TileManager {
  
  Gamepanel gamepanel;
  Tile[] tile;

  public TileManager(Gamepanel gamepanel) {
    this.gamepanel = gamepanel;
    tile = new Tile[10];
    getTileImage();
  }

  public void getTileImage() {
    try {
      tile[0] = new Tile();
      tile[0].image = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/res/tiles/grass/grass1.png"));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void draw(Graphics2D g2) {
    for (int row = 0; row < gamepanel.maxScreenRow; row++) {
      for (int col = 0; col < gamepanel.maxScreenCol; col++) {
        int x = col * gamepanel.tileSize;
        int y = row * gamepanel.tileSize;
        g2.drawImage(tile[0].image, x, y, gamepanel.tileSize, gamepanel.tileSize, null);
      }
    }
  }
}
