
import java.util.ArrayList;
import java.util.List;

public class CollectionHelper {

    // findFirstIndex
    public int findFirstIndex(
            // BEGIN (write your solution here)
            List<? extends Human> humans, String namePrefix
            // END
    ) {
        // BEGIN (write your solution here)
        for (Human item: humans
             ) {
            if (item.toString().startsWith(namePrefix)) {
                humans.indexOf(item);
            }
        }
        return -1;
        // END
    }

}
