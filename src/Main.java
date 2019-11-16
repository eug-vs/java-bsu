import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        final String foo = scanner.nextLine();
        System.out.print("Enter delimiters: ");
        final String bar = scanner.nextLine();
        System.out.print("Enter an integer P: ");
        final int P = scanner.nextInt();

        Integer pIndex = null;
        String modified = foo;

        final StringTokenizer tokenizer = new StringTokenizer(foo, bar);
        final int tokensCount = tokenizer.countTokens();
        final Integer[] hexadecimals = new Integer[tokensCount];
        final String[] latinWords = new String[tokensCount];
        int hexIndex = 0;
        int wordIndex = 0;
        int tokenIndex = 0;

        System.out.println("Tokens: ");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            try {
                Integer hex = Integer.parseInt(token, 16);
                hexadecimals[hexIndex] = hex;
                hexIndex++;
                if (hex == P) {
                    pIndex = foo.indexOf(token, tokenIndex);
                }
            } catch ( NumberFormatException exception) {
                boolean isLatin = true;
                for (char character : token.toCharArray()) {
                    isLatin = (character >= 'a' && character <= 'z') || (character >= 'A' && character <= 'Z');
                    if (!isLatin) break;
                }
                if (isLatin) {
                    if (wordIndex == 0) {
                        modified = foo.replace(
                                foo.substring(tokenIndex),
                                foo.substring(tokenIndex).replaceFirst(token, "")
                        );
                    }
                    latinWords[wordIndex] = token;
                    wordIndex++;
                }
            } finally {
                tokenIndex += token.length();
                System.out.println(token);
            }
        }
        modified = modified.concat(Integer.toString(new Random().nextInt()));
        System.out.println("Modified string: ");
        System.out.println(modified);

        System.out.println("Hexadecimals: ");
        for (int i = 0; i < hexIndex; i++) {
            System.out.println(hexadecimals[i]);

        }

        System.out.println("Latin words, which are not hexadecimals: ");
        for (int i = 0; i < wordIndex; i++) {
            System.out.println(latinWords[i]);
        }

        System.out.println(
                (pIndex == null) ?
                        "Number P was not found in the string." :
                        "Position of number P in the string: " + pIndex.toString()
        );
    }
}
