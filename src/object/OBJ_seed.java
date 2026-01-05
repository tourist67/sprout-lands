package object;

public class OBJ_seed extends SuperObject {

    public OBJ_seed() {
        name = "Seed Packet";
        stackable = false; // Infinite use, no stacking needed

        try {
            image = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/res/plants/plant.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
