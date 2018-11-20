package com.leyoujia.bigdata.entity.result;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.*;

/**
 * API返回值的默认实现.如果返回的具体值为boolean类型, 则不用封装, 直接通过{@link #isSuccess()}取得具体返回值
 *
 * @author hechengfei
 */
public class BaseResultBean implements Serializable {

    private static final long serialVersionUID = 8717072362872890985L;

    private boolean success = true; // 执行是否成功
    private String resultCode;
    protected Set<String> errors = new HashSet<String>();

    /**
     * 在Service请不要设置， 该对象用于在客户端加载错误信息
     */
    private Map<String, String> errorMessages;

    /**
     * 步骤检查执行中的数据模型。
     * <p/>
     * 在执行一些步骤检查完成之后，需要设置一下数据模型，以便调用步骤检查的业务对象可以获得数据
     * <p/>
     * 值参考
     *
     * @see ResultModelKeyConstant
     */
    private Map<String, Object> context = new HashMap<String, Object>();

    /**
     * 创建一个result。
     */
    public BaseResultBean() {
    }

    public BaseResultBean(BaseResultBean result) {
        merge(result);
    }

    public void merge(BaseResultBean result) {
        if (result == null)
            return;

        this.setSuccess(result.isSuccess());
        this.setResultCode(result.getResultCode());
        this.getErrors().addAll(result.getErrors());
    }

    /**
     * 创建一个result。
     *
     * @param success 是否成功
     */
    public BaseResultBean(final boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }

    public boolean isFailure() {
        return !success;
    }

    public void setSuccess(final boolean success) {
        this.success = success;
    }

    /**
     * @return the resultCode
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * @param resultCode the resultCode to set
     */
    public void setResultCode(final String resultCode) {
        this.resultCode = resultCode;
    }

    public Set<String> getErrors() {
        return errors;
    }

    public void setErrors(final Set<String> errors) {
        this.errors = errors;
    }

    public String getErrorStr() {
        if (errors.isEmpty()) {
            return null;
        }
        final StringBuilder sb = new StringBuilder();
        for (final String e : errors) {
            sb.append(e);
            sb.append(",");
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public void addErrors(final Set<String> errors) {
        if (errors.size() > 0) {
            success = false; // 指示验证失败
            this.errors.addAll(errors);
        }
    }

    /**
     * 添加错误信息，并将状态设置为false<br>
     * 当输入错误信息为空时候，不改变当前result状态
     *
     * @param error 错误信息, 也可为错误码
     * @return 当前result状态
     */
    public boolean addError(final String error) {
        if (StringUtils.isBlank(error)) {
            return success;
        }
        errors.add(error);
        success = false; // 指示验证失败
        return success;
    }

    /**
     * 如果<code>expression</code>表达式为true, 则添加error
     *
     * @param problem true表示有问题, false表示没问题
     * @param error   错误信息, 也可为错误码
     * @return 当前result状态
     */
    public boolean addError(final boolean problem, final String error) {
        if (!problem) { // false 不添加出错信息
            return success;
        }

        return addError(error);
    }

    /**
     * 添加error code和字符串类型的上下文信息
     *
     * @param error     错误信息, 也可为错误码
     * @param arguments 上下文参数信息, 比如"第xxx张图片"
     */
    @SuppressWarnings("unchecked")
    public void addError(final String error, final String... arguments) {
        if (StringUtils.isBlank(error)) {
            return;
        }

        addError(error);

        if (arguments != null) {
            List<String> value = null;
            if (context.containsKey(error)) {
                value = (List<String>) context.get(error);
            } else {
                value = new ArrayList<String>();
                context.put(error, value);
            }

            for (String argument : arguments) {
                if (StringUtils.isNotEmpty(argument)) {
                    value.add(argument);
                }
            }
        }

        success = false; // 指示验证失败
    }

    /**
     * 添加错误信息
     *
     * @param error
     * @param message
     */
    public void addErrorMessageIfNotNull(final String error, final String message) {
        if (StringUtils.isBlank(error)) {
            return;
        }
        addError(error);
        if (StringUtils.isBlank(message)) {
            return;
        }
        this.context.put(error, message);
    }

    /**
     * @return the models
     */
    public Map<String, Object> getContext() {
        return context;
    }

    /**
     * @param context the models to set
     */
    public void setContext(final Map<String, Object> context) {
        this.context = context;
    }

    public void putContext(final String key, final Object value) {
        this.context.put(key, value);
    }

    public void putContext(Map<String, Object> context) {
        this.context.putAll(context);
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this,
                ToStringStyle.SHORT_PREFIX_STYLE);
    }

    public void addErrorMessage(String errorCode, String message) {
        this.success = false;
        if (errorMessages == null) {
            errorMessages = new HashMap<String, String>();
        }
        errorMessages.put(errorCode, message);
    }

    public void setErrorMessages(final Map<String, String> errorMessages) {
        this.success = false;
        if (this.errorMessages == null) {
            this.errorMessages = errorMessages;
        } else {
            this.errorMessages.putAll(errorMessages);
        }
    }

    public Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    public String getErrorMessageContent() {
        if (errorMessages == null || errorMessages.isEmpty()) {
            return StringUtils.EMPTY;
        }
        return errorMessages.values().iterator().next();
    }
}
