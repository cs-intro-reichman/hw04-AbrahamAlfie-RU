public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
                "Our product will transform the market",
                "Programming is both painful and engaging",
                "This has nothing to do with machine learning",
                "We need to leverage our core competencies",
                "Let's talk about data and algorithms",
                "Chatbots are great but must be used carefully",
                "This blockchain-based solution will disrupt the industry",
                "The team showed great Synergy in the last project",
                "Use simple words without hype and fluff",
                "Our new technology presents a significant paradigm shift",
                "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business
        // presentations
        String[] keywords = { "synergy", "disrupt", "leverage", "Paradigm", "transform" };
        detectAndPrint(sentences, keywords);

    }

    // Gets the number of words in the sentence string
    public static int wordcount(String sentence) {
        int wordcount = 1;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                wordcount++;
            }
        }
        return wordcount;
    }

    // Converts a sentence to a string array and lowercase
    public static String[] arrToString(String str) {
        String[] strArr = new String[wordcount(str)];
        String newStr = "";

        for (int i = 0; i < strArr.length; i++) {
            for (int j = 0; j < str.length(); j++)
                if (str.charAt(j) != ' ') {
                    newStr += str.charAt(j);
                } else {
                    strArr[i] = newStr;
                    str = str.substring(newStr.length() + 1, str.length());
                    newStr = "";
                    break;
                }
        }
        strArr[strArr.length - 1] = newStr;

        return strArr;
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
        for (int i = 0; i < sentences.length; i++) {
            String[] strArr = arrToString(sentences[i]);

            for (int j = 0; j < strArr.length; j++) {
                for (int k = 0; k < keywords.length; k++) {
                    if (MyString.lowerCase(strArr[j]).equals(MyString.lowerCase(keywords[k]))) {
                        System.out.println(sentences[i]);
                    }
                }
            }
        }
    }
}
