# [Gold III] Milk Scheduling - 9869

[문제 링크](https://www.acmicpc.net/problem/9869)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 620, 정답: 279, 맞힌 사람: 228, 정답 비율: 46.626%

### 분류

자료 구조, 그리디 알고리즘, 정렬, 우선순위 큐

### 문제 설명

<p>Farmer John has N cows that need to be milked (1 &lt;= N &lt;= 10,000), each of which takes only one unit of time to milk.</p><p>Being impatient animals, some cows will refuse to be milked if Farmer John waits too long to milk them.  More specifically, cow i produces g_i gallons of milk (1 &lt;= g_i &lt;= 1000), but only if she is milked before a deadline at time d_i (1 &lt;= d_i &lt;= 10,000).  Time starts at t=0, so at most x total cows can be milked prior to a deadline at time t=x.</p><p>Please help Farmer John determine the maximum amount of milk that he can obtain if he milks the cows optimally.</p>

### 입력

<ul><li>Line 1: The value of N.</li><li>Lines 2..1+N: Line i+1 contains the integers g_i and d_i.</li></ul>

### 출력

<ul><li>Line 1: The maximum number of gallons of milk Farmer John can obtain.</li></ul>

### 힌트

<h4>Input Details</h4><p>There are 4 cows.  The first produces 10 gallons of milk if milked by time 3, and so on.</p><h4>Output Details</h4><p>Farmer John milks cow 3 first, giving up on cow 4 since she cannot be milked by her deadline due to the conflict with cow 3.  Farmer John then milks cows 1 and 2.</p>