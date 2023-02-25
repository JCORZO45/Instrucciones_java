import javax.swing.JOptionPane;
public class Primo {
    public static void main(String[] args) {
        int num, a=0; 
        JOptionPane.showMessageDialog(null, "Vamos a verificar si el numero es primo o no");
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entero"));
        
        
        for (int i = 1; i <= num; i++) {
            if(num % i == 0 ){
            a++;    
        }  
            
        }
        if(a!=2){
            JOptionPane.showMessageDialog(null,"El numero no es primo", "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es primo", "RESULTADOS", JOptionPane.PLAIN_MESSAGE);
        }
    }
    
}
