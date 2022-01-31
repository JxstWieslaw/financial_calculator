package ml.codevilla;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        float wieslawPaid = totalPaid("Wieslaw");
        float nenyashaPaid = totalPaid("Nenyasha");
        float seanPaid = totalPaid("Sean");

        seanPaid= seanPaid-seanPaid/3;
        nenyashaPaid= nenyashaPaid-nenyashaPaid/3;
        wieslawPaid= wieslawPaid-wieslawPaid/3;

        float seanBalance = seanPaid;
        float nenyashaBalance = nenyashaPaid;
        float wieslawBalance = wieslawPaid;

        seanPaid = seanPaid - nenyashaBalance/2 -wieslawBalance /2;
        nenyashaPaid = nenyashaPaid - seanBalance/2 - wieslawBalance /2;
        wieslawPaid = wieslawPaid - seanBalance/2 - nenyashaBalance /2;

        float currentBalance=0;
        if( seanPaid==0 && wieslawPaid==0 && nenyashaPaid==0 ){
            System.out.println("Reconciled");//end program.
        }
        else if(seanPaid < 0 && nenyashaPaid<0 ){
            System.out.println("Sean to send : "+ seanPaid*(-1));
            System.out.println("Nenyasha to send : "+ nenyashaPaid*(-1));
            System.out.println("Reconciled"); //end program.
        }
        else{
            if( seanPaid <0 ){
                System.out.println("Sean to send : "+ seanPaid*(-1));
                currentBalance+=(seanPaid*-1);
            }

            if( nenyashaPaid <0 ){
                System.out.println("Nenyasha to send : "+ nenyashaPaid*(-1));
                currentBalance+=(nenyashaPaid*-1);
            }

            if(wieslawPaid<0 ){
                System.out.println("Wieslaw to send : "+ wieslawPaid*(-1));
                currentBalance+=(wieslawPaid*-1);
            }

            if(nenyashaPaid>0){
                System.out.println("Nenyasha to receive : "+  nenyashaPaid);
                currentBalance-= nenyashaPaid;
            }

            if(seanPaid > 0){
                System.out.println("Sean to receive : "+  seanPaid);
                currentBalance-=seanPaid;
            }

            if( wieslawPaid > 0 ){
                System.out.println("Wieslaw to receive : "+  wieslawPaid);
                currentBalance -=wieslawPaid;
            }

            if(currentBalance <=3 && currentBalance>=-3){
                System.out.println("\n****************************************************************");
                System.out.println("Current Balance : "+currentBalance);
                System.out.println("*****Reconciled****");
            }
            else{
                System.out.println("\n****************************************************************");
                System.out.println("Current Balance : "+currentBalance);
                System.out.println("Recheck calculations");
                System.out.println("\n****************************************************************");
            }
        }
    }

    public static float totalPaid(String name){
        Scanner obj = new Scanner(System.in);
        System.out.println("How many entries are there for "+name+" :");
        int entries = obj.nextInt();
        int totalPaid = 0;
        System.out.println("Input payments if any: ");
        for(int i=0;i<entries;i++){
            int paid = obj.nextInt();
            totalPaid+=paid;
        }
        return totalPaid;
    }
}
