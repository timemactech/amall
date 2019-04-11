package com.timemac.amall.pay.config;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

/**
 * @author ivanyu
 */
@Configuration
@EnableApolloConfig(value = {"application", "amall.common"}, order = Ordered.HIGHEST_PRECEDENCE)
public class AppConfig {
}
