/**
 * Copyright 2018-2020 stylefeng & Hyer (sn93@qq.com)
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package cn.stylefeng.roses.system.config;

import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnConsumerAop;
import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnControllerAop;
import cn.stylefeng.roses.kernel.logger.chain.aop.ChainOnProviderAop;
import cn.stylefeng.roses.kernel.model.api.AuthService;
import cn.stylefeng.roses.system.api.context.LoginContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * 全局配置
 *
 * @author Hyer
 * @date 2018-08-04-下午5:47
 */
@Configuration
public class ContextConfig {

    /**
     * 获取当前用户的便捷工具
     */
    @Bean
    public LoginContext loginContext(AuthService authService) {
        return new LoginContext(authService);
    }

    /**
     * 调用链治理
     */
    @Bean
    public ChainOnConsumerAop chainOnConsumerAop() {
        return new ChainOnConsumerAop();
    }

    /**
     * 调用链治理
     */
    @Bean
    public ChainOnControllerAop chainOnControllerAop() {
        return new ChainOnControllerAop();
    }

    /**
     * 调用链治理
     */
    @Bean
    public ChainOnProviderAop chainOnProviderAop() {
        return new ChainOnProviderAop();
    }

}
