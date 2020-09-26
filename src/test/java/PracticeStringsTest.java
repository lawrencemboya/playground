import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PracticeStringsTest {

    PracticeStrings practiceString = new PracticeStrings();

    @Test
    public void helloName() {
        assertEquals("Input: helloName(\"Bob\")", "Hello Bob!", practiceString.helloName("Bob"));
        assertEquals("Input: helloName(\"Alice\")", "Hello Alice!", practiceString.helloName("Alice"));
        assertEquals("Input: helloName(\"X\")", "Hello X!", practiceString.helloName("X"));
        assertEquals("Input: helloName(\"Dolly\")", "Hello Dolly!", practiceString.helloName("Dolly"));
        assertEquals("Input: helloName(\"Alpha\")", "Hello Alpha!", practiceString.helloName("Alpha"));
        assertEquals("Input: helloName(\"Omega\")", "Hello Omega!", practiceString.helloName("Omega"));
        assertEquals("Input: helloName(\"Goodbye\")", "Hello Goodbye!", practiceString.helloName("Goodbye"));
        assertEquals("Input: helloName(\"ho ho ho\")", "Hello ho ho ho!", practiceString.helloName("ho ho ho"));
        assertEquals("Input: helloName(\"xyz\")", "Hello xyz!", practiceString.helloName("xyz"));
        assertEquals("Input: helloName(\"Hello\")", "Hello Hello!", practiceString.helloName("Hello"));
    }

    @Test
    public void makeAbba() {
        assertEquals("Input: makeAbba(\"Hi\", \"Bye\")", "HiByeByeHi", practiceString.makeAbba("Hi", "Bye"));
        assertEquals("Input: makeAbba(\"Yo\", \"Alice\")", "YoAliceAliceYo", practiceString.makeAbba("Yo", "Alice"));
        assertEquals("Input: makeAbba(\"What\", \"Up\")", "WhatUpUpWhat", practiceString.makeAbba("What", "Up"));
        assertEquals("Input: makeAbba(\"aaa\", \"bbb\")", "aaabbbbbbaaa", practiceString.makeAbba("aaa", "bbb"));
        assertEquals("Input: makeAbba(\"x\", \"y\")", "xyyx", practiceString.makeAbba("x", "y"));
        assertEquals("Input: makeAbba(\"x\", \"\")", "xx", practiceString.makeAbba("x", ""));
        assertEquals("Input: makeAbba(\"\", \"y\")", "yy", practiceString.makeAbba("", "y"));
        assertEquals("Input: makeAbba(\"Bo\", \"Ya\")", "BoYaYaBo", practiceString.makeAbba("Bo", "Ya"));
        assertEquals("Input: makeAbba(\"Ya\", \"Ya\")", "YaYaYaYa", practiceString.makeAbba("Ya", "Ya"));
    }

    @Test
    public void makeTags() {
        assertEquals("Input: makeTags(\"i\", \"Yay\")", "<i>Yay</i>", practiceString.makeTags("i", "Yay"));
        assertEquals("Input: makeTags(\"i\", \"Hello\")", "<i>Hello</i>", practiceString.makeTags("i", "Hello"));
        assertEquals("Input: makeTags(\"cite\", \"Yay\")", "<cite>Yay</cite>", practiceString.makeTags("cite", "Yay"));
        assertEquals("Input: makeTags(\"address\", \"here\")", "<address>here</address>", practiceString.makeTags("address", "here"));
        assertEquals("Input: makeTags(\"body\", \"Heart\")", "<body>Heart</body>", practiceString.makeTags("body", "Heart"));
        assertEquals("Input: makeTags(\"i\", \"i\")", "<i>i</i>", practiceString.makeTags("i", "i"));
        assertEquals("Input: makeTags(\"i\", \"\")", "<i></i>", practiceString.makeTags("i", ""));
    }

    @Test
    public void makeOutWord() {
        assertEquals("Input: makeOutWord(\"<<>>\", \"Yay\")", "<<Yay>>", practiceString.makeOutWord("<<>>", "Yay"));
        assertEquals("Input: makeOutWord(\"<<>>\", \"WooHoo\")", "<<WooHoo>>", practiceString.makeOutWord("<<>>", "WooHoo"));
        assertEquals("Input: makeOutWord(\"[[]]\", \"word\")", "[[word]]", practiceString.makeOutWord("[[]]", "word"));
        assertEquals("Input: makeOutWord(\"HHoo\", \"Hello\")", "HHHellooo", practiceString.makeOutWord("HHoo", "Hello"));
        assertEquals("Input: makeOutWord(\"abyz\", \"YAY\")", "abYAYyz", practiceString.makeOutWord("abyz", "YAY"));
    }

    @Test
    public void extraEnd() {
        assertEquals("Input: extraEnd(\"Hello\")", "lololo", practiceString.extraEnd("Hello"));
        assertEquals("Input: extraEnd(\"ab\")", "ababab", practiceString.extraEnd("ab"));
        assertEquals("Input: extraEnd(\"Hi\")", "HiHiHi", practiceString.extraEnd("Hi"));
        assertEquals("Input: extraEnd(\"Candy\")", "dydydy", practiceString.extraEnd("Candy"));
        assertEquals("Input: extraEnd(\"Code\")", "dedede", practiceString.extraEnd("Code"));
    }

    @Test
    public void firstTwo() {
        assertEquals("Input: firstTwo(\"Hello\")", "He", practiceString.firstTwo("Hello"));
        assertEquals("Input: firstTwo(\"abcdefg\")", "ab", practiceString.firstTwo("abcdefg"));
        assertEquals("Input: firstTwo(\"ab\")", "ab", practiceString.firstTwo("ab"));
        assertEquals("Input: firstTwo(\"a\")", "a", practiceString.firstTwo("a"));
        assertEquals("Input: firstTwo(\"\")", "", practiceString.firstTwo(""));
        assertEquals("Input: firstTwo(\"Kitten\")", "Ki", practiceString.firstTwo("Kitten"));
        assertEquals("Input: firstTwo(\"hi\")", "hi", practiceString.firstTwo("hi"));
        assertEquals("Input: firstTwo(\"hiya\")", "hi", practiceString.firstTwo("hiya"));
    }

    @Test
    public void firstHalf() {
        assertEquals("Input: firstHalf(\"WooHoo\")", "Woo", practiceString.firstHalf("WooHoo"));
        assertEquals("Input: firstHalf(\"HelloThere\")", "Hello", practiceString.firstHalf("HelloThere"));
        assertEquals("Input: firstHalf(\"abcdef\")", "abc", practiceString.firstHalf("abcdef"));
        assertEquals("Input: firstHalf(\"ab\")", "a", practiceString.firstHalf("ab"));
        assertEquals("Input: firstHalf(\"\")", "", practiceString.firstHalf(""));
        assertEquals("Input: firstHalf(\"0123456789\")", "01234", practiceString.firstHalf("0123456789"));
        assertEquals("Input: firstHalf(\"kitten\")", "kit", practiceString.firstHalf("kitten"));
    }

    @Test
    public void withoutEnd() {
        assertEquals("Input: withoutEnd(\"Hello\")", "ell", practiceString.withoutEnd("Hello"));
        assertEquals("Input: withoutEnd(\"java\")", "av", practiceString.withoutEnd("java"));
        assertEquals("Input: withoutEnd(\"coding\")", "odin", practiceString.withoutEnd("coding"));
        assertEquals("Input: withoutEnd(\"code\")", "od", practiceString.withoutEnd("code"));
        assertEquals("Input: withoutEnd(\"Chocolate!\")", "hocolate", practiceString.withoutEnd("Chocolate!"));
        assertEquals("Input: withoutEnd(\"coding\")", "odin", practiceString.withoutEnd("coding"));
        assertEquals("Input: withoutEnd(\"kitten\")", "itte", practiceString.withoutEnd("kitten"));
        assertEquals("Input: withoutEnd(\"woohoo\")", "ooho", practiceString.withoutEnd("woohoo"));
    }

    @Test
    public void comboString() {
        assertEquals("Input: comboString(\"Hello\", \"hi\")", "hiHellohi", practiceString.comboString("Hello", "hi"));
        assertEquals("Input: comboString(\"hi\", \"Hello\")", "hiHellohi", practiceString.comboString("hi", "Hello"));
        assertEquals("Input: comboString(\"aaa\", \"b\")", "baaab", practiceString.comboString("aaa", "b"));
        assertEquals("Input: comboString(\"b\", \"aaa\")", "baaab", practiceString.comboString("b", "aaa"));
        assertEquals("Input: comboString(\"aaa\", \"\")", "aaa", practiceString.comboString("aaa", ""));
        assertEquals("Input: comboString(\"\", \"bb\")", "bb", practiceString.comboString("", "bb"));
        assertEquals("Input: comboString(\"aaa\", \"1234\")", "aaa1234aaa", practiceString.comboString("aaa", "1234"));
        assertEquals("Input: comboString(\"aaa\", \"bb\")", "bbaaabb", practiceString.comboString("aaa", "bb"));
        assertEquals("Input: comboString(\"a\", \"bb\")", "abba", practiceString.comboString("a", "bb"));
        assertEquals("Input: comboString(\"bb\", \"a\")", "abba", practiceString.comboString("bb", "a"));
        assertEquals("Input: comboString(\"xyz\", \"ab\")", "abxyzab", practiceString.comboString("xyz", "ab"));
    }

    @Test
    public void nonStart() {
        assertEquals("Input: nonStart(\"Hello\", \"There\")", "ellohere", practiceString.nonStart("Hello", "There"));
        assertEquals("Input: nonStart(\"java\", \"code\")", "avaode", practiceString.nonStart("java", "code"));
        assertEquals("Input: nonStart(\"shotl\", \"java\")", "hotlava", practiceString.nonStart("shotl", "java"));
        assertEquals("Input: nonStart(\"ab\", \"xy\")", "by", practiceString.nonStart("ab", "xy"));
        assertEquals("Input: nonStart(\"ab\", \"x\")", "b", practiceString.nonStart("ab", "x"));
        assertEquals("Input: nonStart(\"x\", \"ac\")", "c", practiceString.nonStart("x", "ac"));
        assertEquals("Input: nonStart(\"a\", \"x\")", "", practiceString.nonStart("a", "x"));
        assertEquals("Input: nonStart(\"kit\", \"kat\")", "itat", practiceString. nonStart("kit", "kat"));
        assertEquals("Input: nonStart(\"mart\", \"dart\")", "artart", practiceString.nonStart("mart", "dart"));
    }

    @Test
    public void left2() {
        assertEquals("Input: left2(\"Hello\")", "lloHe", practiceString.left2("Hello"));
        assertEquals("Input: left2(\"java\")", "vaja", practiceString.left2("java"));
        assertEquals("Input: left2(\"Hi\")", "Hi", practiceString.left2("Hi"));
        assertEquals("Input: left2(\"code\")", "deco", practiceString.left2("code"));
        assertEquals("Input: left2(\"cat\")", "tca", practiceString.left2("cat"));
        assertEquals("Input: left2(\"12345\")", "34512", practiceString.left2("12345"));
        assertEquals("Input: left2(\"Chocolate\")", "ocolateCh", practiceString.left2("Chocolate"));
        assertEquals("Input: left2(\"bricks\")", "icksbr", practiceString.left2("bricks"));
    }

    @Test
    public void right2() {
        assertEquals("Input: right2(\"Hello\")", "loHel", practiceString.right2("Hello"));
        assertEquals("Input: right2(\"java\")", "vaja", practiceString.right2("java"));
        assertEquals("Input: right2(\"Hi\")", "Hi", practiceString.right2("Hi"));
        assertEquals("Input: right2(\"code\")", "deco", practiceString.right2("code"));
        assertEquals("Input: right2(\"cat\")", "atc", practiceString.right2("cat"));
        assertEquals("Input: right2(\"12345\")", "45123", practiceString.right2("12345"));
    }

    @Test
    public void theEnd() {
        assertEquals("Input: theEnd(\"Hello\", true)", "H", practiceString.theEnd("Hello", true));
        assertEquals("Input: theEnd(\"Hello\", false)", "o", practiceString.theEnd("Hello", false));
        assertEquals("Input: theEnd(\"oh\", true)", "o", practiceString.theEnd("oh", true));
        assertEquals("Input: theEnd(\"oh\", false)", "h", practiceString.theEnd("oh", false));
        assertEquals("Input: theEnd(\"x\", true)", "x", practiceString.theEnd("x", true));
        assertEquals("Input: theEnd(\"x\", false)", "x", practiceString.theEnd("x", false));
        assertEquals("Input: theEnd(\"java\", true)", "j", practiceString.theEnd("java", true));
        assertEquals("Input: theEnd(\"chocolate\", false)", "e", practiceString.theEnd("chocolate", false));
        assertEquals("Input: theEnd(\"1234\", true)", "1", practiceString.theEnd("1234", true));
        assertEquals("Input: theEnd(\"code\", false)", "e", practiceString.theEnd("code", false));
    }

    @Test
    public void withouEnd2() {
        assertEquals("Input:withouEnd2(\"Hello\") ", "ell", practiceString.withouEnd2("Hello"));
        assertEquals("Input: withouEnd2(\"abc\")", "b", practiceString.withouEnd2("abc"));
        assertEquals("Input: withouEnd2(\"ab\")", "", practiceString.withouEnd2("ab"));
        assertEquals("Input: withouEnd2(\"a\")", "", practiceString.withouEnd2("a"));
        assertEquals("Input: withouEnd2(\"\"))", "", practiceString.withouEnd2(""));
        assertEquals("Input: withouEnd2(\"coldy\")", "old", practiceString.withouEnd2("coldy"));
        assertEquals("Input: withouEnd2(\"java code\")", "ava cod", practiceString.withouEnd2("java code"));
    }

    @Test
    public void middleTwo() {
        assertEquals("Input: middleTwo(\"string\")", "ri", practiceString.middleTwo("string"));
        assertEquals("Input: middleTwo(\"code\")", "od", practiceString.middleTwo("code"));
        assertEquals("Input: middleTwo(\"Practice\")", "ct", practiceString.middleTwo("Practice"));
        assertEquals("Input: middleTwo(\"ab\")", "ab", practiceString.middleTwo("ab"));
        assertEquals("Input: middleTwo(\"0123456789\")", "45", practiceString.middleTwo("0123456789"));
    }

    @Test
    public void endsLy() {
        assertEquals("Input: endsLy(\"oddly\")", true, practiceString.endsLy("oddly"));
        assertEquals("Input: endsLy(\"y\")", false, practiceString.endsLy("y"));
        assertEquals("Input: endsLy(\"oddy\")", false, practiceString.endsLy("oddy"));
        assertEquals("Input: endsLy(\"oddl\")", false, practiceString.endsLy("oddl"));
        assertEquals("Input: endsLy(\"olydd\")", false, practiceString.endsLy("olydd"));
        assertEquals("Input: endsLy(\"ly\")", true, practiceString.endsLy("ly"));
        assertEquals("Input: endsLy(\"\")", false, practiceString.endsLy(""));
        assertEquals("Input: endsLy(\"falsey\")", false, practiceString.endsLy("falsey"));
        assertEquals("Input: endsLy(\"evenly\")", true, practiceString.endsLy("evenly"));
    }

    @Test
    public void nTwice() {
        assertEquals("Input: nTwice(\"Hello\", 2)", "Helo", practiceString.nTwice("Hello", 2));
        assertEquals("Input: nTwice(\"Chocolate\", 3)", "Choate", practiceString.nTwice("Chocolate", 3));
        assertEquals("Input: nTwice(\"Chocolate\", 1)", "Ce", practiceString.nTwice("Chocolate", 1));
        assertEquals("Input: Twice(\"Chocolate\", 0)", "", practiceString.nTwice("Chocolate", 0));
        assertEquals("Input: nTwice(\"Hello\", 4)", "Hellello", practiceString.nTwice("Hello", 4));
        assertEquals("Input: nTwice(\"Code\", 4)", "CodeCode", practiceString.nTwice("Code", 4));
        assertEquals("Input: nTwice(\"Code\", 2)", "Code", practiceString.nTwice("Code", 2));
    }

    @Test
    public void twoChar() {
        assertEquals("Input: twoChar(\"java\", 0)", "ja", practiceString.twoChar("java", 0));
        assertEquals("Input: twoChar(\"java\", 2)", "va", practiceString.twoChar("java", 2));
        assertEquals("Input: twoChar(\"java\", 3)", "ja", practiceString.twoChar("java", 3));
        assertEquals("Input: twoChar(\"java\", 4)", "ja", practiceString.twoChar("java", 4));
        assertEquals("Input: twoChar(\"java\", -1)", "ja", practiceString.twoChar("java", -1));
        assertEquals("Input: twoChar(\"Hello\", 0)", "He", practiceString.twoChar("Hello", 0));
        assertEquals("Input: twoChar(\"Hello\", 1)", "el", practiceString.twoChar("Hello", 1));
        assertEquals("Input: twoChar(\"Hello\", 99)", "He", practiceString.twoChar("Hello", 99));
        assertEquals("Input: twoChar(\"Hello\", 3)", "lo", practiceString.twoChar("Hello", 3));
        assertEquals("Input: twoChar(\"Hello\", 4)", "He", practiceString.twoChar("Hello", 4));
        assertEquals("Input: twoChar(\"Hello\", 5)", "He", practiceString.twoChar("Hello", 5));
        assertEquals("Input: twoChar(\"Hello\", -7)", "He", practiceString.twoChar("Hello", -7));
        assertEquals("Input: twoChar(\"Hello\", 6)", "He", practiceString.twoChar("Hello", 6));
        assertEquals("Input: twoChar(\"Hello\", -1)", "He", practiceString.twoChar("Hello", -1));
        assertEquals("Input: twoChar(\"yay\", 0)", "ya", practiceString.twoChar("yay", 0));
    }

    @Test
    public void middleThree() {
        assertEquals("Input: middleThree(\"Candy\")", "and", practiceString.middleThree("Candy"));
        assertEquals("Input: middleThree(\"and\")", "and", practiceString.middleThree("and"));
        assertEquals("Input: middleThree(\"solving\")", "lvi", practiceString.middleThree("solving"));
        assertEquals("Input: middleThree(\"Hi yet Hi\")", "yet", practiceString.middleThree("Hi yet Hi"));
        assertEquals("Input: middleThree(\"java yet java\")", "yet", practiceString.middleThree("java yet java"));
        assertEquals("Input: middleThree(\"Chocolate\")", "col", practiceString.middleThree("Chocolate"));
        assertEquals("Input: middleThree(\"XabcxyzabcX\")", "xyz", practiceString.middleThree("XabcxyzabcX"));
    }

    @Test
    public void hasBad() {
        assertEquals("Input: hasBad(\"badxx\")", true, practiceString.hasBad("badxx"));
        assertEquals("Input: hasBad(\"xbadxx\")", true, practiceString.hasBad("xbadxx"));
        assertEquals("Input: hasBad(\"xxbadxx\")", false, practiceString.hasBad("xxbadxx"));
        assertEquals("Input: hasBad(\"code\")", false, practiceString.hasBad("code"));
        assertEquals("Input: hasBad(\"bad\")", true, practiceString.hasBad("bad"));
        assertEquals("Input: hasBad(\"ba\")", false, practiceString.hasBad("ba"));
        assertEquals("Input: hasBad(\"xba\")", false, practiceString.hasBad("xba"));
        assertEquals("Input: hasBad(\"xbad\")", true, practiceString.hasBad("xbad"));
        assertEquals("Input: hasBad(\"\")", false, practiceString.hasBad(""));
        assertEquals("Input: hasBad(\"badyy\")", true, practiceString.hasBad("badyy"));
    }

    @Test
    public void stringTimes() {
        assertEquals("Input: stringTimes(\"Hi\", 2)", "HiHi", practiceString.stringTimes("Hi", 2));
        assertEquals("Input: stringTimes(\"Hi\", 3)", "HiHiHi", practiceString.stringTimes("Hi", 3));
        assertEquals("Input: stringTimes(\"Hi\", 1)", "Hi", practiceString.stringTimes("Hi", 1));
        assertEquals("Input: stringTimes(\"Hi\", 0)", "", practiceString.stringTimes("Hi", 0));
        assertEquals("Input: stringTimes(\"Hi\", 5)", "HiHiHiHiHi", practiceString.stringTimes("Hi", 5));
        assertEquals("Input: stringTimes(\"Oh Boy!\", 2)", "Oh Boy!Oh Boy!", practiceString.stringTimes("Oh Boy!", 2));
        assertEquals("Input: stringTimes(\"x\", 4)", "xxxx", practiceString.stringTimes("x", 4));
        assertEquals("Input: stringTimes(\"\", 4)", "", practiceString.stringTimes("", 4));
        assertEquals("Input: stringTimes(\"code\", 2)", "codecode", practiceString.stringTimes("code", 2));
        assertEquals("Input: stringTimes(\"code\", 3)", "codecodecode", practiceString.stringTimes("code", 3));
    }

    @Test
    public void frontTimes() {
        assertEquals("Input: frontTimes(\"Chocolate\", 2)", "ChoCho", practiceString.frontTimes("Chocolate", 2));
        assertEquals("Input: frontTimes(\"Chocolate\", 3)", "ChoChoCho", practiceString.frontTimes("Chocolate", 3));
        assertEquals("Input: frontTimes(\"Abc\", 3)", "AbcAbcAbc", practiceString.frontTimes("Abc", 3));
        assertEquals("Input: frontTimes(\"Ab\", 4)", "AbAbAbAb", practiceString.frontTimes("Ab", 4));
        assertEquals("Input: frontTimes(\"A\", 4)", "AAAA", practiceString.frontTimes("A", 4));
        assertEquals("Input: frontTimes(\"\", 4)", "", practiceString.frontTimes("", 4));
        assertEquals("Input: frontTimes(\"Abc\", 0)", "", practiceString.frontTimes("Abc", 0));
    }

    @Test
    public void countXX() {
        assertEquals("Input: countXX(\"abcxx\")", 1, practiceString.countXX("abcxx"));
        assertEquals("Input: countXX(\"xxx\")", 2, practiceString.countXX("xxx"));
        assertEquals("Input: countXX(\"xxxx\")", 3, practiceString.countXX("xxxx"));
        assertEquals("Input: countXX(\"\")", 0, practiceString.countXX(""));
        assertEquals("Input: countXX(\"Hello there\")", 0, practiceString.countXX("Hello there"));
        assertEquals("Input: countXX(\"Hexxo thxxe\")", 2, practiceString.countXX("Hexxo thxxe"));
        assertEquals("Input: countXX(\"\")", 0, practiceString.countXX(""));
        assertEquals("Input: countXX(\"Kittens\")", 0, practiceString.countXX("Kittens"));
        assertEquals("Input: countXX(\"Kittensxxx\")", 2, practiceString.countXX("Kittensxxx"));
    }

    @Test
    public void doubleX() {
        assertEquals("Input: doubleX(\"axxbb\")", true, practiceString.doubleX("axxbb"));
        assertEquals("Input: doubleX(\"axaxax\")", false, practiceString.doubleX("axaxax"));
        assertEquals("Input: doubleX(\"xxxxx\")", true, practiceString.doubleX("xxxxx"));
        assertEquals("Input: doubleX(\"xaxxx\")", false, practiceString.doubleX("xaxxx"));
        assertEquals("Input: doubleX(\"aaaax\")", false, practiceString.doubleX("aaaax"));
        assertEquals("Input: doubleX(\"\")", false, practiceString.doubleX(""));
        assertEquals("Input: doubleX(\"abc\")", false, practiceString.doubleX("abc"));
        assertEquals("Input: doubleX(\"x\")", false, practiceString.doubleX("x"));
        assertEquals("Input: doubleX(\"xx\")", true, practiceString.doubleX("xx"));
        assertEquals("Input: doubleX(\"xax\")", false, practiceString.doubleX("xax"));
        assertEquals("Input: doubleX(\"xaxx\")", false, practiceString.doubleX("xaxx"));
    }

    @Test
    public void stringBits() {
        assertEquals("Input: stringBits(\"Hello\")", "Hlo", practiceString.stringBits("Hello"));
        assertEquals("Input: stringBits(\"Hi\")", "H", practiceString.stringBits("Hi"));
        assertEquals("Input: stringBits(\"Heeololeo\")", "Hello", practiceString.stringBits("Heeololeo"));
        assertEquals("Input: stringBits(\"HiHiHi\")", "HHH", practiceString.stringBits("HiHiHi"));
        assertEquals("Input: stringBits(\"\")", "", practiceString.stringBits(""));
        assertEquals("Input: stringBits(\"Greetings\")", "Getns", practiceString.stringBits("Greetings"));
        assertEquals("Input: stringBits(\"Chocoate\")", "Coot", practiceString.stringBits("Chocoate"));
        assertEquals("Input: stringBits(\"pi\")", "p", practiceString.stringBits("pi"));
        assertEquals("Input: stringBits(\"Hello Kitten\")", "HloKte", practiceString.stringBits("Hello Kitten"));
        assertEquals("Input: stringBits(\"hxaxpxpxy\")", "happy", practiceString.stringBits("hxaxpxpxy"));
    }

    @Test
    public void stringSplosion() {
        assertEquals("Input: stringSplosion(\"Code\")", "CCoCodCode", practiceString.stringSplosion("Code"));
        assertEquals("Input: stringSplosion(\"abc\")", "aababc", practiceString.stringSplosion("abc"));
        assertEquals("Input: stringSplosion(\"abc\")", "aab", practiceString.stringSplosion("ab"));
        assertEquals("Input: stringSplosion(\"x\")", "x", practiceString.stringSplosion("x"));
        assertEquals("Input: stringSplosion(\"fade\")", "ffafadfade", practiceString.stringSplosion("fade"));
        assertEquals("Input: stringSplosion(\"There\")", "TThTheTherThere", practiceString.stringSplosion("There"));
        assertEquals("Input: stringSplosion(\"Kitten\")", "KKiKitKittKitteKitten", practiceString.stringSplosion("Kitten"));
        assertEquals("Input: stringSplosion(\"Bye\")", "BByBye", practiceString.stringSplosion("Bye"));
        assertEquals("Input: stringSplosion(\"Good\")", "GGoGooGood", practiceString.stringSplosion("Good"));
        assertEquals("Input: stringSplosion(\"Bad\")", "BBaBad", practiceString.stringSplosion("Bad"));
    }

    @Test
    public void last2() {
        assertEquals("Input: last2(\"hixxhi\")", 1, practiceString.last2("hixxhi"));
        assertEquals("Input: last2(\"xaxxaxaxx\")", 1, practiceString.last2("xaxxaxaxx"));
        assertEquals("Input: last2(\"axxxaaxx\")", 2, practiceString.last2("axxxaaxx"));
        assertEquals("Input: last2(\"xxaxxaxxaxx\")", 3, practiceString.last2("xxaxxaxxaxx"));
        assertEquals("Input: last2(\"xaxaxaxx\")", 0, practiceString.last2("xaxaxaxx"));
        assertEquals("Input: last2(\"xxxx\")", 2, practiceString.last2("xxxx"));
        assertEquals("Input: last2(\"13121312\")", 1, practiceString.last2("13121312"));
        assertEquals("Input: last2(\"11212\")", 1, practiceString.last2("11212"));
        assertEquals("Input: last2(\"13121311\")", 0, practiceString.last2("13121311"));
        assertEquals("Input: last2(\"1717171\")", 2, practiceString.last2("1717171"));
        assertEquals("Input: last2(\"hi\")", 0, practiceString.last2("hi"));
        assertEquals("Input: last2(\"h\")", 0, practiceString.last2("h"));
        assertEquals("Input: last2(\"\")", 0, practiceString.last2(""));
    }

    @Test
    public void stringX() {
        assertEquals("Input: stringX(\"xxHxix\")", "xHix", practiceString.stringX("xxHxix"));
        assertEquals("Input: stringX(\"abxxxcd\")", "abcd", practiceString.stringX("abxxxcd"));
        assertEquals("Input: stringX(\"xabxxxcdx\")", "xabcdx", practiceString.stringX("xabxxxcdx"));
        assertEquals("Input: stringX(\"xKittenx\")", "xKittenx", practiceString.stringX("xKittenx"));
        assertEquals("Input: stringX(\"Hello\")", "Hello", practiceString.stringX("Hello"));
        assertEquals("Input: stringX(\"xx\")", "xx", practiceString.stringX("xx"));
        assertEquals("Input: stringX(\"x\")", "x", practiceString.stringX("x"));
        assertEquals("Input: stringX(\"\")", "", practiceString.stringX(""));
    }

    @Test
    public void altPairs() {
        assertEquals("Input: altPairs(\"kitten\")", "kien", practiceString.altPairs("kitten"));
        assertEquals("Input: altPairs(\"Chocolate\")", "Chole", practiceString.altPairs("Chocolate"));
        assertEquals("Input: altPairs(\"CodingHorror\")", "Congrr", practiceString.altPairs("CodingHorror"));
        assertEquals("Input: altPairs(\"yak\")", "ya", practiceString.altPairs("yak"));
        assertEquals("Input: altPairs(\"ya\")", "ya", practiceString.altPairs("ya"));
        assertEquals("Input: altPairs(\"y\")", "y", practiceString.altPairs("y"));
        assertEquals("Input: altPairs(\"\")", "", practiceString.altPairs(""));
        assertEquals("Input: altPairs(\"ThisThatTheOther\")", "ThThThth", practiceString.altPairs("ThisThatTheOther"));
    }

    @Test
    public void stringYak() {
        assertEquals("Input: stringYak(\"yakpak\")", "pak", practiceString.stringYak("yakpak"));
        assertEquals("Input: stringYak(\"pakyak\")", "pak", practiceString.stringYak("pakyak"));
        assertEquals("Input: stringYak(\"yak123ya\")", "123ya", practiceString.stringYak("yak123ya"));
        assertEquals("Input: stringYak(\"yak\")", "", practiceString.stringYak("yak"));
        assertEquals("Input: tringYak(\"yakxxxyak\")", "xxx", practiceString.stringYak("yakxxxyak"));
        assertEquals("Input: stringYak(\"HiyakHi\")", "HiHi", practiceString.stringYak("HiyakHi"));
        assertEquals("Input: stringYak(\"xxxyakyyyakzzz\")", "xxxyyzzz", practiceString.stringYak("xxxyakyyyakzzz"));
    }
}