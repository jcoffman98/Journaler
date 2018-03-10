package journaler.com.journaler.activity

import journaler.com.journaler.R

/**
 * Created by jcoffman on 2/23/2018.
 */

class NoteActivity : ItemActivity() {
    override val tag = "Note activity"
    override fun getLayout() = R.layout.activity_note
}