class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void calculate() {
        int area = length * width;
        int perimeter = 2 * (length + width);

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);

        r1.calculate();
    }
}