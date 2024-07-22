import java.util.HashSet;

public class Recursion2 {
    public static void towerofHanoi(int n, String source, String helper, String destination) {
        if (n == 1) {
            System.out.println("Transferred disk " + n + " from " + source + " to " + destination + ".");
            return;
        } else {
            towerofHanoi(n - 1, source, destination, helper);
            System.out.println("Transferred disk " + n + " from " + source + " to " + destination + ".");
            towerofHanoi(n - 1, helper, source, destination);

        }
    }

    public static void reverseString(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        reverseString(str, idx - 1);

    }

    public static void firstLastOccurence(String str, char tofind, int idx, int first, int last) {
        if (idx == str.length() - 1) {
            if (str.charAt(idx) == tofind) {
                if (first == -1) {
                    first = idx;
                    System.out.println("The first accurence of " + tofind + " is " + first + " and last is " + last);
                    return;
                } else {
                    last = idx;
                    System.out.println("The first accurence of " + tofind + " is " + first + " and last is " + last);
                    return;
                }
            }
            System.out.println("The first accurence of " + tofind + " is " + first + " and last is " + last);
            return;
        }
        if (str.charAt(idx) == tofind) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        firstLastOccurence(str, tofind, idx + 1, first, last);

    }

    public static boolean isArraySorted(int[] arr, int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] > arr[idx + 1]) {
            return false;
        }
        return isArraySorted(arr, idx + 1);
    }

    public static void setChatAtBack(String str, char c, int idx, String strofc, String newstr) {
        if (idx == str.length() - 1) {
            if (str.charAt(idx) == c) {
                strofc += c;
                newstr += strofc;
                // for (int i = 1; i <= count; i++) {
                // newstr += c;
                // }
                System.out.println(newstr);
                return;
            } else {
                newstr = newstr + str.charAt(idx) + strofc;

                // for (int i = 1; i <= count; i++) {
                // newstr += c;
                // }
                System.out.println(newstr);
                return;
            }
        }
        if (str.charAt(idx) == c) {
            strofc += c;
            setChatAtBack(str, c, idx + 1, strofc, newstr);
        } else {
            newstr += str.charAt(idx);
            setChatAtBack(str, c, idx + 1, strofc, newstr);
        }
    }

    public static void removeDuplicate(String str, int idx, String newstr) {
        if (idx == str.length() - 1) {
            System.out.println(newstr);
            return;
        }

    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newStr) {
        if (idx == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr_char = str.charAt(idx);
        if (map[curr_char - 'a']) {
            removeDuplicates(str, idx + 1, newStr);
        } else {
            newStr += curr_char;
            map[curr_char - 'a'] = true;
            removeDuplicates(str, idx + 1, newStr);
        }
    }

    public static void subsequence(String str, int idx, String newStr, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newStr)) {
                return;
            } else {
                System.out.println(newStr);
                set.add(newStr);
                return;
            }
        }
        char curr_char = str.charAt(idx);
        subsequence(str, idx + 1, newStr + curr_char, set);
        subsequence(str, idx + 1, newStr, set);
    }

    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char current_char = str.charAt(idx);
        String mapping = keypad[current_char - '0'];
        for (int i = 0; i < mapping.length(); i++) {
            printComb(str, idx + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        // towerofHanoi(3, "S", "H", "D");
        // String str = "abcdaahehehddeea";
        // // reverseString(str, str.length() - 1);
        // firstLastOccurence(str, 'a', 0, -1, -1);
        // System.out.println(str.length());
        // int[] arr = { 1, 2, 3, 4, 8, 9, 11, 90, 980, 111 };
        // if (isArraySorted(arr, 0)) {
        // System.out.println("Array is sorted.");
        // } else {
        // System.out.println("Array is not sorted!");
        // }
        String str = "4";
        int idx = 0;
        // char c = 'x';
        // setChatAtBack(str, c, 0, "", "");
        // HashSet<String> hash = new HashSet<>();
        // subsequence(str, idx, "", hash);
        printComb(str, idx, "");
    }
}
