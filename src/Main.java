int a = 25;
String b = "København";
float c = 22.3f;
boolean isHorizontal = false;

void main() {
        System.out.println(a);
        System.out.println(a + b);
        int a = 16;
        int b = a;
        System.out.println(a + b);
        System.out.println(b + " " + isHorizontal);
        myMethod();
    }
void myMethod() {
        float d = c;
        System.out.println(b);
        boolean b = false;
        int a = 700;
        System.out.println(a + d + " : " + b);
        int f = 5;
        System.out.println(f * d);
        String displayOrientation = isHorizontal ? "landscape" : "portrait";
        System.out.println(displayOrientation);
}


