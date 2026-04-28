# [Platinum II] Wealthy Family - 4815

[문제 링크](https://www.acmicpc.net/problem/4815)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 65, 정답: 14, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 트리

### 문제 설명

<p>While studying the history of royal families, you want to know how wealthy each family is. While you have various &#39;net worth&#39; figures for each individual throughout history, this is complicated by double counting caused by inheritance. One way to estimate the wealth of a family is to sum up the net worth of a set of k people such that no one in the set is an ancestor of another in the set. The wealth of the family is the maximum sum achievable over all such sets of k people. Since historical records contain only the net worth of male family members, the family tree is a simple tree in which every male has exactly one father and a non-negative number of sons. You may assume that there is one person who is an ancestor of all other family members.</p>

### 입력

<p>The input consists of a number of cases. Each case starts with a line containing two integers separated by a space: N (1 &lt;= N &lt;= 150,000), the number of people in the family, and k (1 &lt;= k &lt;= 300), the size of the set. The next N lines contain two non-negative integers separated by a space: the parent number and the net worth of person i (1 &lt;= i &lt;= N). Each person is identified by a number between 1 and N, inclusive. There is exactly one person who has no parent in the historical records, and this will be indicated with a parent number of 0. The net worths are given in millions and each family member has a net worth of at least 1 million and at most 1 billion.</p>

### 출력

<p>For each case, print the maximum sum (in millions) achievable over all sets of k people satisfying the constraints given above. If it is impossible to choose a set of k people without violating the constraints, print &#39;impossible&#39; instead.</p>