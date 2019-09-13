package ru.nikitadrzh.rentateam.ui.main.bottom_navigation


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.nikitadrzh.rentateam.R

/**
 * A simple [Fragment] subclass.
 */
class StoresFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_stores, container, false)
    }


}
