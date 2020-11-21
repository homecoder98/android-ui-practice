package com.example.practiceui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import com.example.practiceui.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyDialogFragment extends DialogFragment{
    Button btn_alert;
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(),"확인 누름",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("취소", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(),"취소 누름",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setMultiChoiceItems(R.array.item, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {
                Toast.makeText(getContext(),i+" 누름",Toast.LENGTH_SHORT).show();
            }
        });
        builder.setIcon(R.drawable.img_menu);
        builder.setTitle("제목");
        builder.setView(R.layout.acitivity_dialog_fragment);
        return builder.create();
    }

}
