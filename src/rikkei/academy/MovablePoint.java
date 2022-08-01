package rikkei.academy;


public class MovablePoint extends Point{

        public float xSpeed = 0.0f;
        public float ySpeed = 0.0f;

        //Ví dụ 1: điểm A đang ở tọa độ (0,0), muốn di chuyển điểm A sang tọa độ(3.5 , 4.9)
        // thì xspeed phải là 3.5 và yspeed sẽ là 4.9

        //Ví dụ 2: Điểm B đang ở tọa dodoj (2, 😎, muốn di chuyển sang tọa độ (7,9)
        //thì xspeed phải là 5 và yspeed phải là 1
        public MovablePoint() {
        }

        public MovablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
            super(x, y);
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float getXSpeed() {
            return xSpeed;
        }

        public void setXSpeed(float xSpeed) {
            this.xSpeed = xSpeed;
        }

        public float getYSpeed() {
            return ySpeed;
        }

        public void setYSpeed(float ySpeed) {
            this.ySpeed = ySpeed;
        }

        public void setSpeed(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        public float[] getSpeed(float xSpeed, float ySpeed) {
            float[] array = {xSpeed,ySpeed} ;
            return array;
        }

        // Chức năng của method move này là di chuyển đối tượng
        // Bằng cách cộng x ban đầu cho xspeed và cộng y ban đầu cho yspeed
        // Từ đó sinh ra tọa độ mới
        // Ví dụ: Điểm B có tọa độ ban đầu là (2,3)  xSPeed = 5 và Yspeed = 7
        // Kết quả sau khi di chuyển, điểm B có tọa độ mới là (7, 10);
        public MovablePoint move(){
            setX(super.getX() + getXSpeed());
            setY(super.getY() + getYSpeed());
            return this;
        }

        @Override
        public String toString() {
            return super.toString();
        }

    }


