package ANU7710;

public class Cinema_zi extends Cinema_fu {

    private String type;

    public Cinema_zi() {
        super();
    }
    public Cinema_zi(String name,String actor,String type) {
        super(name, actor);
        this.type=type;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }



}
