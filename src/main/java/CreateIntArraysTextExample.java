import java.util.Arrays;

public class CreateIntArraysTextExample {

        public boolean isDigit(char c) {
            return c >= '0' && c <= '9';
        }
        public boolean isDigitInString(String str) {
            if (str.length() > 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                        return true;
                    }
                }
            }
            return false;
        }
        public boolean isOnlyDigitsInString(String str) {
            if (str.length() == 0) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                    return false;
                }
            }
            return true;
        }
        public boolean isDotOrComma(char c) {
            return (c == ',' || c == '.');
        }
        public boolean isDotBetweenDigits(String str, int index) {
            return ((index > 0) && (index < str.length() - 1)
                    && isDotOrComma(str.charAt(index))
                    && isDigit(str.charAt(index - 1))
                    && (isDigit(str.charAt(index + 1))));
        }
        public boolean isNegativeNumber(String str, int index) {
            return index < str.length() - 1
                    && str.charAt(index) == '-'
                    && isDigit(str.charAt(index + 1));
        }
        public boolean isIntCanStoreValue(String str) {
            if (str.length() <= 10) {
                return Long.parseLong(str) <= Integer.MAX_VALUE;
            }
            return false;
        }
        //---------------------------------------------------------------------------//
        //Part 2.1 Arrays - task 1
        public int[] createIntArrayFromText(String str) {
            if (str != null && isDigitInString(str)) {
                String bigNumError = ": number is too large and was not included in the sequence.";
                if (isOnlyDigitsInString(str)) {
                    if (isIntCanStoreValue(str)) {
                        return new int[]{Integer.parseInt(str)};
                    } else {
                        System.out.println("\n" + str + bigNumError);
                        return new int[0];
                    }
                }
                String temporaryString = "";
                int resultArrayLength = 0;
                int[] temporaryArray = new int[str.length()];
                for (int i = 0; i < str.length(); i++) {
                    if (isDigit(str.charAt(i)) || isNegativeNumber(str, i)) {
                        temporaryString += str.charAt(i);
                        if (i < str.length() - 1 && !(isNegativeNumber(str, i + 1))) {
                            continue;
                        }
                    }
                    if (temporaryString.length() > 0) {
                        if (isIntCanStoreValue(temporaryString)) {
                            temporaryArray[resultArrayLength++] = Integer.parseInt(temporaryString);
                        } else {
                            System.out.println("\n" + temporaryString + bigNumError);
                        }
                        temporaryString = "";
                    }
                    if (isDotBetweenDigits(str, i)) {
//          работает так же как for ниже:
//                  while (i < str.length() - 1 && utils.isDigit(str.charAt(++i))) {}
                        for (++i; i < str.length() - 1 && isDigit(str.charAt(i)); i++){}
                    }
                }
                int[] resultArray = new int[resultArrayLength];
                System.arraycopy(temporaryArray, 0, resultArray, 0, resultArray.length);
                return resultArray;
            }
            return new int[0];
        }

        public static void main(String[] args) {
            String testData =  "abc -12 23/43 sf++ +234,12 \n 9999999999 2424.3423454542AJDKJE -12,345 #$-42";
            int[] expectedResult = {-12, 23, 43, 234, 2424, -12, -42};
            // actualResult:
            System.out.println(Arrays.toString(new CreateIntArraysTextExample().createIntArrayFromText(testData)));
            //expectedResult :
            System.out.println(Arrays.toString(expectedResult));
        }
    }

