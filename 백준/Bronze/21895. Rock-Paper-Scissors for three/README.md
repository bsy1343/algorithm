# [Bronze II] Rock-Paper-Scissors for three - 21895

[문제 링크](https://www.acmicpc.net/problem/21895)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 149, 정답: 129, 맞힌 사람: 119, 정답 비율: 88.148%

### 분류

구현, 문자열, 많은 조건 분기

### 문제 설명

<p>Jury of Innopolis Open really like problems about &quot;Rock-Paper-Scissors&quot; game. They even built two special robots to play against each other in this game. As the time passed, robots became so good at this game, so they invited Dasha to play with them.</p>

<p>Rules of &quot;Rock-Paper-Scissors&quot; for three players are as follows:</p>

<ul>
	<li>In each round all players simultaneously show one of three followings signs: Rock, Paper or Scissors.</li>
	<li>Rock beats Scissors, Scissors beats Paper and Paper beats Rock.</li>
	<li>If one player showed the sign which beats both other players&#39; signs, then he is the winner of the round.</li>
	<li>If two players showed the sign which beats the third player&#39;s sign, then they both are winners of the round.</li>
	<li>If all players showed either all different signs or all equal signs, then it&#39;s impossible to determine a winner and that round ends with a draw.</li>
</ul>

<p>What robots didn&#39;t know is that Dasha programmed them and knows every move they are going to make in each round. Help Dasha show them who&#39;s boss and win as many rounds as possible.</p>

### 입력

<p>First line of input contains $n$ --- number of rounds in Dasha&#39;s and robots&#39; game ($1 \le n \le 100$).</p>

<p>Second line contains a string of length $n$, which consists of letters &quot;<code>R</code>&quot; (Rock), &quot;<code>S</code>&quot; (Scissors) and &quot;<code>P</code>&quot; (Paper), $i$-th letter is the first robot&#39;s move in the $i$-th round of the game.</p>

<p>Third line contains description of second robot&#39;s moves in the same format.</p>

### 출력

<p>Output a string of $n$ characters &quot;<code>R</code>&quot;, &quot;<code>P</code>&quot; and &quot;<code>S</code>&quot;, describing Dasha&#39;s moves in each round, that allows her to win as many rounds as possible.</p>

### 제한

<ul>
	<li>$1 \le n \le 100$</li>
</ul>

### 힌트

<p>In the sample input, Dasha can win all three rounds. To achieve that, in the first round she chooses Rock (and wins the round together with the first robot), in the second round she chooses Scissors (and wins the round together with the second robot), in the third round she chooses Paper (winning both robots).</p>