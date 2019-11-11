package components;

public interface IValue {

    public Object getValue();

    public void initialize(Object initValue);

    public void setValue(Object value);

    public void setLabels(String txt, String error);
}
