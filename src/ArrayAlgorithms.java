public class ArrayAlgorithms
{
    /**
     * Prints each String in wordList, on its own line, followed by “!”.
     * Does NOT mutate (modify) wordList.
     * PRECONDITION: wordList.length > 0
     *
     * @param wordList original array of Strings; does not get modified
     */
    public static void printExclamation(String[] wordList)
    {
        for(String word : wordList)
        {
            System.out.println(word + "!");
        }
    }

    /** Adds a “!” to the end of each String in wordList (does not print).
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void addExclamation(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i] + "!";
        }
    }

    /** Returns the sum of all values in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find sum
     *  @return  the sum of all numbers in the list
     */
    public static int sum(int[] numList)
    {
        int sum = 0;
        for(int num : numList)
        {
            sum = sum + num;
        }
        return sum;
    }

    /** Returns the average of all values in numList, as a double.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find average
     *  @return  the average of all numbers in the list
     *
     *  Use your sum method for this! (don’t rewrite that logic!)
     */
    public static double average(int[] numList)
    {
        double average = (double) sum(numList) / numList.length;
        return average;
    }

    /** Returns the value in numList that represents the minimum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find minimum
     *  @return  the minimum value in the array
     */
    public static int minimum(int[] numList)
    {
        int minimum = numList[0];
        for(int num : numList)
        {
            if(num < minimum)
            {
                minimum = num;
            }
        }
        return minimum;
    }

    /** Returns the value in numList that represents the maximum value in numList.
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  array of integers to find maximum
     *  @return  the maximum value in the array
     */
    public static int maximum(int[] numList)
    {
        int maximum = numList[0];
        for(int num : numList)
        {
            if(num > maximum)
            {
                maximum = num;
            }
        }
        return maximum;
    }

    /** Multiplies each number in numList by multiplier.
     *  DOES mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers, modified by method
     *  @param multiplier  number to multiply each element in numList
     */
    public static void multiplyBy(int[] numList, int multiplier)
    {
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = numList[i] * multiplier;
        }
    }

    /** Returns a NEW array containing the squares of the elements in the original
     *  numList array, in the same position.
     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of integers to be squared
     *  @return  new array containing squares of the values in numList
     */
    public static int[] squares(int[] numList)
    {
        int[] squares = new int[numList.length];
        for(int i = 0; i < numList.length; i++)
        {
            squares[i] = numList[i] * numList[i];
        }
        return squares;
    }

    /** Switches each boolean value in boolList to its opposite value; true values
     *  becomes false, and false values become true.
     *  DOES mutate (modify) original boolList.
     *  PRECONDITION: boolList.length > 0
     *
     *  @param boolList  original array of booleans, modified by method
     */
    public static void flipBool(boolean[] boolList)
    {
        for(int i = 0; i < boolList.length; i++)
        {
            if(boolList[i])
            {
                boolList[i] = false;
            }
            else
            {
                boolList[i] = true;
            }
        }
    }

    /** Returns a String representing the array of ints as a printable String,
     *  including open and closing brackets, with values separated by commas.
     *  This method should function identically to Arrays.toString()!

     *  Does NOT mutate (modify) original numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints to be represented in String form
     */
    public static String customToString(int[] numList)
    {
        String array = "[";
        for(int i = 0; i < numList.length; i++)
        {
            if(i == (numList.length - 1))
            {
                array = array + numList[i] + "]";
            }
            else
            {
                array = array + numList[i] + ", ";
            }
        }
        return array;
    }

    /** Returns the length of the longest String(s) in an array of Strings.
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  length of the longest String in the array
     */
    public static int longestString(String[] stringList)
    {
        int longestLength = stringList[0].length();
        for(String string : stringList)
        {
            if(string.length() > longestLength)
            {
                longestLength = string.length();
            }
        }
        return longestLength;
    }

    /** Changes all words in an array of words to uppercase.
     *  DOES mutate (modify) original wordList.
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, modified by method
     */
    public static void makeUppercase(String[] wordList)
    {
        for(int i = 0; i < wordList.length; i++)
        {
            wordList[i] = wordList[i].toUpperCase();
        }
    }

    /** Returns true if ANY of the ints in numList are positive, otherwise,
     *  returns false.
     *
     *  Does NOT mutate (modify) numList.
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of ints; does not get modified
     *  @return  true if any element of numList is positive, false otherwise
     */
    public static boolean containsPositive(int[] numList)
    {
        boolean hasPositive = false;
        for(int num : numList)
        {
            if(num > 0)
            {
                hasPositive = true;
            }
        }
        return hasPositive;
    }

    /** Returns true if ANY of the Strings in stringList contain searchStr,
     *  otherwise, returns false. Your method should NOT be case sensitive, e.g.
     *  searching for "ma" should be found in the String "Maddox" and searching
     *  for "MA" should be found in String "mad"
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @param searchStr  the String to search each element of stringList
     *  @return  true if any element of stringList contains searchStr, otherwise
     *           returns false
     */
    public static boolean containsString(String[] stringList, String searchStr)
    {
        boolean hasString = false;
        for(String string : stringList)
        {
            if(string.toUpperCase().contains(searchStr.toUpperCase()))
            {
                hasString = true;
            }
        }
        return hasString;
    }

    /** Returns a NEW array of Strings that contains all words from the original
     *  array of strings in lowercase.
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: wordList.length > 0
     *
     *  @param wordList  original array of Strings, not modified by method
     *  @return  new array of Strings in all lowercase
     */
    public static String[] makeLowercase(String[] wordList)
    {
        String[] lowerCaseWordList = new String[wordList.length];
        for(int i = 0; i < wordList.length; i++)
        {
            lowerCaseWordList[i] = wordList[i].toLowerCase();
        }
        return lowerCaseWordList;
    }

    /** Returns a NEW array of ints that contains the higher value of each pair
     *  of elements at the same index in two other equally-sized arrays of ints
     *  For example, if intArr1 = {2, 5, 6, 1, 0} and intArr2 = {1, 7, 6, -2, 8},
     *  this method returns the array {2, 7, 6, 1, 8}, where each value is the
     *  higher of the two at that respective index in the two original arrays
     *
     *  Does NOT mutate (modify) EITHER array
     *  PRECONDITION: intArr1.length == intArr2.length
     *
     *  @param intArr1  first array of ints
     *  @param intArr2  second array of ints, having the same length as intArr1
     *  @return  new array of ints representing the higher values
     */
    public static int[] arrayMaximums(int[] intArr1, int[] intArr2)
    {
        int[] maximum = new int[intArr1.length];
        for(int i = 0; i < intArr1.length; i++)
        {
            int higherValue = intArr1[i];
            if(intArr2[i] > higherValue)
            {
                higherValue = intArr2[i];
            }
            maximum[i] = higherValue;
        }
        return maximum;
    }

    /** Returns the number of Strings in stringList that have an exclamation point
     *  ("!") at the end.
     *
     *  Does NOT mutate (modify) stringList.
     *  PRECONDITION: stringList.length > 0
     *
     *  @param stringList  original array of Strings; does not get modified
     *  @return  number of Strings in stringList that end in "!"
     */
    public static int endsInExclamations(String[] stringList)
    {
        int exclamationsEndings = 0;
        for(String string : stringList)
        {
            int endIndex = string.length() - 1;
            String lastCharacter = String.valueOf(string.charAt(endIndex));
            if(lastCharacter.equals("!"))
            {
                exclamationsEndings++;
            }
        }
        return exclamationsEndings;
    }

    /** Returns the number of elements in the numList array that have the same
     *  value as the element immediately adjacent to the right in the array.
     *  (BE CAREFUL not to go out of bounds!)
     *  For example, given the array {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *  this method would return 5, since there are five numbers in the array that
     *  are equal to the number immediately to the right (shown below in blue):
     *                    {4, 7, 7, 3, 2, 2, 4, 4, 4, 6, 4, 6, 6}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  number of elements in numList that are equal to the element
     *           adjacent to the right of the element in the array
     */
    public static int countConsecutiveDoubles(int[] numList)
    {
        int consecutiveDoubles = 0;
        for(int i = 0; i < numList.length; i++)
        {
            if(i != (numList.length - 1))
            {
                if(numList[i] == numList[i + 1])
                {
                    consecutiveDoubles++;
                }
            }
        }
        return consecutiveDoubles;
    }

    /** Returns a NEW array that contains all elements of the original numList,
     *  shifted to the left by one index; the first element of the array should
     *  wrap around and appear at the end.
     *  For example, given the array {5, 1, 3, 4, 7}, this method returns the
     *  array {1, 3, 4, 7, 5}
     *
     *  Does NOT mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does not get modified
     *  @return  array with elements in numList shifted by one index left
     */
    public static int[] shiftLeft(int[] numList)
    {
        int[] shiftedLeft = new int[numList.length];
        for(int i = 0; i < numList.length; i++)
        {
            if(i == (numList.length - 1))
            {
                shiftedLeft[i] = numList[0];
            }
            else
            {
                shiftedLeft[i] = numList[i + 1];
            }
        }
        return shiftedLeft;
    }

    public static void shiftLeftModify(int[] numList)
    {
        int[] shiftedLeft = shiftLeft(numList);
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = shiftedLeft[i];
        }
    }

    /** Shifts all elements in numList to the LEFT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The first shiftNum elements of the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {3, 4, 7, 6, 5, 1} (all elements shifted left
     *  two with the first two elements wrapping around to the back)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {7, 6, 5, 1, 3, 4}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumLeftModify(int[] numList, int shiftNum)
    {
        for(int i = 0; i < shiftNum; i++)
        {
            shiftLeftModify(numList);
        }
    }
    public static void shiftNumLeftModify2(int[] numList, int shiftNum)
    {
        int[] shiftedLeft = new int[numList.length];
        int beginning = 0;
        for(int i = 0; i < numList.length; i++)
        {
            if(i >= (numList.length - shiftNum))
            {
                shiftedLeft[i] = numList[beginning];
                beginning++;
            }
            else
            {
                shiftedLeft[i] = numList[i + shiftNum];
            }
        }
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = shiftedLeft[i];
        }
    }

    /** Shifts all elements in numList to the RIGHT shiftNum places;
     *  this method modifies the original array and does not
     *  return anything (void).
     *
     *  The last shiftNum elements of the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6} and shiftNum = 2, this method MODIFIES
     *  the array to {7, 6, 5, 1, 3, 4} (all elements shifted right
     *  two with the last two elements wrapping around to the front)
     *  And given the array {5, 1, 3, 4, 7, 6} and shiftNum = 4,
     *  this method modifies the array to {3, 4, 7, 6, 5, 1}
     *
     *  Assume shiftNum <= numList.length (precondition)
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *  PRECONDITION: shiftNum <= numList.length
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void shiftNumRightModify(int[] numList, int shiftNum)
    {
        int[] shiftedRight = new int[numList.length];
        for(int i = 0; i < shiftNum; i++)
        {
            for(int j = 0; j < numList.length; j++)
            {
                shiftedRight[j] = numList[j];
            }
            for(int j = 0; j < numList.length; j++)
            {
                int beforeShift = numList[j];
                if(j == (numList.length - 1))
                {
                    shiftedRight[0] = beforeShift;
                }
                else
                {
                    shiftedRight[j + 1] = beforeShift;
                }
            }
            for(int j = 0; j < numList.length; j++)
            {
                numList[j] = shiftedRight[j];
            }
        }
    }

    /** Returns a NEW array of ints that contains all elements of numList in
     *  reversed order.  For example, given the array {5, 1, 3, 4, 7, 6}, this
     *  method returns the array {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  Does NOT mutate (modify) original wordList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; does NOT get modified
     *  @return  array of ints that contains numList in reversed order
     */
    public static int[] reverse(int[] numList)
    {
        int[] reversed = new int[numList.length];
        int oppositeIndex = numList.length - 1;
        for(int i = 0; i < numList.length; i++)
        {
            reversed[i] = numList[oppositeIndex];
            oppositeIndex--;
        }
        return reversed;
    }

    /** Reverses all elements in an array; this method modifies
     *  the original array and does not return anything (void).
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  MODIFIES the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  DOES mutate (modify) numList
     *  PRECONDITION: numList.length > 0
     *
     *  @param numList  original array of numbers; DOES get modified
     */
    public static void reverseModify(int[] numList)
    {
        int[] reversed = new int[numList.length];
        int oppositeIndex = numList.length - 1;
        for(int i = 0; i < numList.length; i++)
        {
            reversed[i] = numList[oppositeIndex];
            oppositeIndex--;
        }
        for(int i = 0; i < numList.length; i++)
        {
            numList[i] = reversed[i];
        }
    }
    public static void reverseModify2(int[] numList)
    {
        for(int i = 0; i < (numList.length / 2); i++)
        {
            int original = numList[i];
            int opposite = numList[numList.length - (1 + i)];
            numList[i] = opposite;
            numList[numList.length - (1 + i)] = original;
        }
    }
}