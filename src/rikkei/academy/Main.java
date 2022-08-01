package rikkei.academy;

public class Main {
        public static void main(String[] args) {
            //kiểm thử Class Point
            System.out.println("---------POINT----------");
            Point point = new Point();
            System.out.println(point);

            point = new Point(5.5f, 9.5f);
            System.out.println(point);

            //kiểm thử Class MovablePoint
            System.out.println("---------MOVABLE POINT----------");
            MovablePoint movablePoint = new MovablePoint();
            System.out.println("Tọa độ khi không truyền đối số ====== " + movablePoint);

            movablePoint = new MovablePoint(1.2f, 1.5f, 2.3f, 3.8f);
            System.out.println("Tọa độ trước khi di chuyển ====== " + movablePoint);
            movablePoint.move();
            System.out.println("Tọa độ sau khi di chuyển ====== " + movablePoint);
        }
    }

