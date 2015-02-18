package waxa.boost.juntalimpio.inicio;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;

import waxa.boost.juntalimpio.R;

/**
 * Created by waxa2 on 4/01/15.
 */
public class NotImplementedFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the Builder class for convenient dialog construction
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Esta categoria se encuentra en desarrollo en estos momentos. Sin embargo su funcionamiento" +
                " es similar a la de Espacios Naturales").setTitle("Categoria no disponible")
                .setNeutralButton(R.string.aceptar, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dismiss();
                    }
                });
        // Create the AlertDialog object and return it
        return builder.create();
    }
}