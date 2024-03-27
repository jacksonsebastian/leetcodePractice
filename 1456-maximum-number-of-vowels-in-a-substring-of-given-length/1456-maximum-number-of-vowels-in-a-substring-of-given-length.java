class Solution {
    public int maxVowels(String input, int k) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a', 'e', 'i', 'o','u','A','E','I','O','U'));

        int maxVowels = 0;
        int currentVowelCount = 0;
        for(int index = 0; index<input.length();index++) {
            if(index<k) {
                if(vowels.contains(input.charAt(index))) {
                    currentVowelCount++;
                }
            } else {
                if(vowels.contains(input.charAt(index))) {
                    currentVowelCount++;
                }

                if(vowels.contains(input.charAt(index-k))) {
                    currentVowelCount--;
                }

            }
            maxVowels = Math.max(maxVowels, currentVowelCount);
        }

        return maxVowels;
    }
}