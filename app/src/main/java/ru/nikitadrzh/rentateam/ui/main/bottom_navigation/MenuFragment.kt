package ru.nikitadrzh.rentateam.ui.main.bottom_navigation

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
import kotlinx.android.synthetic.main.fragment_menu.*
import ru.nikitadrzh.rentateam.R
import ru.nikitadrzh.rentateam.ui.main.view_pager.FixedTabsPagerAdapter

class MenuFragment : Fragment(R.layout.fragment_menu) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        menu_view_pager.adapter =
            FixedTabsPagerAdapter(
                childFragmentManager,
                BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
            )
        tabs.setupWithViewPager(menu_view_pager)
    }
}