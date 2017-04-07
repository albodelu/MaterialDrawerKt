package co.zsmb.materialdrawerkt.draweritems

import android.graphics.drawable.Drawable
import com.mikepenz.materialdrawer.model.PrimaryDrawerItem

class PrimaryDrawerItemKt(name: String, description: String) {

    private val item = PrimaryDrawerItem()

    init {
        item.withName(name)
                .withDescription(description)
    }

    var icon: Int?
        get() = null
        set(value) {
            if (value == null) {
                item.withIcon(null as Drawable?)
                return
            }
            item.withIcon(value)
        }

    var iconTintingEnabled: Boolean?
        get() = null
        set(value) {
            if (value == null) {
                return
            }
            item.withIconTintingEnabled(value)
        }

    internal fun build() = item

}