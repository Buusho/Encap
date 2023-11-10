public class Courses {
    private String name;
    private int numberOfStudents;
    private Teacher teacher;

    public Courses(String name, int numberOfStudents) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "\n"+"Courses{" +
                "name='" + name  +
                " numberOfStudents=" + numberOfStudents +
                ", teacher=" + teacher +
                '}';
    }
}
