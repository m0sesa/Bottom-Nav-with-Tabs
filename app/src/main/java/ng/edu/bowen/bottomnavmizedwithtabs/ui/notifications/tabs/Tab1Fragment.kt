package ng.edu.bowen.bottomnavmizedwithtabs.ui.notifications.tabs


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ng.edu.bowen.bottomnavmizedwithtabs.R

/**
 * A simple [Fragment] subclass.
 */
class Tab1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tab1, container, false)
    }


}
