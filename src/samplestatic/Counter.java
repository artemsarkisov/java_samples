package samplestatic;

class Counter {
    static int count = 0;
    Counter(){
        count ++;
    }
    public void getCount() {
        System.out.printf("Value of counter: %d \n", count);
    }
    public static void main(String[] args) {
        Counter c1 = new Counter(); //count incremented to 1
        c1.getCount();
        Counter c2 = new Counter(); //count incremented to 2
        c2.getCount();
        Counter c3 = new Counter(); //count incremented to 3
        c3.getCount();
    }
}