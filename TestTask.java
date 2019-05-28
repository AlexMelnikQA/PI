import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Alex Melnik on 28.05.2019.
 */
public class TestTask {
  private   String text = "Enrico Fermi was an Italian-American physicist who was awarded the 1938 Nobel Prize in Physics. He created the world\'s first nuclear reactor, Chicago Pile-1, and is one of 16 scientists who have elements named after them. One of the few physicists to excel in both theoretical and experimental work, he made significant contributions to quantum theory, statistical mechanics, and nuclear and particle physics.";

    @Test
    public void test1(){
        String[] subStr;
        String d = " ";
        subStr = text.split(d);
        List<String> list = new ArrayList();

        for(int i = 0; i < subStr.length; i++) {
            list.add(subStr[i].replace(".", "").replace(",",""));
        }

        Map<String, Integer> map = new HashMap<String, Integer>();
        Integer item;

        for (String s : list) {
            item = map.get(s);
            if (item == null) map.put(s, 1); // если нет в списке то добавить со значением 1
            else map.put(s, item + 1); // если есть, то +1
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue()>1)
            System.out.println(entry.getKey() + "  : " + entry.getValue());
        }
    }
}
