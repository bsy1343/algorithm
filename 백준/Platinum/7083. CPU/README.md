# [Platinum III] CPU - 7083

[문제 링크](https://www.acmicpc.net/problem/7083)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 57, 정답: 11, 맞힌 사람: 6, 정답 비율: 15.385%

### 분류

자료 구조, 분리 집합, 기하학, 구현, 느리게 갱신되는 세그먼트 트리, 세그먼트 트리

### 문제 설명

<p>John is attempting to design a low cost processor that he can build on a circuit board using standard components. The components need to be connected together with connecting wires (&quot;connections&quot;). The connections cannot cross components or each other, but do not have to follow straight lines.</p>

<p>John has already made the basic design, in which all the components are connected together in a loop (called the main loop). The components in the main loop are in a consecutive order. However, to speed up the processor he wants to add direct connections between some pairs of components. For each component he will wish to add at most one connection. He has made a list of all the connections he wants to add, and has ordered them by importance. He will incorporate the K most important of these connections, where K is as large as possible without forcing wires to cross. Your task is to write a program and help John to determine the largest possible value of K .</p>

### 입력

<p>Your program should read the input from a standard input. The first line of the file contains an integer N (where 1&lt;N &lt;200.000) representing the number of components that John has already in the main loop. The second line contains an integer M (where 1&lt;M &lt;50.000) representing the number of extra connections that John is considering to add. The remaining M lines contain two positive integers P and Q , indicating that John wishes to connect P to Q .</p>

<p>Note : there is never a connection from a component to itself, although a component may be connected to an adjacent component in the main loop. The connections are listed in descending order of importance.</p>

### 출력

<p>Your program should write the output into a standard output with 1 line containing a single integer, the maximum possible value of K .</p>