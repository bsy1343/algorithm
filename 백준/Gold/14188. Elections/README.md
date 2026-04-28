# [Gold III] Elections - 14188

[문제 링크](https://www.acmicpc.net/problem/14188)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 48, 정답: 31, 맞힌 사람: 30, 정답 비율: 71.429%

### 분류

수학, 다이나믹 프로그래밍, 조합론, 확률론

### 문제 설명

<p>Jenabkhan who has become billionaire from his Laboo bussiness, is now running for president. His country uses a strange mechanism, so-called electoral college, to select the president. There are several states in the country, and each state counts the votes independently. Depending on the population, each state has some members in the electoral college, and all of those members will vote the candidate with the majority of votes in their state. In the case of ties, each state has some tie-break rule to announce the clear winner. The president will be the candidate who receives more than half of votes in the electoral college.</p>

<p>Given the chance of Jenabkhan to win in each state, compute his winning probability in the electoral college.</p>

### 입력

<p>The input consists of several test cases. Each test case starts with a line containing a single integer n denoting the number of states (1 &le; n &le; 1000). Each of the next n lines contains a real value pi with at most 4 digits after the decimal point (0 &le; p<sub>i </sub>&le; 1) and a positive integer e<sub>i</sub> , specifying the winning probability of Jenabkhan in the i-th state and the number of electoral votes associated with that state, respectively. The total number of members in the electoral college is an odd number and is no more than 2000. The input terminates with a line containing 0 which should not be processed.</p>

### 출력

<p>For each test case, output in a single line containing the winning probability of Jenabkhan, rounded to exactly four digits after the decimal point (e.g., 0.3000 is correct while 0.3 is not).</p>