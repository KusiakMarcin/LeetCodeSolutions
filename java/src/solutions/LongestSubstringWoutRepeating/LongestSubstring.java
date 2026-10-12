package solutions.LongestSubstringWoutRepeating;

public class LongestSubstring {


    private int [] table;
    int counter,highest;
    public int lengthOfLongestSubstring(String s) {

        table = new int[256];
        counter = 0; highest = 0;
        byte [] stringBytes = s.getBytes();
        for(int i =0; i<stringBytes.length;i++)
        {
            if(table[stringBytes[i]]!=0)
            {
                counter = 0;
                i = table[stringBytes[i]];
                table = new int[256];

            }

            table[stringBytes[i]] = i+1;
            counter++;
            if(highest<counter) highest = counter;

        }

        return highest;
    }

}
