class Main {
  public static void main(String[] args) {
  int[][] tablicaMnozenia = new int[10][10];
        
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                tablicaMnozenia[i][j] = (i+1) * (j+1);
            }
        }
        
        for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++) {
                System.out.print(tablicaMnozenia[i][j] + "\t");
            }
            System.out.println();
        }
    }
}