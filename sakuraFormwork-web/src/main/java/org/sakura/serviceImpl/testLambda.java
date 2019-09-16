package org.sakura.serviceImpl;

import org.junit.Test;

import java.util.function.Function;

public class testLambda<dfsf> {

    class Apple{

        private String name;
        private String color;

        @Override
        public String toString() {
            return "Apple{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    '}';
        }

        public Apple() {
        }

        public Apple(String name, String color) {
            this.name = name;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }



    @Test
    public void testLambda() {
        int a = 100;

        Apple apple = new Apple("苹果", "红色");


    }


}
