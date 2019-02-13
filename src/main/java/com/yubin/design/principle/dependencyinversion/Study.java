package com.yubin.design.principle.dependencyinversion;

/**
 * 学生类
 *
 * @Author YUBIN
 * @create 2019-02-13
 */
public class Study {

    //public void studyJavaCourse() {
    //    System.out.println("小王在学习Java课程");
    //}
    //
    //public void studyFECourse() {
    //    System.out.println("小王在学习FE课程");
    //}

    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {
        iCourse.studyCourse();
    }
}
