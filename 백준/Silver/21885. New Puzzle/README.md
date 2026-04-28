# [Silver V] New Puzzle - 21885

[문제 링크](https://www.acmicpc.net/problem/21885)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 69, 정답: 60, 맞힌 사람: 41, 정답 비율: 91.111%

### 분류

수학, 구현, 브루트포스 알고리즘, 정수론, 시뮬레이션

### 문제 설명

<p>Katya has a younger brother Denis, who loves puzzles. It seemed to him that he had already solved all the puzzles in the world. But, one day, returning from school with Katya, he noticed a vending machine with a puzzle that he has never seen before. He asked Katya to play with this machine and win a new puzzle.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/df15c5a8-ac20-42fa-99d2-1284727c79f0/-/preview/" style="width: 200px; height: 196px;" /></p>

<p style="text-align: center;">Vending machine from the first example, before the start of the game.</p>

<p>The machine has a disk, divided into $n$ sectors, rotating arrow and a button. When the button is pressed, the arrow starts to spin, and the player receives this prize, corresponding to the sector on which it stops. After observing the machine, Katya noticed that it is quite primitive, and after each click of the button the arrow moves $k$ sectors clockwise. Also, Katya realized that the desired puzzle is at sector $x$, and it could be impossible to win. And then she asked you to help her.</p>

<p>Help Katya find out whether it is possible to win a puzzle, corresponding to sector $x$, if the arrow initially points to the sector $s$. And, if it is possible, calculate the minimal number of button clicks.</p>

### 입력

<p>A single line contains four integers $n$, $k$, $s$ and $x$ --- the number of sectors in the machine, number of sectors the arrow moves after one click, number of a sector the arrow points initially to, and the number of a sector corresponding to desired puzzle, respectively ($2 \leq n \leq 20\,000$; $1 \leq k &lt; n$; $0 \leq s, x &lt; n$; $x \neq s$).</p>

### 출력

<p>Output one integer, the minimal number of clicks you need to make to get the desired puzzle, or &lt;&lt;<code>-1</code>&gt;&gt;, if it is impossible.</p>

### 힌트

<p>In the first example, the arrow will move through the sectors $0 \rightarrow 2 \rightarrow 4 \rightarrow 1 \rightarrow 3 \rightarrow \dots$. Thus, after $4$ button clicks you can get a puzzle from sector $3$. The figure in the statement shows the machine from the first example before the game starts.</p>

<p>In the second example, the arrow will move only between the two sectors: 1 and 4. So it&#39;s impossible to get puzzle from sector 3.</p>

<p>Notice, that samples do not satisfy the additional constraints of the first, second, third, and fourth subtasks. Your solution will run on tests of the first four subtasks even if it does not pass the sample tests.</p>