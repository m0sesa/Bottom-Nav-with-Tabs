package ng.edu.bowen.bottomnavmizedwithtabs.ui.home

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

class HomeFragment : Fragment() {

    private val _tag = HomeFragment::class.java.name

    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MainActivity.showActionBarAndHideTabs()

        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
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