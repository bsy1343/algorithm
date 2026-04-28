# [Platinum I] Maximal Sum - 13050

[문제 링크](https://www.acmicpc.net/problem/13050)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 167, 정답: 39, 맞힌 사람: 34, 정답 비율: 24.113%

### 분류

자료 구조, 세그먼트 트리, 두 포인터, 오프라인 쿼리, 최대 부분 배열 문제

### 문제 설명

<p>Marty wants to get back to the future from the past. But the computer system of his time machine is broken, so he needs to make some calculations by himself and then enter the results.</p>

<p>Marty has two arrays of integers: a[1..n] and b[1..m]. For each b<sub>j</sub> Marty needs to find the segment a[l..r] such that each element in it is greater or equal to b<sub>j</sub> and the sum of elements a[l] + a[l + 1] + ... + a[r] is maximal possible. These sums must be entered into time machine&#39;s computer system to get Marty back to the future.</p>

<p>Help him, write the program to solve this problem.</p>

### 입력

<p>The first line of input contains two integers n and m (1 &le; n, m &le; 10<sup>5</sup>) &mdash; the sizes of arrays a and b, respectively.</p>

<p>The second line contains n integers a<sub>i</sub> ( -10<sup>9</sup> &le; a<sub>i</sub> &le; 10<sup>9</sup>).</p>

<p>The third line contains n integers b<sub>j</sub> ( -10<sup>9</sup> &le; b<sub>j</sub> &le; 10<sup>9</sup>).</p>

### 출력

<p>Output m integers, the j-th of them must be the required maximal sum for b<sub>j</sub>. If there is no such segment in a array, output 0 instead.</p>

<p>&nbsp;</p>