
package object;

public class OBJ_watering extends SuperObject {

    public OBJ_watering() {
        name = "Watering Can";

        try {
            image = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/res/tools/watering_can.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}