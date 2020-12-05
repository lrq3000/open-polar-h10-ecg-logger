package org.circadiaware.open_polar_h10_ecg_logger.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class TabFragment extends Fragment {

    private static final String FRAGMENT_ID = "fragment_id";
    private int mFragmentId;

    public static TabFragment newInstance(int fragmentId) {
        TabFragment fragment = new TabFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(FRAGMENT_ID, fragmentId);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int fragmentId = 0;
        if (getArguments() != null) {
            fragmentId = getArguments().getInt(FRAGMENT_ID);
        }

        mFragmentId = fragmentId;
    }

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(mFragmentId, container, false);

        return root;
    }
}