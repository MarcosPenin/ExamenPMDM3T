package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SongListFragment : Fragment() {

    private val viewModel by activityViewModels<MusicViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_song_list, container, false)

        if (view is RecyclerView) {
            with(view) {
                viewModel.listadoDiscos.observe(viewLifecycleOwner){
                    adapter=CustomAdapter(it)
                }
                layoutManager = LinearLayoutManager(requireContext());

            }
        }

        return view
    }

}