package ejercicio5;
public class Ejercicio5 {
    public static void main(String[] args) {
        int matriz[][]= new int [11][11];
        for (int i=0; i<11; i++){
         for(int j=0;j<11; j++) {
             
             if (i+j==i){
                 
                 matriz[i][j] = i*1; 
             }
             else if ((j+i==j)){
                 
                 matriz[i][j] = j*1;          
             }
             
             System.out.print(matriz[i][j]+" ");
        }   
                 System.out.println("");
            }
        System.out.println("-----------------------------------------------");
        int x=11, y=11;
        int mtz1[] = new int[x];
        int mtz2[] = new int[y];
        int mtzf[] = new int[x+y];
       
        for (int i=0; i<x; i++) {
            System.out.print(mtz1[i]+i+" "+" "+" ");
        }
        
        System.out.println("");
        
        for (int j=1; j<y; j++) {
            System.out.print(mtz2[j]+j+" "+""+" ");
            
            for (int i=1; i<x; i++) {
                mtzf[i] = (mtz1[i]+i) * (mtz2[j]+j);
                if(((mtz1[i]+i) * (mtz2[j]+j)) <10){
                System.out.print(mtzf[i]+ " " + "  ");
                }
                else{
                System.out.print(mtzf[i]+ " "+" ");
                }
            }
            System.out.println("");
        }
    }
}


   

