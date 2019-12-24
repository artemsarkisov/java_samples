import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreateLists {
    public static List<String> create(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        else if (i == 1) {
            return Collections.singletonList("o");
        }
        else if (i == 2) {
            return Arrays.asList("1", "2");
        }
        else {
            return new ArrayList<>();
        }
    }
}