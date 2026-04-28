# [Platinum II] Beautiful Mountains - 22265

[문제 링크](https://www.acmicpc.net/problem/22265)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 31, 맞힌 사람: 26, 정답 비율: 65.000%

### 분류

자료 구조, 조화수

### 문제 설명

<p>A subarray of an array is a contiguous portion of the array. A partition of an array into subarrays is a collection of subarrays that cover all the array without overlaps (each element in the array belongs to exactly one subarray). For instance, if A = [3, 1, 4, 1, 5] is an array, [3, 1, 4] and [1, 5] form a partition of A into subarrays, while [3, 4, 5] is not a subarray of A.</p>

<p>Those are standard definitions that you may have read elsewhere. So, what&rsquo;s new here? Well, a few more definitions follow.</p>

<p>Given an array A of integers, a subarray [A<sub>i</sub>, A<sub>i+1</sub>, . . . , A<sub>j</sub>] of A is called a mountain if there exists an index k such that i &lt; k &lt; j, the subarray from A<sub>i</sub> to A<sub>k</sub> is non-decreasing, and the subarray from A<sub>k</sub> to A<sub>j</sub> is non-increasing. In simple words, the values in the subarray &ldquo;go up&rdquo; until index k and then &ldquo;go down&rdquo;, resembling a mountain. Note that a subarray with fewer than three elements cannot be a mountain.</p>

<p>An array of integers is called a beautiful mountain chain if it can be partitioned into mountains, each of them having the same number of elements, except for the last mountain which may have fewer elements.</p>

<p>As an example, [5, 10, 4, 1, 3, 2] is a beautiful mountain chain because it can be partitioned into [5, 10, 4] and [1, 3, 2], being both mountains that have the same number of elements. Another example is the array [5, 10, 4, 4, 10, 20, 30, 20, 2, 3, 1], which is also a beautiful mountain chain because it can be partitioned into [5, 10, 4, 4], [10, 20, 30, 20] and [2, 3, 1].</p>

<p>Given an array of positive integers, where some values can be missing, determine if it is possible to complete the array with positive integers such that it becomes a beautiful mountain chain.</p>

### 입력

<p>The first line contains an integer N (3 &le; N &le; 10<sup>5</sup>) indicating the number of elements in the array. The second line contains N integers A<sub>1</sub>, A<sub>2</sub>, . . . , A<sub>N</sub> (A<sub>i</sub> = &minus;1 or 1 &le; A<sub>i</sub> &le; 10<sup>9</sup> for i = 1, 2, . . . , N), where A<sub>i</sub> = &minus;1 indicates that the i-th element of the array needs to be determined, and a positive value is the actual i-th element of the array.</p>

### 출력

<p>Output a single line with the uppercase letter &ldquo;<code>Y</code>&rdquo; if it is possible to complete the array with positive integers such that it becomes a beautiful mountain chain, and the uppercase letter &ldquo;<code>N</code>&rdquo; otherwise.</p>