
    class Shape {
        public void draw() {
            System.out.println("Drawing a shape");
        }
    }
    
    class Square extends Shape {
        @Override
        public void draw() {
            System.out.println("Drawing a square");
        }
    }
    
    class Main {
        public static void main(String[] args) {
         Shape s1 = new Square();
             s1.draw();
        }
    }
