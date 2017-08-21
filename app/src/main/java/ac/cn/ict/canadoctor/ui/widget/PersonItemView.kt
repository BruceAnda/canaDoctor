package ac.cn.ict.canadoctor.ui.widget

import ac.cn.ict.canadoctor.R
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout

/**
 * 用户信息View
 * Created by zhaoliang on 2017/8/10.
 */
class PersonItemView : LinearLayout {

    constructor(context: Context?) : super(context)
    constructor(context: Context?, attrs: AttributeSet?) : super(context, attrs) {
        LayoutInflater.from(context).inflate(R.layout.person_item, this)
    }

}