package main.Problem6;

/**
 * Created by ahacker on 12/18/2016.
 */
public class LineCounter {

    private CharCounter[] columnCounters;
    private String input;

    public LineCounter(String input){
        this.input = input;
        int len = input.split("\\n")[0].length();
        columnCounters = new CharCounter[len];
        for (int i = 0; i < len; i++){
            columnCounters[i] = new CharCounter();
        }
    }

    public void addLine(String line){
        for(int i = 0; i < line.length(); i++) {
            columnCounters[i].put(line.charAt(i));
        }
    }

    public String decode(){
        StringBuilder sb = new StringBuilder();
        for (CharCounter counter : columnCounters){
            sb.append(counter.getLeastCommon());
        }
        return sb.toString();
    }

    public String run(){
        String[] lines = this.input.split("\\n");
        for (String line : lines){
            this.addLine(line);
        }
        return this.decode();
    }
}
