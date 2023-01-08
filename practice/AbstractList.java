public class AbstractList implements List {
    public Object[] dataList = new Object[100]; 
    public int lastIndex = 0;

    public void clear() {
        dataList = new Object[100];
    }
    
    public void add() {       
        dataList[lastIndex] = new Object();
        ++lastIndex;
    }
    
    public void update(int index, Object value) {
        dataList[index] = value;
    }
    
    public void remove(int index) {
        dataList[index] = null;
    }
    
    public void removeAll() {
        clear();
    }

}