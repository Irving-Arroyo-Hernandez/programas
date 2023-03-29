package potencia;
public class Calcular {
    public int elevar (int base , int exp){
        if (base==0){
            return 0;
             }else{ 
        }if (exp==0){
                return 1;
             }else{
        }if(exp!=1){
                    return base*elevar(base,exp-1);
                }else{
                    return base;
                    
                }
            }
                
    }

