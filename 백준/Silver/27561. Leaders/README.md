# [Silver I] Leaders - 27561

[문제 링크](https://www.acmicpc.net/problem/27561)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 649, 정답: 264, 맞힌 사람: 213, 정답 비율: 41.929%

### 분류

그리디 알고리즘, 구현

### 문제 설명

<p>Farmer John has $N$ cows ($2 \leq N \leq 10^5$). Each cow has a breed that is either Guernsey or Holstein. As is often the case, the cows are standing in a line, numbered $1 \ldots N$ in this order.</p>

<p>Over the course of the day, each cow writes down a list of cows. Specifically, cow $i$&#39;s list contains the range of cows starting with herself (cow $i$) up to and including cow $E_i$ ($i \leq E_i \leq N$).</p>

<p>FJ has recently discovered that each breed of cow has exactly one distinct leader. FJ does not know who the leaders are, but he knows that each leader must have a list that includes all the cows of their breed, or the other breed&#39;s leader (or both).</p>

<p>Help FJ count the number of pairs of cows that could be leaders. It is guaranteed that there is at least one possible pair.</p>

### 입력

<p>The first line contains $N$.</p>

<p>The second line contains a string of length $N$, with the $i$th character denoting the breed of the $i$th cow (G meaning Guernsey and H meaning Holstein). It is guaranteed that there is at least one Guernsey and one Holstein.</p>

<p>The third line contains $E_1 \dots E_N$.</p>

### 출력

<p>Output the number of possible pairs of leaders.</p>