package cl.hardcoder.game_of_life.feature.hub.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.hardcoder.game_of_life.hub.databinding.FragmentHubBinding

class HubFragment : Fragment() {
    private var _binding: FragmentHubBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentHubBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initObservables()
        initViews()
    }

    private fun initObservables() {
//        TODO: not yet implemented
    }

    private fun initViews() {
//        TODO: not yet implemented
    }
}