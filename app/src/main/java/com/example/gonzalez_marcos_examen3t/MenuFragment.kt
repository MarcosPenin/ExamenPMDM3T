package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.gonzalez_marcos_examen3t.databinding.FragmentMenuBinding

class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null

    private val binding get() = _binding!!
    private val viewModel by activityViewModels<MusicViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.spinner
            .apply {
                setSelection(0, false)
                adapter = ArrayAdapter.createFromResource(
                    requireContext(),
                    R.array.generos,
                    R.layout.item_menu
                )
                onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                        when (position) {
                            1 -> viewModel.listadoDiscos.postValue(viewModel.listadoRock.value)
                            2 -> viewModel.listadoDiscos.postValue(viewModel.listadoBlues.value)
                            3 -> viewModel.listadoDiscos.postValue(viewModel.listadoJazz.value)
                        }
                        if(position>0){
                            findNavController().navigate(MenuFragmentDirections.actionMenuFragmentToSongListFragment())
                        }
                        setSelection (0, false)
                    }
                    override fun onNothingSelected(parent: AdapterView<*>?) {}
                    }

                }
            }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

