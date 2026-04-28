# [Bronze I] Estimathon - 27340

[문제 링크](https://www.acmicpc.net/problem/27340)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 197, 정답: 101, 맞힌 사람: 91, 정답 비율: 50.276%

### 분류

수학, 구현

### 문제 설명

<p>Paula and Domagoj are organizing an exciting team competition called Estimathon. They have already prepared the questions, and now they are arranging the room for the quiz.</p>

<p>Before you could blink, Domagoj had already placed $n$ tables in the room. Now they need to add chairs. They have very colourful chairs. They come in $m$ colours and there are $a_i$ chairs of the $i$-th colour. Every team consists of <strong>four</strong> people. Therefore, for each table, Paula and Domagoj need to add four chairs. They want to make the room look as nice as possible. To make that happen, they agreed on these conditions:</p>

<ul>
	<li>Each table has all chairs of the same colour</li>
	<li>Every chair colour is used, that is, for every colour there exists at least one table that has chairs of that colour</li>
</ul>

<p>Caring too much about how nice the room will look, they suddenly realized that the quiz starts very soon! Help them find out if a chair arrangement with these conditions is even possible.</p>

### 입력

<p>The first line contains integers $n$ and $m$ ($1 &le; n, m &le; 100$), the number of tables and the number of chair colours.</p>

<p>he second line contains $m$ integers $a_i$ ($1 &le; a_i &le; 100$), where the $i$-th number is the number of chairs of the $i$-th colour.</p>

### 출력

<p>In the first and only line output <code>DA</code> if it is possible to arrange the chairs so that both conditions hold, otherwise output <code>NE</code>.</p>

### 힌트

<p>Clarification of the second example: We can have 5 tables with chairs of the same colour, but we cannot have a table with colour 4, so the second condition can&rsquo;t be satisfied.</p>