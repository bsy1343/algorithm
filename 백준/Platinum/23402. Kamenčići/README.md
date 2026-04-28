# [Platinum V] Kamenčići - 23402

[문제 링크](https://www.acmicpc.net/problem/23402)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 79, 정답: 44, 맞힌 사람: 39, 정답 비율: 54.930%

### 분류

다이나믹 프로그래밍, 누적 합, 게임 이론

### 문제 설명

<p>This summer, Antun and Branka stumbled upon a very interesting beach, which was completely covered with plastic &rsquo;pebbles&rsquo; brought by the sea from the containers that fell from the cargo ships. They decided to take back with them n of these pebbles, some red and some blue. Now that autumn has arrived, they are playing with the pebbles and reminiscing about the warm summer days.</p>

<p>Their game proceeds as follows: in the beginning, they place the n pebbles in a row. Then, Antun and Branka make moves in turn, each time removing one of the pebbles from one of the ends of the row, until someone obtains k red pebbles, losing the game. Antun moves first and is wondering whether he could win regardless of the moves Branka makes. Please help him and write a program which will answer his question.</p>

### 입력

<p>The first line contains two integers, n and k (1 &le; k &lt; n &le; 350).</p>

<p>The second line contains a sequence of n characters <code>C</code> or <code>P</code>, where <code>C</code> denotes a red pebble, and <code>P</code> denotes a blue pebble. The character <code>C</code> appears at least 2k &minus; 1 times.</p>

### 출력

<p>If Antun can win regardless of Branka&rsquo;s moves, you should print <code>DA</code>, otherwise print <code>NE</code>.</p>

### 힌트

<p>Clarification of the second example</p>

<p>Antun can take a blue pebble from the left (<code>CPPCCCC</code>). Then, Branka has to take a red pebble.</p>

<p>If she takes a pebble from the left (<code>PPCCCC</code>), Antun will take the first, and Branka the second blue pebble on the left, after which only red pebbles remain and Branka will lose.</p>

<p>If she takes a pebble from the right (<code>CPPCCC</code>), Antun can take another pebble from the right and then Branka will again have to take another red pebble and lose.</p>