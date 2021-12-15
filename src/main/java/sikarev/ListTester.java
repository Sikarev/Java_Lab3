import java.util.Collections;
import java.util.List;
/**
 *
 * @author roman-
 * ListerTester is a class which contains methods of calculating time(adding, deleting, geting value etc.)
 *
 */
public class ListTester {
    /**
     * start time is a field
     */
    private long startTime_;
    /**
     * endtime is a field
     */
    private long endTime_;
    /**
     * recieving list, if its empty list, throws an error(so u cant work with this list)
     * in case evrything ok, we clear list
     */
    private void tryClear_(List<Object> list) {
        if(list == null){
            throw new NullPointerException();
        }
        list.clear();
    }

    /**
     * startTimer calculates the time of begining
     */
    private void startTimer_() {
        startTime_ = System.nanoTime();
    }
    /**
     * stopTimer calculates the time of ending
     */
    private void stopTimer_() {
        endTime_ = System.nanoTime();
    }
    /**
     * getEstimatedTime calculates difference between startTimer and StopStiemr
     */
    private long getEstimatedTime_() {
        return endTime_ - startTime_;
    }
    /**
     * GetAddTime receiving list and number of operations, and applying method add(adding an element in any position).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getAddTime(List<Object> list, int amount){
        /**
         * trying to clear list
         */
        tryClear_(list);
        /**
         * starting calculating time
         */
        startTimer_();
        /**
         * this cycle applies method
         */
        for(int i = 0 ; i < amount ; i++){
            list.add(new Object());
        }
        stopTimer_();
        return getEstimatedTime_();
    }
    /**
     * GetAddEndTime receiving list and number of operations, and applying method addEnd(adding an element in the end).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getAddEndTime(List<Object> list, int amount){
        tryClear_(list);
        startTimer_();
        for(int i = 0 ; i < amount ; i++){
            list.add(i,new Object());
        }
        stopTimer_();
        return getEstimatedTime_();
    }
    /**
     * GetAddEndTime receiving list and number of operations, and applying method addEnd(adding an element in the begining).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getAddFrontTime(List<Object> list, int amount){
        tryClear_(list);
        startTimer_();
        for(int i = 0 ; i < amount ; i++){
            list.add(0,new Object());
        }
        stopTimer_();
        return getEstimatedTime_();
    }
    /**
     * GetAddEndTime receiving list and number of operations, and applying method get(receiving a value of an index an element).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getGetTime(List<Object> list, int amount){
        tryClear_(list);
        list.addAll(Collections.nCopies(amount,new Object()));
        startTimer_();
        for(int i = 0 ; i < amount ; i++){
            list.get(i);
        }
        stopTimer_();
        return getEstimatedTime_();
    }
    /**
     * GetAddEndTime receiving list and number of operations, and applying method getRemoveFrontTime(removing in the begining).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getRemoveFrontTime(List<Object> list, int amount){
        tryClear_(list);
        list.addAll(Collections.nCopies(amount,new Object()));
        startTimer_();
        for(int i = 0 ; i < amount ; i++){
            list.remove(0);
        }
        stopTimer_();
        return getEstimatedTime_();
    }
    /**
     * GetAddEndTime receiving list and number of operations, and applying method RemoveBack(deleting an element in the ending).
     * @param list is a list which is received by method
     * @param amount is an number of operations.
     */
    public long getRemoveBackTime(List<Object> list, int amount){
        tryClear_(list);
        list.addAll(Collections.nCopies(amount,new Object()));
        startTimer_();
        for(int i = 0 ; i < amount ; i++){
            list.remove(list.size()-1);
        }
        stopTimer_();
        return getEstimatedTime_();
    }
}
