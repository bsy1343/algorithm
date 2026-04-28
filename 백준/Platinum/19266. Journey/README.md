# [Platinum IV] Journey - 19266

[문제 링크](https://www.acmicpc.net/problem/19266)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 18, 정답: 8, 맞힌 사람: 7, 정답 비율: 53.846%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>There are $n$ cells along a straight line numbered from $1$ to $n$. Each cell $i$ contains a number $a_i$. Initially, the player is in the cell number $1$ with the number $h_0$ in his hand.&nbsp;</p>

<p>If the player is in a cell number $p$ ($1 \le p \le n$) with a number $h$ in hand, he can jump to the cell number $p + a_p$ or to the cell number $p + h$. It is forbidden to leave the field. After the jump, the new number in the player&#39;s hand is equal to the length of the last jump.</p>

<p>You have to calculate the number of paths from the cell $1$ to the cell $n$. Two paths are considered different if their sets of visited cells are different. Print the answer modulo $998\,244\,353$.</p>

### 입력

<p>The first line contains two integers $n$ and $h_0$: the number of cells on the line and the number in the player&#39;s hand before the start of the path ($2 \le n \le 100\,000$; $1 \le h_0 \le n - 1$).</p>

<p>The second line contains $n$ integers $a_1$, $a_2$, $\ldots$, $a_n$. Here, $a_i$ is the number in $i$-th cell ($1 \le a_i \le n - 1$).</p>

### 출력

<p>Print a single integer: the number of different paths modulo $998\,244\,353$.</p>