public class Student{
    private String name;
    private long ID;

    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public long getID(){return ID;}
    public void setID(long ID){this.ID = ID;}
    public static void main(String[] args) {
        Student [] s = new Student[10];
        for(int i = 0; i<10; i++){
            s[i] = new Student();
            s[i].setID(i+10000);
    
        }
        System.out.println(s[5].getID());
    }
}