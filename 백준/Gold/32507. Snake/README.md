# [Gold II] Snake - 32507

[문제 링크](https://www.acmicpc.net/problem/32507)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 142, 정답: 31, 맞힌 사람: 21, 정답 비율: 20.792%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 백트래킹

### 문제 설명

<figure style="float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32507.%E2%80%85Snake/0d216224.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32507-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 250px; height: 250px;">
<figcaption>Google’s version of Snake</figcaption>
</figure>

<p>Snake is a video game classic, preserved at the Museum of Modern Art (MoMA) and listed as one of the “Top 100 Video Games” of all time. The goal of the game is to move a snake’s head to an apple. Once the snake reaches the apple, it eats it and grows in length. A new apple is placed, which the now grown snake must then eat.</p>

<p>The game is played on a grid, and every segment of the snake’s body occupies one cell. The snake’s head can turn in three directions, but it cannot go backwards. The body follows the head. The head may not collide with the body or exit the grid. Since the entire snake moves at the same time, the head is allowed to enter the cell that the tail is vacating.</p>

<p>Playing the game requires quickness and foresight. It’s all too easy to take turns that put the snake head in a position where it’s doomed to hit the wall or its body before reaching the apple, especially as the snake grows longer.</p>

<p>You’re being asked to write a program that can determine whether the snake’s head can reach the apple from a given position, or not and the snake is doomed to die.</p>

### 입력

<p>The first line of output contains two integers $r$ and $c$ ($1≤r,c≤10$, $r \cdot c≥2$), where the grid has $r$ rows and $c$ columns.</p>

<p>Each of the next $r$ lines contains a string of length exactly $c$ characters from the set</p>

<p style="text-align: center;">{‘<code>.</code>’,‘<code>0</code>’,  …    …  ,‘<code>9</code>’,‘<code>a</code>’,  …    …  ,‘<code>f</code>’,‘<code>A</code>’}</p>

<p>where ‘<code>.</code>’ represents an open cell in the grid, the hexadecimal digits ‘<code>0</code>’,  …    …  ,‘<code>9</code>’ and ‘<code>a</code>’,  …    …  ,‘<code>f</code>’ represent the snake, and ‘<code>A</code>’ represents the apple. The snake may be anywhere from one to sixteen characters long, with ‘<code>0</code>’ as its head, followed by the other hexadecimal digits in strict order (‘<code>1</code>’ follows ‘<code>0</code>’, ‘<code>2</code>’ follows ‘<code>1</code>’, etc., with no skipping digits.). It is guaranteed that there is at most one of each digit, each digit (except ‘<code>0</code>’) is adjacent to the immediately previous digit, and that there is exactly one apple in the grid.</p>

### 출력

<p>Output a single integer, which is $1$ if the snake can reach the apple, and $0$ if it cannot and is doomed to die.</p>