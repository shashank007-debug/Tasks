public class CheckArmstrong {
    public boolean isArmstrong(int num){
        int original = num;
        int result = 0;
        int digit = 0;
        while(num != 0){
            digit = num % 10;
            result +=( digit * digit * digit);
            // result += (digit*10)
            num /= 10;

        }
        return (original == result);

    }
}
