# [Platinum III] Safe Distance - 21210

[문제 링크](https://www.acmicpc.net/problem/21210)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 120, 정답: 75, 맞힌 사람: 66, 정답 비율: 66.667%

### 분류

자료 구조, 그래프 이론, 기하학, 이분 탐색, 분리 집합, 매개 변수 탐색

### 문제 설명

<p>The past year has been difficult, with a virus spreading among the population. Fortunately, Alice knows that one of the keys to be healthy is to keep a safe distance from other people.</p>

<p>Alice is currently in a closed room, represented in the $2D$ plane, with width $X$ and height $Y$. There are $N$ other people inside the room, and we&#39;re given their $(x_i, y_i)$ coordinates.</p>

<p>We consider Alice and the $N$ people as points in the $2D$ plane. Alice&#39;s initial position is $(0, 0)$ and she wants to move to the exit at position $(X, Y)$. She can move freely in any direction inside the room, but can not step outside the room bounds.</p>

<p>Find the maximum distance Alice can keep from other people while moving from $(0, 0)$ to $(X, Y)$.</p>

### 입력

<p>The input begins with one line containing two space-separated integers, $X$ and $Y$, where $X$ is the width, and $Y$ is the height of the room. &nbsp;The second line consists of a single integer $N$, the number of people in the room. &nbsp;Then $N$ lines follow, each of them consisting of two floating-point numbers $x_i$ and $y_i$, the coordinates of the $i^{th}$ person in the room.</p>

### 출력

<p>The output consists of a single value $d$, the maximum safe distance, &nbsp;as a floating-point number.&nbsp;</p>

<p>An additive or multiplicative error of $10^{-5}$ is tolerated: if $d$ is the answer, any number either within $[d - 10^{-5}; d + 10^{-5}]$ or within $[(1 - 10^{-5})d ;(1 + 10^{-5})d]$ is accepted.</p>

### 제한

<ul>
	<li>$1 \le X, Y \le 1\,000\,000 $</li>
	<li>$1 \le N \le 1\,000$</li>
	<li>$0 \le x_i \le X$</li>
	<li>$0 \le y_i \le Y$</li>
</ul>