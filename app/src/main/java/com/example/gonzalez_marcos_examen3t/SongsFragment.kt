package com.example.gonzalez_marcos_examen3t

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.LinearLayout
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.LifecycleOwner
import androidx.navigation.fragment.findNavController
import com.example.gonzalez_marcos_examen3t.databinding.FragmentSongsBinding

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
class SongsFragment : Fragment() {

    private var _binding: FragmentSongsBinding? = null

    private val binding get() = _binding!!

    private val viewModel by activityViewModels<MusicViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSongsBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.listadoDiscos.observe(viewLifecycleOwner) {
            binding.recyclerView.adapter = CustomAdapter(it)
        }

/*
        binding.checkRock.setOnCheckedChangeListener { _, checked ->
            if (checked) {
                viewModel.listadoDiscos.postValue(getRock())
            }else {
                viewModel.listadoDiscos.postValue(getBlues())
            }

*/

        /*fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {
                R.id.checkRock -> {
                    chooseList(checked, listadoRock)
                }

            }
        }
    }*/

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}