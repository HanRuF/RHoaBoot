package com.wx;

import io.github.biezhi.wechat.WeChatBot;
import io.github.biezhi.wechat.api.annotation.Bind;
import io.github.biezhi.wechat.api.constant.Config;
import io.github.biezhi.wechat.api.enums.MsgType;
import io.github.biezhi.wechat.api.model.WeChatMessage;
import io.github.biezhi.wechat.utils.StringUtils;

/****
 *
 *  【微信个人账号】
 *
 * 主动回复
 *
 */
public class danli extends WeChatBot {


        public danli(Config config) {
            super(config);

        }

        @Bind(msgType = MsgType.TEXT)
        public void handleText(WeChatMessage message) {
            if (StringUtils.isNotEmpty(message.getName())) {
                System.out.println("接收到 [{}] 的消息: {}"+ message.getName()+message.getText());

                System.out.println("sss"+message.getFromUserName());
                //
               // this.sendMsg("@dace5e50cfca852ef56dffea0485a70b278c9ab58213fbde2aa2d0b012254093","主动发送信息");
               // this.sendImg("@dace5e50cfca852ef56dffea0485a70b278c9ab58213fbde2aa2d0b012254093","C:/Users/user/Desktop/权限系统/7/培罗成量体ios端/liangtiForPage/liangti/image/icon(0).png");
                this.sendMsg(message.getFromUserName(), "自动回复: " + message.getText());
            }
        }


        public  void  text_fs(){
            //
            api().sendText("@ff1fbe36fc66a11667af2702c3f174b8dafe26b33e8237b08706740848cc2c49", "自动回复: 发送信息了，接收到没有" );
        }


        public static void main(String[] args) {
            new danli(Config.me().autoLogin(true).showTerminal(true)).start();

        }


}
