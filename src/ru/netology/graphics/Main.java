package ru.netology.graphics;

import ru.netology.graphics.image.TextColorSchemaImpl;
import ru.netology.graphics.image.TextGraphicsConverter;
import ru.netology.graphics.image.TextGraphicsConverterImpl;
import ru.netology.graphics.server.GServer;

public class Main {
    public static void main(String[] args) throws Exception {
        TextGraphicsConverter converter = new TextGraphicsConverterImpl(); // Создайте тут объект вашего класса
        // конвертера

        GServer server = new GServer(converter); // Создаём объект сервера
        server.start(); // Запускаем

        // Или то же, но с выводом на экран:
//        converter.setTextColorSchema(new TextColorSchemaImpl(
//                new char[]{'W', 'Q', 'R', 'T', 'I', 'w', 'q', 'r', 't', 'i', '-', '.'})
//        );
//        converter.setMaxHeight(10);
//        converter.setMaxRatio(1.43);
//        System.out.printf("%5d %5d %5.2f %n",
//                converter.getMaxWidth(),
//                converter.getMaxHeight(),
//                converter.getMaxRatio());
//        System.out.printf("%5s %5s %5s %n",
//                converter.getMaxWidth()==0,
//                converter.getMaxHeight()==0,
//                converter.getMaxRatio()==0);
//        String url = "https://raw.githubusercontent.com/netology-code/java-diplom/main/pics/simple-test.png";
//        String imgTxt = converter.convert(url);
//        System.out.println(imgTxt);
    }
}
