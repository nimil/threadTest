package xin.nimil.threadtest.enablemoudle;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author:nimil e-mail:nimilgg@qq.com
 * @Date:2019/3/31
 * @Time:19:08
 */
public class HelloWorldImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        return new String[]{HwConfiguration.class.getName()};
    }
}
