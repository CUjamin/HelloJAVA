package cuj.anything.hashmap;

/**
 * Created by cujamin on 2017/12/23.
 */
public enum Statuses {
    //1xx
    CONTINUE(100),
    PROCESSING(102),
    CHECKPIONT(103);

    private int cood;
    private Statuses(int ncode)
    {
        this.cood = ncode;
    }
//2xx
}
