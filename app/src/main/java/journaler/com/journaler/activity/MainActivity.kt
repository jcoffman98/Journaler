package journaler.com.journaler.activity
import journaler.com.journaler.R

class MainActivity : BaseActivity() {
    override val tag = "Main activity"
    override fun getLayout() = R.layout.activity_main
    override fun getActivityTitle() = R.string.app_name
}
