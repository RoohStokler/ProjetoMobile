package com.example.projetointegrador.ui.cadastrar;


import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.projetointegrador.R;

public class CadastrarFragment extends Fragment {

    private CadastrarViewModel mViewModel;

    public static CadastrarFragment newInstance() {
        return new CadastrarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.cadastrar_fragment, container, false);
    }

}