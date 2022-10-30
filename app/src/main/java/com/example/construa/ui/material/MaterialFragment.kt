package com.example.construa.ui.material

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.construa.databinding.FragmentMaterialBinding
import com.example.construa.ui.projectos.MaterialViewModel

class MaterialFragment : Fragment() {

    private var _binding: FragmentMaterialBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val materialViewModel =
            ViewModelProvider(this)[MaterialViewModel::class.java]

        _binding = FragmentMaterialBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMaterial
        materialViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}