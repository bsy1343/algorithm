# [Platinum III] Procesor - 32974

[문제 링크](https://www.acmicpc.net/problem/32974)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 41, 정답: 11, 맞힌 사람: 10, 정답 비율: 47.619%

### 분류

세그먼트 트리, 자료 구조, 트리

### 문제 설명

<p>Initially, Fran has an empty array $a$. Fran processes $n$ queries of the form $x$ — he appends $x$ elements to the end of $a$. After each query, Fran wants to determine the smallest element in the array $a$, and once he identifies it, he removes it from the array without altering the indices of the other elements.</p>

<p>Your task is to determine the smallest element of the array for each query by asking questions.</p>

### 입력



### 출력



### 힌트

<p>Explanation of the Sample Case:</p>

<p>The final array is of the form $3, 2, 4, 1, 5$.</p>

<p>The first query outputs $1$ because $a_1 &gt; a_2$.</p>

<p>The second query outputs $0$ because $a_1 &lt; a_3$.</p>

<p>The third query outputs $0$ because $a_2 &lt; a_3$.</p>

<p>After this, it can be determined that $a_2$ is the smallest current element, so the output is <code>!</code> $2$. The interaction continues with the subsequent queries.</p>