package meet7;

/**
 *
 * @author sye
 */
public class Students {

    public Students(int nStudent) {
        this.nStudent = (nStudent);
    }
    
    private int nStudent;
    private String[] names = new String[nStudent];
    private double[] examResults = new double[nStudent];

    public int getnStudent() {
        return nStudent;
    }

    public void setnStudent(int nStudent) {
        if(nStudent > 0){
            this.nStudent = nStudent;
        } else {
            nStudent = 0;
        }
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public double[] getExamResults() {
        return examResults;
    }

    public void setExamResults(double[] examResults) {
        this.examResults = examResults;
    }
}
