package poop2;

/**
 *
 * @author brayan
 */
public class POOP2 {
    private static boolean menor(int x, int y){
        return x<y;
    }
    
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CODIGO UNO
        System.out.println("///////////////////////CODIGO UNO/////////////////////////");
        
        int a = 15, b = 10;
        
        if(a<b)
            System.out.println("\ta es menor que b.");
        else if(a==b)
            System.out.println("\ta es igual a b.");
        else
            System.out.println("\ta es mayor que b.");
        
        if(menor(a,b))
            System.out.println("\tmétodo menor retorna true.");
        else
            System.out.println("\tmétodo menor retorna false.");
        
        //CODIGO DOS  
        System.out.println("///////////////////////CODIGO DOS/////////////////////////");
        int dia = 1;
        
        switch (dia) {
            case 1:
                System.out.println("\tdomingo.");
                break;
            case 2:
                System.out.println("\tlunes.");
                break;
            case 3:
                System.out.println("\tmartes.");
                break;
            case 4:
                System.out.println("\tmiercoles.");
                break;
            case 5:
                System.out.println("\tjueves.");
                break;
            case 6:
                System.out.println("\tviernes.");
                break;
            case 7:
                System.out.println("\tsábado.");
                break;
            default:
                System.out.println("\tOpción invalida.");
                break;
        }
        
        //CODIGO TRES 
        System.out.println("///////////////////////CODIGO TRES/////////////////////////");
        char vocal = '9';
        
        switch (vocal) {
            case 'a':
                System.out.println("\tseleccionó vocal a.");
                break;
            case 'e':
                System.out.println("\tseleccionó vocal e.");
                break;
            case 'i':
                System.out.println("\tseleccionó vocal i.");
                break;
            case 'o':
                System.out.println("\tseleccionó vocal o.");
                break;
            case 'u':
                System.out.println("\tseleccionó vocal u.");
                break;
            default:
                System.out.println("\tNo se seleccionó una vocal.");
                break;
        }
        
        //CODIGO CUATRO
        System.out.println("///////////////////////CODIGO CUATRO/////////////////////////");
        
        int n = 0;
        
        while(n<10){
            System.out.println("Contando hacia arriba n = " + n + ".");
            n++;
        }
        
        while(n>10){
            System.out.println("Contando hacia abajo n = " + n + ".");
            n--;
        }
        
        System.out.println("n = " + n + ".");
        
        //CODIGO CINCO
        System.out.println("///////////////////////CODIGO CINCO/////////////////////////");
        
        int m = 10;
        
        do{
            System.out.println("Contando hacia abajo m = " + m + ".");
            m--;
        }while(m>0);
        
        System.out.println("\tm = " + m);
        
        System.out.println("\t############## FOR ##############");
        for (int i = 0; i <= 10; i++) 
            System.out.println("Contando hacia arriba " + i + ".");
        
        for (int j = 10; j > 0; j--) 
            System.out.println("Contando hacia abajo " + j + ".");
            
        //CODIGO SEIS
        System.out.println("///////////////////////CODIGO SEIS/////////////////////////");
        
        int[] miArreglo = {1,2,3,4,5};
        int numElementos = miArreglo.length;
        System.out.println("miArreglo tiene "+numElementos+" elementos");
        int[] miArreglo2 = new int[10];
        numElementos = miArreglo2.length;
        System.out.println("miArreglo2 tiene "+numElementos+" posiciones");
        
        for (int i = 0; i < miArreglo2.length; i++) 
            miArreglo2[i] = i*10;
        
        for (int i = 0; i < miArreglo2.length; i++) 
            System.out.println("miArreglo2["+i+"]="+miArreglo2[i]);
      
        for (int i = 0; i < miArreglo2.length; i++) {
            int j = miArreglo2[i];
            System.out.println("Mapeo en porcentaje "+j+"%");
        }
    }
}

