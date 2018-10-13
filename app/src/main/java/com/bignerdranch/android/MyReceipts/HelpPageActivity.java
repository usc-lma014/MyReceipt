package com.bignerdranch.android.MyReceipts;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;

public class HelpPageActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context){
        Intent i = new Intent(context, HelpPageActivity.class);
        return i;
    }
    @Override
    protected Fragment createFragment(){
        return HelpPageFragment.newInstance();
    }
}
