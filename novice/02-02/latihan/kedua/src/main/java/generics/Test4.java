package generics;


class Test4<T> {
   
    T obj;

    Test4(T obj) {
        this.obj = obj;
    } 

    public T getObject() {
        return this.obj;
    }
}


class Main3 {
    public static void main(String[] args) {
       
        Test4<Integer> iObj = new Test4<Integer>(15);
        System.out.println(iObj.getObject());

       
        Test4<String> sObj= new Test4<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());
        iObj = sObj; 
    }
}
