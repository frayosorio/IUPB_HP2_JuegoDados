import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int cara;

    public void lanzar(Random r) {
        cara = r.nextInt(6) + 1;
    }

    public void mostrar(JLabel lbl) {
        String archivoImagen = "imagenes/" + cara + ".jpg";
        ImageIcon imgDado = new ImageIcon(getClass().getResource(archivoImagen));
        lbl.setIcon(imgDado);
    }

    public int getCara() {
        return cara;
    }

}
