import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

class CheckString implements StringChecker {
    CheckString() { }
    public boolean checkString(String s) {
        if (s.contains("app")) {
            return true;
        } else {
        return false;
        }
    }
}

public class ListTests {
    
    @Test
    public void testFilter() {
        List<String> arr = new ArrayList<>();
        arr.add("application");
        arr.add("apple");
        arr.add("orange");
        arr.add("icon");
        arr.add("pineapple");

        StringChecker sc = new CheckString();

        List<String> filteredArr = ListExamples.filter(arr, sc);

        List<String> expectedArr = new ArrayList<>();
        expectedArr.add("application");
        expectedArr.add("apple");
        expectedArr.add("pineapple");

        assertEquals(expectedArr, filteredArr);
    }

    @Test
    public void testMerge() {
        List<String> list1 = new ArrayList<>();
        list1.add("adam");
        list1.add("david");
        list1.add("eve");

        List<String> list2 = new ArrayList<>();
        list2.add("abraham");
        list2.add("cain");

        List<String> mergedList = ListExamples.merge(list1, list2);

        List<String> expectedList = new ArrayList<>();
        expectedList.add("abraham");
        expectedList.add("adam");
        expectedList.add("cain");
        expectedList.add("david");
        expectedList.add("eve");

        assertEquals(expectedList, mergedList);
    }
}
