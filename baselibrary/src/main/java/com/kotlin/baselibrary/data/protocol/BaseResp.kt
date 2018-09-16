package com.kotlin.baselibrary.data.protocol

/**
 * @author Lin
 * @date 2018/9/15
 * @function 数据模型基类
 *
 * @status:响应状态码
 * @message:响应文字消息
 * @data:具体响应业务对象
 */
class BaseResp <out T>(val status:Int, val message:String, val data:T)
//知识点：out表示类是将泛型作为内部方法的返回（https://www.jianshu.com/p/c5ef8b30d768）