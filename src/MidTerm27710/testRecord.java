package MidTerm27710;

public record testRecord (String name, String uni, int age){
    //this is compact constructor!
    public testRecord{
        if(age < 0){
            throw new IllegalArgumentException("age cannot be negative");
        }
    }
}
