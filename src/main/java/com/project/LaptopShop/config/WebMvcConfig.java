package com.project.LaptopShop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration // 1. Đánh dấu đây là lớp cấu hình Spring
@EnableWebMvc  // 2. Kích hoạt cấu hình Spring MVC tùy chỉnh (quan trọng!)
public class WebMvcConfig implements WebMvcConfigurer { // 3. Implement interface để tùy chỉnh

    @Bean // 4. Đánh dấu phương thức này tạo ra một Spring Bean
    public ViewResolver viewResolver() { // 5. Phương thức tạo Bean ViewResolver
        final InternalResourceViewResolver bean = new InternalResourceViewResolver(); // 6. Tạo đối tượng InternalResourceViewResolver

        bean.setViewClass(JstlView.class); // 7. Hỗ trợ JSTL
        bean.setPrefix("/WEB-INF/view/"); // 8. Đặt tiền tố đường dẫn (!!!)
        bean.setSuffix(".jsp"); // 9. Đặt hậu tố file
        return bean; // Trả về bean đã cấu hình
    }

    @Override // Ghi đè phương thức từ WebMvcConfigurer
    public void configureViewResolvers(ViewResolverRegistry registry) { // 10. Phương thức để đăng ký ViewResolver (có thể không cần thiết)
        registry.viewResolver(viewResolver()); // 11. Đăng ký ViewResolver đã tạo ở trên
    }
}
