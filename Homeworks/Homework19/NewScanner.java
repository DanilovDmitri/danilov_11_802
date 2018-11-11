import java.io.IOException;
import java.io.InputStream;

public class NewScanner {

    private InputStream inputStream;

    NewScanner (InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String nextString () throws IOException {
        StringBuilder string = new StringBuilder();
        int character = readNextExistingSymbol ();
        while (character != -1 && !Character.isWhitespace(character)) {
            string.append((char) character);
            character = inputStream.read();
        }
        return string.toString();
    }

    private int readNextExistingSymbol () throws IOException {
        int character;
        while (true)
         {
            character = inputStream.read();
            if (character == -1) break;
            if (!Character.isWhitespace(character)) break;
        }
        return character;
    }

    public int nextInt () throws IOException {
        String intSymbolFromString = nextString();
        Integer integerS = Integer.parseInt(intSymbolFromString);
        return integerS;
    }

    public double nextDouble () throws IOException {
        String doubleSymbolFromString = nextString();
        Double doubleS = Double.parseDouble (doubleSymbolFromString);
        return doubleS;
    }




}

