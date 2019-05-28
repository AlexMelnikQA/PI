import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex Melnik on 28.05.2019.
 */
public class TestTask {
  private   String text = "Enrico Fermi was an Italian-American physicist who was awarded the 1938 Nobel Prize in Physics. He created the world\'s first nuclear reactor, Chicago Pile-1, and is one of 16 scientists who have elements named after them. One of the few physicists to excel in both theoretical and experimental work, he made significant contributions to quantum theory, statistical mechanics, and nuclear and particle physics.";


    @Test
    public void test1(){
        String[] subStr;
        String delimeter = " ";
        subStr = text.split(delimeter);
        List list = new ArrayList();

        for(int i = 0; i < subStr.length; i++) {
            System.out.println(subStr[i]);
            list.add(subStr[i].replace(".", "").replace(",",""));
        }
    }


}
