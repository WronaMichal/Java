package com.javafee.task.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Wall implements Structure {
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockBycolor(String color) {
        return Optional.empty();
    }

    @Override
    public List<Block> findBlockByMaterial(String material) {
        return null;
    }

    @Override
    public int count() {
        return 0;
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
//        Structure structure = buildStructure(blocks);

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

//    public static Structure buildStructure(List<Block> blocks) {
//        return new Structure() {
//            @Override
////            public List<Block> findBlockBycolor(String color) {
////                return
////            }
//
//            @Override
//            public List<Block> findBlockByMaterial(String material) {
//                return null;
//            }
//
//            @Override
//            public int count() {
//                return 0;
//            }
//        };
//    }
}
