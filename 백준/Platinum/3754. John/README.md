# [Platinum II] John - 3754

[문제 링크](https://www.acmicpc.net/problem/3754)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 143, 정답: 69, 맞힌 사람: 62, 정답 비율: 48.819%

### 분류

게임 이론, 스프라그–그런디 정리

### 문제 설명

<p>Little John is playing very funny game with his younger brother. There is one big box filled with M&amp;Ms of different colors. At first John has to eat several M&amp;Ms of the same color. Then his opponent has to make a turn. And so on. Please note that each player has to eat at least one M&amp;M during his turn. If John (or his brother) will eat the last M&amp;M from the box he will be considered as a looser and he will have to buy a new candy box.</p>

<p>Both of players are using optimal game strategy. John starts first always. You will be given information about M&amp;Ms and your task is to determine a winner of such a beautiful game.&nbsp;</p>

### 입력

<p>The first line of input will contain a single integer T &ndash; the number of test cases. Next T pairs of lines will describe tests in a following format. The first line of each test will contain an integer N &ndash; the amount of different M&amp;M colors in a box. Next line will contain N integers A<sub>i</sub>, separated by spaces &ndash; amount of M&amp;Ms of i-th color.&nbsp;</p>

<ul>
	<li>1 &lt;= T &lt;= 474,</li>
	<li>1 &lt;= N &lt;= 47,</li>
	<li>1 &lt;= A<sub>i</sub> &lt;= 4747&nbsp;</li>
</ul>

### 출력

<p>Output T lines each of them containing information about game winner. Print &ldquo;John&rdquo; if John will win the game or &ldquo;Brother&rdquo; in other case.&nbsp;</p>