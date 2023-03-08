package com.javafee.task.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockBycolor(String color) {
        Block result = null;
        for (Block block : blocks) {
            if (block.getColor().equals(color)) {
                result = block;
            }
        }
            return Optional.ofNullable(result);
    }

    @Override
    public List<Block> findBlockByMaterial(String material) {
        ArrayList <Block> result = new ArrayList<>();
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                result.add(block);
            }
        }
        return result;
    }

    @Override
    public int count() {
        int blocksNumber = blocks.size();
        return blocksNumber;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

    public void setBlocks(List<Block> blocks) {
        this.blocks = blocks;
    }

    public static void main(String[] args) {
        Block block = buildBlock("red", "concrete");
        Block block1 = buildBlock("grey", "brick");
        List<Block> blocks = new ArrayList<>();
        blocks.add(block);
        blocks.add(block1);

        block.getColor();
    }

    public static Block buildBlock(String color, String material) {
        return new Block() {
            @Override
            public String getColor() {
                return color;
            }

            @Override
            public String getMaterial() {
                return material;
            }
        };
    }

}
