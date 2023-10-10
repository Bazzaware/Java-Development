public class Student {
    private String _id;
    private String _name;
    private String _course;
    private int _mark;

    public Student(String id, String name, String course, int mark) {
        _id = id;
        _name = name;
        _course = course;
        _mark = mark;
    }

    public String toString() {
        return String.format("%s %s %s %d", _id, _name, _course, _mark);
    }

}
