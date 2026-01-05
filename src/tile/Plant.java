package tile;

import main.Gamepanel;

public class Plant {
    public int tileCol;
    public int tileRow;
    public int growthStage; // 1-3
    public int growthCounter;
    public final int growthInterval = 300; // frames between growth stages (~5 seconds at 60fps)
    
    public Plant(int col, int row) {
        this.tileCol = col;
        this.tileRow = row;
        this.growthStage = 1;
        this.growthCounter = 0;
    }
    
    public void update(Gamepanel gp) {
        if (growthStage < 3) {
            growthCounter++;
            if (growthCounter >= growthInterval) {
                growthCounter = 0;
                growthStage++;
                // Update the tile to show new growth stage
                // Stage 1 = tile 5, Stage 2 = tile 6, Stage 3 = tile 7
                gp.tileM.mapTileNum[tileCol][tileRow] = 4 + growthStage;
            }
        }
    }
    
    public boolean isFullyGrown() {
        return growthStage >= 3;
    }
}
