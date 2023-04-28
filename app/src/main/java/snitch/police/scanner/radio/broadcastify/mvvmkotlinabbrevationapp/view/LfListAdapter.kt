package snitch.police.scanner.radio.broadcastify.mvvmkotlinabbrevationapp.view

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import snitch.police.scanner.radio.broadcastify.mvvmkotlinabbrevationapp.databinding.RvItemBinding


/**
 * This is ListAdapter class to display list of large forms in recyclerview.
 */
class LfListAdapter : RecyclerView.Adapter<MainViewHolder>() {

    private var largeFormsList = mutableListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    fun setLfList(lfs: List<String>) {
        this.largeFormsList = lfs.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RvItemBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val largeForm = largeFormsList[position]
        holder.binding.lfTv.text = largeForm
    }

    override fun getItemCount(): Int {
        return largeFormsList.size
    }
}

class MainViewHolder(val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root)