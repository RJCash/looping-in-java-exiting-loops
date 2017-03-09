package com.theironyard;

/**
 * For this exercise you will write a simple main() method that prints out the
 * following text:
 *
 * 1
 * 2 2
 * 4 4 4 4
 * 5 5
 * 6 6 6 6 6 6
 *
 * Note the following facts:
 *
 * - 3 is not output at all
 * - 5 is only output twice
 * - You are required use nested for loops (not while loops)
 * - You will need to use both the "break" and continue "keywords"
 * - Each number is followed by a space. EG: 2_2_, not 2_2.
 *
 * The test is picky about formatting so make sure you get it right. Ask
 * questions if something is unclear.
 *
 */
public class Main {

    public static void main(String[] args) {

        for(int x = 1; x <= 6; x++){
            if(x == 3){
                continue;
            }
            if(x != 1){
            System.out.println();
            }
            if(x > 6){
                break;
            }
            for(int y = 1; y <= x; y++){
                if( x == 5 && y > 2 ){
                    continue;
                }
                System.out.print(x + " ");

            }


        }
        System.out.println();

    }
        /* Output the following text:
            1
            2 2
            4 4 4 4
            5 5
            6 6 6 6 6 6
         */
        // todo: output the expected text


    }


