package com.fineui.java.emptyproject;

import com.fineui.java.core.FineUIPageBase;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.util.HtmlUtils;

/**
 * 项目的页面基类：所有页面都继承它，项目级的公共函数放在这里。
 *
 * <p>什么该放进来：需要请求上下文的（如取会话），或者绝大多数页面都可能用到的。只服务某一类场景的
 * （比如文件上传、多语言）另开一个继承本类的场景基类；入参自足的纯函数放静态工具类。
 *
 * <p>不用重复包装框架已经提供的能力：{@code isPostBack()}、{@code showNotify(...)}、{@code showAlert(...)}、
 * {@code getQueryParam(...)} 等都由父类 {@link FineUIPageBase} 直接给出。
 */
public abstract class PageBase extends FineUIPageBase {

    /** 当前请求的会话。 */
    protected HttpSession session() {
        return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();
    }

    /** HTML 编码：把用户输入或其它不可信数据安全地输出到页面，防止 XSS。 */
    protected String htmlEncode(String text) {
        return HtmlUtils.htmlEscape(text == null ? "" : text);
    }
}
