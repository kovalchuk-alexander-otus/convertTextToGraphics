package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {

    private char[] palette;

    public TextColorSchemaImpl() {
        this(new char[]{'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'});
    }

    public TextColorSchemaImpl(char[] palette) {
        this.palette = palette;
    }

    @Override
    public char convert(int color) {
        return palette[Math.min(color / (255 / palette.length), palette.length - 1)];
    }
}
