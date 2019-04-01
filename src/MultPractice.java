/**
 * Created by Teacher on 4/1/2019.
 */
public class MultPractice implements StudyPractice {
    private int a;
    private int b;
    public MultPractice(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String getProblem(){
        return a+" Times "+b;
    }
    public void nextProblem(){
        b++;
    }
}
