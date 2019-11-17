import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        final String inputPath = "input.txt";
        final String outputPath = "output.txt";

        final BufferedReader reader = new BufferedReader(new FileReader(inputPath));
        final BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath));

        final Pattern validSymbolsPattern= Pattern.compile("^[a-zA-Z\\d_]{8,}$");
        final Pattern containsCapitalLetter = Pattern.compile("^.*[A-Z].*$");
        final Pattern containsLowercaseLetter = Pattern.compile("^.*[a-z].*$");
        final Pattern containsDigitPattern = Pattern.compile("^.*\\d.*$");

        String buffer;
        while ((buffer = reader.readLine()) != null) {
            final boolean match = (
                validSymbolsPattern.matcher(buffer).matches() &&
                containsCapitalLetter.matcher(buffer).matches() &&
                containsLowercaseLetter.matcher(buffer).matches() &&
                containsDigitPattern.matcher(buffer).matches()
            );
            writer.write(buffer + (match ? " - It's a match!" : ""));
            writer.newLine();
        }

        writer.close();
        reader.close();
    }
}
