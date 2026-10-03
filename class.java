class Student {
    private String name;
    private int age;
    private double marks;

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setMarks(double marks) {
        this.marks = marks;
    }

    // Getter methods
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Kishan");
        s1.setAge(19);
        s1.setMarks(88.5);

        System.out.println("=== Student Details ===");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Marks: " + s1.getMarks());
    }
}
