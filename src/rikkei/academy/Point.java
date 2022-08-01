package rikkei.academy;

import java.util.Arrays;

public class Point {

        public float x = 0.0f;
        public float y = 0.0f;

        public Point() {
        }

        public Point(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float getX() {
            return x;
        }

        public void setX(float x) {
            this.x = x;
        }

        public float getY() {
            return y;
        }

        public void setY(float y) {
            this.y = y;
        }

        public void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }

        public float[] getXY(float x, float y) {
            float[] array = {x,y} ;
            return array;
        }

        @Override
        public String toString() {
            return Arrays.toString(getXY(x,y));
        }
    }

