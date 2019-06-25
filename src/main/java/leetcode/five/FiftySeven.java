package leetcode.five;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序
 */
public class FiftySeven {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for (String ss : strs) {
            for (int i = ss.length() - 1; i > -1; i--) {
                sb.append(ss.charAt(i));
            }
            sb.append(" ");
        }
        return sb.substring(0, s.length());
    }
}
