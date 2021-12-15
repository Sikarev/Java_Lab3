

import java.util.ArrayList;
import java.util.LinkedList;
/**
 *
 * @author roman-
 * ListComparator is main class where methods are aplied. It has field arrayList and LinkedList. They have final modification
 * as we dont need having legacy. They recieve memory only once when the variable listcomparator created, they are not being deleted
 * and modified which is why they are final
 */
public class ListComparator {
    private final ArrayList<Object> arrayList_;
    private final LinkedList<Object> linkedList_;
    /**
     *columNames are necessary for table which would contain all results
     */
    private final String[] columnNames_ = {" comparableMethod ", " ArrayList (ms) ", " LinkedList (ms) ", " Difference (ms) "};
    /**
     *methodNames are necessary for table which would contain all results
     */
    private final String[] methodNames_ = {"add", "add(to the end)", "add(to the beginning)", "get", "remove(from the end)", "remove(from the beginning)"};



    String[][] compareMethod_(int amount) {
        /**
         *creating table
         */
        String[][] results = new String[6][4];
        /**
         *creating tester and in order not to creating a variables many time we create ListTime variable for both array and linkedlist
         */
        ListTester tester = new ListTester();
        long arrayListTime, linkedListTime;
        for (int i = 0; i < 6; i++) {
            results[i][0] = methodNames_[i];
        }
        /**
         *Here we say thet arraylisttime equals tester.gettaddtime, in such way we remember time
         * Same goes for LinkedListTime
         * in first column array`s time is written
         * in second column list`s time is written
         * in third column difference is written
         * Same here goes for evryother method
         */
        arrayListTime = tester.getAddTime(arrayList_,amount);
        linkedListTime = tester.getAddTime(linkedList_,amount);
        results[0][1] = String.valueOf(arrayListTime);
        results[0][2] = String.valueOf(linkedListTime);
        results[0][3] = String.valueOf(arrayListTime - linkedListTime);
/**
 *Here we say thet arraylisttime equals tester.gettaddendtime, in such way we remember time
 * Same goes for LinkedListTime
 * in first column array`s time is written
 * in second column list`s time is written
 * in third column difference is written
 * Same here goes for evryother method
 */
        arrayListTime = tester.getAddEndTime(arrayList_,amount);
        linkedListTime = tester.getAddEndTime(linkedList_,amount);
        results[1][1] = String.valueOf(arrayListTime);
        results[1][2] = String.valueOf(linkedListTime);
        results[1][3] = String.valueOf(arrayListTime - linkedListTime);
/**
 *Here we say thet arraylisttime equals tester.getAddFrontTime, in such way we remember time
 * Same goes for LinkedListTime
 * in first column array`s time is written
 * in second column list`s time is written
 * in third column difference is written
 * Same here goes for evryother method
 */
        arrayListTime = tester.getAddFrontTime(arrayList_,amount);
        linkedListTime = tester.getAddFrontTime(linkedList_,amount);
        results[2][1] = String.valueOf(arrayListTime);
        results[2][2] = String.valueOf(linkedListTime);
        results[2][3] = String.valueOf(arrayListTime - linkedListTime);
/**
 *Here we say thet arraylisttime equals tester.getGetTime, in such way we remember time
 * Same goes for LinkedListTime
 * in first column array`s time is written
 * in second column list`s time is written
 * in third column difference is written
 * Same here goes for evryother method
 */
        arrayListTime = tester.getGetTime(arrayList_,amount);
        linkedListTime = tester.getGetTime(linkedList_,amount);
        results[3][1] = String.valueOf(arrayListTime);
        results[3][2] = String.valueOf(linkedListTime);
        results[3][3] = String.valueOf(arrayListTime - linkedListTime);
/**
 *Here we say thet arraylisttime equals tester.getRemoveFrontTime, in such way we remember time
 * Same goes for LinkedListTime
 * in first column array`s time is written
 * in second column list`s time is written
 * in third column difference is written
 * Same here goes for evryother method
 */
        arrayListTime = tester.getRemoveFrontTime(arrayList_,amount);
        linkedListTime = tester.getRemoveFrontTime(linkedList_,amount);
        results[4][1] = String.valueOf(arrayListTime);
        results[4][2] = String.valueOf(linkedListTime);
        results[4][3] = String.valueOf(arrayListTime - linkedListTime);
/**
 *Here we say thet arraylisttime equals tester.getRemoveBackTime, in such way we remember time
 * Same goes for LinkedListTime
 * in first column array`s time is written
 * in second column list`s time is written
 * in third column difference is written
 * Same here goes for evryother method
 */
        arrayListTime = tester.getRemoveBackTime(arrayList_,amount);
        linkedListTime = tester.getRemoveBackTime(linkedList_,amount);
        results[5][1] = String.valueOf(arrayListTime);
        results[5][2] = String.valueOf(linkedListTime);
        results[5][3] = String.valueOf(arrayListTime - linkedListTime);
        return results;
    }
    public ListComparator() {
        arrayList_ = new ArrayList<>();
        linkedList_ = new LinkedList<>();
    }




}
