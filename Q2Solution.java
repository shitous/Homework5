
public class Solution {
	public int coinChange(int[] coins, int amount) {
		
        int numCoin = 0, i = coins.length - 1;
        while (amount > 0 && i >= 0) {
            if (amount >= coins[i]) {
                amount -= coins[i];
                numCoin++;
            } else {
                i--;
            }
        }

        if (amount != 0) {
            return -1;
        } 
        else
        {
            return numCoin;
        }
        
    }

}


