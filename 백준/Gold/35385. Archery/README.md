# [Gold III] Archery - 35385

[문제 링크](https://www.acmicpc.net/problem/35385)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 11, 정답: 6, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

그래프 이론

### 문제 설명

<p>Charles IV (known in Czech as Karel IV.), the founder of the first university in the Czech lands, enjoyed a game once popular among archers in the Middle Ages — a game that, unfortunately, gradually disappeared at the dawn of the modern era. It was played during grand outdoor tournaments.</p>

<p>A flat rectangular field was divided into a grid of squares. The referee of the game, at his discretion, marked some of the squares by placing a boar head at their center. Each square then contained either one boar head or none.</p>

<p>Next, the host of the tournament chose one marked square, covering it with purple cloth to mark the starting square, and then another marked square, covering it with golden cloth to mark the final square.</p>

<p>The competing archer always started from the purple square and his goal was to reach the golden square. He could shoot only from the marked squares. When he shot an arrow and hit a boar head in another square, he was allowed to move to that square and continue shooting from there. If he missed, his game ended unsuccessfully. His arrow could fly only straight across a single row or column of squares, that is, parallel to the edges of the field. It did not matter how far the arrow did fly, the archer could reach any square in his current row or column.</p>

<p>It often happened that even the finest archers could not win, unable to reach the golden square, because the placement of the marked squares made it impossible.</p>

<p>Charles IV, when he was present at a tournament, used to introduce an additional preparatory phase, performed just before the purple and golden squares were chosen. In this phase, the referee’s assistant sent a small number of men onto the field with the task of relocating some of the boar heads into other, previously unmarked squares. This meant that some marked squares effectively changed position.</p>

<p>Each man had to move exactly one boar head, and, just like an archer’s shot, he could move it only within the same row or column, i.e., parallel to the edges of the field. Also, the original principle had to remain valid — no square could ever contain more than one boar head.</p>

<p>Note that the men were sent one after the other, in particular, it is possible that one boar head moved several times.</p>

<p>The purpose of this phase was obvious: Upon its completion, it was guaranteed that victory in the game would always be possible, no matter where the host subsequently placed the purple and golden cloths.</p>

<p>The assistant referee had to decide for each man from which square to which square that man would move the boar head. He did this by experience and intuition, but today we can solve his task precisely, by contemporary algorithmic means.</p>

<p>For a given initial arrangement of boar heads, determine the minimum number of men who must move some of the boar heads so that Charles IV’s requirement is fulfilled — that is, it will always be possible to win the game, regardless of how the host chooses the starting and target squares.</p>

### 입력

<p>The first line contains an integer $N$ ($1 ≤ N ≤ 2 \cdot 10^5$), the number of boar heads placed on the field.</p>

<p>Each of the next $N$ lines contains two integers $x$ and $y$ ($−10^9 ≤ x, y ≤ 10^9$), representing the coordinates of one boar head in the plane. Assume that each square of the field is one unit wide and that the borders of the field are parallel to the coordinate axes. No two boar heads occupy the same square.</p>

### 출력

<p>Output a single line with a single integer — the minimum number of men required to rearrange the boar heads so that Charles IV’s requirement is fulfilled.</p>