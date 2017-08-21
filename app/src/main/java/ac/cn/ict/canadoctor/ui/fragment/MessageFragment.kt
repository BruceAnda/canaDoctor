package ac.cn.ict.canadoctor.ui.fragment


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import ac.cn.ict.canadoctor.R
import ac.cn.ict.canadoctor.adapter.MessageListAdapter
import ac.cn.ict.canadoctor.base.BaseFragment
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_message.*


/**
 * A simple [Fragment] subclass.
 */
class MessageFragment : BaseFragment() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater!!.inflate(R.layout.fragment_message, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        messageList.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        messageList.adapter = MessageListAdapter(context)
    }
}// Required empty public constructor
