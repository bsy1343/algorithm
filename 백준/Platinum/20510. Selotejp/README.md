# [Platinum I] Selotejp - 20510

[문제 링크](https://www.acmicpc.net/problem/20510)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 42, 맞힌 사람: 35, 정답 비율: 37.234%

### 분류

다이나믹 프로그래밍, 비트마스킹, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>For Mirko there is no greater happiness than finding a new roll of sticky tape, and today he is especially happy because he had also found Slavko&rsquo;s Advent calendar.</p>

<p>The Advent calendar can be represented as a table with n rows and m columns. Each square contains a little window, and behind each window is a piece of chocolate. Slavko had already opened some of the windows, and others are still closed.</p>

<p>Mirko decided to use his sticky tape to glue all closed windows shut. The tape is infinitely long, and it is one calendar cell wide. Mirko can rip off a piece of tape and use it to glue some <strong>sequence of horizontally or vertically adjacent closed windows</strong> shut. He doesn&rsquo;t want to put more than one piece of tape over some window, since he wants to remain friends with Slavko.</p>

<p>He is wondering what is the <strong>minimal</strong> number of pieces of tape he needs to glue <strong>all</strong> closed windows shut.</p>

### 입력

<p>The first line contains integers n and m (1 &le; n &le; 1000, 1 &le; m &le; 10), dimensions of the Advent calendar.</p>

<p>Each of the following n lines contains m characters &#39;<code>.</code>&#39;&nbsp;and &#39;<code>#</code>&#39; that represent the Advent calendar. The character &#39;<code>.</code>&#39; denotes an open window, and the character &#39;<code>#</code>&#39; denotes a closed window.</p>

### 출력

<p>Output the minimal number of pieces of tape needed to glue all closed windows shut.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>One possible solution is to use one piece of tape for the first column, one piece for the third column, and one piece for the window in the second row and second column.</p>