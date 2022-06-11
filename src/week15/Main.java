package week15;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Comparator comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((int) o1 > (int) o2) ? +1 : -1;
            }
        };

        MyMergeSort mms = new MyMergeSort(comp);
        Random rand = new Random();
        ArrayList data = new ArrayList();
        for (int i = 0; i < 20; i++)
            data.add(rand.nextInt(100) + 1);
        System.out.println("**************** PR1 ****************");
        mms.sort(data);

        System.out.println();

        comp = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                o1 = ((String) o1).toLowerCase();
                o2 = ((String) o2).toLowerCase();
                if (((String) o1).compareTo((String) o2) > 0)
                    return 1;
                return -1;
            }
        };
        mms = new MyMergeSort(comp);
        data = new ArrayList();
        String strData = "In computer science, a data structure is a data organization, management, and storage format that enables efficient access and modification. More precisely, a data structure is a collection of data values, the relationships among them, and the functions or operations that can be applied to the data.";
        String[] wordArr = strData.split(" ");

        for (int i = 0; i < wordArr.length; i++)
            data.add(wordArr[i]);

        System.out.println("**************** PR2 ****************");
        mms.sort(data);

    }
}
