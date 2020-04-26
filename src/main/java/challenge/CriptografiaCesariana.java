package challenge;

public class CriptografiaCesariana implements Criptografia {

    @Override
    public String criptografar(String texto) {
        int numDeCasas = 3, i , asc;
        String fraseCifrada="", saida="";
        char charArray [] = texto.toLowerCase().toCharArray();

        for (char c : charArray) {
            if (c + numDeCasas >= 97 && numDeCasas <= 122) {
                fraseCifrada += (c + numDeCasas) + "#";
            } else if (c + numDeCasas >= 123 && numDeCasas <= 125) {
                fraseCifrada += (c + numDeCasas + 26) + "#";
            } else {
                i = c;
                fraseCifrada += (i) + "#";
            }
        }

        String[] split = fraseCifrada.split("#");
        for (String string : split) {
            asc = Integer.parseInt(string);
            saida += ((char) asc);
        }
        return saida;
    }

    @Override
    public String descriptografar(String texto) {
        int numDeCasas  = 3, i, asc;
        String fraseDecifrada="", saida="";
        char charArray[] = texto.toLowerCase().toCharArray();

        for (char c : charArray) {
            if (c - numDeCasas >= 97 && numDeCasas <= 122) {
                fraseDecifrada += (c - numDeCasas) + "#";
            } else if (c - numDeCasas >= 93 && c - numDeCasas <= 96) {
                fraseDecifrada += (c - numDeCasas + 26) + "#";
            } else {
                i = c;
                fraseDecifrada += (i) + "#";
            }
        }

        String[] split = fraseDecifrada.split("#");
        for (String string : split) {
            asc = Integer.parseInt(string);
            saida += ((char) asc);
        }
        return saida;
    }
}
