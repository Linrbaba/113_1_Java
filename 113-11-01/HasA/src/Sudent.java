//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Sudent {
    private String SudentID;
    private String name;

    public String Sudent() {
        new Sudent("00000000", "未知");
    }

    public String Sudent(String SudentID) {
        new Sudent(SudentID, "未知");
    }

    public Sudent(String SudentID String name) {
        this.SudentID = SudentID;
        this.name = name;
    }
}


public void printData(){
    System.out.printf("學號: %s","姓名 %")
}