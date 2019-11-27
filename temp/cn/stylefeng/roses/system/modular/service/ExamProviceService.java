package cn.stylefeng.roses.system.modular.service;

import cn.stylefeng.roses.system.modular.entity.ExamProvice;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 省网课程考试表（规则：因为考卷是存放在省网系统，此试卷将在考生学习完课程，进入考试的时候生成，和考生id关联，
考生在考试结束前不论省网试卷是否有改动，都会继续使用此试卷考试，若考生一次考试不过需重新考试，需重新获取考卷供学员考试使用） 服务类
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public interface ExamProviceService extends IService<ExamProvice> {

}
