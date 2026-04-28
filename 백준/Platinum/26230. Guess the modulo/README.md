# [Platinum IV] Guess the modulo - 26230

[문제 링크](https://www.acmicpc.net/problem/26230)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 45, 정답: 9, 맞힌 사람: 8, 정답 비율: 18.182%

### 분류

수학, 자료 구조, 정수론, 무작위화, 덱

### 문제 설명

<p>Fimka Sobak, unlike Ellochka the Cannibal, was reputed to be a cultured girl. In addition to her favorite smart buzzword, the $\ldots$-ality, she learned a remarkably entertaining game, &quot;Guess the modulo&quot;.</p>

<p>The game is played in the following way. There are two players: the leader and the player. The leader initially thinks of two numbers: $N$ --- the number of numbers to be summed and $M$ --- the modulo. The leader tells the player the number $N$, and the player must guess the number $M$. Moreover, the leader thinks of an array of $(N-1)$ numbers and tells it to the player.</p>

<p>During the game the player tells the leader numbers to get more information. Every time the player says a number, the leader:</p>

<ol>
	<li>appends it to the end of his array,</li>
	<li>calculate $S$ --- the sum of the last $N$ numbers in the array by the modulo $M$,</li>
	<li>appends $S$ to the end of the array and</li>
	<li>tells $S$ to the player.</li>
</ol>

<p>As soon as the player guesses the value of the modulo $M$, he or she informs the leader.</p>

<p>It is known that the modulo $M$ lies within the range between $2$ and $10^9$, inclusively.</p>

### 입력

<p>The first line of the input stream contains a single integer $N$ ($2 \le N \le 100$). The following line contains $(N-1)$ space-separated integers ranging from $0$ to $10^9$ inclusively.</p>

<p>The following lines of the input stream contain answers to questions. Each answer is the sum of the last $N$ elements of its array by modulo $M$.</p>

### 출력

<p>You should print the queries and the player&#39;s answer into the standard output.</p>

<p>Player query format: &quot;<code>? p</code>&quot;, <code>p</code> --- the number added by the player to the array. The number $p$ must be integer and must lie within the range from $0$ to $10^9$ inclusively.</p>

<p>Player answer format: &quot;<code>! M</code>&quot;, <code>M</code> --- the modulo in question.</p>

<p>Make sure that each query ends with a line break and that you flush the output stream buffer (the <code>flush</code> command of the language). Otherwise the solution may get the verdict Deadlock.</p>