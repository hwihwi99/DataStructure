package week15;

import java.util.ArrayList;
import java.util.Comparator;

public class MyMergeSort {
    private ArrayList L1;
    private ArrayList L2;
    private Comparator comp;

    MyMergeSort(Comparator c) {
        this.L1 = new ArrayList();
        this.L2 = new ArrayList();
        this.comp = c;
    }

    public void sort(ArrayList l) {
        System.out.println("******* BEFORE SORT *******");
        for (int i = 0; i < l.size(); i++) {
            ArrayList temp = new ArrayList();
            temp.add(l.get(i));
            System.out.print(l.get(i) + " ");
            L1.add(temp);
        }
        System.out.println();

        while (true) {
            this.L2 = new ArrayList();
            for (int i = 0; i < L1.size() / 2; i++) {
                ArrayList tempList = new ArrayList();
                ArrayList compList1 = (ArrayList) this.L1.get(2 * i);
                ArrayList compList2 = (ArrayList) this.L1.get(2 * i + 1);
                int m = 0;
                int n = 0;
                while (m != compList1.size() && n != compList2.size()) {
                    if (this.comp.compare(compList1.get(m), compList2.get(n)) == 1) {
                        tempList.add(compList2.get(n));
                        n++;
                    } else {
                        tempList.add(compList1.get(m));
                        m++;
                    }
                }
                if (m == compList1.size())
                    for (; n < compList2.size(); n++)
                        tempList.add(compList2.get(n));
                else
                    for (; m < compList1.size(); m++)
                        tempList.add(compList1.get(m));
                this.L2.add(tempList);
            }
            if (this.L1.size() % 2 == 1)
                this.L2.add(this.L1.get(this.L1.size() - 1));

            if (this.L2.size() == 1) {
                System.out.println("******* AFTER SORT *******");
                ArrayList result = (ArrayList) this.L2.get(0);
                for (int i = 0; i < result.size(); i++)
                    System.out.print(result.get(i) + " ");
                System.out.println();

                return;
            } else {
                System.out.println("******* TEMP SORT *******");
                for (int i = 0; i < this.L2.size(); i++)
                    for (int j = 0; j < ((ArrayList) this.L2.get(i)).size(); j++)
                        System.out.print(((ArrayList) this.L2.get(i)).get(j) + " ");
                System.out.println();
            }

            this.L1 = new ArrayList();
            for (int i = 0; i < L2.size() / 2; i++) {
                ArrayList tempList = new ArrayList();
                ArrayList compList1 = (ArrayList) this.L2.get(2 * i);
                ArrayList compList2 = (ArrayList) this.L2.get(2 * i + 1);
                int m = 0;
                int n = 0;
                while (m != compList1.size() && n != compList2.size()) {
                    if (this.comp.compare(compList1.get(m), compList2.get(n)) == 1) {
                        tempList.add(compList2.get(n));
                        n++;
                    } else {
                        tempList.add(compList1.get(m));
                        m++;
                    }
                }
                if (m == compList1.size())
                    for (; n < compList2.size(); n++)
                        tempList.add(compList2.get(n));
                else
                    for (; m < compList1.size(); m++)
                        tempList.add(compList1.get(m));
                this.L1.add(tempList);
            }
            if (this.L2.size() % 2 == 1)
                this.L1.add(this.L2.get(this.L2.size() - 1));

            if (this.L1.size() == 1) {
                System.out.println("******* AFTER SORT *******");
                ArrayList result = (ArrayList) this.L1.get(0);
                for (int i = 0; i < result.size(); i++)
                    System.out.print(result.get(i) + " ");
                System.out.println();

                return;
            } else {
                System.out.println("******* TEMP SORT *******");
                for (int i = 0; i < this.L1.size(); i++)
                    for (int j = 0; j < ((ArrayList) this.L1.get(i)).size(); j++)
                        System.out.print(((ArrayList) this.L1.get(i)).get(j) + " ");
                System.out.println();
            }
        }
    }

    public Comparator setComparator(Comparator c) {
        this.comp = c;
        return this.comp;
    }
}
