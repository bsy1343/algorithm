# [Gold I] Squary - 25125

[문제 링크](https://www.acmicpc.net/problem/25125)

### 성능 요약

시간 제한: 서브태스크 참고, 메모리 제한: 1024 MB

### 통계

제출: 96, 정답: 67, 맞힌 사람: 50, 정답 비율: 79.365%

### 분류

수학, 애드 혹, 해 구성하기

### 문제 설명

<p>Addition and squaring do not commute. That is, the square of the sum of all elements of a list of integers is not necessarily equal to the sum of the squares of those same elements. However, this is true for some lists; one example is $[3,-2,6]$, because $(3+(-2)+6)^2=49=3^2+(-2)^2+6^2$. Let us call these lists <i>squary</i>.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7c975379-291a-4b0b-a76f-2f213b0c8ad8/-/preview/" /></p>

<p>Given a (not necessarily squary) list of relatively small integers, we want to know whether it is possible to add at least $1$ and at most $K$ more elements such that the final list is squary. Each added element must be an integer between $-10^{18}$ and $10^{18}$, inclusive, and these do not have to be distinct from each other or from the initial list&#39;s elements.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case is described in two lines. The first line contains two integers $N$ and $K$, the number of elements of the initial list and the maximum number of elements you may add, respectively. The second line contains $N$ integers $E_1,E_2,&hellip;,E_N$, representing the $N$ elements of the initial list.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1). If it is possible to add at least $1$ and at most $K$ elements (each an integer between $-10^{18}$ and $10^{18}$, inclusive) to the initial list such that the square of the sum of its elements equals the sum of the squares of its elements, $y$ should be $z_1$ $z_2$ $\dots$ $z_r$, where $1&le;r&le;K$ and the $z_i$ values are the additional elements. If there is no way to accomplish this, $y$ should be <code>IMPOSSIBLE</code>.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;N&le;1000$.</li>
	<li>$-1000&le;E_i&le;1000$, for all $i$.</li>
</ul>