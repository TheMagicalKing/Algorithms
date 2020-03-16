import java.util.ArrayList;
import java.util.Random;

public class SearchAlgorithms {

    ArrayList<Integer> data = new ArrayList<Integer>();

    int forCount;

    Random rand = new Random();



    public void dataFillStatic(){
        data.clear();
        int forMax = 11;
        for (int forCount=0; forCount<forMax;forCount++){
            data.add(forCount);

        }
        System.out.println(data);
    }
    public void dataFillRand(){
        data.clear();
        int forMax = 31;
        for (int forCount=0; forCount<forMax;forCount++){
            data.add(rand.nextInt(forMax));
        }
        System.out.println(data);
    }



    public String find(int x){
        String a = null;
        for (int i = 0; i<data.size(); i++) {
            if (data.get(i)==x) {
                a = "Tallet, du leder efter, er placeret på index " + i + " i arraylisten.";
                System.out.println(a);
                return a;
            }
        }

        a = x + " er ikke blevet fundet";
        System.out.println(a);
        return a;
    }

    public int findAlle(int x){
        int sameCount = 0;
        for (int i = 0; i<data.size(); i++){
            if (data.get(i)==x){
                sameCount++;
            }
        }
        System.out.println("Der blev fundet " + sameCount + " pladser med tallet " + x + " i indexet");
        return sameCount;
    }
    public int findMax(){
        int maksTal = 0;
        for ( int i = 0; i<data.size(); i++){
            if (data.get(i)>maksTal){
                maksTal = data.get(i);
            }
        }
        System.out.println("Det højeste tal I indexet er = " + maksTal);
        return maksTal;
    }

}
