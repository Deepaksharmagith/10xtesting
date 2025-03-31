package ex_19_OOPs_Part2.ecap;

public class Lab176 {
    public static void main(String[] args) {


        VWOLogin vwoLogin = new VWOLogin("admin","pass123");
        System.out.println(vwoLogin.password);
        vwoLogin.password = "345";  // this pass can be change , excess from the outside, it is not sequre.
        System.out.println(vwoLogin.password);

        GoodEcapVWOLogin vwoLogin1 =  new GoodEcapVWOLogin("admin","pwd123");
//        System.out.println(vwoLogin1.password);  // now can't excess the pwd, user bez it became private, it is avalable within this class "GoodEcapVWOLogin" -line-37-58
//        basically it says that you should hide your variable
//        but 1 problem if i want to change user name directely you are not allow but you can by •	Getter, Setter.
// right click - Generate- Getter, Setter-- now you can select those varriable jisko you want to change.
// as you select both 4 function will be generated, by using this you can set, excess the variable.
// Still 1 proble you can set the password so we do 1 things in case of set pass i will add sequirty in setpass function
        vwoLogin1.setUsername("sushma");
        System.out.println(vwoLogin1.getUsername());

    // only admin can set pass now.
        boolean isAdmin = true;
        vwoLogin1.setPassword("123", false);
        vwoLogin1.getPassword();



    }
}


class VWOLogin{
    public String username;
    public String password;

    public VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;  // these 2 variable are not sequires.
    }
}
// ecap says that when we make a class you should make them variable private in nature so that nobody can't excess .
class GoodEcapVWOLogin{
    private String username;
    private String password;


    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin){
            this.password = password;
        }else{
            System.out.println("Not allowed to change password!");
        }

    }

    public GoodEcapVWOLogin(String usr, String pwd) {
        this.username = username;
        this.password = password;
    }
}