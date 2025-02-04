package day02.resourceEx;

public class TryReadResourceEx {

    public static void main(String[] args) {

        try(MyResource resource = new MyResource("A")){
            String data = resource.read1();
            int value = Integer.parseInt(data);
        }catch (Exception e){
            System.out.println("예외 처리 : " + e.getMessage());
        }


        MyResource resource1 = new MyResource("A");
        MyResource resource2 = new MyResource("B");

    }
}
