public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}//class

class Program2Run{

    public static void main(String[] args) {

        User obj = new User();

        obj.setName("Mindaugas");
        System.out.println(obj.getName());
    }

}