package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gonzalez_marcos_examen3t.databinding.FragmentSongListBinding

class SongListFragment : Fragment() {



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

        /*
        if(viewModel.listadoDiscos.value!!.isEmpty()){
            Snackbar.make(binding.root, "No hay discos", Snackbar.LENGTH_SHORT).setAction("Restaurar",
                View.OnClickListener {
                    viewModel.reiniciar()
                }).show()
        }
*/

        }}




