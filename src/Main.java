public class Main {
    public static void main(String[] args) {

    }

    public String indexChar(String text, int index) {
        StringBuilder result = new StringBuilder();

        try {
            if (index < text.length() && index >= 0) {
                result.append(text.charAt(index));
            } else {
                result.append("l'indice al numero: ").append(index).append(" non esiste");
            }
            return result.toString();

        } catch (NullPointerException e) {
            result.append("Errore: la stringa è null");
        }

        return result.toString();
    }
}
