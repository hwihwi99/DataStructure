package week6;

public class MyEnrty implements Entry {

    private Object key;
    private Object value;

    public MyEnrty (Object k, Object v) {
        this.key = k;
        this.value = v;
    }

    @Override
    public void setKey(Object k) {
        this.key = k;
    }

    @Override
    public void setValue(Object v) {
        this.value = v;
    }

    @Override
    public Object getKey() {
        return this.key;
    }

    @Override
    public Object getValue() {
        return this.value;
    }
}
