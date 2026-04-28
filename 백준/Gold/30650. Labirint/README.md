# [Gold II] Labirint - 30650

[문제 링크](https://www.acmicpc.net/problem/30650)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 28, 정답: 22, 맞힌 사람: 22, 정답 비율: 78.571%

### 분류

그래프 이론, 브루트포스 알고리즘, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<blockquote>
<p>What is an EJOI for you?</p>

<p>Game room!</p>
</blockquote>

<p>Teo is searching for the Croatian EJOI team! She has already found Gabriel, but is still looking for Vito, Dino, and Ivo.</p>

<p>Teo and the EJOI team are in a labyrinth consisting of n &times; m rooms, all of the same size. The rooms form a grid. The top-left room is labeled with (1, 1), and the bottom-right with (n, m). Between each pair of adjacent rooms, there is a door colored in one of four colors: blue (marked with &#39;<code>P</code>&#39;), red (marked with &#39;<code>C</code>&#39;), green (marked with &#39;<code>Z</code>&#39;) and orange (marked with &#39;<code>N</code>&#39;).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/07d2af78-ec5e-495c-8c72-923f009c99c1/-/preview/" style="width: 242px; height: 243px;" /></p>

<p style="text-align: center;">Illustration of the third example. The black circle marks the room in which Teo and Gabriel are located at in the fourth question, and the white circle marks the room in which Vito, Ivo and Dino are located at. The gray path is one of the possible paths that passes through three different door colors.</p>

<p>At some point, Gabriel says: I know where the rest of the team is, but I will only tell you if you can answer all of my questions.</p>

<p>Gabriel&rsquo;s questions are: If we are currently in room (a<sub>i</sub>, b<sub>i</sub>) and the rest of the team is in room (c<sub>i</sub>, d<sub>i</sub>), what is the minimum number of door colors we have to go through to reach them?</p>

<p>Teo is very good at answering Gabriel&rsquo;s questions, but there are simply too many of them. She does not have much time (the bus is leaving soon), so she is asking you to help her answer q of Gabriel&rsquo;s questions!</p>

### 입력

<p>The first line contains integers n and m (1 &le; n, m &le; 100, 1 &lt; n &times; m), the number of rooms.</p>

<p>The i-th of the following n lines contains m &minus; 1 characters (&#39;<code>P</code>&#39;, &#39;<code>C</code>&#39;, &#39;<code>Z</code>&#39; or &#39;<code>N</code>&#39;), where the j-th character marks the colour of the door that connects rooms (i, j) and (i, j + 1).</p>

<p>The i-th of the following n &minus; 1 lines contains m characters (&#39;<code>P</code>&#39;, &#39;<code>C</code>&#39;, &#39;<code>Z</code>&#39; or &#39;<code>N</code>&#39;), where the j-th character marks the colour of the door that connects rooms (i, j) and (i + 1, j).</p>

<p>The next line contains the integer q (1 &le; q &le; 100), the number of Gabriel&rsquo;s questions.</p>

<p>In the i-th of the following q lines, there are four integers a<sub>i</sub>, b<sub>i</sub>, c<sub>i</sub>, d<sub>i</sub> (1 &le; a<sub>i</sub>, c<sub>i</sub> &le; n, 1 &le; b<sub>i</sub>, d<sub>i</sub> &le; m, (a<sub>i</sub>, b<sub>i</sub>) &ne; (c<sub>i</sub>, d<sub>i</sub>)), the description of Gabriel&rsquo;s i-th question.</p>

### 출력

<p>In the i-th of q lines, output the answer to Gabriel&rsquo;s i-th question.</p>

### 힌트

<p>Clarification of the third example:</p>

<p>The third example is illustrated in the text.</p>

<p>For the first question, Teo and Gabriel can use just the blue doors to reach the rest of the team; for the second question, they can use blue and green doors; for the third again only blue is enough; and for the fourth, they can use blue, green, and red doors.</p>