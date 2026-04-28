# [Platinum IV] Wipe Your Whiteboards - 11635

[문제 링크](https://www.acmicpc.net/problem/11635)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 256 MB

### 통계

제출: 418, 정답: 163, 맞힌 사람: 127, 정답 비율: 38.138%

### 분류

수학, 정수론, 확장 유클리드 호제법

### 문제 설명

<p>You enter an empty classroom to do some homework, and you find out that someone did not clean the whiteboard properly. Apparently, the previous instruction in that room has been about the Extended Euclidean algorithm, because you see lots of intermediate results of this algorithm on the whiteboard. However, some parts of it have been wiped out, so you don&rsquo;t see everything they did. In particular, you&rsquo;re not sure what numbers they used as the inputs for the algorithm. As you didn&rsquo;t really feel like doing your homework in the first place, you decide to see if you can figure out the numbers they started with.</p>

<p>Looking at the algorithm as executed on the whiteboard, you can determine one thing for certain from their intermediate results: given that their inputs were A and B (A, B &ge; 1, both integers), you see three integers R, S and Q (with R &ge; 2, S &le; &minus;2 and Q &ge; 1), for which you know that A &middot; R + B &middot; S = Q. Now, given these three numbers, you want to figure out the A and B they started out with. Unfortunately, you quickly realize that there may not be a single A and B pair that fit this, so you decide to go looking for the pair with smallest positive A and B. Finally, you decide to not actually bother trying to find an A and B such that R, S and Q are intermediate results of the Extended Euclidean algorithm applied on A and B: you decide you&rsquo;re happy if they just satisfy A &middot; R + B &middot; S = Q.</p>

### 입력

<p>The input starts with a line containing an integer T, the number of test cases. Then for each test case:</p>

<ul>
	<li>One line with three space-separated integers R, S and Q. These satisfy 2 &le; R &le; 10<sup>8</sup> , &minus;10<sup>8</sup> &le; S &le; &minus;2 and 1 &le; Q &le; 10<sup>8</sup>. You are given that Q is a multiple of the greatest common divisor of R and S.</li>
</ul>

### 출력

<p>For each test case, output one line with two space-separated integers A &ge; 1 and B &ge; 1, the smallest such pair of numbers so that A &middot; R + B &middot; S = Q. By the smallest pair, we mean the pair such that A is minimal and if there are multiple such pairs the one of these for which B is minimal.</p>