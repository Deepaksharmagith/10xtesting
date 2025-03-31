package ex_19_OOPs_Part2.accessModifer.police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIShoot(){  // if i use privite than jrcop also not allow to shoot bez private  only give excess within class but this give within folder, package.
        System.out.println("Yes You can shoot!");
    }
}
