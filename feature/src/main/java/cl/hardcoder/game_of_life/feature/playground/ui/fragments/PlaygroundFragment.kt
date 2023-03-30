package cl.hardcoder.game_of_life.feature.playground.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.hardcoder.game_of_life.hub.databinding.FragmentPlaygroundBinding

class PlaygroundFragment : Fragment() {
    private var _binding: FragmentPlaygroundBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlaygroundBinding.inflate(inflater, container, false)
        return binding.root
    }
}