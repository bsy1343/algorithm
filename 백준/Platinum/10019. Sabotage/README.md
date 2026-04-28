# [Platinum III] Sabotage - 10019

[문제 링크](https://www.acmicpc.net/problem/10019)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 264, 정답: 100, 맞힌 사람: 72, 정답 비율: 36.735%

### 분류

다이나믹 프로그래밍, 이분 탐색, 누적 합, 매개 변수 탐색

### 문제 설명

<p>Farmer John&apos;s arch-nemesis, Farmer Paul, has decided to sabotage Farmer John&apos;s milking equipment!</p><p>The milking equipment consists of a row of N (3 &lt;= N &lt;= 100,000) milking machines, where the ith machine produces M_i units of milk (1 &lt;= M_i &lt;= 10,000).  Farmer Paul plans to disconnect a contiguous block of these machines -- from the ith machine up to the jth machine (2 &lt;= i &lt;= j &lt;= N-1); note that Farmer Paul does not want to disconnect either the first or the last machine, since this will make his plot too easy to discover.  Farmer Paul&apos;s goal is to minimize the average milk production of the remaining machines.  Farmer Paul plans to remove at least 1 cow, even if it would be better for him to avoid sabotage entirely.</p><p>Fortunately, Farmer John has learned of Farmer Paul&apos;s evil plot, and he is wondering how bad his milk production will suffer if the plot succeeds.  Please help Farmer John figure out the minimum average milk production of the remaining machines if Farmer Paul does succeed.</p>

### 입력

<ul><li>Line 1: The integer N.</li><li>Lines 2..1+N: Line i+1 contains M_i.</li></ul>

### 출력

<ul><li>Line 1: The lowest possible average Farmer Paul can achieve, rounded to 3 digits after the decimal point, and printed with 3 digits after the decimal point.</li></ul>

### 힌트

<h4>Output Details</h4><p>The optimal solution is to remove the 7 and 8, leaving 5, 1, and 2, whose average is 8/3.</p>