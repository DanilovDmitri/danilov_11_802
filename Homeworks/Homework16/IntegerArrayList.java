public class IntegerArrayList {
    private int [] elements;
    private int count;
    private boolean sorted;

    public IntegerArrayList () {
        elements = new int[10];
        count = 0;
        sorted = true;
    }

    public void changeLength (int n) {
        if (n > elements.length) {
            int [] elements2 = new int [n*3/2];
            for (int i = 0; i<count;i++ ) {
                elements2[i] = elements[i];
            }
            elements = elements2;
        }
    }

    public void plusElement (int newElement) {
        changeLength (count+1);
        elements [count++] = newElement;
        if ((count > 1) && (elements [count-2] > elements [count-1])) {
            sorted = false;
        }
    }

    public int countOfElements() {
        return count;
    }

    public void reversing () {
        int a;
        for (int i = 0; i < count/2; i++ ) {
            a = elements [i];
            elements [i] = elements [count-1-i];
            elements [count-1-i] = a;
        }
        sorted = false;
    }

    public void sorting () {
        for (int i = 0; i < count; i++)
            for (int j = 0; j < count-i-1; j++)
                if (elements[j] > elements[j + 1])
                {
                    int a = elements [j];
                    elements [j] = elements [j + 1];
                    elements[j + 1] = a;
                }
                sorted = true;
    }

    public void print () {
        for (int i = 0; i < count; i++) {
            System.out.print (elements[i] + " ");
        }
        System.out.println ();
    }

    public void addOtherArray (IntegerArrayList array2) {
        int newCount = count + array2.countOfElements();
        changeLength (newCount);
        for (int i = 0; i < array2.countOfElements(); i++) {
            elements[i + count] = array2.elements[i];
        }
        sorted = false;
        count = newCount;
    }
    public int findIndex (int n) {
        if (sorted = true) {
            int l = 0;
            int r = count - 1;

            while (l <= r) {
                int m = l + (r - l) / 2;
                if (elements[m] == n)
                    return m;

                if (elements[m] < n)
                    l = m + 1;

                else r = m - 1;
            }
            return -1;
        }

            else {
                for (int i = 0; i < count; i++) {
                if (elements[i] == n) {
                    return i;
                }
            }
        }
        return -1;
    }


   public void delete (int index) {
       if (index < count) {
           for (int i = index; i < count - 1; i++) {
               elements[i] = elements[i + 1];
           }
       }
       elements[count]=0;
       count=count-1;
   }

}