package cn.stylefeng.roses.system.modular.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 课件学习记录
 * </p>
 *
 * @author Hyer
 * @since 2019-11-26
 */
public class TsVideoCourseSession implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    /**
     * 学员id
     */
    private Long userId;

    /**
     * 课程id
     */
    private String courseId;

    private String scoid;

    /**
     * 学习开始时间
     */
    private LocalDateTime startTime;

    /**
     * 学习结束时间
     */
    private LocalDateTime endTime;

    /**
     * 初始化
     */
    private Integer initialized;

    /**
     * 最新错误代号
     */
    private String lastErrorCode;

    /**
     * 学习进度
     */
    private String lessonPercent;

    /**
     * 视频播放位置
     */
    private String cmiCoreLessonLocation;

    /**
     * 视频学分
     */
    private String cmiCoreCredit;

    /**
     * 课程状态
     */
    private String cmiCoreLessonStatus;

    private String cmiCoreEntry;

    private String cmiCoreScoreRaw;

    /**
     * 学习总时长
     */
    private String cmiCoreTotalTime;

    private String cmiCoreLessonMode;

    private String cmiCoreExit;

    private String cmiCoreSessionTime;

    private String cmiSuspendData;

    private String cmiLaunchData;

    private String cmiComments;

    private String cmiCommentsFromLms;

    private Long learnedTimeSpan;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getScoid() {
        return scoid;
    }

    public void setScoid(String scoid) {
        this.scoid = scoid;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public Integer getInitialized() {
        return initialized;
    }

    public void setInitialized(Integer initialized) {
        this.initialized = initialized;
    }

    public String getLastErrorCode() {
        return lastErrorCode;
    }

    public void setLastErrorCode(String lastErrorCode) {
        this.lastErrorCode = lastErrorCode;
    }

    public String getLessonPercent() {
        return lessonPercent;
    }

    public void setLessonPercent(String lessonPercent) {
        this.lessonPercent = lessonPercent;
    }

    public String getCmiCoreLessonLocation() {
        return cmiCoreLessonLocation;
    }

    public void setCmiCoreLessonLocation(String cmiCoreLessonLocation) {
        this.cmiCoreLessonLocation = cmiCoreLessonLocation;
    }

    public String getCmiCoreCredit() {
        return cmiCoreCredit;
    }

    public void setCmiCoreCredit(String cmiCoreCredit) {
        this.cmiCoreCredit = cmiCoreCredit;
    }

    public String getCmiCoreLessonStatus() {
        return cmiCoreLessonStatus;
    }

    public void setCmiCoreLessonStatus(String cmiCoreLessonStatus) {
        this.cmiCoreLessonStatus = cmiCoreLessonStatus;
    }

    public String getCmiCoreEntry() {
        return cmiCoreEntry;
    }

    public void setCmiCoreEntry(String cmiCoreEntry) {
        this.cmiCoreEntry = cmiCoreEntry;
    }

    public String getCmiCoreScoreRaw() {
        return cmiCoreScoreRaw;
    }

    public void setCmiCoreScoreRaw(String cmiCoreScoreRaw) {
        this.cmiCoreScoreRaw = cmiCoreScoreRaw;
    }

    public String getCmiCoreTotalTime() {
        return cmiCoreTotalTime;
    }

    public void setCmiCoreTotalTime(String cmiCoreTotalTime) {
        this.cmiCoreTotalTime = cmiCoreTotalTime;
    }

    public String getCmiCoreLessonMode() {
        return cmiCoreLessonMode;
    }

    public void setCmiCoreLessonMode(String cmiCoreLessonMode) {
        this.cmiCoreLessonMode = cmiCoreLessonMode;
    }

    public String getCmiCoreExit() {
        return cmiCoreExit;
    }

    public void setCmiCoreExit(String cmiCoreExit) {
        this.cmiCoreExit = cmiCoreExit;
    }

    public String getCmiCoreSessionTime() {
        return cmiCoreSessionTime;
    }

    public void setCmiCoreSessionTime(String cmiCoreSessionTime) {
        this.cmiCoreSessionTime = cmiCoreSessionTime;
    }

    public String getCmiSuspendData() {
        return cmiSuspendData;
    }

    public void setCmiSuspendData(String cmiSuspendData) {
        this.cmiSuspendData = cmiSuspendData;
    }

    public String getCmiLaunchData() {
        return cmiLaunchData;
    }

    public void setCmiLaunchData(String cmiLaunchData) {
        this.cmiLaunchData = cmiLaunchData;
    }

    public String getCmiComments() {
        return cmiComments;
    }

    public void setCmiComments(String cmiComments) {
        this.cmiComments = cmiComments;
    }

    public String getCmiCommentsFromLms() {
        return cmiCommentsFromLms;
    }

    public void setCmiCommentsFromLms(String cmiCommentsFromLms) {
        this.cmiCommentsFromLms = cmiCommentsFromLms;
    }

    public Long getLearnedTimeSpan() {
        return learnedTimeSpan;
    }

    public void setLearnedTimeSpan(Long learnedTimeSpan) {
        this.learnedTimeSpan = learnedTimeSpan;
    }

    @Override
    public String toString() {
        return "TsVideoCourseSession{" +
        "id=" + id +
        ", userId=" + userId +
        ", courseId=" + courseId +
        ", scoid=" + scoid +
        ", startTime=" + startTime +
        ", endTime=" + endTime +
        ", initialized=" + initialized +
        ", lastErrorCode=" + lastErrorCode +
        ", lessonPercent=" + lessonPercent +
        ", cmiCoreLessonLocation=" + cmiCoreLessonLocation +
        ", cmiCoreCredit=" + cmiCoreCredit +
        ", cmiCoreLessonStatus=" + cmiCoreLessonStatus +
        ", cmiCoreEntry=" + cmiCoreEntry +
        ", cmiCoreScoreRaw=" + cmiCoreScoreRaw +
        ", cmiCoreTotalTime=" + cmiCoreTotalTime +
        ", cmiCoreLessonMode=" + cmiCoreLessonMode +
        ", cmiCoreExit=" + cmiCoreExit +
        ", cmiCoreSessionTime=" + cmiCoreSessionTime +
        ", cmiSuspendData=" + cmiSuspendData +
        ", cmiLaunchData=" + cmiLaunchData +
        ", cmiComments=" + cmiComments +
        ", cmiCommentsFromLms=" + cmiCommentsFromLms +
        ", learnedTimeSpan=" + learnedTimeSpan +
        "}";
    }
}
