package Game;

import java.util.Scanner;

public class PlayerMove {

    public int playerMove(int PLnumber, int playerMoney,int highestBid){
        int Input = 0;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Player number "+PLnumber+",what you want to do?");
        System.out.println("1-FOLD , 2-CALL , 3-RAISE");
        Input = userInput.nextInt();
        Poker poker = new Poker();

        switch (Input){
            case 1:

                return -1;


            case 2:
                if(highestBid == 0){
                    Input = 10;
                }

                else if(highestBid<playerMoney){
                    Input = highestBid;
                }
                else if(highestBid >= playerMoney){
                    Input = playerMoney;
            }
                return Input;


            case 3:
                System.out.println("Your money "+playerMoney);
                System.out.println("select how much you want to raise: ");
                Input = userInput.nextInt();

                if(playerMoney < Input){
                    System.out.println("All-in. Your bid is "+playerMoney);
                    Input = playerMoney;
                }

                poker.setMoneyOnTable(Input);
                return Input;


                default:
                    return -1;

        }

    }
}
