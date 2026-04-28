# [Platinum II] Retro - 15356

[문제 링크](https://www.acmicpc.net/problem/15356)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 13, 맞힌 사람: 8, 정답 비율: 28.571%

### 분류

다이나믹 프로그래밍, 그래프 이론, 문자열, 그래프 탐색, 너비 우선 탐색, 역추적

### 문제 설명

<p>Little Mirko got a video game console for Christmas. It wasn&rsquo;t a Playstation 4 or an Xbox one, but Atari 2600, and it came with one free game. The protagonist of the game is standing on the bottom of the screen, and there are various objects dispersed on the rest of the screen, falling towards the bottom.</p>

<p>More precisely, the screen can be represented as a grid of RxS pixels arranged in R rows and S columns. The protagonist takes up one pixel of the lowest line and is marked with &lsquo;M&rsquo;. The rest of the pixels are marked with some of the characters: &lsquo;.&rsquo; (empty space), &lsquo;*&rsquo; (bomb), &lsquo;(&lsquo; (open bracket) or &lsquo;)&rsquo; (closed bracket).</p>

<p>The protagonist can move one pixel to the left or to the right in a single move, but doesn&rsquo;t need to, whereas the rest of the objects simultaneously move one pixel down (possibly out of the screen). When the protagonist finds himself at the same position as one of the brackets, we say that he picked up that bracket and added it at the end of his array of acquired brackets. The protagonist&rsquo;s goal is to acquire the longest possible valid bracket expression.</p>

<p>A valid bracket expression is defined inductively in the following way:</p>

<ul>
	<li>&ldquo;()&rdquo; is a valid expression</li>
	<li>If a​ is a valid expression, then &ldquo;(a​)&rdquo; is a valid expression as well</li>
	<li>If a​ and b​ are valid expressions, then &ldquo;ab​&rdquo; is a valid expression as well</li>
</ul>

<p>The game ends when the protagonist finds himself at the same position as the bomb, or when all the objects fall out of the screen.</p>

### 입력

<p>The first line of input contains the positive integers R ​and S ​(1 &le; R, S &le; 300) that represent the dimensions of the screen.</p>

<p>Each of the following R lines contains S characters &lsquo;M&rsquo;, &lsquo;.&rsquo;, &lsquo;*&rsquo;, &lsquo;(&lsquo; or &lsquo;)&rsquo; that represent the initial state of the screen.</p>

<p>Test data will be such that there will always exist at least one valid bracket expression that is possible to acquire.</p>

### 출력

<p>In the first line, you must output the length of the longest valid bracket expression that Mirko can acquire.</p>

<p>In the second line, output that expression. If there are multiple longest valid expressions, output the lexicographically​ ​smallest​ one.</p>

### 힌트

<p>Clarification​ ​of​ ​the​ ​first​ ​test​ ​case:​ ​The protagonist&rsquo;s moves are: left, left, right right.</p>

<p>Clarification​ ​of​ ​the​ ​second​ ​test​ ​case:​ ​The protagonist&rsquo;s moves are: stay still, stay still, stay still, right, left.</p>

<p>Clarification​ ​of​ ​the​ ​third​ ​test​ ​case:​ ​The protagonist&rsquo;s moves are: stay still, stay still, right.</p>