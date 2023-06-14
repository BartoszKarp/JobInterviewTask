package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure{

    private List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block block){
        blocks.add(block);
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for(Block block : blocks){
            if(block.getColor().equals(color)){
                System.out.println(block.getMaterial());
                return Optional.of(block);
            }
        }
        System.out.println("No matches...");
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        List<Block> blocksByMaterial = new ArrayList<>();
        for (Block value : blocks) {
            if (value.getMaterial().equals(material)) {
                blocksByMaterial.add(value);
            }
        }
        for (Block customBlock : blocksByMaterial) {
            if(blocksByMaterial.size() == 0){
                System.out.println("No matches...");
            }else {
                System.out.println("[Material]: " + customBlock.getMaterial() + " | [Color]: " + customBlock.getColor());
                System.out.println("-------------------------");
            }
        }

        return blocksByMaterial;
    }

    @Override
    public int count() {
        System.out.println(blocks.size());
        return blocks.size();
    }
}
