
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

public class Controlador implements ActionListener{
    
    private Vista vista;
    private Modelo modelo;

    public Controlador(Vista vista, Modelo modelo) {
        this.vista = vista;
        this.modelo = modelo;
        
        vista.botonSumar.addActionListener(this);
        
    }
    
    public void iniciar(){
        vista.setTitle("MVC Sumar");
        vista.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        modelo.setNumero1(Integer.parseInt(vista.cajaNumero1.getText()));//obtengo lo de cajaNumero1, luego lo parseo y finalmente lo establezco en numero1 del modelo con el set
        modelo.setNumero2(Integer.parseInt(vista.cajaNumero2.getText()));//obtengo lo de cajaNumero2, luego lo parseo y finalmente lo establezco en numero2 del modelo con el set
        
        //una vez que los numeros están dentro del modelo ya puedo operar
        modelo.sumar();
        
        vista.cajaResultado.setText(String.valueOf(modelo.getResultado()));
    }
    
    
    
}
