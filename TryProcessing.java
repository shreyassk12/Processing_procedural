    import processing.core.PApplet;
    public class TryProcessing extends PApplet{

        public static final int WIDTH = 640;
        public static final int HEIGHT = 480;
        public static final int Diameter = 10;
        int state1,state2,state3,state4=0;

        public static void main(String[] args)
        {
            PApplet.main("TryProcessing",args);
        }
        @Override
        public void settings(){
            super.settings();
            size(WIDTH, HEIGHT);
        }

    //    @Override
    //    public void setup() {
    //        System.out.println("Printed from setup");
    //        ellipse(WIDTH /2, HEIGHT /2,100,100);
    //    }

        @Override
        public void draw() {
            fourBalls();
        }

        private void fourBalls() {
            drawCircle1();
            drawCircle2();
            drawCircle3();
            drawCircle4();
        }


        private void drawCircle4() {
            ellipse(state4, HEIGHT * 4 /5, Diameter,Diameter);
            state4+=4;
        }

        private void drawCircle3() {
            ellipse(state3, HEIGHT * 3 /5, Diameter,Diameter);
            state3+=3;
        }

        private void drawCircle2() {
            ellipse(state2, (HEIGHT * 2) /5, Diameter,Diameter);
            state2+=2;
        }

        private void drawCircle1() {
            ellipse(state1, HEIGHT /5, Diameter,Diameter);
            state1+=1;
        }
    }
