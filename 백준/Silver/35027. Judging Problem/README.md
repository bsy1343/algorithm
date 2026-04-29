# [Silver I] Judging Problem - 35027

[문제 링크](https://www.acmicpc.net/problem/35027)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 17, 정답: 12, 맞힌 사람: 10, 정답 비율: 83.333%

### 분류

구현, 시뮬레이션, 자료 구조, 집합과 맵

### 문제 설명

<p>The judges of NWRRC came up with $n$ problems on a similar topic and decided to use them for $n$ consecutive years, one problem per year. The only question was: in what order should they be used?</p>

<p>Each problem's name consists of two words. Let's call two names <em>similar</em> if either their first words are the same or their second words are the same. For example, <code>eight shaped</code> and <code>eight connected</code> are similar, while <code>hello world</code> and <code>world hello</code> are not.</p>

<p>The judges decided to implement the following rule: in the first year, they chose a problem arbitrarily. In every subsequent year, if there was a problem with a name similar to the previous year's problem that was still unused, they chose one of such problems; otherwise, they chose any unused problem.</p>

<p>You are given the names of the problems in chronological order of their use. Determine whether the judges correctly followed the rule above, or if they made a mistake.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains a single integer $n$, denoting the number of problems ($2 \le n \le 10^5$).</p>

<p>The $i$-th of the following $n$ lines contains the name of the $i$-th problem in chronological order: two words consisting of at least $1$ and at most $10$ lowercase English letters each. All problem names are distinct.</p>

<p>It is guaranteed that the sum of $n$ over all test cases does not exceed $10^5$.</p>

### 출력

<p>For each test case, print "<code>Yes</code>" if the judges followed the rule correctly, and "<code>No</code>" otherwise.</p>

### 힌트

<p>In the first test case, each subsequent problem name is similar to the previous one.</p>

<p>In the second test case, the judges should have chosen "<code>eight shaped</code>" for the second year.</p>

<p>In the third test case, neither "<code>binary problem</code>" nor "<code>logic problem</code>" is similar to "<code>judging logic</code>"; the judges could have chosen either of those problems for the third year.</p>