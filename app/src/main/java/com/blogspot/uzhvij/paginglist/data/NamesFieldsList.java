package com.blogspot.uzhvij.paginglist.data;

import android.content.Context;
import com.blogspot.uzhvij.paginglist.R;
import java.util.Arrays;
import java.util.List;

public class NamesFieldsList {
    static private List<String> list;

    public static void init(Context context) {
        list = Arrays.asList(context.getResources().getStringArray(R.array.fields_name));
    }

    public static List<String> getData() {
        return list;
    }
}
