# [Gold IV] Organizing Beads - 23178

[문제 링크](https://www.acmicpc.net/problem/23178)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 164, 정답: 97, 맞힌 사람: 89, 정답 비율: 65.926%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>Hyunuk has a long barrel of $n$ ($2 \le n \le 2 \cdot 10^5$) cells. Each cell is either empty or contains a bead. When storing beads, it doesn&#39;t look good if they are scattered here and there, so Hyunuk wants to gather all the beads at one end. Specifically, if the barrel has $k$ beads, the beads must be in cells $1$ through $k$ or in cells $n-k+1$ through $k$.</p>

<p>Hyunuk can move the bead in the $i$-th cell of the barrel to the ($i-1$)-th cell or the ($i+1$)-th cell by lightly pushing it. If there is a bead in the cell to be moved, that bead is also pushed in the same direction. For example, let there be beads in the 2nd, 3rd, and 5th cells. If Hyunuk pushes the bead in the 2nd cell to the 3rd cell, the bead in the 3rd cell is also pushed to the 4th cell. The bead in the 5th cell remains in place.</p>

<p>Hyunuk wonders how the minimum number of moves required to organize all beads will change when he adds or removes beads from the barrel. Write a program that calculates the minimum number of moves required to organize the bead barrel as Hyunuk inserts or removes beads from the barrel.</p>

### 입력

<p>The first line contains a single integer $n\ (2 \le n \le 2 \cdot 10^5)$, the length of the bead barrel.</p>

<p>The second line contains a string of length $n$ consisting of only <code>O</code>&#39;s and <code>X</code>&#39;s representing the state of the bead barrel. If the $i$-th character of the string is <code>O</code>, then the cell has a bead in it. Otherwise, the $i$-th character of the string is <code>X</code>&nbsp;and the cell is empty.</p>

<p>The third line contains a single integer $q\ (1 \le q \le 2 \cdot 10^5)$, the number of actions performed by Hyunuk.</p>

<p>The next $q$ lines each contain a single integer $k\ (1 \le k \le n)$ representing Hyunuk&#39;s action. This means that if there is a bead in the $k$-th cell of the barrel, the bead is removed, and if there is no bead, it is inserted at the corresponding position.</p>

<p>The input will be designed such that the barrel will never have zero beads.</p>

### 출력

<p>Output $q$ lines, the $i$-th of which contains a single integer, the minimum number of moves required to organize all beads after Hyunuk&#39;s first $i$ actions. &nbsp; &nbsp;</p>