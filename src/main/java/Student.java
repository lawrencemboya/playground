public class Student <K, V>{
    private K id;
    private V fullName;

    public Student(K identification,V studentName){
        this.id = identification;
        this.fullName = studentName;
    }

    public K getId(){
        return this.id;
    }

    public V getFullName(){
        return this.fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fullName=" + fullName +
                '}';
    }
}
