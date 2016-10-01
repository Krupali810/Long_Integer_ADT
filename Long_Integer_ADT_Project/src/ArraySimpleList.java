
public class ArraySimpleList implements SimpleList<ArrayEntry> {

    // # of positions in the list
    private int n = 0;

    // Current size of array
    private int arraySize = 0;
    ArrayEntry[] arr_ae; //array of array entries

    public ArraySimpleList() {

    }

    public ArraySimpleList(int arraySizeC) {
        arraySize = arraySizeC;
        arr_ae = new ArrayEntry[arraySize];

        int i;
        for (i = 0; i < arraySize; i++) {
            arr_ae[i] = new ArrayEntry(0, i);
        }
    }

    public void insertFirst(int value) {
        if (n == 0) {
            arr_ae[0] = new ArrayEntry(value, 0);
            n++;
        } else {
            int j;
            int n_idx = n;

            for (j = 0; j < n; j++) {
                arr_ae[n_idx] = new ArrayEntry(arr_ae[n_idx - 1].getValue(), n_idx);
                n_idx--;
            }
            arr_ae[0] = new ArrayEntry(value, 0);
            n++;

        }
    }

    public void insertLast(int value) {
        arr_ae[n] = new ArrayEntry(value, n);
        n++;
    }

    public ArrayEntry first() {

        return arr_ae[0];

    }

    public ArrayEntry last() {
        return arr_ae[n - 1];

    }

    public boolean isFirst(ArrayEntry p) {
        int index;
        index = p.getIndex();
        if (index == 0)
        {
            return true;
        }
        return false;

    }

    public boolean isLast(ArrayEntry p) {
        
        int index;
        index = p.getIndex();
        if (index == n-1)
        {
            return true;
        }
        return false;
    }

    public ArrayEntry before(ArrayEntry p) {

        int index;
        index = p.getIndex();
                
        if(index <= 0)
        {
            return null;
        }
        else 
        {
            index = index -1;
            return arr_ae[index];
        }
       
        
    }

    public ArrayEntry after(ArrayEntry p) {
       
         int index;
        index = p.getIndex();
                
        if(index >= n-1)
        {
            return null;
        }
        else 
        {
            index = index +1;
            return arr_ae[index];
        }
       
    }

    public boolean isEmpty() {
        if (n==0)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }

    public int size() {
        return arraySize;
    }
    
    
    public boolean isSLL() {
        return false;
    }

}
