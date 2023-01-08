public class ProfilePrint {

    byte age;
    String name;

    boolean isMarried;

    public void setAge(byte age) {
        this.age = age;
    }
    
    public byte getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMarried(boolean flag) {
        isMarried = flag;
    }

    public boolean getMarried() {
        return isMarried;
    }

    public static void main(String[] args) {
        ProfilePrint pp = new ProfilePrint();

        byte age = 25;
        String name = "insung";
        boolean married = false;

        pp.setAge(age);
        pp.setName(name);
        pp.setMarried(married);
        
        System.out.println(pp.getAge() + pp.getName() + pp.getMarried());
    }
}
