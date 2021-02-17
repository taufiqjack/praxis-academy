package generic;

public class SimpleGen<T> {
    private T objReff = null;

    public SimpleGen(T param) {
        this.objReff = param;
    }

    public T getObjReff(){
        return this.objReff;
    }

    public void printType(){
        System.out.println("Type: " +objReff.getClass().getName());
    }
}
