package com.ruoyi.common.filter;

import com.ruoyi.common.constant.Constants;
import com.ruoyi.common.utils.uuid.IdUtils;
import org.slf4j.MDC;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * MDC过滤器
 * 前端的所有请求都有带上traceId
 *
 * @author Administrator
 */
public class LogMdcFilter implements Filter {
    private static final String UNIQUE_ID = "traceId";

    @Override
    public void init(FilterConfig filterConfig) {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        //如果有上层调用就用上层的ID
        String traceId = req.getHeader(Constants.TRACE_ID);
        if (traceId == null) {
            traceId = IdUtils.fastUUID();
        }
        MDC.put(Constants.TRACE_ID, traceId);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        MDC.remove(Constants.TRACE_ID);
    }

}
