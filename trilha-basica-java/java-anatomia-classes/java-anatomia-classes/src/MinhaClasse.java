public class MinhaClasse {
    public static void main (String [] args) {
        String meuNome = "Bruno";
        int anoFabricacao = 2024;
        boolean verdadeira = true;

        String primeiroNome = "Bruno";
        String segundoNome = "Nascimento";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);


        System.out.println(meuNome);
        System.out.println(anoFabricacao);
        System.out.println(verdadeira);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
