import java.util.Arrays;

public class Database {
    private Courses [] courses;
    private Student [] students;
    private Teacher [] teachers;

    public Courses[] getCourses() {
        return courses;
    }

    public void setCourses(Courses[] courses) {
        this.courses = courses;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }
    public String addNewTeacher(Teacher teacher){
        Teacher [] teachers1 ;
        teachers1= Arrays.copyOf(teachers, teachers.length + 1);
        teachers1[teachers1.length - 1] = teacher;
        teachers = teachers1;
        return "Teacher added successfully";
    }

    public String addNewStudent(Student student){
        return "Student added successfully";
    }

    public String addNewCourse(Courses course){
        return "Course added successfully";
    }

    public String removeTeacher(Teacher teacher){
        return "Teacher removed successfully";
    }

    public String removeStudent(Student student){
        return "Student removed successfully";
    }

    public String removeCourse(Courses course){
        return "Course removed successfully";
    }

    public String updateTeacher(Teacher teacher){
        return "Teacher updated successfully";
    }

    public String updateStudent(Student student){
        return "Student updated successfully";
    }

    public String updateCourse(Courses course){
        return "Course updated successfully";
    }

    public Teacher  searchTeacherBYName(String name){
        return null;
    }

    public Student searchStudentByName(String name){
        return null;
    }

    public Courses searchCourseByIndex(int index){
        return null;
    }

    public String listTeachers(){
        return "Teachers listed successfully";
    }

    public String listStudents(){
        return "Students listed successfully";
    }

    public String listCourses(){
        return "Courses listed successfully";
    }

    public String listStudentsByCourse(Courses course){
        return "Students listed successfully";
    }

    public String listCoursesByTeacher(Teacher teacher){
        return "Courses listed successfully";
    }

    public String listCoursesByStudent(Student student){
        return "Courses listed successfully";
    }

    public String listTeachersByCourse(Courses course){
        return "Teachers listed successfully";
    }

    public String listStudentsByTeacher(Teacher teacher){
        return "Students listed successfully";
    }

    public String listTeachersByStudent(Student student){
        return "Teachers listed successfully";
    }

    public Courses [] listCoursesByStudentName(String studentName){
        return null;
    }

    public Teacher [] listTeachersByStudentName(String studentName){
        return null;
    }

    public Student [] listStudentsByTeacherName(String teacherName){
        return null;
    }

    public Courses [] listCoursesByTeacherName(String teacherName){
        return null;
    }

    public Student [] listStudentsByCourseName(String courseName){
        return null;
    }

    public  void findTeacherBySpec(String spec) {
        Teacher [] teacher = new Teacher[teachers.length];
        int counter =0;
        for (int i = 0; i < teachers.length ; i++) {
            if (teachers[i].getSpecialization().equals(spec)) {
                teacher[i]=teachers[i];
                counter++;
            }
        }
        Teacher[] teachers1 = Arrays.copyOf(teacher,counter);
        System.out.println(Arrays.toString(teachers1));
    }
    public void findTeacherByName(String name){
        Teacher []teacher = new Teacher[teachers.length];
        int counter = 0;
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i].getName().equals(name)){
                teacher[i]=teachers[i];
                counter++;
            }
        }
        Teacher[] teachers1 = Arrays.copyOf(teacher,counter);
        System.out.println(Arrays.toString(teachers1));
    }

    public void findStudentByName(String name){
        Student [] student = new Student[students.length];
        int counter = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(name)){
                student[i]=students[i];
                counter++;
            }
        }
        Student [] students1 = Arrays.copyOf(student,counter);
        System.out.println(Arrays.toString(students1));
    }

    public void findCourseByName (String name){
        Courses [] courses1 = new Courses[courses.length];
        int counter =0;
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getName().equals(name)){
                courses1[i]=courses[i];
                counter++;
            }
        }
        Courses [] courses2 = Arrays.copyOf(courses1,counter);
        System.out.println(Arrays.toString(courses2));
    }

    public String updateStudent(String name, Student student){
        for (int i = 0; i < students.length; i++) {
            if(students[i].getName().equals(name)) {
                students[i].setName(student.getName());
                students[i].setAge(student.getAge());
                students[i].setAddress(student.getAddress());
                System.out.println(students[i]);
            }
        }
        return "Student updated successfully";
    }

    public String updateCourse(String name ,Courses course){
        for (int i = 0; i < courses.length; i++) {
            if (courses[i].getName().equals(name)){
                courses[i].setName(course.getName());
                courses[i].setNumberOfStudents(course.getNumberOfStudents());
                System.out.println(courses[i]);
            }
        }

        return "Course updated successfully";
    }
    public String updateTeacher(String name,Teacher teacher){
        for (int i = 0; i < teachers.length; i++) {
            if(teachers[i].getName().equals(name))
            {
                teachers[i].setName(teacher.getName());
                teachers[i].setSpecialization(teacher.getSpecialization());
                teachers[i].setStage(teacher.getStage());
                System.out.println(teachers[i]);

            }
        }
        return "Teacher updated successfully";
    }



    @Override
    public String toString(){
        return "Database{" +
                "courses=" + Arrays.toString(courses) +
                ", students=" + Arrays.toString(students) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
