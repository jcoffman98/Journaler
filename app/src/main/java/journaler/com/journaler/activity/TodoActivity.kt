package journaler.com.journaler.activity

import journaler.com.journaler.R

/**
 * Created by jcoffman on 2/23/2018.
 */

class TodoActivity : ItemActivity() {
    override val tag = "Todo activity"
    override fun getLayout() = R.layout.activity_todo
}