package io.zipcoder;

public class Problem5 {


        public String reverseString(String rawData){
            for(int i = rawData.length()-1; i == 0; i--){
                rawData.replace(rawData.charAt(i), rawData.charAt()).replace(rawData.charAt(), rawData.charAt());
            }
                return rawData;
        }

        public String reverseSrtingWhile(String rawData){
            while(){

            }
            return rawData;
        }


        //This is the easy way why do I have to do it without creating new variables or using ANY built in functions
        //Or using google for a hint to do it without usable criteria
        public String easyReverse(String rawData){
            StringBuilder builder = new StringBuilder(rawData);
            return builder.reverse().toString();
        }

}
