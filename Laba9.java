class Laba9 {
    public int zadanie8(String text) {
        int answer = 0;
        for (String sentence : text.split(" ")) {
            boolean isNumber =true;
            for (char character : sentence.toLowerCase().toCharArray()) {
                if (character < 48 || character > 57) {
                    isNumber = false;
                    break;
                }
            }
            if (isNumber){
                answer++;
            }
        }
        return answer;
    }
    public int octStringToInt (String s) {
        String[] numbersS = s.split("");
        int[] numbers = new int[s.length()];
        int result = 0;
        try {
            for (int x =0; x < s.length(); x++) {
                numbers[x] = Integer.parseInt(numbersS[x]);
                if (numbers[x]>8 || numbers[x]<0) {
                    throw new Exception("Число не у вісімковій системі числення.");
                }
            }
            for (int x = 0; x < numbers.length; x++) {
                result+=numbers[x]*Math.pow(8,numbers.length-1-x);
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return -1;
    }
}
