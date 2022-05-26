package com.example.gonzalez_marcos_examen3t


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.gonzalez_marcos_examen3t.databinding.ItemSongBinding
import kotlinx.coroutines.withContext


class CustomAdapter(val listadoDatos: MutableList<DataSource>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {


    class ViewHolder(binding:ItemSongBinding) : RecyclerView.ViewHolder(binding.root) {
        //val mView = binding.root
        val titulo = binding.titulo
        val autor = binding.autor
        val portada= binding.portada
        val info = binding.info
        val remove = binding.remove
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemSongBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.apply {
            titulo.text = listadoDatos[position].titulo
            autor.text = listadoDatos[position].autor
            val descripcion=listadoDatos[position].descripcion

            portada.setImageResource(listadoDatos[position].imagen)
            info.setOnClickListener{
                AlertDialog.Builder(it.context).setMessage(descripcion)
                    .setTitle(titulo.text).create().show()

            }

            remove.setOnClickListener {
                listadoDatos.removeAt(position)
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, listadoDatos.size)
            }

        }
    }



    override fun getItemCount(): Int = listadoDatos.size
}
