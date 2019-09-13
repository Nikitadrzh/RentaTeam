package ru.nikitadrzh.rentateam.ui.main.view_pager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ru.nikitadrzh.rentateam.ui.main.view_pager.ComboFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.DrinksFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.RefreshmentsFragment
import ru.nikitadrzh.rentateam.ui.main.view_pager.pizza_list.PizzaFragment

class FixedTabsPagerAdapter(
    fm: FragmentManager,
    behavior: Int
) :
    FragmentPagerAdapter(fm, behavior) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaFragment()
            1 -> RefreshmentsFragment()
            2 -> DrinksFragment()
            3 -> ComboFragment()
            else -> PizzaFragment()
        }
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "Пицца"
            1 -> "Закуски"
            2 -> "Напитки"
            3 -> "Комбо"
            else -> "-"
        }
    }
}