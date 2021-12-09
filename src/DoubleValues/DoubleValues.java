package DoubleValues;

import java.util.List;

public class DoubleValues {

    public List doubleValues(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + list.get(i));
        }
        return list;
    }
}
