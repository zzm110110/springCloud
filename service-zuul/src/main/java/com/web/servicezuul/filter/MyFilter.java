package com.web.servicezuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @version <p>V1.0</p>
 * @Author: <H2>james</H2>
 * @Description: <P>添加说明</P>
 * @Date: <P>CREATE IS 2018/10/10 9:58</P>
 **/
@Component
public class MyFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    /**
     * filterType：返回一个字符串代表过滤器的类型，在zuul中定义了四种不同生命周期的过滤器类型，具体如下：
     *              pre：路由之前
     *              routing：路由之时
     *              post： 路由之后
     *              error：发送错误调用
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        //获取请求内容
        RequestContext ctx = RequestContext.getCurrentContext();
        //获取请求对象
        HttpServletRequest request = ctx.getRequest();
        //打印请求的方式和请求路径
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        //获取请求token
        Object accessToken = request.getParameter("token");
        //判断token是否为空
        if(accessToken == null) {
            log.warn("token is empty");
            //如果请求为空，则zuul设置请求类容失败
            ctx.setSendZuulResponse(false);
            //设置返回的状态码为401
            ctx.setResponseStatusCode(401);
            try {
                //返回的类容：token is empty
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}
            return null;
        }
        log.info("ok");
        return null;
    }
}
