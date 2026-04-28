# [Silver II] ICPC Team Generation - 31305

[문제 링크](https://www.acmicpc.net/problem/31305)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 77, 정답: 41, 맞힌 사람: 35, 정답 비율: 53.030%

### 분류

그리디 알고리즘

### 문제 설명

<p>Vi is a coach for her university&#39;s ICPC organization and is working on creating teams for their upcoming regional contest. They recently competed in the North America Qualifier and Vi is using the results as well as each person&#39;s preferences to create as many teams of three as possible to send to regionals.</p>

<p>More specifically, $n$ people from Vi&#39;s university competed in the North America Qualifier (NAQ), and each person got a unique rank from $1$ to $n$. The person at rank $r$ has two parameters, $a_r$ and $b_r$, where $a_r \le r \le b_r$, indicating that their two teammates must have a rank between $a_r$ and $b_r$, inclusive. Teams must have exactly three people.</p>

<p>Due to the collaborative environment, Vi notes that for every pair of individuals at ranks $i$ and $j$, if $i &lt; j$, then $a_i \le a_j$ and $b_i \le b_j$.</p>

<p>Compute the maximum number of teams that Vi can send to regionals</p>

### 입력

<p>The first line of input contains a single integer $n$ ($3 \le n \le 50$), which is the number of competitors in the local contest.</p>

<p>Each of the next $n$ lines contains two integers $a_r$ and $b_r$ ($a_r \le r \le b_r$), where $r$ is the competitor&#39;s rank. These are the limits of the ranks of the competitors that can be teamed with this competitor. The competitors are given in rank order, from $1$ to $n$. If $i &lt; j$, then $a_i \le a_j$ and $b_i \le b_j$.</p>

### 출력

<p>Output a single integer, which is the maximum number of teams Vi can send to the regional contest.</p>