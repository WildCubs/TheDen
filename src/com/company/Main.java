package com.company;

import java.util.Random;

public class Main {

    public void invoker() {

        Random izer = new Random;

        int playerPosition = 11;            // needed by scoutRecon
        int enemyPosition = -11;

        boolean isPlayerTurn = true;        // I put it here, maybe the enemy could go first somehow
        boolean moveDirectionLeft = true;   // Can't start behind enemy line

        while (isRunning = true) {

            getMe.scoutRecon                // Returns int to describe distance between troops
            // if isPlayerTurn    // if playerPos > enemyPos, amend output  "in front of you"
            // to any reveal by the scout, else "behind our line"

            // if else isPlayerTurn
            getMe.playerTurn                // outputs a choice of (A)dvance, (R)etreat, Suppressive (F)ire
            // (S)niper Team, or (B)ombing Run

            getMe.computerTurn              // chooses an action (randomly)

            rollDice()                  // returns int between 1-6 to transform into / 2,
            // and %2 == 0, when advancing under Supression.

            getMe.moveTroop                 // called by (A)dvance, (R)etreat and (B)ombing Run choices

            getMe.updateAttritionTable      // if attTableSet = false, initializes and flags true
            // if true, calculates loss(/gain) of ammo and men

            // called  by (R)etreat, Supressive (F)ire and (S)niper Team
            // case R Restore moveTroop * 48 Ammo,
            // case F Spend diceRoll * 24 Ammo, and kill 6-0 enemies 0-6 spaces away
            // case S Spend Ammo = kills * 1.5

            getMe.snipers                       // called by (S)niper Team, depending on distance
            // 90%  80%  70%  60%  50%  40%  30%  20%  10%  chance of first kill
            // 85%  66%  55%  42%  37%  30%  20%  10%   --   - subsequent kills
            // 80%  50%  42%  33%  25%  22%  10%   1%   --    |
            // 75%  33%  30%  22%  12%  11%   2%   --   --    | first check to fail
            // 70%  17%  14%  11%   6%   4%   --   --   --    | breaks the while()
            // 65%   8%   6%   4%   2%   --   --   --   --    |
            // 60%   3%  1.5%  1%   --   --   --   --   --
            // 55%   2%  0.5%  --   --   --   --   --   --


            getMe.BombRaid                      // called by (B)ombing Run


        }


    public int scoutRecon()  {

        /*
            // Let's find out where our boys are....
            // First conditional = Our boys are closest to our home base, both troops scout forward,
            // Second conditional = Both troops are behind each other, scouting backward,
            // relative to their own perspectives

            int enemySpotted;
            // the _Position variable doesn't immediately work to
            // determine scouting range (see below)
            if (playerPosition > enemyPosition && playerPosition + enemyPosition < 3)  {
                // e.g. 1 > -1 & 1 - 1 < 3   true, but false return of 0 distance
                // e.g.-1 > -3 & -1 - 3 < 3  true
                // e.g.-6 > -9 & -6 - 9 < 3  true, all numbers on enemy side are negative and produce bad output

                // What if: add operator to negative positions before calculating?
                // e.g. 1 > -1 & 1 + 1 < 3   true, correct return of 2 distance
                // e.g.-1 > -3 & 1 + 3 < 3   false, unfortunately
                // e.g.-6 > -9 & 6 + 9 < 3   false

                enemySpotted = playerPosition - enemyPosition;
                System.out.println("Recon Intelligence: Enemy spotted at position: " + enemySpotted);

            } else if (playerPosition < enemyPosition && enemyPosition - playerPosition < 4)  {
                enemySpotted = enemyPosition - playerPosition;
                System.out.println("Recon Intelligence: Enemy behind our line, at position: " + enemySpotted);
            } else
                enemySpotted = 20;
            System.out.println("Recon Intelligence: Pending...");

            return enemySpotted;// This int describes the distance to the opponent's troop
                                // I want to return this value, so I can calculate ammo use and deaths.
        */
        }


        public int rollDice  {
            return izer.nextInt(5) +1;

        }

        public static void main (String[]args){
            Main getMe = new Main;
            getMe.invoker();
        }
    }
}
