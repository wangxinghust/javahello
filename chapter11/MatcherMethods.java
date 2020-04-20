import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherMethods {
    public static void main(String[] args) {
        String sentence = "a man a plan a canal panama";
        System.out.printf("语句：%s%n", sentence);
        Pattern pattern = Pattern.compile("an");
        Matcher matcher = pattern.matcher(sentence);
        // 重建字符串
        StringBuilder builder = new StringBuilder();
        while (matcher.find()) {
            matcher.appendReplacement(
                    builder, matcher.group().toUpperCase());
        }
        // 将最后一次匹配后剩余的字符串添加到builder对象中
        matcher.appendTail(builder);
        System.out.printf("%n使用appendReplacement/appendTail处理后：%s%n", builder);
        matcher.reset(); // 重置匹配为初始状态
        System.out.printf("%n使用replaceFirst处理前：%s%n", sentence);
        String result = matcher.replaceFirst(m -> m.group().toUpperCase());
        System.out.printf("%n使用replaceFirst处理后：%s%n", result);
        matcher.reset();// 重置匹配为初始状态
        System.out.printf("%n使用replaceAll处理前：%s%n", sentence);
        result = matcher.replaceAll(m -> m.group().toUpperCase());
        System.out.printf("%n使用replaceAll处理后：%s%n", result);
        // 获取MatchResult流
        System.out.printf("%n使用方法results()处理：%n");
        pattern = Pattern.compile("\\w+");
        matcher = pattern.matcher(sentence);
        System.out.printf("统计单词个数为：%d%n", matcher.results().count());
        matcher.reset();// 重置匹配为初始状态
        System.out.printf("平均每个单词的长度：%f%n", matcher.results().mapToInt(m -> m.group().length()).average().orElse(0));
    }
}
