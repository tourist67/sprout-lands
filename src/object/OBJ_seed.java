package object;

public class OBJ_seed extends SuperObject {

    public OBJ_seed() {
        name = "Seed";

        try {
            image = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/res/plants/plant.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
