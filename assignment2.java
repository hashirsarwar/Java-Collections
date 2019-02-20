import java.util.*;

public class Main {

    public static void main(String[] args) {

        //vector
        Vector<Integer> v = new Vector();
        System.out.println(v.capacity());
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        v.add(1);
        System.out.println(v.capacity());

        //ArrayList
        ArrayList<Integer> al = new ArrayList();
        al.add(7);
        al.add(4);


        for (int i : al)
        {
            System.out.println(i);
        }

        //HashSet
        HashSet<Integer> hs = new HashSet();
        hs.add(2);
        hs.add(0);
        hs.add(9);

        for(int h : hs)
        {
            System.out.println(h);
        }

        //SortedSet
        SortedSet<Integer> ss = new TreeSet<>(Comparator.naturalOrder());
        ss.add(8);
        ss.add(0);
        ss.add(89);
        ss.add(88);

        for (int s : ss)
        {
            System.out.println(s);
        }

        //Array
        int arr[] = new int[4];
        arr[0]=4;
        arr[1]=7;
        arr[2]=0;
        arr[3]=6;

        for(int i =0;i<4;i++)
        {
            System.out.println(arr[i]);
        }

        //List
        List<Integer> l = new LinkedList<>();

        ((LinkedList<Integer>) l).addFirst(1);
        ((LinkedList<Integer>) l).addFirst(5);
        ((LinkedList<Integer>) l).addFirst(55);
        System.out.println(l.get(2));


        //NavigableSet
        NavigableSet<String> ns = new TreeSet<>();
        ns.add("hello");
        ns.add("world");
        ns.add("Hey");

        for (String n : ns)
        {
            System.out.println(n);
        }

        //NavigableMap
        NavigableMap<String,String> nm = new TreeMap<>();
        nm.put("name","Hashir");
        nm.put("age","21");
        nm.put("field","cs");

        for (String x : nm.keySet())
        {
            System.out.println(x + " " + nm.get(x));
        }
    }
}
