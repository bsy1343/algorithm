# [Platinum III] Kindergarten Revisited - 35450

[문제 링크](https://www.acmicpc.net/problem/35450)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 5, 정답 비율: 83.333%

### 분류

구현, 기하학, 분할 정복, 브루트포스 알고리즘, 선분 교차 판정

### 문제 설명

<p>In kindergarten, one of the most time consuming activities was cutting out shapes from a piece of paper with safety scissors. Let's look at a simplified model of this task: you start with an infinitely large sheet of paper with $N$ disjoint axis-aligned rectangles drawn on it, and cuts are infinitely long straight lines. A cut must not "nick" any rectangle: it must not pass through any point strictly on the interior of any rectangle. (Cuts that pass <em>exactly</em> along a rectangle edge or through a rectangle corner are allowed.) When you cut a piece of paper, the paper falls apart into two different pieces of paper that you continue cutting independently of each other (future cuts on one piece do <em>not</em> affect any other pieces).</p>

<p>Your goal is to make a sequence of cuts so that each rectangle ends up on its own piece of paper (since after that it's pretty easy to cut out each rectangle exactly).</p>

<p>Determine the minimum number of cuts (not necessarily axis-aligned) needed to cut out the rectangles in this way. If the task is impossible, print <code>impossible</code> instead.</p>

### 입력

<p>The first line of input contains an integer $N$ $(1 \leq N \leq 100)$, the number of rectangles.</p>

<p>Each of the next $N$ lines describe one rectangle. Each line contains four space-separated integers $x_1$, $y_1$, $x_2$, and $y_2$ $(|x_1|, |y_1|, |x_2|, |y_2| \leq 10^{9},\ x_1 &lt; x_2,\ y_1 &lt; y_2)$, where $(x_1, y_1)$ is the bottom-left corner of the rectangle and $(x_2, y_2)$ is the top-right corner of the rectangle.</p>

<p>The rectangles are guaranteed to be disjoint: no two rectangles intersect at any common point, including on their edges or corners.</p>

### 출력

<p>Print the minimum number of cuts needed to separate all rectangles. (Do <em>not</em> include additional cuts that would be needed to trim blank paper from around the margins of the rectangles once separated.) If this task is impossible, print <code>impossible</code> instead.</p>