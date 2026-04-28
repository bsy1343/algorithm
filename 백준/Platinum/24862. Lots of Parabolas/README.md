# [Platinum IV] Lots of Parabolas - 24862

[문제 링크](https://www.acmicpc.net/problem/24862)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 8, 맞힌 사람: 8, 정답 비율: 88.889%

### 분류

삼분 탐색

### 문제 설명

<p>On a plane there is a set of parabolas given by equations in the form $y = a\cdot x^2 + b\cdot x + c$.</p>

<p>Let&#39;s consider a point to be located <em>inside</em> a parabola if it located above the parabola in case of positive coefficient $a$, or below the parabola in case of negative $a$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/de9abf28-fe63-4429-8091-1465660a81fe/-/preview/" style="width: 236px; height: 275px;" /></p>

<p>On this figure, the point $P$ is located inside both parabolas, the point $Q$ is inside one of them, and the point $R$ is inside none of them.</p>

<p>You need to find any point that is located inside all parabolas. It is guaranteed that such point exists.</p>

### 입력

<p>The first line contains a single integer $n$ ($1 \leq n \leq 100\,000$)  --- the number of parabolas.</p>

<p>Each of the next $n$ lines contains three integers $a$, $b$, $c$ ($|a|, |b|, |c| \leq 10^9$; $a \neq 0$), describing a parabola $y = a\cdot x^2 + b\cdot x + c$.</p>

### 출력

<p>Print two real numbers $x$ and $y$  --- coordinates of a point located inside all parabolas.</p>

<p>The answer is considered correct if there exists a point at distance at most $10^{-6}$ from the printed one, which is located strictly inside all parabolas.</p>