package cl.hardcoder.game_of_life.feature.playground.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.hardcoder.game_of_life.feature.playground.ui.widgets.CanvasView
import cl.hardcoder.game_of_life.hub.databinding.FragmentPlaygroundBinding

class PlaygroundFragment : Fragment() {
    private var _binding: FragmentPlaygroundBinding? = null
    private val binding get() = _binding!!

    private val canvasView by lazy { binding.canvasContainer }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPlaygroundBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        canvasView.addView(CanvasView(requireContext(), null))
    }

}