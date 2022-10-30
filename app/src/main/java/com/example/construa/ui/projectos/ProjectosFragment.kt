package com.example.construa.ui.projectos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.construa.databinding.FragmentProjectosBinding

class ProjectosFragment : Fragment() {

    private var _binding: FragmentProjectosBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val projectosViewModel =
            ViewModelProvider(this).get(MaterialViewModel::class.java)

        _binding = FragmentProjectosBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textProjectos
        projectosViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}