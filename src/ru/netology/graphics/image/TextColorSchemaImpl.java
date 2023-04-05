package ru.netology.graphics.image;

public class TextColorSchemaImpl implements TextColorSchema {

    final char[] SCHEMA = {'▇', '●', '◉', '◍', '◎', '○', '☉', '◌', '-'};

    @Override
    public char convert(int color) {
        return SCHEMA[Math.min(color / (255 / SCHEMA.length), SCHEMA.length - 1)];
    }
}
