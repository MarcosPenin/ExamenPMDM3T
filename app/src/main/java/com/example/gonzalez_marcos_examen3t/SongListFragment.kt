package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gonzalez_marcos_examen3t.databinding.FragmentSongListBinding
import com.google.android.material.snackbar.Snackbar

class SongListFragment : Fragment() {

/*
COMO NO HE CONSEGUIDO HACER FUNCIONAR EL FRAGMENT FINAL HE MANTENIDO EL BOTÓN DE BORRAR AQUÍ
ESO SÍ FUNCIONA Y MANTIENE EL ESTADO HASTA QUE REINICIAS EN EL MENÚ
 */


    private val viewModel by activityViewModels<MusicViewModel>()

    private var _binding: FragmentSongListBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        (activity as AppCompatActivity?)!!.supportActionBar!!.setTitle("Lista de canciones")


        val view = inflater.inflate(R.layout.fragment_song_list, container, false)

        if (view is RecyclerView) {
            with(view) {
                viewModel.listadoDiscos.observe(viewLifecycleOwner){
                    adapter=CustomAdapter(it)
                }
                layoutManager = LinearLayoutManager(requireContext());
            }
        }
        _binding = FragmentSongListBinding.inflate(inflater, container, false)
        return view

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        if(viewModel.listadoDiscos.value!!.isEmpty()){
            Snackbar.make( view, "No hay discos", Snackbar.LENGTH_LONG).setAction("VOLVER",
                View.OnClickListener {
                    findNavController().navigateUp()
                }).show()
        }


        }}




