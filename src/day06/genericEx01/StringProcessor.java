package day06.genericEx01;

public class StringProcessor implements Processor<String>{

    @Override
    public void process(String input) {
        System.out.println("Processing " + input);
    }
}
