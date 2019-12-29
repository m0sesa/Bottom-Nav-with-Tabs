package ng.edu.bowen.bottomnavmizedwithtabs.ui.dashboard

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import ng.edu.bowen.bottomnavmizedwithtabs.MainActivity
import ng.edu.bowen.bottomnavmizedwithtabs.R

class DashboardFragment : Fragment() {

    private val _tag = DashboardFragment::class.java.name

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MainActivity.showActionBarAndHideTabs()

        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        dashboardViewModel.text.observe(this, Observer {
            textView.text = it
        })

        _tag.let {
            Log.d("lol", it)
        }

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