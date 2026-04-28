# [Platinum V] Domino Line - 21043

[문제 링크](https://www.acmicpc.net/problem/21043)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 31, 정답: 19, 맞힌 사람: 18, 정답 비율: 60.000%

### 분류

그래프 이론, 그래프 탐색, 오일러 경로

### 문제 설명

<p>A domino piece is a rectangular-shape tile with a line dividing its face into two square halves. Each square contains a number of dots representing the value of the square. Domino is called by the value of its two squares (also called &quot;ends&quot;), e.g., a domino with 2 dots in one half and 5 dots in the other half is called 2-5 (or 5-2) domino.</p>

<p>Dominoes is played by laying down the dominoes one by one, next to each other, with the touching ends having the same value. A domino-line is a sequence of dominoes such that each adjacent dominoes have the same value on their touching ends; in other words, it&#39;s a valid played dominoes. For example, the sequence (2-5, 5-4, 4-4, 4-6, 6-3) is a valid domino-line, while (2-5, 5-3, 5-4, 4-6) is not as 5-3 and 5-4 do not share the same value on the touching ends (3 and 5). Notice that you can play a domino piece in either direction, e.g., a 3-5 domino can be played as 5-3.</p>

<p>Given a set of <em>N</em> dominoes, lay down all the dominoes such that the number of domino-lines is as few as possible.</p>

<p>For example, let there be 6 dominoes: {2-6, 1-3, 4-2, 6-3, 2-5, 4-3}. For readability, let&#39;s denote the dominoes as D1, D2, D3, D4, D5, and D6, respectively. If a domino D1 is played in reversed order (e.g., playing 6-2 with a 2-6 domino), we call it as R1, likewise the other dominoes.</p>

<p>The minimum number of domino-lines needed to be formed is 2:</p>

<ul>
	<li>D2, R4, R1, D5 1-3, 3-6, 6-2, 2-5.</li>
	<li>R3, D6 2-4, 4-3.</li>
</ul>

<p>There are other strategies to lay down the dominoes, but none has fewer than 2 domino-lines in this example.</p>

<p>Your task is to find the minimum number of domino-lines needed to be formed with the given dominoes set.</p>

### 입력

<p>The first line contains an integer: <em>N</em> (1 &le; <em>N</em> &le; 50,000) denoting the number of dominoes. The next <em>N</em> lines, each contains two integers: <em>A</em> <em>B</em> (1 &le; <em>A</em>, <em>B</em> &le; 50,000) representing an <em>A</em>-<em>B</em> domino.</p>

### 출력

<p>Output in a single line, the minimum number of domino-lines which have to be formed to lay down all the given dominoes.</p>