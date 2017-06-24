/**
 * Created by user on 28.05.16.
 */
public class NavalBattleMap {
    public static void main(String[] args) {

        String [][] arr = new String[10][10];

       String [][] String1 = {
               {" ", "A", "B", "C", "D", "E", "F", "G", "H", "I", "K",},
               {"1", "*", "0", "0", "0", "0", "0", "0", "*", "0", "0",},
               {"2", "*", "0", "0", "0", "0", "*", "0", "*", "0", "0",},
               {"3", "*", "0", "0", "0", "0", "0", "0", "0", "0", "*",},
               {"4", "*", "0", "*", "0", "0", "0", "0", "0", "0", "0",},
               {"5", "0", "0", "*", "0", "0", "0", "0", "0", "0", "0",},
               {"6", "0", "0", "*", "0", "0", "0", "0", "0", "0", "0",},
               {"7", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",},
               {"8", "*", "0", "0", "0", "0", "*", "*", "0", "*", "*",},
               {"9", "0", "0", "0", "0", "0", "0", "0", "0", "0", "0",},
               {"10", "*", "0", "0", "*", "*", "*", "*", "0", "0", "0",},
       };



        int[][] NavalBattleMap = {
                {0, 0, 0, 0, 0, 0, 0, 1, 0, 0,},
                {1, 0, 0, 0, 0, 1, 0, 1, 0, 0,},
                {1, 0, 0, 0, 0, 0, 0, 0, 0, 1,},
                {1, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 1, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {1, 0, 0, 0, 0, 1, 1, 0, 1, 1,},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0,},
                {1, 0, 0, 1, 1, 1, 1, 0, 0, 0,}
        };
        System.out.println();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                System.out.print(String1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(NavalBattleMap[i][j] + "\t");
            }
            System.out.println();
        }


    }
    }


