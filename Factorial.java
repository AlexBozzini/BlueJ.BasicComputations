 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger fact = new BigInteger("1");
        for (Integer i = 1; i <= value; i++){
        fact = fact.multiply(BigInteger.valueOf(i));
    }
return fact;
}
}
