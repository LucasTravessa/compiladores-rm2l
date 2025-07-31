public class sym {
    public static final int EOF = 0;
    public static final int IDENTIFICADOR = 1;
    public static final int RESTO = 2;
    public static final int VIRGULA = 3;
    public static final int FECHA_PARENTESES = 4;
    public static final int ABRE_PARENTESES = 5;
    public static final int DIVISAO = 6;
    public static final int MENOS = 7;
    public static final int MAIS = 8;
    public static final int MULTIPLICACAO = 9;
    public static final int INTEIRO = 10;
    public static final int MAIOR_QUE = 11;
    public static final int MENOR_QUE = 12;
    public static final int FECHA_COMANDO = 13;
    public static final int FECHA_COLCHETE = 14;
    public static final int ABRE_COLCHETE = 15;
    public static final int OU_EXCLUSIVO = 16;
    public static final int ATRIBUICAO = 17;
    public static final int NEGACAO = 18;
    public static final int EQUIVALENCIA = 19;
    public static final int OU = 20;
    public static final int SE_NAO = 21;
    public static final int E = 22;
    public static final int STRING = 23;
    public static final int DECIMAL = 24;
    public static final int ENQUANTO = 25;
    public static final int INTEIRO_RESERVADO = 26;
    public static final int FECHA_BLOCO = 27;
    public static final int SE = 28;
    public static final int CARACTER_RESERVADO = 29;
    public static final int BOOLEANO = 30;
    public static final int ABRE_BLOCO = 31;
    public static final int PARA = 32;
    public static final int ESCREVA = 33;
    public static final int DECIMAL_RESERVADO = 34;
    public static final int GUARDA = 35;
    public static final int BOOLEANO_RESERVADO = 36;
    public static final int CARACTER = 37;
    
    // Nomes dos tokens para debug
    public static final String[] terminalNames = {
        "EOF", "IDENTIFICADOR", "RESTO", "VIRGULA", "FECHA_PARENTESES",
        "ABRE_PARENTESES", "DIVISAO", "MENOS", "MAIS", "MULTIPLICACAO",
        "INTEIRO", "MAIOR_QUE", "MENOR_QUE", "FECHA_COMANDO", "FECHA_COLCHETE",
        "ABRE_COLCHETE", "OU_EXCLUSIVO", "ATRIBUICAO", "NEGACAO", "EQUIVALENCIA",
        "OU", "SE_NAO", "E", "STRING", "DECIMAL", "ENQUANTO", "INTEIRO_RESERVADO",
        "FECHA_BLOCO", "SE", "CARACTER_RESERVADO", "BOOLEANO", "ABRE_BLOCO",
        "PARA", "ESCREVA", "DECIMAL_RESERVADO", "GUARDA", "BOOLEANO_RESERVADO",
        "CARACTER"
    };
    
    public static String getName(int token) {
        if (token >= 0 && token < terminalNames.length) {
            return terminalNames[token];
        }
        return "UNKNOWN";
    }
}
