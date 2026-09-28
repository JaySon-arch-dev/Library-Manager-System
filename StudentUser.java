package user;

public class StudentUser {
     private String name, section, course, IDnumber, password;
    
    StudentUser(String name,
    String section,
    String course,
    String IDnumber){
        this.name = name;
        this.section = section;
        this.course = course;
        this.IDnumber = IDnumber;
    }
    
    
    //for the setters
    void setName(String name) {
        this.name = name;
    }
    void setSection(String section) {
        this.section = section;
    }
    void setCourse(String course) {
        this.course = course;
    }
    void setID(String IDnumber) {
        this.IDnumber = IDnumber;
    }
    void setPass(String password) {
        this.password = password;
    }
    
    //for the getters
    String getName() {
        return name;
    }
    String getSection() {
        return section;
    }
    String getCourse() {
        return course;
    }
    String getIDnumber() {
        return IDnumber;
    }
    String getPass() {
        return password;
    }
}