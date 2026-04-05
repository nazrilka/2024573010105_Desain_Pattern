package modul_3.bagian_4.overriding;

import javax.swing.*;

public class kucing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Meong!");
    }
}