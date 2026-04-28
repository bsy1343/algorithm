# [Platinum II] How to Learn You Score - 19822

[문제 링크](https://www.acmicpc.net/problem/19822)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 32, 정답: 14, 맞힌 사람: 13, 정답 비율: 52.000%

### 분류

수학, 구현, 브루트포스 알고리즘, 애드 혹, 누적 합

### 문제 설명

<p>Petya participates in such contest that the participants only learn results of judging their submissions after the end of the contest.</p>

<p>There are $n$ problems numbered from $1$ to $n$ in the contest. For each problem he has made a submission. After the contest he was very eager to learn his points and his place. But the results would only be published at the closing ceremony, which is a few hours away.</p>

<p>Petya decided to find out his result before that: to get his points for each problem from the jury, he would ask weird questions. Let Petya&#39;s points be $c_1, c_2, \ldots, c_n$ for problems $1, 2, \ldots, n$, respectively. Petya doesn&#39;t know these numbers and wants to find them out.</p>

<p>Petya chooses three distinct numbers of the problems and asks the jury to tell him the sum of the minimum and the maximum points he received for these three problems. Fortunately, the jury answers such queries. Formally, if he queries about $i$, $j$, $k$, he gets $min(c_i, c_j, c_k) + max(c_i, c_j, c_k)$.</p>

<p>Petya still doesn&#39;t know how to find out all his points. Help him find out $c_1, c_2, \ldots, c_n$, by making no more than $4n$ queries to the jury.</p>

### 입력



### 출력



### 힌트

<p>In this sample, there are $5$ problems, and Petya got $1$, $0$, $2$, $1$, $3$ points for the problems. If he queries about problems $1$, $2$, $3$, his minimum points among them is $0$ (for the $2$-nd problem), and his maximum is $2$ (for the $3$-rd problem). Thus, the jury will answer $2 = 0 + 2$ to that query.</p>