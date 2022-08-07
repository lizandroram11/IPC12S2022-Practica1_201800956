package calculadorapractica1;

import java.util.Scanner;

public class CalculadoraPractica1 {
    
    static final int MAX=  20;
    static double matriz[][]=new double[MAX][MAX];
    static int incognitas;

    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int opcion,aritmetica,pot,trigonometricas,iterador=0,n,facto=1,calculo;
        float potencia=1,x;
        double seno=0,coseno=0,operacion,tangente;
        float a,b,suma,resta,div,mult=0;
        int estadistica;
        double digito,sumaEs=0;
        double promedio,media;
        String cadena;
        String[] fragmento;
        
        
        do{
        System.out.println(" * ======================================================== * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * BIENVENIDO AL MENU, SELECCIONE UNA OPERACION             * ");
        System.out.println("| |1. ARITMETICAS                                          | |");
        System.out.println(" * 2. TRIGONOMETRICAS                                       * ");
        System.out.println("| |3. ESTADISTICA                                          | |");
        System.out.println(" * 4. CALCULO                                               * ");
        System.out.println("| |5. SALIR                                                | |");
        System.out.println(" * ========================================================  *");
        System.out.println("| |========================================================| |");
        
        opcion=entrada.nextInt();
        
        switch(opcion){
            case 1:
                do{
                    
        System.out.println(" * ======================================================== * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ELIJA UNA OPERACION ARITMETICA A REALIZAR                * ");
        System.out.println("| |1. SUMA                                                 | |");
        System.out.println(" * 2. RESTA                                                 * ");
        System.out.println("| |3. MULTIPLICACION                                       | |");
        System.out.println(" * 4. DIVISION                                              * ");
        System.out.println("| |5. POTENCIA                                             | |");
        System.out.println(" * 6. SALIR                                                 * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ======================================================== *");
        
        
        aritmetica=entrada.nextInt();
        
        
         switch (aritmetica){
             
             case 1: //Suma
                
                 sumaAritmetica();
                
                break;
            
            case 2: //Resta
                
                restaAritmetica();
                
                break;
                
                
            case 3: //Multiplicacion
                
                multiplicacionAritmetica();
                
                break;
                
            case 4: //Division
                
                divisionAritmetica();
                
                break;
                
                
            case 5: //Potencia
                
                potencia();
                
                
                
                break;
            default:
             
         }
     
                }while(aritmetica!=6);
                break;
                
                
                 case 2:
                System.out.println("Trigonometricas");
                
                System.out.println("Trigonometricas");
                do{
                    
        System.out.println(" * ======================================================== * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ELIJA UNA OPERACION TRIGONOMETRICA A REALIZAR            * ");
        System.out.println("| |1. SENO                                                 | |");
        System.out.println(" * 2. COSENO                                                * ");
        System.out.println("| |3. TANGENTE                                             | |");
        System.out.println(" * 4. SALIR                                                 * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ======================================================== *");
        
        
        trigonometricas=entrada.nextInt();
        
        switch(trigonometricas){
            
            case 1: //Seno
                
                seno();
                
                break;
           
                
            case 2: //Coseno
                
                coseno();
        
                
                break;
                
            case 3: //Tngente
                
                tangente();

                break;
            
            
            
        }
                    
                }while(trigonometricas!=4);
                break;

            case 3:
                System.out.println("Estadistica");
                
                 do{
                    
        System.out.println(" * ======================================================== * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ELIJA UNA OPERACION ESTADISTICA A REALIZAR               * ");
        System.out.println("| |1. PROMEDIO                                             | |");
        System.out.println(" * 2. MEDIA                                                 * ");
        System.out.println("| |3. MODA                                                 | |");
        System.out.println(" * 4. VARIANZA                                              * ");
        System.out.println("| |5. DESVIACION ESTANDAR                                  | |");
        System.out.println(" * 6. SALIR                                                 * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ======================================================== *");
        
        
        estadistica=entrada.nextInt();
        
        switch(estadistica){
            
            case 1: //Promedio
                
                promedio();
                
                break;
                
            case 2: //Media
                
                media();

                break;
                
            case 3:
                //Moda
                
                calcularMMM();  
                
                break;
                
            case 4:
                //Varianza
                System.out.println("Varianza");
                
                varianza();
                
                break;
                
            case 5:
                System.out.println("Desviacion Estandar");
                
                DesviacionEstandar();
                
                break;
            default:
            
            
        }

                }while(estadistica!=6);

                break;

            case 4:
                
                do{
                     System.out.println("Calculo Matrices: ");
        System.out.println(" * ======================================================== * ");
        System.out.println("| |========================================================| |");
        System.out.println(" *  CALCULO                                                 * ");
        System.out.println("| |1.RESOLVER SISTEMA DE ECUACIONES DE NXN CON GAUSS-JORDAN| |");
        System.out.println(" * 2. SALIR                                                 * ");
        System.out.println("| |========================================================| |");
        System.out.println(" * ======================================================== *");
        
        
        calculo=entrada.nextInt();
        switch(calculo){
            
         case 1: //Promedio    
              
                System.out.print("Cuantas incognitas tendra el sistema? ");
        Scanner sc=new Scanner(System.in);
        incognitas=sc.nextInt();
        System.out.println("Ingrese un sistema de ecuaciones lineales representado por una matriz: ");
        for (int i = 0; i < incognitas; i++) {// Ingresa las ecuaciones
            for (int j = 0; j <= incognitas; j++) {
                System.out.print("Matriz["+i+"]["+j+"]: ");
                matriz[i][j]=sc.nextDouble();
            }
        }


        for (int j = 0; j < incognitas-1; j++)
        {
            MatrizDiagonal(j);
            MatrizTriangular(j);
            Resto(j+1);
        }
        MatrizDiagonal(incognitas-1);
        for(int i=0;i<incognitas;i++)
        {
            System.out.println("x"+i+"="+matriz[i][incognitas]);
             
            
            
        }
                    
                    
                }
                }while(calculo!=2);
        
        break; 
                
            default: 
        
    
}
        }while(opcion!=5);
        
    }
    
    public static int factorial(int number){
        if ( number == 1){
            return 1;
        } else {
            int factorial = number;
            int i = number -1;
            do{
                factorial = factorial * i ;
                i--;
            }while( i > 0);
            return factorial;
        }

    
}
  
    public static void calcularMMM(){
        Scanner entrada=new Scanner(System.in);
        double digito,sumaEs=0;
        double media;
        String cadena;
        int aux;
        
        
        System.out.println("Digite los valores para determinar el promedio, "
                + "\ncada elemento debe ir separado por coma(,): ");
        cadena=entrada.next();

        String[] fragmento=cadena.split(",");
        int [] numeros= new int[fragmento.length];
        for(int i=0;i<fragmento.length;i++){
            numeros[i]=Integer.parseInt(fragmento[i]);
 
        }
        
        // Algoritmo Metodo Burbuja forma ascendente
	
        for(int i=0;i<(fragmento.length-1);i++){
            for(int j=0;j<(fragmento.length-1);j++){
                if(numeros[j]>numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;
                    
                }
                
            }
        }
        
        
        //Mostrando el arreglo ordenado en forma creciente
        System.out.println("\nArreglo ordenado en forma creciente para determinar la moda");
        for(int i=0;i<fragmento.length;i++){
            System.out.print(numeros[i]+" - ");
            
        }
        
        
        
        //Moda
       int numeroDistinto[]=new int[numeros.length];
        for(int posN=0;posN<numeroDistinto.length;posN++){
            numeroDistinto[posN]=-1;
        }
        
        int posND=0;
        int posR=0;
        
        
        while(posR<numeroDistinto.length){
            int nr=numeros[posR];
            int contarNumeroExiste=0;
            for(int pos=0;pos<numeroDistinto.length;pos++){
                if(nr==numeroDistinto[pos]){
                    contarNumeroExiste++;
                }
            }
            if(contarNumeroExiste==0){
                numeroDistinto[posND]=nr;
                posND++;
            }
            
            posR++;
            
        }
        
        int cuentaNumeros[]=new int[posND];
        for(int posNL=0;posNL<posND;posNL++){
         int nd=numeroDistinto[posNL];   
            for(int posCN=0;posCN<numeros.length;posCN++){
             if(nd== numeros[posCN]){
                 
                 cuentaNumeros[posNL]++;
                
                 
            }
            
            
        }
            
            
        }
        
        int max=Integer.MIN_VALUE;
        double numeroEncontrado=-1;
        for(int posN=0;posN<cuentaNumeros.length;posN++){
            if(max<cuentaNumeros[posN]){
                
                numeroEncontrado=numeroDistinto[posN];
                max=cuentaNumeros[posN];
                
            }
        }
        
        System.out.println("");
        System.out.println("\n\nCalculando la Moda");
        
        double moda=numeroEncontrado;
        System.out.println("\nLa moda es igual a: "+moda);
        
        
        
        
}//Metodo para calcular la moda
    
    public static void sumaAritmetica(){
        float a,b,suma;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite dos numeros reales: ");
                       a=entrada.nextFloat();
                       b=entrada.nextFloat();
                       
                       suma=a+b;
                       System.out.println("La suma de "+a+"+"+b+" es: "+suma);
                       System.out.println("");
        
    }
    
    public static void restaAritmetica(){
        float a,b,resta;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Digite dos numeros reales: ");
          a=entrada.nextFloat();
          b=entrada.nextFloat();
          resta=a-b;
          System.out.println("La resta de "+a+"-"+b+" es: "+resta);
          System.out.println("");
           
    }
    
    public static void multiplicacionAritmetica(){
        float a,b,mult;
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("Digite dos numeros reales: ");
                       a=entrada.nextFloat();
                       b=entrada.nextFloat();
                       
                           mult=a*b;
                       
                      System.out.println("La multiplicacion de "+a+"*"+b+" es: "+mult);
    }

    private static void divisionAritmetica() {
        float a,b,div;
        Scanner entrada=new Scanner (System.in);
        
        System.out.println("Digite dos numeros reales: ");
                       a=entrada.nextFloat();
                       b=entrada.nextFloat();
                       
                       if(a>0 || b>0){
                          div=a/b;
                       System.out.println("La division de "+a+"/"+b+" es: "+div);
                           
                       }else{
                           System.out.println("Operacion no valida");
                       }
        
    }

    private static void potencia() {
        
        float a,b,pot,potencia = 1;
        Scanner entrada=new Scanner (System.in);
        
        System.out.print("Digite la base: ");
                       a=entrada.nextFloat();
                       System.out.print("Digite la potencia: ");
                       pot=entrada.nextInt();
                       
                       for(int i=0;i<pot;i++){
                           potencia=potencia*a;
                       }
                       System.out.println("La Potencia de "+a+"^"+pot+" es: "+potencia);
        
        
        
    }

    private static void seno(){
        Scanner entrada=new Scanner (System.in);
        double seno=0;
        
        System.out.println("Ingrese el valor de X: ");
               float x=entrada.nextFloat();
                System.out.println("\nCuantas iteraciones necesita? ");
               float n=entrada.nextFloat();      
        
        for(int i=0; i<6; i++){
            if(i>4){
                int resultFactorial = factorial(2*i+1);
                double calculo = Math.pow(-1,i)* (Math.pow(x,(2*i+1)));
                //System.out.println("LONG: "+calculo);
                long otro = (long) calculo;
                double calculo2 = otro/resultFactorial;
               seno = seno + calculo2;                
            } else {
                int resultFactorial = factorial(2*i+1);
                double calculo = (Math.pow(-1,i)*(Math.pow(x,(2*i+1))));
                double calculo2 = calculo/resultFactorial;
                seno = seno + calculo2;
            }           
        }
        System.out.println("\nEl Seno de "+x+" es: "+seno);
        
        
    }
    
    private static void coseno(){
       Scanner entrada=new Scanner(System.in);
       double coseno=0;
       
        System.out.println("Ingrese el valor de X: ");
               float x=entrada.nextFloat();
                System.out.println("\nCuantas iteraciones necesita? ");
                float n=entrada.nextFloat();      
        
        for(int i=0; i<6; i++){
            if(i>4){
                int resultFactorial = factorial(2*i);
                double calculo = Math.pow(-1,i)* (Math.pow(x,2*i));
                //System.out.println("LONG: "+calculo);
                long otro = (long) calculo;
                double calculo2 = otro/resultFactorial;
                coseno = coseno + calculo2;                
            } else {
                int resultFactorial = factorial(2*i);
                double calculo = (Math.pow(-1,i)*(Math.pow(x,(2*i))));
                double calculo2 = calculo/resultFactorial;
                coseno = coseno + calculo2;
            }           
        }
        System.out.println("\nEl Coseno de "+x+" es: "+coseno);
        
        
    }

    private static void tangente() {
        
        double seno=0;
        double coseno=0;
        double tangente;
        Scanner entrada=new Scanner(System.in);
        System.out.println("Calculo de Tangente de X:");
                
                System.out.println("\nCalculando la Tangente");
                System.out.println("");
                System.out.print("Ingrese el valor de X: ");
              float  x=entrada.nextFloat();
                System.out.print("\nCuantas iteraciones necesita? ");
               float n=entrada.nextFloat();      
        
        for(int i=0; i<6; i++){
            if(i>4){
                int resultFactorial = factorial(2*i+1);
                double calculo = Math.pow(-1,i)* (Math.pow(x,(2*i+1)));
                //System.out.println("LONG: "+calculo);
                long otro = (long) calculo;
                double calculo2 = otro/resultFactorial;
                seno = seno + calculo2;                
            } else {
                int resultFactorial = factorial(2*i+1);
                double calculo = (Math.pow(-1,i)*(Math.pow(x,(2*i+1))));
                double calculo2 = calculo/resultFactorial;
                seno = seno + calculo2;
            }           
        }
         
        
        for(int i=0; i<6; i++){
            if(i>4){
                int resultFactorial = factorial(2*i);
                double calculo = Math.pow(-1,i)* (Math.pow(x,2*i));
                //System.out.println("LONG: "+calculo);
                long otro = (long) calculo;
                double calculo2 = otro/resultFactorial;
                coseno = coseno + calculo2;                
            } else {
                int resultFactorial = factorial(2*i);
                double calculo = (Math.pow(-1,i)*(Math.pow(x,(2*i))));
                double calculo2 = calculo/resultFactorial;
                coseno = coseno + calculo2;
            }           
        }
        
                tangente=seno/coseno;
                
                System.out.println("\nLa tangente de "+x+" es: "+tangente);
    }
    
    private static void promedio(){
    
        String cadena;
        Scanner entrada=new Scanner(System.in);
        String[] fragmento;
        int digito;
        int sumaEs=0;
        double media;
        
        
        System.out.println("Digite los valores para determinar el promedio, "
                + "\ncada elemento debe ir separado por coma(,): ");
        cadena=entrada.next();

        fragmento=cadena.split(",");
        
        for(int i=0;i<fragmento.length;i++){
            digito=Integer.parseInt(fragmento[i]);
            
            sumaEs=sumaEs+digito;
            
        }
        
        media=(double)(sumaEs/fragmento.length);
    
        System.out.println("El promedio es: "+media);
        
        
}

    public static void media(){
        
        String cadena;
        Scanner entrada=new Scanner(System.in);
        String[] fragmento;
        int digito;
        int sumaEs=0;
        double media;
        
        
        System.out.println("Digite los valores para determinar La Media, "
                + "\ncada elemento debe ir separado por coma(,): ");
        cadena=entrada.next();

        fragmento=cadena.split(",");
        
        for(int i=0;i<fragmento.length;i++){
            digito=Integer.parseInt(fragmento[i]);
            
            sumaEs=sumaEs+digito;
            
        }
        
        media=(double)(sumaEs/fragmento.length);
    
        System.out.println("La media es: "+media);
        
        
    }

    public static void varianza(){
       
        Scanner entrada=new Scanner(System.in);
        double digito,sumaEs=0,sumaMedia=0;
        double media;
        String cadena;
        int aux;
        double varianza;
        
        
        
        
        System.out.println("Digite los valores para determinar el promedio, "
                + "\ncada elemento debe ir separado por coma(,): ");
        cadena=entrada.next();

        String[] fragmento=cadena.split(",");
        double [] numeros= new double[fragmento.length];
        for(int i=0;i<fragmento.length;i++){
            numeros[i]=Double.parseDouble(fragmento[i]);
            
            sumaEs=sumaEs+numeros[i];
            
 
        }
        
        media=sumaEs/fragmento.length;
        System.out.println("\n\nLa media es: "+media);
        
        for(int i=0;i<fragmento.length;i++){
            
            sumaMedia=sumaMedia+((numeros[i]-media)*(numeros[i]-media));
            
            
        }
        System.out.println("\n\nLa suma media es: "+sumaMedia);
        

        
        varianza=sumaMedia/(fragmento.length-1);
        
        
        System.out.println("La Varianza es: "+varianza);
    }
    
    private static void DesviacionEstandar() {
        
        Scanner entrada=new Scanner(System.in);
        double digito,sumaEs=0,sumaMedia=0;
        double media;
        String cadena;
        int aux;
        double varianza;
        double desviacion;
        
        
        
        System.out.println("Digite los valores para determinar el promedio, "
                + "\ncada elemento debe ir separado por coma(,): ");
        cadena=entrada.next();

        String[] fragmento=cadena.split(",");
        double [] numeros= new double[fragmento.length];
        for(int i=0;i<fragmento.length;i++){
            numeros[i]=Double.parseDouble(fragmento[i]);
            
            sumaEs=sumaEs+numeros[i];
            
 
        }
        
        media=sumaEs/fragmento.length;
        System.out.println("\n\nLa media es: "+media);
        
        for(int i=0;i<fragmento.length;i++){
            
            sumaMedia=sumaMedia+((numeros[i]-media)*(numeros[i]-media));
            
            
        }
        System.out.println("\n\nLa suma media es: "+sumaMedia);
        

        
        varianza=sumaMedia/(fragmento.length-1);
        
        
        System.out.println("La Varianza es: "+varianza);
        
        System.out.println("");
        
        desviacion=Math.sqrt(varianza);
        
        
        System.out.println("");
        System.out.println("\n\n\nLa Desviacion Estandar es: "+desviacion);
        
        
        
    }

    static void MatrizTriangular(int jj) {// Convierte la matriz original en un triángulo
        for (int i = jj + 1; i < incognitas; i++) {
            double k =  matriz[i][jj]/ matriz[jj][jj];
            for (int j = jj; j <= incognitas; j++) {
                matriz[i][j] = matriz[i][j] - matriz[jj][j] * k;
            }
        }
    }

    static  void MatrizDiagonal(int jj){ //Convierte la matriz diagonal en 1
        for(int i=incognitas;i>=0;i--){
            matriz[jj][i]=matriz[jj][i]/matriz[jj][jj];
        }
    }
    
    static  void Resto(int jj){// Hacer otros valores 0
        for(int i=0;i<jj;i++){
            double k=(-matriz[i][jj])/matriz[jj][jj];
            for(int j=jj;j<=incognitas;j++){
                matriz[i][j]+=matriz[jj][j]*k;
            }
        }


    }
    
    
}
