package edu.temple.inclassuiacvitivity

import android.R.attr.textSize
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter (private val context: Context, private val items: Array<Int> ): BaseAdapter() {

    override fun getCount() = items.size

    override fun getItem(position: Int) = items[position]

    override fun getItemId(position: Int) = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?) =
        if (convertView == null) {
            TextView(context)
        } else {
            convertView as TextView
        }.apply {
            text = items[position].toString()
            textSize = 22f
        }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View? {
        return getView(position, convertView, parent).apply {
            textSize = items[position].toFloat()
        }
    }

}