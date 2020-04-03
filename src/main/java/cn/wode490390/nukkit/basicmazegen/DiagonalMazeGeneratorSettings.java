package cn.wode490390.nukkit.basicmazegen;

public class DiagonalMazeGeneratorSettings {

    private final int wallId;
    private final int wallMeta;
    private final int groundId;
    private final int groundMeta;

    public DiagonalMazeGeneratorSettings(int wallId, int wallMeta, int groundId, int groundMeta) {
        this.wallId = wallId;
        this.wallMeta = wallMeta;
        this.groundId = groundId;
        this.groundMeta = groundMeta;
    }

    public int getWallId() {
        return this.wallId;
    }

    public int getWallMeta() {
        return this.wallMeta;
    }

    public int getGroundId() {
        return this.groundId;
    }

    public int getGroundMeta() {
        return this.groundMeta;
    }
}
