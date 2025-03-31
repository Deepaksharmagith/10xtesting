package ex_19_OOPs_Part2.accessModifer.criminal;

import ex_19_OOPs_Part2.accessModifer.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop thief = new Cop(100); // thief acting like a cop but he is not able to shoot
      //  thief.canIShoot(); // bez he is not in the same folder
    }
}
