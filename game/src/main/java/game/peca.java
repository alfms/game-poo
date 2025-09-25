package game;

public class peca {

    public enum TipoPeca {
        I, T, L, Z, O
    }

    private static final int[][][] FORMATO_PECA = {

        // Fomarto peça I
        {
            {0,0,0,0},    
            {1,1,1,1},    
            {0,0,0,0},    
            {0,0,0,0}    
        },

        // Formato peça T
        {
            {0,0,0,0},    
            {0,1,0,0},   
            {1,1,1,0},  
            {0,0,0,0}    

        },

        // Formato peça L
        {
            {0,0,0,0},    
            {0,0,1,0},    
            {1,1,1,0},    
            {0,0,0,0}    

        },

        // Formato peça Z
        {
            {1,1,0,0},    
            {0,1,1,0},    
            {0,0,0,0},    
            {0,0,0,0}    
        },

        // Formato peça O
        {
            {0,0,0,0},    
            {0,1,1,0},    
            {0,1,1,0},    
            {0,0,0,0}    
        }
    };
        
        private TipoPeca tipo;
        private int[][] formato;
        private int x, y; // Posição no tabuleiro
        private int rotacao; // 0, 1, 2, 3 (90°, 180°, 270°, 360°)

        // Construtor
        public peca(TipoPeca tipo, int startX, int startY){
            this.tipo = tipo;
            this.x = x;
            this.y = y;
            this.rotacao = rotacao;
            this.formato = new int[4][4];

            loadShape();

        }

        // Carrega a forma da peça baseada no tipo
        private void loadShape() {
        int tipoIndex = tipo.ordinal();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                this.formato[i][j] = FORMATO_PECA[tipoIndex][i][j];
            }
        }
    }
    }



