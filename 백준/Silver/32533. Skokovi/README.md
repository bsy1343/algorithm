# [Silver III] Skokovi - 32533

[문제 링크](https://www.acmicpc.net/problem/32533)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 47, 맞힌 사람: 39, 정답 비율: 69.643%

### 분류

그리디 알고리즘, 애드 혹

### 문제 설명

<p>In a land who knows where, in a world who knows when, lives a bee named Maya. Her adventure-filled life is an endless source of ideas for tasks, so we chose one of them.</p>

<p>Maya’s friend, a grasshopper named Filip, is preparing for the Olympics in flower jumping. The flowers in the meadow can be represented as a sequence of positive intergers $a$ of length $N$. The height of each flower is given by the number $a_i$.</p>

<p>Filip always jumps from left to right. Additionally, since this whole sport is new to him, he cannot jump to a flower whose height differs too much from the one he is currently on. Specifically, from flower $i$, he can jump to flower $j$ if and only if $i &lt; j$ and $|a_i - a_j | ≤ K$, where $K$ is a positive integer given in the input.</p>

<p>Help Maya plan Filip’s training by determining which flowers Filip can reach if he starts on the leftmost flower. In other words, for each flower, determine if there is a sequence of jumps that leads to it, starting from the first flower.</p>

### 입력

<p>The first line contains positive integers $N$ ($1 ≤ N ≤ 2 \cdot 10^5$) and $K$ ($1 ≤ K ≤ 10^9$). The second line contains a sequence of positive integers a, i.e., $N$ numbers $a_i$ ($1 ≤ a_i ≤ 10^9$), representing the heights of the flowers.</p>

### 출력

<p>In a single line, output $N$ numbers, either $0$ or $1$, where each number indicates whether the corresponding flower is reachable. The number $0$ means that it is not possible to reach that flower, while $1$ means the flower is reachable. The first flower is always reachable as Filip starts from there.</p>