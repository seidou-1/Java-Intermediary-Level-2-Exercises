/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercise7_Fors;

/**
 *
 * @author laptop
 */
public class _8ForByForSandbox {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (int i = 0; i < 3; i++) {
            System.out.print("|");
            if (i == 1) {
                for (int j = 0; j < 3; j++) {
                    if (j == 1) {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("#");
                        }
                    } else {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("@");
                        }
                    }
                    System.out.print("|");
                }
            } else { 
                for (int j = 0; j < 3; j++) {
                    if (j == 1) {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("$");
                        }
                    } else {
                        for (int k = 0; k < 3; k++) {
                            System.out.print("*");
                        }
                    }
                    System.out.print("|");
                }
            }

            System.out.println("");
        }

    }

}
