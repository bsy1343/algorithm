# [Gold II] Swipe - 32366

[문제 링크](https://www.acmicpc.net/problem/32366)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 76, 정답: 19, 맞힌 사람: 17, 정답 비율: 27.419%

### 분류

두 포인터, 애드 혹

### 문제 설명

<p>Swipe is a new mobile game that has recently exploded in popularity. In each level of Swipe, you are given 2 rows of integers that can be represented as arrays A and B of size N. The objective of Swipe is to beat each level by turning array A into array B.</p>

<p>There are two swipe operations you can perform on array A.</p>

<ul>
	<li>Swipe right: Select the subarray [ℓ, r] and set A<sub>i</sub> = A<sub>ℓ</sub> for all ℓ ≤ i ≤ r.</li>
	<li>Swipe left: Select the subarray [ℓ, r] and set A<sub>i</sub> = A<sub>r</sub> for all ℓ ≤ i ≤ r.</li>
</ul>

<p>For example, starting with array A = [0, 1, 2, 3, 4, 5], if we swipe right on [2, 4], we would obtain the array [0, 1, 2, 2, 2, 5]. If instead, we started with the same array A, and swiped left on [3, 5], we would obtain the array [0, 1, 2, 5, 5, 5]. Note that these arrays are 0-indexed.</p>

<p>Unfortunately, the game is bugged and contains levels that are impossible to beat. Determine if it is possible to transform array A into array B. If it is possible, determine a sequence of swipe operations that transforms array A into array B.</p>

### 입력

<p>The first line of input will consist of one positive integer N, representing the length of each of the two arrays of integers.</p>

<p>The second line of input contains N space separated integers contained in array A.</p>

<p>The third line of input contains N space separated integers contained in array B.</p>

### 출력

<p>The first line of output will contain <code>YES</code> if there is a sequence of swipes that can transform array A into array B; otherwise, the first line of output will contain <code>NO</code>.</p>

<p>If the first line of output is <code>YES</code>, the next line contains a non-negative integer K (K ≤ N), indicating the number of swipes.</p>

<p>Each of the next K lines contain three space-separated values: D<sub>j</sub>, ℓ<sub>j</sub>, and r<sub>j</sub>. The value D<sub>j</sub> will be either <code>R</code> or <code>L</code>, indicating that the jth swipe is either a right or left swipe, respectively. The values ℓ<sub>j</sub> and r<sub>j</sub> indicate the left-end and right-end of the swipe where 0 ≤ ℓ<sub>j</sub> ≤ r<sub>j</sub> &lt; N.</p>