package examples.ocp.chapter10;

import java.util.ArrayList;
import java.util.List;

final class Faucet {
    private final String water;
    private final List<Double> pipes;

    public Faucet(String water, List<Double> pipes) {
        this.water = water;
        this.pipes = pipes;
    }

    public String getWater() {
        return water;
    }

    public List<Double> getPipes() {
        return pipes;
    }
}

public final class Spout {
    private final String well;
    private final List<Boolean> buckets;

    public Spout(String well, List<Boolean> buckets) {
        this.well = well;
        this.buckets = new ArrayList<>(buckets);
    }

    public String getWell() {
        return well;
    }

    public List<Boolean> getBuckets() {
        return new ArrayList<>(buckets);
    }
}
