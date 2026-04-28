# [Gold III] Decelerating Jump - 23378

[문제 링크](https://www.acmicpc.net/problem/23378)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 266, 정답: 118, 맞힌 사람: 102, 정답 비율: 52.308%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>An athlete is participating in a new sport that is the perfect mix of hopscotch and triple jumping. For this jury sport, $n$ squares are laid out on the ground in a line, with equal distances between them. The first phase is the approach, where an athlete sprints towards the first square, in which they start their first jump. Then, they may jump on any number of other squares, and must finally land in the last square.</p>

<p>The jury has given a predetermined number of points to jumping in each square, and the score of the athlete will be the sum of the scores of all the squares they jump in, including the very first and last squares.</p>

<p>Due to the nature of this sport, once the athlete starts jumping, they can not accelerate anymore, and the length of consecutive jumps can never increase. Naturally, it is also impossible to reverse direction.</p>

<p>Given the points the jury has allocated to each square, find the maximal possible score an athlete can get on this event.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($2\leq n\leq 3000$), the number of squares.</li>
	<li>One line with $n$ integers $p_1, p_2, \dots, p_n$ ($-10^9\leq p_i\leq 10^9$), the number of points the jury awards for jumping on each of the squares.</li>
</ul>

### 출력

<p>Output the maximum score that an athlete can get.</p>