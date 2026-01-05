package main;

public class AssetSetter {
  Gamepanel gp;

  public AssetSetter(Gamepanel gp) {
    this.gp = gp;
  }

  public void setObject() {
    gp.obj[0] = new object.OBJ_hoe();
    gp.obj[0].worldX = gp.tileSize * 16;
    gp.obj[0].worldY = gp.tileSize * 19;

    gp.obj[1] = new object.OBJ_seed();
    gp.obj[1].worldX = gp.tileSize * 17;
    gp.obj[1].worldY = gp.tileSize * 19;
  }
}
 