package localtime;

import java.time.LocalTime;

public class Talk {
    private final int rating;

    public Talk(int rating) {
        this.rating = rating;
    }

    LocalTime scheduleSession() {
        return rating < 3 ? LocalTime.of(9, 0) : LocalTime.of(10, 0);
    }

    public static void main(String[] args) {
        Talk talk = new Talk(2);

        System.out.println(talk.scheduleSession());
    }
}
