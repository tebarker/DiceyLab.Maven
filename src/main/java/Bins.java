
public class Bins {

    private int[] bin;
    private int binMin;
    public Bins(int min, int max){
        binMin=min;
        bin=new int[max-min+1];
    }
    public void incrementBin(int num){
        bin[num-binMin]++;
    }
    public int getBin(int num){
        return bin[num-binMin];
    }

}
