# [Platinum III] Mouse Trap - 32901

[문제 링크](https://www.acmicpc.net/problem/32901)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 2048 MB

### 통계

제출: 62, 정답: 45, 맞힌 사람: 41, 정답 비율: 74.545%

### 분류

기댓값의 선형성, 기하학, 누적 합, 다각형의 넓이, 수학, 조합론, 확률론

### 문제 설명

<p>Medea the cat is a real troublemaker. Even though she is loving and caring with humans, sometimes she likes to crash on mouse parties in the field nearby her house, uninvited, just for the fun of it!</p>

<p>A mouse party is a bunch of mice standing on the vertices of a convex polygon in the two-dimensional plane. When Medea crashes a mouse party, she jumps, out of nowhere, to some point inside the party's polygon. All the mice and Medea can be considered as points in the two-dimensional plane, meaning that they have no shape or dimensions.</p>

<p>Medea is still careful, however. She considers how the mice might encircle her, so that she runs away before they get a chance to do so. Medea defines an <em>encirclement</em> as a subset of exactly three mice such that she lies strictly inside the triangle constructed with the mice as vertices. An example can be seen in Figure M.1.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/32901.%E2%80%85Mouse%E2%80%85Trap/91ea024f.png" data-original-src="https://boja.mercury.kr/assets/problem/32901-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 202px; height: 200px;"></p>

<p style="text-align: center;">Figure M.1: Illustration of Sample Input 2, showing one of the three encirclements in the case where Medea jumps to $(1.4, 1.4)$.</p>

<p>One day, Medea decided to crash on a party of mice. She does not jump accurately, so she does not know exactly which point inside the mouse party she is going to jump to -- all she knows is that she will jump to a uniformly random point with real coordinates inside the mouse party.</p>

<p>Medea wants to know the expected number of distinct encirclements after she lands inside the party. This turned out to be too difficult to calculate, even for Medea's 200 IQ points, so she asked for your help!</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with an integer $n$ ($3 \leq n \leq 2\cdot 10^5$), the number of mice.</li>
	<li>$n$ lines, each with two integers $x$ and $y$ ($|x|, |y| \leq 10^7$), the coordinates of a mouse.</li>
</ul>

<p>The coordinates of the mice are given in counterclockwise order and form a strictly convex polygon with non-zero area. A strictly convex polygon is a convex polygon such that no three consecutive vertices are on a straight line.</p>

### 출력

<p>Output the expected number of encirclements after Medea lands inside the polygon.</p>

<p>Your answer should have an absolute or relative error of at most $10^{-4}$.</p>