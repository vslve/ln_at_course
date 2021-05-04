package food;

public abstract class Food {
    protected int richness;

    public Food() {};

    public Food(int richness) {
        this.richness = richness;
    }

    public int getRichness() {
        return richness;
    }

    public void setRichness(int richness) {
        if (richness > 0) {
            this.richness = richness;
        }
    }
}
