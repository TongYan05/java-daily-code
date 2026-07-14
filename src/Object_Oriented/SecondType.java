package Object_Oriented;

public class SecondType {
    private String name;
    private int studentID;
    private double grade;
    private int rank;

    public SecondType(){System.out.println("This is a second type");}
    public SecondType(String name, int studentID, double grade, int rank){
        this.name = name;
        this.studentID = studentID;
        this.grade = grade;
        this.rank = rank;
    }

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}

    public void setStudentID(int studentID){this.studentID = studentID;}
    public int getStudentID(){return this.studentID;}

    public void setGrade(double grade){this.grade = grade;}
    public double getGrade(){return this.grade;}

    public void setRank(int rank){this.rank = rank;}
    public int getRank(){return this.rank;}

    public void printInformation(){
        System.out.println("Name: " + this.name+" StudentID: " + this.studentID+" Grade: " + this.grade+" Rank: " + this.rank);
    }

}
