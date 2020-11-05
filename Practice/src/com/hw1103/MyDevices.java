package com.hw1103;

import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class MyDevices {
    private static final Map<Float, SingleUSB> price2usb = new TreeMap<>();
    private static final Map<Integer, SingleUSB> size2usb = new TreeMap<>();

    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(20190105);
        for (int i = 0; i < 10; i++) {
            int size = (int) Math.pow(2, random.nextInt(20));
            float price = random.nextFloat() * 1000;
            String name = "A " + size + " GB USB Flash Drives needs $" + price;
            SingleUSB usb = new SingleUSB(name, size, price);
            price2usb.put(price, usb);
            size2usb.put(size, usb);
        }
        price2usb.forEach((key, value) -> System.out.println("Price: $" + key + "\nName: " + value.getName() + "\n"));
        size2usb.forEach((key, value) -> System.out.println("Size: " + key + " GB\nName: " + value.getName() + "\n"));
    }

}
