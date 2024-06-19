package com.phalphearun.campinggearapp;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class ContactDialogFragment extends DialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(requireActivity());
        builder.setTitle("Contact Us")
                .setMessage("Phone: (+855)15 700 648\nFacebook: @campinggear\nTelegram: @campinggear\nAddress:#68Eo, St.148 S/K Phsar Kandal 2, Khan Daun Penh")
                .setPositiveButton("OK", (dialog, which) -> dialog.dismiss());
        return builder.create();
    }
}


