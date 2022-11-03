package Day4;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        // The oldStyle list will let you add anything, e.g 1 and "2"
        ArrayList oldStyle = new ArrayList();

        // The newStyle of using generics means that it checks we are only adding strings to the list
        ArrayList<String> newStyle = new ArrayList<String>();

        oldStyle.add("Hello");
        oldStyle.add(2); // This line does not throw an error because it cannot check what type of object you want
        System.out.println("Old style ArrayList" + oldStyle);

        newStyle.add("1");
        // newStyle.add(2); //This line will throw an error because newStyle can only accept String objects
    }
}
