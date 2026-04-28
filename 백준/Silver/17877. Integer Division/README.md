# [Silver II] Integer Division - 17877

[문제 링크](https://www.acmicpc.net/problem/17877)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 188, 정답: 117, 맞힌 사람: 96, 정답 비율: 58.537%

### 분류

수학, 자료 구조, 정렬, 집합과 맵, 조합론, 해시를 사용한 집합과 맵, 두 포인터

### 문제 설명

<p>In C++ division with positive integers always rounds down. Because of this, sometimes when two integers are divided by the same divisor they become equal even though they were originally not equal. For example in C++, 5/4 and 7/4 are both equal to 1, but 5 &ne;&nbsp;7.</p>

<p>Given a list of nonnegative integers and a divisor, how many pairs of distinct entries in the list are there that give the same result when both are divided by the divisor in C++?</p>

### 입력

<p>The first line of input contains two integers n (1 &le; n &le; 200 000), the number of elements in the list, and d (1 &le; d &le; 10<sup>9</sup>), the divisor.</p>

<p>The second line of input contains n integers a<sub>1</sub>, . . . , a<sub>n</sub> (0 &le; a<sub>i</sub> &le; 10<sup>9</sup>), where ai is the i<sup>th</sup> element of the list.</p>

### 출력

<p>Display a single integer indicating the number of distinct pairs of indices (i, j) with 1 &le; i &lt; j &le; n such that a<sub>i</sub>/d = a<sub>j</sub>/d when using integer division in C++. Note that the numbers in the list are not necessarily distinct (i.e. it is possible that a<sub>i</sub> = a<sub>j</sub> for some indices i &ne;&nbsp;j).</p>