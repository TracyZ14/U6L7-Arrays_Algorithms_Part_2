public class CodingBatProblems
{
    public int[] fizzArray3(int start, int end)
    {
        int[] sequence = new int[end - start];
        for(int i = 0; i < sequence.length; i++)
        {
            sequence[i] = start;
            start++;
        }
        return sequence;
    }

    public boolean isEverywhere(int[] nums, int val)
    {
        boolean firstElement = true;
        for(int i = 0; i < nums.length; i += 2)
        {
            if(nums[i] != val)
            {
                firstElement = false;
            }
        }
        boolean secondElement = true;
        for(int i = 1; i < nums.length; i += 2)
        {
            if(nums[i] != val)
            {
                secondElement = false;
            }
        }
        return(firstElement || secondElement);
    }

    public int centeredAverage(int[] nums)
    {
        int sum = 0;
        int minimum = nums[0];
        int maximum = nums[0];
        for(int number : nums)
        {
            sum += number;
            if(minimum > number)
            {
                minimum = number;
            }
            if(maximum < number)
            {
                maximum = number;
            }
        }
        int average = (sum - (minimum + maximum)) / (nums.length - 2);
        return average;
    }
}