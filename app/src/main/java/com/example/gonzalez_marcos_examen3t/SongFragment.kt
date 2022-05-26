package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.gonzalez_marcos_examen3t.databinding.FragmentSongBinding


class SongFragment : Fragment() {

    private val viewModel by activityViewModels<MusicViewModel>()
    private var _binding: FragmentSongBinding? = null

    //private val args: SongFragmentArgs by navArgs()

    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        (activity as AppCompatActivity?)!!.supportActionBar!!.setTitle("Información: ")

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_song, container, false)
        _binding = FragmentSongBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var titulo = SongFragmentArgs.fromBundle(requireArguments()).titulo

        //ESTO ROMPE Y NO ENTIENDO PQ
        //binding.titulo.text = titulo


    }

        }
