package net.minecraft.server;

import java.util.Random;

public class BlockBookshelf extends Block {

    public BlockBookshelf(int i, int j) {
        super(i, j, Material.c);
    }

    public int a(int i) {
        return i <= 1 ? 4 : this.bh;
    }

    public int a(Random random) {
        return 0;
    }
}
