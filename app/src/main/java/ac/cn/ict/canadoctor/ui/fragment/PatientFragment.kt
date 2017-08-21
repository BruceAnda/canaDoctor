package ac.cn.ict.canadoctor.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ac.cn.ict.canadoctor.R
import ac.cn.ict.canadoctor.adapter.PaitientListAdapter
import ac.cn.ict.canadoctor.base.BaseFragment
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_patient.*


/**
 * A simple [Fragment] subclass.
 */
class PatientFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_patient, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        paitentList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        paitentList.adapter = PaitientListAdapter(context)
    }
}// Required empty public constructor
