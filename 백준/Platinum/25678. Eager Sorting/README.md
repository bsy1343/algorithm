# [Platinum IV] Eager Sorting - 25678

[문제 링크](https://www.acmicpc.net/problem/25678)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 19, 정답: 9, 맞힌 사람: 4, 정답 비율: 40.000%

### 분류

정렬

### 문제 설명

<p>Petya is a sorting robot. In his memory, there is an array of length $n$ (from $1$ to $100$), and its elements are pairwise distinct integers. The positions in the array are numbered left to right from $1$ to $n$.</p>

<p>Nina is a robot operator. Nina wants to sort this array: make it so that, for each two distinct positions, the number on the left is less than the number on the right. The only available command for that is to compare elements at two positions, $i$ and $j$. If the element on the left position (it can be position $i$ or $j$) is greater than the element on the right position, Petya swaps them and displays number <code>1</code> on the screen. Otherwise, Petya does nothing with the array and just displays <code>0</code> on the screen.</p>

<p>Unfortunately, Petya&#39;s power system is damaged, so sometimes the robot shuts down. It looks as follows: when given a command, instead of executing it, Petya just displays <code>-1</code> on the screen, and then ignores any subsequent commands.</p>

<p>To make Petya work again, Nina disassembles him and then assembles anew. The array is not altered. Unfortunately, during repairs, Nina forgets which commands she already issued to the robot. After that, Petya works as long as his battery lasts, and then shuts down again.</p>

<p>The battery has enough power for Petya to execute $1500$ commands. Petya shuts down exactly twice: after executing $x$-th command and after executing $1500$-th command ($0 &lt; x &lt; 1500$, the value of $x$ is not known to Nina). Knowing all the above, help Nina make it so that, after Petya shuts down for the second time, the array in his memory is sorted.</p>

### 입력



### 출력

