class Main {
  public static void main(String[] args) {
    int[] tab = new int[10];
    int i;
    int ip=1;
    int inp=1;
    System.out.println("Znaki w tablicy: ");
    for(i=1;i<11;i++)
      {
        tab[i-1] = i * i;
        System.out.print(tab[i-1] + " ");
      }
    for(i=0;i<10;i++)
      {
        if(tab[i]%2 == 0)
        {
          ip = ip * tab[i];
        }
        else
        {
          inp = inp * tab[i];
        }
      }
    System.out.println("iloczyn liczb parzystych wynosi: " + ip);
    System.out.println("iloczyn liczb nieparzystych wynosi: " + inp);
  }
}