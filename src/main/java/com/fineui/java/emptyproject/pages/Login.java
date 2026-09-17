package com.fineui.java.emptyproject.pages;

import com.fineui.java.core.EventArgs;
import com.fineui.java.core.FineUIPage;
import com.fineui.java.core.MessageBoxIcon;
import com.fineui.java.core.controls.TextBox;
import com.fineui.java.emptyproject.PageBase;

/**
 * 登录表单示例（路由 {@code login}）：Window ▸ Form ▸ 用户名/密码（必填 + 红星）+ 登录/重置。
 * 硬编码 admin/admin，仅弹通知演示，不做真实认证/会话。
 */
@FineUIPage("login")
public class Login extends PageBase {

    TextBox tbxUserName;
    TextBox tbxPassword;

    public void Page_Load(Object sender, EventArgs e) {
    }

    public void btnLogin_Click(Object sender, EventArgs e) {
        if ("admin".equals(tbxUserName.getValue()) && "admin".equals(tbxPassword.getValue())) {
            showNotify("成功登录！", MessageBoxIcon.Success);
        } else {
            showNotify("用户名或密码错误！", MessageBoxIcon.Error);
        }
    }
}
