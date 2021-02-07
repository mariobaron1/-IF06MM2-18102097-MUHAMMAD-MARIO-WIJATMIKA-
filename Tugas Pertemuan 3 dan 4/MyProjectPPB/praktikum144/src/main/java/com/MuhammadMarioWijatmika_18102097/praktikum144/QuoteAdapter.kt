package com.MuhammadMarioWijatmika_18102097.praktikum144

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.MuhammadMarioWijatmika_18102097.praktikum144.databinding.ItemQuoteBinding
import com.MuhammadMarioWijatmika_18102097.praktikum144.helper.EXTRA_POSITION
import com.MuhammadMarioWijatmika_18102097.praktikum144.helper.EXTRA_QUOTE
import com.MuhammadMarioWijatmika_18102097.praktikum144.helper.REQUEST_UPDATE
import com.MuhammadMarioWijatmika_18102097.praktikum144.model.Quote
import com.MuhammadMarioWijatmika_18102097.praktikum144.ui.QuoteAddUpdateActivity

class QuoteAdapter(private val activity: Activity): RecyclerView.Adapter<QuoteAdapter.QuoteViewHolder>() {
    var listQuotes = ArrayList<Quote>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_quote, parent, false)
        return QuoteViewHolder(view)
    }

    override fun getItemCount(): Int = this.listQuotes.size

    override fun onBindViewHolder(holder: QuoteViewHolder, position: Int) {
        holder.bind(listQuotes[position],position)
    }

    inner class QuoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding = ItemQuoteBinding.bind(itemView)
        fun bind(quote: Quote, position: Int) {
            binding.tvItemTitle.text = quote.quote_name
            binding.cvItemQuote.setOnClickListener{
                val intent = Intent(activity,
                    QuoteAddUpdateActivity::class.java)
                intent.putExtra(EXTRA_POSITION, position)
                intent.putExtra(EXTRA_QUOTE, quote)
                activity.startActivityForResult(intent, REQUEST_UPDATE)
            }
            binding.tvOwner.text = quote.user_name+" ("+quote.class_name+")"
            binding.tvItemDate.text = quote.created_at
            binding.tvItemDescription.text = quote.quote_description
        }
    }
}