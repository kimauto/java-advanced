package day02.resourceEx;

public class MyResource implements AutoCloseable {

    private String name;

    public MyResource(String name) {
        this.name = name;
        System.out.println("MyResource (" + name + ") created");
    }

    public String read1() {
        System.out.println("MyResource (" + name + ") read");
        return "200";
    }


    public String read2() {
        System.out.println("MyResource (" + name + ") read");
        return "abc";
    }

    @Override
    public void close() throws Exception {
        System.out.println("MyResource (" + name + ") cloes");
    }
}
