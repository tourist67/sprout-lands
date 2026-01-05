package object;

public class OBJ_plant_pickup extends SuperObject {

    public OBJ_plant_pickup() {
        name = "Plant Pickup";
        stackable = true;

        try {
            image = javax.imageio.ImageIO.read(getClass().getResourceAsStream("/res/plants/plant_pickup.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
