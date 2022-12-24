

//Defino um nó para realizar saltos na lista
public class SkipNo {

    public int val;

    public SkipNo left;
    public SkipNo right;
    public SkipNo up;
    public SkipNo down;

    public SkipNo(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
        this.up = null;
        this.down = null;
    }

    public SkipNo(SkipNo lowerLevelNode) {
        this.val = lowerLevelNode.val;
        this.left = null;
        this.right = null;
        this.up = null;
        this.down = lowerLevelNode;
    }
}
