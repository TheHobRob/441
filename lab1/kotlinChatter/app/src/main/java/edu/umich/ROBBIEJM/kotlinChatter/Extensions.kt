package edu.umich.ROBBIEJM.kotlinChatter

import android.net.Uri
import android.view.View
import android.widget.ImageView

class Extensions {

    fun ImageView.display(uri: Uri) {
        setImageURI(uri)
        visibility = View.VISIBLE
    }
}