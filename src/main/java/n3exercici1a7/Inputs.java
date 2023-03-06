package n3exercici1a7;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Inputs {
    private Integer integer1;
    private Integer integer2;
    private Integer integer3;
    private int[] array1;
    private int[] array2;
    private StringBuilder sb;
    private Optional<String> opt;
    private Map<String,Integer> map;

    public Inputs() {
        this.integer1 = 9;
        this.integer2 = 9;
        this.integer3 = 8;
        this.array1 = new int[]{1, 2, 3};
        this.array2 = new int[]{1, 2, 3};
        this.sb = new StringBuilder("Laura");
        this.opt = Optional.empty();
        this.map = new HashMap<>();
    }

    public Integer getInteger1() {
        return integer1;
    }

    public Integer getInteger2() {
        return integer2;
    }

    public Integer getInteger3() {
        return integer3;
    }

    public int[] getArray1() {
        return array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public StringBuilder getSb() {
        return sb;
    }

    public Optional<String> getOpt() {
        return opt;
    }

    public Map<String, Integer> getMap() {
        return map;
    }
}
