package com.leo.tools

import android.content.Context
import android.widget.Toast

class Misc {
    companion object {
        fun toast(ctx:Context, msg: CharSequence) {
            Toast.makeText(ctx, msg, Toast.LENGTH_SHORT).show()
        }
    }
}