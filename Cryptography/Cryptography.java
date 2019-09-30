package Cryptography;

public class Cryptography {
    public static void main(String args[]) {

        //System.out.println(modPow(23, 2, 29));


        //Alice prime modulus 
        //Alice generator g
        //Alice secret key AlicePower (unknown)
        //Alice modulus
        /*long p = 24852977L;
        long g = 2744L;
        long modRes = 8414508L;
        long AlicePower = findPower(g, p, modRes);

*/
        long p = 11L;
        long g = 2L;
        long modRes = 8L;
        long AlicePower = findPower(g, p, modRes);
        System.out.println("key "+AlicePower);

        //Bobs cipher
        // c1 = g^y
        //c2 = message*g^AlicePower*BobPower
       /* long c1 = 15268076L;
        long c2 = 743675L;*/

        long c1 = 7L;
        long c2 = 1L;

        //Message =  c2/c1
        //c1Power = p-1-AlicePower
        //now c1 * c1Power % p
        //now to get the message c1Power * c2 % p
        long c1Power = p-1-AlicePower;
        long c1Calculation= modPow(c1, c1Power, p);
        long message = modMult(c1Calculation, c2, p);

        System.out.println(message);

    }

    public static long modPow(long number, long power, long modulus) {
    //raises a number to a power with the given modulus
    //when raising a number to a power, the number quickly becomes too large to handle
    //you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
    //however you want the algorithm to work quickly - having a multiplication loop would result in an O(n) algorithm!
    //the trick is to use recursion - keep breaking the problem down into smaller pieces and use the modMult method to join them back together
        if (power == 0)
            return 1;
        else if (power % 2 == 0) {
            long halfpower = modPow(number, power / 2, modulus);
            return modMult(halfpower, halfpower, modulus);
        } else {
            long halfpower = modPow(number, power / 2, modulus);
            long firstbit = modMult(halfpower, halfpower, modulus);
            return modMult(firstbit, number, modulus);
        }
    }

    public static long modMult(long first, long second, long modulus) {
    //multiplies the first number by the second number with the given modulus
    //a long can have a maximum of 19 digits. Therefore, if you're multiplying two ten digits numbers the usual way, things will go wrong
    //you need to multiply numbers in such a way that the result is consistently moduloed to keep it in the range
    //however you want the algorithm to work quickly - having an addition loop would result in an O(n) algorithm!
    //the trick is to use recursion - keep breaking down the multiplication into smaller pieces and mod each of the pieces individually
        if (second == 0)
            return 0;
        else if (second % 2 == 0) {
            long half = modMult(first, second / 2, modulus);
            return (half + half) % modulus;
        } else {
            long half = modMult(first, second / 2, modulus);
            return (half + half + first) % modulus;
        }
    }

    public static long findPower(long g, long p, long modres) {
        int i = 0;
        while (i < p) {
            long current = modPow(g, i, p);
            if(current==modres) return i;
            i++;
        }
        return 0;
    }
}
