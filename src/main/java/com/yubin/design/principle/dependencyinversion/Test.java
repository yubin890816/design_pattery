package com.yubin.design.principle.dependencyinversion;

/**
 * 依赖倒置原则的测试类
 *
 * @Author YUBIN
 * @create 2019-02-13
 */
public class Test {

    // V1
    //public static void main(String[] args) {
    //    Study study = new Study();
    //    study.studyJavaCourse();
    //    study.studyFECourse();
    //}

    // v2
    //public static void main(String[] args) {
    //    Study study = new Study();
    //    study.studyImoocCourse(new JavaCourse());
    //    study.studyImoocCourse(new FECourse());
    //}

    public static void main(String[] args) {
        Study study = new Study();
        study.setiCourse(new JavaCourse());
        study.studyImoocCourse();

        study.setiCourse(new FECourse());
        study.studyImoocCourse();
    }
}
