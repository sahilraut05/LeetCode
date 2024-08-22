class Solution {
    public int romanToInt(String s) {
        int value = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'I'){
                value += 1;
            } else if(ch == 'V'){
                if(i > 0 && s.charAt(i-1) == 'I'){
                    value += 3; 
                } else {
                    value += 5;
                }
            } else if(ch == 'X'){
                if(i > 0 && s.charAt(i-1) == 'I'){
                    value += 8; 
                } else {
                    value += 10;
                }
            } else if(ch == 'L'){
                if(i > 0 && s.charAt(i-1) == 'X'){
                    value += 30;
                } else {
                    value += 50;
                }
            } else if(ch == 'C'){
                if(i > 0 && s.charAt(i-1) == 'X'){
                    value += 80; 
                } else {
                    value += 100;
                }
            } else if(ch == 'D'){
                if(i > 0 && s.charAt(i-1) == 'C'){
                    value += 300;
                } else {
                    value += 500;
                }
            } else if(ch == 'M'){
                if(i > 0 && s.charAt(i-1) == 'C'){
                    value += 800;
                } else {
                    value += 1000;
                }
            } else {
                return -1;
            }
        }
        return value;
    }
}
