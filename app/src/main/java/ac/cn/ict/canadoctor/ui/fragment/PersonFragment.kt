package ac.cn.ict.canadoctor.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ac.cn.ict.canadoctor.R
import ac.cn.ict.canadoctor.base.BaseFragment


/**
 * A simple [Fragment] subclass.
 */
class PersonFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_person, container, false)
    }

}// Required empty public constructor
