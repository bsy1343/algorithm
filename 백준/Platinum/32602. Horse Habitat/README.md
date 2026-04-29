# [Platinum II] Horse Habitat - 32602

[문제 링크](https://www.acmicpc.net/problem/32602)

### 성능 요약

시간 제한: 25 초, 메모리 제한: 2048 MB

### 통계

제출: 65, 정답: 27, 맞힌 사람: 18, 정답 비율: 48.649%

### 분류

누적 합, 다이나믹 프로그래밍, 분리 집합, 오프라인 쿼리, 자료 구조

### 문제 설명

<p>Harold has inherited a huge habitat with hundreds of horses! He wants to train a handful of horses for the Bareback Arizona Phoenix Cowboys, which is a half-yearly happening honouring Arizonan horse riding history. Hence, Harold signed his horses up for the Hurdle Hopping event and he has requested your help handling the training program.</p>

<p>Hurdle Hopping courses have many possible layouts, each requiring a different rectangular area. However, not all of the land in the habitat is suitable for courses. Horses, moreover, need to train courses on multiple different grounds in order to learn to adapt to possible circumstances. Handling the training program, it is thus relevant that courses can be rebuilt in many different locations.</p>

<p>Handed to you is a map showing the habitat as a grid of unit squares with each square indicating whether the land is suitable for courses or not. Help Harold by answering a list of questions, each question asking the total number of possible locations in the habitat for a Hurdle Hopping course with a particular size.</p>

### 입력

<p>The input consists of:</p>

<ul>
	<li>One line with three integers $r$, $c$, and $q$ ($1 \leq r,c \leq 9 \cdot 10^6$, $r \cdot c \leq 9 \cdot 10^6$, $1 \leq q \leq 10^5$), the number of rows and columns of the grid, and the number of questions.</li>
	<li>$r$ lines with $c$ characters, each character being either '<code>.</code>' if the corresponding square indicates land suitable for courses or '<code>#</code>' otherwise.</li>
	<li>$q$ lines, each with two integers $h$ and $w$ ($1 \leq h \leq r$, $1 \leq w \leq c$), indicating a question from Harold about the number of Hurdle Hopping courses with height $h$ (number of rows in the grid) and width $w$ (number of columns in the grid).</li>
</ul>

### 출력

<p>For each of the $q$ questions, output the number of possible locations for a grid-aligned Hurdle Hopping course of the requested height $h$ (number of rows in the grid) and width $w$ (number of columns in the grid).</p>