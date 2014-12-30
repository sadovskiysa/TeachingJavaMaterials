import org.apache.http.auth.NTUserPrincipal;

import java.util.*;

/**
 * Created by akravets on 12/30/14.
 */
public class MyMap implements Map {
    Object[] arr = new Object[10];


    @Override
    public void clear() {

    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public Set<Entry> entrySet() {
        return null;
    }

    @Override
    public Object get(Object key) {
        return arr[key.hashCode() % 10];
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Set keySet() {
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int position = key.hashCode() % arr.length;
        List list = arr[position]==null ? new LinkedList() : (List) arr[position];
        Tuple tuple = new Tuple(key, value);
        boolean contains= false;
        for(int i=0; i<list.size(); i++) {
            Tuple tp = (Tuple) list.get(i);
            if(tp.key.equals(key)){
                contains = true;
                list.set(i, tuple);
                break;
            }
        }
        if(!contains) list.add(tuple);
        return tuple.value;
    }

    @Override
    public void putAll(Map map) {
        for(Object entry: map.entrySet()){
            Map.Entry e = (Entry) entry;
            this.put(e.getKey(), e.getValue());
        }
    }

    @Override
    public Object remove(Object key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Collection values() {
        return null;
    }

    private class Tuple{
        Object key;
        Object value;

        public Tuple(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }
}
