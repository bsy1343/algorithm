# [Silver I] Cooking Steaks - 33081

[문제 링크](https://www.acmicpc.net/problem/33081)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 23, 정답: 15, 맞힌 사람: 15, 정답 비율: 65.217%

### 분류

그리디 알고리즘, 누적 합, 두 포인터

### 문제 설명

<p>Morgan is a chef in a steak house. In his steak house, a steak can have $N$ level of doneness, numbered from $1$ to $N$. Currently, Morgan has $A_i$ steaks of doneness level $i$ ready in his steak house.</p>

<p>There are $B_i$ orders of steaks with doneness level $i$ that need to be fulfilled. Morgan can cook the steaks in order to match the doneness level. For each $1 ≤ i &lt; N$, it takes Morgan $T_i$ seconds to cook a steak from doneness level $i$ to $i + 1$. Note that Morgan can only cook one steak at a time.</p>

<p>Morgan asks for your help to find the minimum total time to fulfil all orders, or tell him that the orders are impossible to fulfil.</p>

### 입력

<p>Input begins with an integer $N$ ($2 ≤ N ≤ 100\, 000$). The next line contains $N - 1$ integers $T_i$ ($1 ≤ T_i ≤ 1000$) representing the time required to cook a steak of doneness level $i$ to $i+ 1$. The next line contains $N$ integers $A_i$ ($0 ≤ A_i ≤ 1000$) representing the number of steaks with doneness level $i$. The next line contains $N$ integers $B_i$ ($0 ≤ B_i ≤ 1000$) representing the number of orders for a steak with doneness level $i$.</p>

### 출력

<p>If all orders can be fulfilled, then output an integer in a single line representing the minimum total time to fulfill all orders. Otherwise, output <code>-1</code> in a single line.</p>