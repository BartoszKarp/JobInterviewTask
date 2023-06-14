package org.example;

import java.util.List;

public class CustomBlock implements CompositeBlock{

    private String color;
    private String material;
    private List<Block> blocks;

    public CustomBlock(String color, String material) {
        this.color = color;
        this.material = material;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getMaterial() {
        return material;
    }

    @Override
    public List<Block> getBlocks() {
        return blocks;
    }
}
