public class MakeArrayConsecutive2 {

    public static int makeArrayConsecutive2(int[] statues) {
        int ordem = 0;
        int quantidade = 0;    
         
         for(int i = 0; i < statues.length; i++){
             for(int j = 0; j < statues.length; j++){

                 if(statues[i] < statues[j]){
                 ordem = statues[i];
                 statues[i] = statues[j];
                 statues[j] = ordem;
                 }
            }
        }
          
        quantidade = (statues[statues.length-1] - statues[0] +1) - statues.length;
        return quantidade; 
    }
}