# [Bronze II] Morning Exercises - 27025

[문제 링크](https://www.acmicpc.net/problem/27025)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 73, 정답: 59, 맞힌 사람: 50, 정답 비율: 79.365%

### 분류

구현

### 문제 설명

<p>Each morning, Farmer John leads his cows outside the barn for their morning calisthenics (fit cows give more milk). The cows are required to arrange themselves into two side-by-side lines of the same length. FJ has already set out a 2 x N (1 &le; N &le; 100) strip of pasture on which he wishes to conduct these exercises.  Think of this strip as composed of 2N grid squares. Just when he thought everything was ready, he realized that he had overlooked the trees that grew in some of these squares.  Of course, cows cannot stand on top of trees.</p>

<p>It is important for the purposes of the exercise that the cows be grouped tightly together, so FJ can&#39;t use other parts of the pasture. He has no choice but to split the cows into potentially multiple 2 x [something] groups and conduct the exercises for one group at a time.  FJ likes conducting these exercises on larger groups of cows. Therefore, he wants to find the maximum number of cows he can take out into the pasture at once, while keeping in mind that the cows must occupy a contiguous 2 x K sub-strip (K &le; N).</p>

### 입력

<ul>
	<li>Line 1: An integer, N</li>
	<li>Lines 2..N+1: Each line contains two space-separated integers that describe one 1 x 2 strip of pasture.  A square has a 1 if there is a tree in that square and has a 0 if there is not. The sample input should make this clear.</li>
</ul>

### 출력

<ul>
	<li>Line 1: An integer representing the number of cows that can participate in the exercise at once.</li>
</ul>