package ng.edu.bowen.bottomnavmizedwithtabs.ui.notifications

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.fragment_notifications.view.*
import ng.edu.bowen.bottomnavmizedwithtabs.MainActivity
import ng.edu.bowen.bottomnavmizedwithtabs.R
import ng.edu.bowen.bottomnavmizedwithtabs.adapters.SectionsPagerAdapter

class NotificationsFragment : Fragment() {

    private val _tag = NotificationsFragment::class.java.name

    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        MainActivity.hideActionBarAndShowTabs()

        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_notifications, container, false)

        val viewPager = root.viewPager
        viewPager.adapter = SectionsPagerAdapter(context!!, childFragmentManager)
        MainActivity.tabLayout.setupWithViewPager(viewPager)

        return root
    }

    override fun onDestroy() {
        super.onDestroy()
        _tag.let {
            Log.d("lol", it+"destroy")
        }
    }

    override fun onDetach() {
        super.onDetach()
        _tag.let {
            Log.d("lol", it+"detached")
        }
    }
}