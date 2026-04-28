# [Gold IV] PTSD - 31142

[문제 링크](https://www.acmicpc.net/problem/31142)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 9, 정답: 8, 맞힌 사람: 8, 정답 비율: 100.000%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵

### 문제 설명

<p>There are $n$ soldiers in JB kingdom, numbered as $1, 2, \cdots, n$. The $i$-th soldier has a power value of $i$. </p>

<p>There is a tournament in the kingdom now. The soldiers need to be divided into several groups where each soldier belongs to exactly one group. Note that it&#39;s allowed for a group to contain only one single soldier. For some unknown reason, some soldiers have a disease called PTSD (post-traumatic stress disorder). The soldiers with PTSD don&#39;t like being the $<strong>second</strong>$ strongest soldier in their groups. Formally speaking, a soldier with PTSD will be upset if there is exactly one other soldier with a larger power value than him in his group.</p>

<p>JB, the king of JB kingdom, wants to maximize the sum of the power values of the soldiers who feel upset because of PTSD. You are asked to help him divide the soldiers.</p>

### 입력

<p>There are multiple test cases. The first line of the input contains a positive integer $T$, indicating the number of test cases. For each test case:</p>

<p>The first line contains an integer $n$ ($1 \le n \le 10^6$), indicating the number of soldiers.</p>

<p>The second line contains a string $s$ of length $n$. It&#39;s guaranteed that $s$ only contains &#39;<code>0</code>&#39; and &#39;<code>1</code>&#39;. The $i$-th character describes the $i$-th soldier: If $s_i = $ &#39;<code>1</code>&#39;, the $i$-th soldier has PTSD. Otherwise, the $i$-th soldier doesn&#39;t have PTSD.</p>

<p>It&#39;s guaranteed that the sum of $n$ of all test cases doesn&#39;t exceed $10^6$.</p>

### 출력

<p>For each test case, output one line containing an integer, indicating the maximum sum of power values of the upset soldiers.</p>

### 힌트

<p>For the first test case, a valid division is [1, 2], [3, 4], [5], which makes the $1$-st soldier and the $3$-rd soldier upset. [1, 2], [3, 5], [4] is also valid.</p>

<p>For the second test case, a valid division is [1, 2], [3, 4], [5, 6], [7, 8].</p>

<p>For the third test case, a valid division is [1, 3], [2, 4].</p>

<p>For the fourth test case, a valid division is [1, 2, 3, 4].</p>