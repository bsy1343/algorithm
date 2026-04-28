# [Platinum IV] Robot - 21107

[문제 링크](https://www.acmicpc.net/problem/21107)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 21, 정답: 14, 맞힌 사람: 14, 정답 비율: 93.333%

### 분류

애드 혹, 누적 합

### 문제 설명

<p>There is an infinitely large 2-dimensional chessboard, in which every cell has a unique integer coordinate $(x, y)$. The starting cell has coordinate $(0, 0)$. If we start from this cell, walk $x$ steps to the right, and then walk $y$ steps upwards, we will arrive at cell $(x, y)$. Note that $x$ and $y$ could be negative, which means walking in the opposite direction.</p>

<p>There is a robot that starts from cell $(0,0)$ and then executes a sequence of commands $c_1 c_2 \ldots c_n$, where each $c_i \in \{\mathtt{L}, \mathtt{R}, \mathtt{D}, \mathtt{U}\}$, meaning walking one step in the direction of Left, Right, Down, Up, respectively. For example, if the sequence of commands is $\mathtt{LRLD}$, then the cells traveled are $(0, 0) \to (-1, 0) \to (0, 0) \to (-1, 0) \to (-1, -1)$. We call such sequence the <em>travel history</em> of the robot (in this example, the history contains five elements).</p>

<p>For every cell $(x, y)$ in the travel history, if it is the $i$-th time the robot visits this cell, then the robot earns a score of $$f(x, y, i) = i \cdot \left((|x| + 1) \mathrm{xor} (|y| + 1)\right) + i\text{.}$$ The total score is the sum of the score of every cell in the travel history. In this example, the total score is $f(0, 0, 1) + f(-1, 0, 1) + f(0, 0, 2) + f(-1, 0, 2) + f(-1, -1, 1) = 1 + 4 + 2 + 8 + 1 = 16$.</p>

<p>For every $i$ from $1$ to $n$, please answer: if we remove $c_i$ from the sequence of commands, what is the total score earned by the robot after executing the remaining sequence $c_1 c_2 \ldots c_{i - 1} c_{i + 1} \ldots c_n$?</p>

### 입력

<p>The first line contains an integer $n$ ($2 \le n \le 3 \cdot 10^{5}$).</p>

<p>The second line contains a string $c_1 c_2 \ldots c_n$ of length $n$, denoting the sequence of commands.</p>

### 출력

<p>Output $n$ lines. The $i$-th line must contain the total score if we remove command $c_i$.</p>