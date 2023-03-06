package com.javafee.task.task6;

import java.util.List;
import java.util.Optional;

public interface Structure {
    Optional<Block> findBlockBycolor(String color);
    List<Block> findBlockByMaterial(String material);
    int count();
}
