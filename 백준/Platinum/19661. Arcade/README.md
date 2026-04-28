# [Platinum III] Arcade - 19661

[문제 링크](https://www.acmicpc.net/problem/19661)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 34, 정답: 14, 맞힌 사람: 12, 정답 비율: 52.174%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그리디 알고리즘, 방향 비순환 그래프, 가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>Emily the alien octopus is playing an arcade game. The game machine consists of N buttons, numbered 1 to N from left to right. The game involves pressing a series of M buttons, one per second. At T<sub>i</sub> seconds from the start of the game, button Ai must be pressed. Note that it is possible for T<sub>i</sub> = T<sub>j</sub>, A<sub>i</sub> = A<sub>j</sub> even if i &ne;&nbsp;j.</p>

<p>Each of Emily&rsquo;s hands can start at any position at the start of the game, and it takes exactly one second for Emily to move a hand from a button to an adjacent button. Emily&rsquo;s hands can move simultaneously, and it takes no time to press a button. As alien octopuses have an infinite number of hands, it is always possible to obtain the maximum score on the game by completing all M button presses. However, as Emily is lazy, she does not want to use all her hands. Let the minimum number of hands required to obtain the maximum score be S.</p>

<p>Given the exact series of button presses Emily has to accomplish, help her find out the minimum number of hands she needs to use to obtain the maximum score for the game. Help find and provide Emily the value of S.</p>

### 입력

<p>Your program must read from standard input.</p>

<p>The first line contains two integers N and M.</p>

<p>The second line contains M integers, where the i<sup>th</sup> integer represents T<sub>i</sub>.</p>

<p>The third line contains M integers, where the i<sup>th</sup> integer represents A<sub>i</sub>.</p>

### 출력

<p>Your program must print to standard output.</p>

<p>The output should contain a single integer on a single line, the minimum number of hands Emily needs to use to obtain the maximum score for the game.</p>

### 제한

<ul>
	<li>1 &le; N &le; 10<sup>9</sup></li>
	<li>1 &le; M &le; 5 &times; 10<sup>5</sup></li>
	<li>1 &le; A<sub>i</sub> &le; N</li>
	<li>1 &le; T<sub>i</sub> &le; 10<sup>9</sup></li>
</ul>