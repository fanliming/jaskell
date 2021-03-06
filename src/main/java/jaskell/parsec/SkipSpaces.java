package jaskell.parsec;

import java.io.CharArrayReader;
import java.io.EOFException;

/**
 * Created by march on 16/9/12.
 * SkipSpaces is a parser skip all spaces.
 */
public class SkipSpaces implements Parsec<Character, Character> {
    private final Parsec<Character, Character> parser = new Skip<>(new Whitespace());
    @Override
    public <Status, Tran, S extends State<Character, Status, Tran>> Character parse(S s)
            throws EOFException, ParsecException {
        return parser.parse(s);
    }
}
