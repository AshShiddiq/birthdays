package com.example.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.navigation.databinding.FragmentHalamanDiklatBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HalamanDiklat.newInstance] factory method to
 * create an instance of this fragment.
 */
class HalamanDiklat : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding : FragmentHalamanDiklatBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_halaman_diklat, container, false)

        binding.button5.setOnClickListener {
            it.findNavController().navigate(R.id.action_halamanDiklat_to_dashboard)
        }
        return binding.root
    }


}