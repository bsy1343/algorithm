# [Platinum III] Raging River - 31051

[문제 링크](https://www.acmicpc.net/problem/31051)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 11, 맞힌 사람: 11, 정답 비율: 57.895%

### 분류

그래프 이론, 최대 유량, 최소 비용 최대 유량

### 문제 설명

<p>Sally and her friends are trying to cross safely from one bank of a raging river to another. Boulders are scattered within the river, with log planks connecting the banks of the river to some of the boulders, and some pairs of boulders to each other.</p>

<p>Sally begins by trying to cross the river first. She starts at the left bank and crosses one plank at a time, with the goal of reaching the right bank. Walking across a plank takes Sally one second. Each time she crosses a plank, that plank becomes unstable and collapses into the river (so that neither Sally nor her friends can use that plank again). After Sally has safely reached the right bank, another friend tries to cross the river, and so on, until everyone who is able to make it has crossed the river.</p>

<p>Given the graph of banks/boulders and planks and the number of people who need the cross the river, what is the smallest amount of total time (in seconds) required for everyone to cross the river safely? If it is impossible for all people to cross, compute the minimum number of people $n$ who must be left behind and print <code>n people left behind</code>.</p>

### 입력

<p>The first line of the input contains three integers $P$, $R$, and $L$: the number of people $P$ who must cross the river, the number of boulders $R$ in the river, and the number of logs $L$ spanning boulders/river banks. These integers satisfy $1 \leq P \leq 10$ and $0 \leq R \leq 1\, 000$ and $0 \leq L \leq 1\, 000$.</p>

<p>Then follows $L$ lines, each of which contains two integers $E_1$ and $E_2$ specifying the endpoints on one log. The values for $E_1$ and $E_2$ are in the range $[-2,R-1]$, where $-2$ signifies the left river bank, $-1$ signifies the right river bank, and all other values indicate one of the boulders in the river.</p>

<p>You may assume that every log has two distinct endpoints, and that no two logs span the same pair of boulders/river banks. There is no guarantee that every boulder, or even the right river bank, is reachable from the left river bank.</p>

### 출력

<p>If it is possible for all $P$ people to reach the right bank, print a single integer, the minimum total time (in seconds) required for all people to cross.</p>

<p>If some people must be left behind at the left bank, instead print <code>n people left behind</code>, where the integer $n$ is the least number of people who must be left behind.</p>