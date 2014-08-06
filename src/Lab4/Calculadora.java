/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Lab4;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell Latitude
 */
public class Calculadora {
    
    public String signo;
    public char valor;
    public Factory miFactor = new Factory();
    public Stack<String> miVector = miFactor.getStack(menu());
    public int parcial=0;
    public int op1=0;
    public int op2=0;
    public String res ="";
            
    public String menu(){
        System.out.println("Bienvenido, escoja el tipo de Almacenamiento");
   
        res = JOptionPane.showInputDialog("\n1. Para escoger ArrayList\n2. Para escoger Vector\n3. Para escoger un tipo de lista");
        //System.out.println("\n1. Para escoger ArrayList\n2. Para escoger Vector\n3. Para escoger un tipo de lista");
  
            
     
        return res;
    }
    
   /* public String getTypeStack(){
        return "1";
    }*/
    
    public void pedirNumero(){
         try{
            FileReader fr = new FileReader("Datos.txt");
            BufferedReader br = new BufferedReader(fr);
            String cadena;
           // char valor;
           //String uno = Integer.toString(numero);
            while ((cadena=br.readLine())!=null){
                for(int j=0;j<=cadena.length()-1;j++){
                    valor=cadena.charAt(j);
                    signo=valor+"";
                    if(valor!=' '){
                        if(miVector.size()==2){
                            if(signo.equals("+")){
                                parcial=(Integer.parseInt(miVector.pop()))+(Integer.parseInt(miVector.pop()));                              
                            }
                            if(signo.equals("-")){
                                op1=(Integer.parseInt(miVector.pop()));
                                op2=(Integer.parseInt(miVector.pop()));
                                parcial=op1-op2;
                            }
                            if(signo.equals("*")){
                                parcial=(Integer.parseInt(miVector.pop()))*(Integer.parseInt(miVector.pop()));
                            }
                            if(signo.equals("/")){
                                op1=(Integer.parseInt(miVector.pop()));
                                op2=(Integer.parseInt(miVector.pop()));
                                parcial=op1/op2;
                            }
                            miVector.push(Integer.toString(parcial));
                        }else{
                            miVector.push(signo);
                        }
                    }
                    
                
                }
                System.out.println("\nEl total es: "+parcial);
                cadena=br.readLine();
                
            }
        }catch(Exception ex){
            
      }
    }
}
