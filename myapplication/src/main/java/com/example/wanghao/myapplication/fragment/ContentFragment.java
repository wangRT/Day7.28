package com.example.wanghao.myapplication.fragment;

import android.app.Fragment;
import android.widget.TextView;

/**
 * Created by WangHao on 2016/7/28.
 */
public class ContentFragment extends Fragment {
    private TextView textView_info;

    public void setName(String name) {
        this.textView_info.setText(name+",你好,咱们吃饭去!");
    }
}
