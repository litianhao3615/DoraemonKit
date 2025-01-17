package com.didichuxing.doraemonkit.kit.viewcheck

import android.app.Activity
import android.content.Context
import com.didichuxing.doraemonkit.DoKit.Companion.launchFloating
import com.didichuxing.doraemonkit.R
import com.didichuxing.doraemonkit.kit.AbstractKit
import com.google.auto.service.AutoService

/**
 * Created by wanglikun on 2018/11/20.
 */
@AutoService(AbstractKit::class)
class ViewCheckerKit : AbstractKit() {
    override val name: Int
        get() = R.string.dk_kit_view_check
    override val icon: Int
        get() = R.mipmap.dk_view_check

    override fun onClickWithReturn(activity: Activity): Boolean {
        launchFloating(ViewCheckDokitView::class.java)
        launchFloating(ViewCheckDrawDokitView::class.java)
        launchFloating(ViewCheckInfoDokitView::class.java)
        return true
    }

    override fun onAppInit(context: Context?) {}
    override val isInnerKit: Boolean
        get() = true

    override fun innerKitId(): String {
        return "dokit_sdk_ui_ck_widget"
    }
}