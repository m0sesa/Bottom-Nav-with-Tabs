package ng.edu.bowen.bottomnavmizedwithtabs.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import ng.edu.bowen.bottomnavmizedwithtabs.R
import ng.edu.bowen.bottomnavmizedwithtabs.ui.notifications.tabs.Tab1Fragment
import ng.edu.bowen.bottomnavmizedwithtabs.ui.notifications.tabs.Tab2Fragment
import ng.edu.bowen.bottomnavmizedwithtabs.ui.notifications.tabs.Tab3Fragment

private val TAB_TITLES = arrayOf(
    R.string.tab_text_1,
    R.string.tab_text_2,
    R.string.tab_text_3
)

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        // getItem is called to instantiate the fragment for the given page.
        // Return a PlaceholderFragment (defined as a static inner class below).
        return when (position) {
            0 -> {
                Tab1Fragment()
            }
            1 -> {
                Tab2Fragment()
            }
            else -> {
                Tab3Fragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 3 total pages.
        return TAB_TITLES.size
    }
}