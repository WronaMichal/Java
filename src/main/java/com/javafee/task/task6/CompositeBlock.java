package com.javafee.task.task6;

import java.util.List;

public interface CompositeBlock {
    List<Block> getBlocks();
    default int getBlockCount(){
        return getBlocks().size();
    }
}
