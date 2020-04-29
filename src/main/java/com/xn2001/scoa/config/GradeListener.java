package com.xn2001.scoa.config;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.xn2001.scoa.entity.Grade;
import com.xn2001.scoa.service.GradeService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 乐心湖 on 2020/4/26 16:50
 */
@Slf4j
public class GradeListener extends AnalysisEventListener<Grade> {
    private static final Logger LOGGER = LoggerFactory.getLogger(com.xn2001.scoa.config.GradeListener.class);
    /**
     * 每隔2500条存储数据库，实际使用中可以3000条，然后清理list ，方便内存回收
     */
    private static final int BATCH_COUNT = 3000;
    List<Grade> list = new ArrayList();
    /**
     * 假设这个是一个DAO，当然有业务逻辑这个也可以是一个service。当然如果不用存储这个对象没用。
     */
    private GradeService gradeService;

    /**
     * 如果使用了spring,请使用这个构造方法。每次创建Listener的时候需要把spring管理的类传进来
     *
     * @param gradeService
     */
    public GradeListener(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    /**
     * 这个每一条数据解析都会来调用
     *
     * @param data    one row value. Is is same as {@link AnalysisContext#readRowHolder()}
     * @param context
     */
    @Override
    public void invoke(Grade data, AnalysisContext context) {
        list.add(data);
        // 达到BATCH_COUNT了，需要去存储一次数据库，防止数据几万条数据在内存，容易OOM
        if (list.size() >= BATCH_COUNT) {
            saveData();
            // 存储完成清理 list
            list.clear();
        }
    }

    /**
     * 所有数据解析完成了 都会来调用
     *
     * @param context
     */
    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        // 这里也要保存数据，确保最后遗留的数据也存储到数据库
        saveData();
        LOGGER.info("所有数据解析完成！");
    }

    /**
     * 加上存储数据库
     */
    private void saveData() {
        LOGGER.info("{}条数据，开始存储数据库！", list.size());
        // 过滤成绩
        gradeInspect();
        // 存储数据库
        gradeService.insert(list);
        LOGGER.info("存储数据库成功！");
    }


    /**
     * 过滤成绩的额外业务
     */
    public void gradeInspect(){
        for (Grade grade : list) {
            if (grade.getGd() < 60) {
                Integer integer = gradeService.selectCount(grade);
                if (integer == 0) {
                    String sign = grade.getSign();
                    if (sign != null) {
                        grade.setSign(sign + ",不及格");
                    } else {
                        grade.setSign("不及格");
                    }
                } else {
                    String sign = grade.getSign();
                    if (sign != null) {
                        grade.setSign(grade.getSign() + ",补考失败");
                    } else {
                        grade.setSign("不及格");
                    }
                }
            }
        }
    }

}
