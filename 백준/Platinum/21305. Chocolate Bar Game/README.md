# [Platinum III] Chocolate Bar Game - 21305

[문제 링크](https://www.acmicpc.net/problem/21305)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 19, 맞힌 사람: 18, 정답 비율: 24.324%

### 분류

게임 이론, 수학, 정수론, 소수 판정

### 문제 설명

<p>Dia and Ruby take turns playing a game using an <strong><em>n</em></strong> x <strong><em>n</em></strong> square chocolate bar. Each turn, the current player must do one of the following (Ruby will go first):</p>

<ol>
	<li>Select a prime number <strong><em>p</em></strong> that has not been selected by any player in the previous rounds. Then, choose a <strong><em>p</em></strong> x <strong><em>p</em></strong> square that does not contain any empty squares on the chocolate bar and eat up every chocolate square within the <strong><em>p</em></strong> x <strong><em>p</em></strong> square.</li>
	<li>Eat an arbitrary <strong>1</strong> x <strong>1</strong> chocolate square on the bar.</li>
</ol>

<p>The player who eats up the last chocolate square wins. Initially, some squares on the chocolate bar are already eaten. If both players play optimally, who will win the game? Note: &ldquo;optimally&rdquo; means if any player has a strategy to win no matter how their opponent responds, they will take that move &ndash; optimizing their chance of winning.</p>

### 입력

<p>Input consists of multiple lines. The first line contains a single integer, <strong><em>n</em></strong>, (1 &le; <em><strong>n</strong></em> &le; 2000) which gives the dimensions of the chocolate bar and indicates there are <strong><em>n</em></strong> lines of data that follow that describe the chocolate bar.</p>

<p>Each line contains <strong><em>n</em></strong> characters consisting of <code>X</code> (indicating an empty square) or <code>&ndash;</code> (indicating a chocolate square).</p>

### 출력

<p>The output line consists of the word <code>RUBY</code> if Ruby is the winner or <code>DIA</code> if Dia is the winner.</p>