package cn.stylefeng.roses.system.modular.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class LogTraceLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Long id;

    /**
     * 应用编码
     */
    @TableField("APP_CODE")
    private String appCode;

    /**
     * ip地址
     */
    @TableField("IP")
    private String ip;

    /**
     * 请求路径
     */
    @TableField("SERVLET_PATH")
    private String servletPath;

    /**
     * rpc调用类型，
    G1,     //网关发送请求

    G2,     //接收网关请求（切controller）

    P1,     //调用端发送请求（切consumer）

    P2,     //被调用端接收到请求（切provider）

    P3,     //被调用端发送响应成功

    P4,     //调用端接收到响应成功

    EP3,    //被调用端发送响应失败

    EP4,    //调用端接收到响应失败

    G3,     //控制器响应网关成功

    G4,     //网关接收到成功请求

    EG3,    //控制器接收到错误响应

    EG4,    //网关接收到错误响应
     */
    @TableField("RPC_PHASE")
    private String rpcPhase;

    /**
     * 唯一请求号
     */
    @TableField("TRACE_ID")
    private String traceId;

    /**
     * 节点id
     */
    @TableField("SPAN_ID")
    private String spanId;

    /**
     * 节点父id
     */
    @TableField("PARENT_SPAN_ID")
    private String parentSpanId;

    /**
     * 日志内容
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 生成时间戳
     */
    @TableField("CREATE_TIMESTAMP")
    private Long createTimestamp;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getServletPath() {
        return servletPath;
    }

    public void setServletPath(String servletPath) {
        this.servletPath = servletPath;
    }

    public String getRpcPhase() {
        return rpcPhase;
    }

    public void setRpcPhase(String rpcPhase) {
        this.rpcPhase = rpcPhase;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpanId() {
        return spanId;
    }

    public void setSpanId(String spanId) {
        this.spanId = spanId;
    }

    public String getParentSpanId() {
        return parentSpanId;
    }

    public void setParentSpanId(String parentSpanId) {
        this.parentSpanId = parentSpanId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    @Override
    public String toString() {
        return "LogTraceLog{" +
        "id=" + id +
        ", appCode=" + appCode +
        ", ip=" + ip +
        ", servletPath=" + servletPath +
        ", rpcPhase=" + rpcPhase +
        ", traceId=" + traceId +
        ", spanId=" + spanId +
        ", parentSpanId=" + parentSpanId +
        ", content=" + content +
        ", createTimestamp=" + createTimestamp +
        "}";
    }
}
