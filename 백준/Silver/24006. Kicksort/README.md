# [Silver I] Kicksort - 24006

[문제 링크](https://www.acmicpc.net/problem/24006)

### 성능 요약

시간 제한: 서브태스크 참고 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 27, 정답: 18, 맞힌 사람: 16, 정답 비율: 66.667%

### 분류

구현, 애드 혹, 시뮬레이션

### 문제 설명

<p>Here at Kickstart, we are fans of the well-known&nbsp;<a href="https://en.wikipedia.org/wiki/Quicksort" target="_blank">Quicksort</a>&nbsp;algorithm, which chooses a&nbsp;<i>pivot</i>&nbsp;value from a list, moves each other value into one of two new lists depending on how it compares with the pivot value, and then recursively sorts each of those new lists. However, the algorithm might choose a pivot that causes all of the other values to end up in only one of the two new lists, which defeats the purpose of the divide-and-conquer strategy. We call such a pivot a&nbsp;<i>worst-case pivot</i>.</p>

<p>To try to avoid this problem, we have created our own variant, Kicksort. Someone told us that it is good to use a value in the middle as a pivot, so our algorithm works as follows:</p>

<pre>
  Kicksort(A): // A is a 0-indexed list with E elements
    If E &le; 1, return A.
    Otherwise:
      Create empty new lists B and C.
      Choose A[floor((E-1)/2)] as the pivot P.
      For i = 0 to E-1, except for i = floor((E-1)/2):
        If A[i] &le; P, append it to B.
        Otherwise, append it to C.
    Return the list Kicksort(B) + [P] + Kicksort(C).
    // [P] is a new list with just P; + means concatenate
</pre>

<p>For practice, we are trying Kicksort out on lists that are permutations of the numbers 1 through&nbsp;<b>N</b>. Unfortunately, it looks like Kicksort still has the same problem as Quicksort: it is possible for every pivot to be a worst-case pivot!</p>

<p>For example, consider the list&nbsp;<code>1 4 3 2</code>. Kicksort will choose&nbsp;<code>4</code>&nbsp;as a pivot, and all of the other values&nbsp;<code>1 3 2</code>&nbsp;will end up in one of the two new lists. Then, when Kicksort is called on that list&nbsp;<code>1 3 2</code>, it will choose&nbsp;<code>3</code>, and once again, all of the other values will end up in one of the two new lists. Finally, it will choose&nbsp;<code>1</code>&nbsp;from the list&nbsp;<code>1 2</code>, and the other value&nbsp;<code>2</code>&nbsp;will of course end up in only one of the two new lists. In every case, the algorithm will choose a worst-case pivot. (Notice that when Kicksort is called on a list with 0 or 1 elements, it does not choose a pivot at all.)</p>

<p>Please help us investigate this further! Given a permutation of the numbers 1 through&nbsp;<b>N</b>, determine whether Kicksort will choose only worst-case pivots.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<b>T</b>.&nbsp;<b>T</b>&nbsp;test cases follow; each consists of two lines. The first line has one integer&nbsp;<b>N</b>: the number of elements in the permutation. The second line contains&nbsp;<b>N</b>&nbsp;integers&nbsp;<b>A<sub>i</sub></b>, which are a permutation of the values from 1 through&nbsp;<b>N</b>.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x: y</code>, where&nbsp;<code>x</code>&nbsp;is the test case number (starting from 1) and&nbsp;<code>y</code>&nbsp;is&nbsp;<code>YES</code>&nbsp;if Kicksort will choose only worst-case pivots when sorting this list, or&nbsp;<code>NO</code>&nbsp;otherwise.</p>

### 제한

<ul>
	<li>The values&nbsp;<b>A<sub>i</sub></b>&nbsp;are a permutation of the values from 1 to&nbsp;<b>N</b>.</li>
</ul>

### 힌트

<p>Sample Case #1 is the one described in the problem statement.</p>

<p>In Sample Case #2, our first pivot will be&nbsp;<code>1</code>, which is a worst-case pivot, because it causes all of the other values&nbsp;<code>2 3 4</code>&nbsp;to end up in one of the two new lists. However, the Kicksort call on the list&nbsp;<code>2 3 4</code>&nbsp;will choose&nbsp;<code>3</code>&nbsp;as a pivot. This is not a worst-case pivot, because it puts&nbsp;<code>2</code>&nbsp;in one of the new lists, and&nbsp;<code>4</code>&nbsp;in the other.</p>

<p>In Sample Case #3, Kicksort will start by choosing the worst-case pivot&nbsp;<code>2</code>, and then it has no other pivot choices to make.</p>

<p>In Sample Case #4, Kicksort will start by choosing&nbsp;<code>2</code>, which is not a worst-case pivot.</p>