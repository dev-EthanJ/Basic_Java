public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO() {}
    public MemberDTO(String name) { this.name = name; }
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public void printMember() {
        System.out.println("name: " + name);
        System.out.println("phone: " + phone);
        System.out.println("email: " + email + "\n");
    }

    public static void main(String[] args) {
        // MemberManager manager = new MemberManagerImpl();

        MemberDTO mem1 = new MemberDTO();
        MemberDTO mem2 = new MemberDTO("Kim");
        MemberDTO mem3 = new MemberDTO("Lee", "1234");
        MemberDTO mem4 = new MemberDTO("Park", "5678", "abc@mail.com");

        MemberDTO[] members = new MemberDTO[] {mem1, mem2, mem3, mem4};

        for(MemberDTO mem: members) {
            mem.printMember();
        }
    }
}
