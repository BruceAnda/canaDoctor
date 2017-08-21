package ac.cn.ict.canadoctor.ui.activity

import ac.cn.ict.canadoctor.R
import ac.cn.ict.canadoctor.adapter.MainPagerAdapter
import ac.cn.ict.canadoctor.base.BaseActivity
import ac.cn.ict.canadoctor.base.BaseFragment
import ac.cn.ict.canadoctor.ui.fragment.MessageFragment
import ac.cn.ict.canadoctor.ui.fragment.PatientFragment
import ac.cn.ict.canadoctor.ui.fragment.PersonFragment
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 程序的主界面
 */
class MainActivity : BaseActivity() {

    val mPagerChangeListener = object : ViewPager.OnPageChangeListener {
        override fun onPageScrollStateChanged(state: Int) {
            // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }

        val mTabIds = arrayOf(R.id.rbPatient, R.id.rbMessage, R.id.rbPerson)
        override fun onPageSelected(position: Int) {
            // 根据页面变化选中底部导航
            rgTabs.check(mTabIds[position])
        }
    }

    var mOnCheckedChangeListener = object : RadioGroup.OnCheckedChangeListener {
        override fun onCheckedChanged(p0: RadioGroup?, p1: Int) {
            // 根据点击底部导航的id选中对应的页面
            when (p1) {
                R.id.rbPatient -> vpPagers.currentItem = 0
                R.id.rbMessage -> vpPagers.currentItem = 1
                R.id.rbPerson -> vpPagers.currentItem = 2
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 初始化页面
        val pagers = ArrayList<BaseFragment>()
        pagers.add(PatientFragment())
        pagers.add(MessageFragment())
        pagers.add(PersonFragment())
        vpPagers.adapter = MainPagerAdapter(supportFragmentManager, pagers)

        // 添加页面改变监听
        vpPagers.addOnPageChangeListener(mPagerChangeListener)

        // 添加底部导航改变的监听
        rgTabs.setOnCheckedChangeListener(mOnCheckedChangeListener)

        // 设置默认选中患者界面
        rgTabs.check(R.id.rbPatient)
    }
}
