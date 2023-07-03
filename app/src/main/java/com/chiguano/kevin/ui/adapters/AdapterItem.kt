package com.chiguano.kevin.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.chiguano.kevin.R
import com.chiguano.kevin.data.Datos
import com.chiguano.kevin.databinding.ItemsBinding

class AdapterItem(private val items: List<Datos>, private val itemClickListener: OnItemClickListener) :
    RecyclerView.Adapter<AdapterItem.CorreoViewHolder>() {

    // Trabaja con la vista del metodo de abajo
    class CorreoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val binding: ItemsBinding = ItemsBinding.bind(view)

        fun render(item: Datos) {
            println("Recibiendo a ${item.nombre}")
            binding.nombreTextview.setText(item.nombre)
            binding.asuntoTextview.setText(item.asunto)
            binding.cuerpoTextview.setText(item.cuerpo)
            binding.imagenImageview.setImageResource(R.drawable.logo_correo)
        }
    }

    interface OnItemClickListener {
        fun onItemClick(nombre: String, asunto: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CorreoViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        // Crea una vista
        return CorreoViewHolder(
            inflater.inflate(
                R.layout.items,
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CorreoViewHolder, position: Int) {
        val item = items[position]
        holder.render(item)
        holder.itemView.setOnClickListener {
            itemClickListener.onItemClick(item.nombre, item.asunto)
        }
    }

    override fun getItemCount(): Int = items.size
}