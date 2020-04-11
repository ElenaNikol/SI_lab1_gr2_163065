import java.util.ArrayList;

class Student {
	String index;
	String firstName;
	String lastName;
    ArrayList<Integer> grades;

	//TODO constructor

    public Student(String index, String firstName, String lastName, ArrayList<> grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }
    //TODO seters & getters

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAverage() {
        int br=0,zbir=0;
        for (int i = 0; i < grades.size(); i++) {
            zbir += grades[i];
            br++;
        }
        return zbir/br;
	}

	public int ECTSCredits() {
        int br =0;
        for (int i = 0; i < grades.size(); i++) {
            if(grades[i]>5)
            br++;
        }
        return br;
	}

}


class Faculty{
    List<Student> students = new ArrayList<>();
    String ime;

    public Faculty(List<Student> students, String ime) {
        this.students = students;
        this.ime = ime;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void deleteStudent(String ime){
        for (int i = 0; i < students.size() ; i++) {
            if(students.firstName == ime){
                students.delete(i);
            }
        }
    }

    public void deleteStudent(String ime){
        double prosek = 0;
        for (int i = 0; i < students.size() ; i++) {
            prosek += students[i].getAverage();
        }
        return prosek/students.size();
    }
}