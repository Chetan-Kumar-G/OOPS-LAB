package library.members;

public class Member {
    private int memberID;
    private String name;
    private String email;

    public Member(int memberID, String name, String email) {
        this.memberID = memberID;
        this.name = name;
        this.email = email;
    }

    public void displayMemberDetails() {
        System.out.println("Member ID: " + memberID + ", Name: " + name + ", Email: " + email);
    }

    public String getName() {
        return name;
    }
}
