package com.czh.taskflow.config;

import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

/**
 * @author: zhehao.chen
 * @version: V1.0
 * @Description:自定义bean过滤
 * @date: 2018/8/20 18:12
 */

public class MyTypeExcludeFilter extends TypeExcludeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) {
        //common包中的PicaLogAspect过滤掉，使用自定义的PicaLogAspectForXml
        if ("com.pica.cloud.foundation.utils.aop.PicaLogAspect".equals(metadataReader.getClassMetadata().getClassName())) {
            return true;
        }
        return false;
    }
}
