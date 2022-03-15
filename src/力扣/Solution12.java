package 力扣;

/**
 * @Author xqf
 */
//验证回文串
//    islower(char c) 是否为小写字母
//    isupper(char c) 是否为大写字母
//    isdigit(char c) 是否为数字
//    isalpha(char c) 是否为字母
//    isalnum(char c) 是否为字母或者数字
//    toupper(char c) 字母小转大
//    tolower(char c) 字母大转小
//    Character.isLetterOrDigit(s) 如果s是字母或数字此方法返回true，否则为false。


public class Solution12 {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (!Character.isLetterOrDigit(charArray[i])) {
                i++;
            }
            if (!Character.isLetterOrDigit(charArray[j])) {
                j--;
            }
            if ((int) charArray[i] != (int) charArray[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "annf,jddjfnna";
        Solution12 a = new Solution12();
        System.out.println(a.isPalindrome(str));
    }
}
