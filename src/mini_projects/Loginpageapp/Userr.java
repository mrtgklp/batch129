package mini_projects.Loginpageapp;

public class Userr {
    //3-name,username,email,password
    private String name;
    private String username;
    private String email;
    private String password;
    //4-user object olusturuken ozellikler set edilsin.
    public Userr (String name,String username,String email,String password){
        this.name=name;
        this.username=username;
        this.email=email;
        this.password=password;
    }
    public String getName() {
        return name;
    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return "Userr{" +
                "name='" + name + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
