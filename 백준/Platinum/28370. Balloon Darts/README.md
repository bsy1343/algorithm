# [Platinum III] Balloon Darts - 28370

[문제 링크](https://www.acmicpc.net/problem/28370)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 219, 정답: 50, 맞힌 사람: 42, 정답 비율: 20.896%

### 분류

기하학, 무작위화, 비둘기집 원리

### 문제 설명

<p>As you may know, you get a colourful balloon for each problem you solve in an ICPC contest. You were quite successful in your last contest and now you own a remarkable collection of $n$ balloons. The obvious thing to do with these balloons is to pop them all using darts. However, you only have three darts.</p>

<p>The balloons are modelled as points in the plane with fixed locations. For each dart you choose from where and in which direction to throw it. The dart travels in a straight line, popping all balloons in its way.</p>

<p>As you practised a lot during the last years, you can throw a dart precisely in any direction and it will fly infinitely far. Thus, if anyone can pop all the balloons, it is you. However, before the fun begins, you first need to determine if you can pop all balloons using at most three darts.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line containing an integer $n$ ($1 \leq n \leq 10^4$), the number of balloons.</li>
	<li>$n$ lines, each containing two integers $x$ and $y$ ($|x|, |y| \leq 10^9$), the coordinates of a balloon.</li>
</ul>

<p>It is guaranteed that no two balloons are at the same location.</p>

### 출력

<p>Output &quot;<code>possible</code>&quot; if three darts are sufficient to pop all balloons and &quot;<code>impossible</code>&quot; otherwise.</p>