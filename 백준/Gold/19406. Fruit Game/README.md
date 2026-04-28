# [Gold I] Fruit Game - 19406

[문제 링크](https://www.acmicpc.net/problem/19406)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 62, 정답: 22, 맞힌 사람: 21, 정답 비율: 60.000%

### 분류

게임 이론, 그리디 알고리즘

### 문제 설명

<p>Apfelmann and Bananenfrau are good friends. Today, Apfelmann brought some apples, and Bananenfrau brought some bananas. Also, they found a coconut.</p>

<p>The friends decided to play a fruit game. They put their apples, bananas and the only coconut in a row on a table. Players take turns, Apfelmann is the first to make a move.</p>

<p>An apple or a banana is considered <em>tasty</em> if and only if there is no other fruit lying on the table between this apple or banana and the coconut.</p>

<p>On his turn, Apfelmann must take a tasty apple from the table and eat it. If there are no tasty apples at the moment, Apfelmann skips his turn. Similarly, on her turn, Bananenfrau must take a tasty banana from the table and eat it. If there are no tasty bananas at the moment, Bananenfrau skips her turn.</p>

<p>The player who eats all his or her fruit before the opponent does the same is declared to be the winner of the game.</p>

<p>Given the initial placement of the fruit on the table, determine who will win the game if both players play perfectly and strive to win.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases.</p>

<p>Each of the next $t$ lines contains a string consisting of uppercase English letters &quot;<code>A</code>&quot;, &quot;<code>B</code>&quot; and &quot;<code>C</code>&quot; --- the initial placement of the fruit in the row, in order from left to right. &quot;<code>A</code>&quot; stands for an apple, &quot;<code>B</code>&quot; stands for a banana, and &quot;<code>C</code>&quot; stands for the coconut. There is at least one apple, at least one banana and exactly one coconut in the row.</p>

<p>The total length of the input strings doesn&#39;t exceed $10^6$.</p>

### 출력

<p>For each test case, output a single line containing the name of the winner of the game.</p>

### 힌트

<p>In the first example test case, Apfelmann and Bananenfrau take turns eating apples and bananas from different sides of the coconut. There are less bananas than apples, therefore, Bananenfrau wins.</p>

<p>In the second example test case, the players eat apples and bananas in turns from left to right. Apfelmann finishes with apples first.</p>

<p>In the third example test case, Apfelmann has to skip his first turn. Then, Bananenfrau has a choice to eat either the banana to the left or the banana to the right of the coconut. Once Bananenfrau eats the rightmost banana, Apfelmann will eat the only apple in the next turn and win. It&#39;s better for Bananenfrau to eat all the bananas to the left of the coconut first, one by one, making Apfelmann skip his turns. After that Bananenfrau will be able to win by eating the rightmost banana.</p>