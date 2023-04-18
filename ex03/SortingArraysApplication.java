class SortingArraysApplication {

  public static void main(String[] args) {
    int[][] arrays = {
      { 3, 2, 1 },
      { 9, 7, 10, 4, 8, 2, 5, 3, 1, 6 },
      { 7, 2, 3, 2, 2, 1, 1, 1 },
      { 2, 1 },
      { 100 },
      { 888888888, -888888888 },
    };

    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays[i].length - 1; j++) {
        for (int k = 0; k < arrays[i].length - 1 - j; k++) {
          if (arrays[i][k] > arrays[i][k + 1]) {
            int temp = arrays[i][k];
            arrays[i][k] = arrays[i][k + 1];
            arrays[i][k + 1] = temp;
          }
        }
      }
    }

    for (int i = 0; i < arrays.length; i++) {
      for (int j = 0; j < arrays[i].length; j++) {
        System.out.print(" " + arrays[i][j]);
      }
      System.out.println();
    }
  }
}
