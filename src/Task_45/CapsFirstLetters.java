package Task_45;

public class CapsFirstLetters extends Message implements Editing{
    /*метод edit() делает прописными (заглавными) все первые буквы слов. Пробелы не удаляются.*/

    @Override
    public String edit(String text) {
        StringBuilder builder = new StringBuilder(text);

        if (Character.isAlphabetic(text.codePointAt(0))){
            builder.setCharAt(0, Character.toUpperCase(text.charAt(0)));
        }
        for (int i = 1; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i)) && Character.isSpaceChar(text.charAt(i - 1)))
                builder.setCharAt(i, Character.toUpperCase(text.charAt(i)));
        }
        return builder.toString();
    }
}
