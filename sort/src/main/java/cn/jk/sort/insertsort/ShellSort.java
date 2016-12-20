package cn.jk.sort.insertsort;

import cn.jk.sort.ISort;

/**
 * 插入排序--希尔排序（缩小增量排序）
 *
 * 基本思想：
 *  先将整个待排序的记录分散成若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序
 *
 * 操作方法：
 *  1. 选择一个增量序列 : t1,t2,t3,....tk 其中ti>tj,tk=1
 *  2. 按增量序列个数k，对序列进行k趟排序
 *  3. 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
 *
 * 时间复杂度 : O(n) ~ O(n^2) , 平均O(n^1.3)
 * 空间复杂度 : O(1)
 *
 * 算法实现：
 *  1. 将要排序的一组记录按某个增量d（n/2,n为要排序数的个数）分成若干组子序列，每组中记录的下标相差d.
 *  2. 对每组中全部元素进行直接插入排序，
 *  3. 用一个较小的增量（d/2）对它进行分组，在每组中再进行直接插入排序。
 *  4. 继续不断缩小增量直至为1，最后使用直接插入排序完成排序。
 *
 *
 * Created by JinKai on 2016/12/5.
 */
public class ShellSort implements ISort {


    @Override
    public void sort(Integer[] numbers) {

    }


}
