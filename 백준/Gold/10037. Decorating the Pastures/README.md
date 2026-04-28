# [Gold II] Decorating the Pastures - 10037

[문제 링크](https://www.acmicpc.net/problem/10037)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 291, 정답: 146, 맞힌 사람: 96, 정답 비율: 41.921%

### 분류

그래프 이론, 그래프 탐색, 깊이 우선 탐색, 이분 그래프

### 문제 설명

<p>Farmer John has N (1 &lt;= N &lt;= 50,000) pastures, conveniently numbered 1...N, connected by M (1 &lt;= M &lt;= 100,000) bidirectional paths. Path i connects pasture A_i (1 &lt;= A_i &lt;= N) to pasture B_i (1 &lt;= B_i &lt;= N) with A_i != B_i. It is possible for two paths to connect between the same pair of pastures.</p><p>Bessie has decided to decorate the pastures for FJ&apos;s birthday.  She wants to put a large sign in each pasture containing either the letter &apos;F&apos; or &apos;J&apos;, but in order not to confuse FJ, she wants to be sure that two pastures are decorated by different letters if they are connected by a path.</p><p>The sign company insists on charging Bessie more money for an &apos;F&apos; sign than a &apos;J&apos; sign, so Bessie wants to maximize the number of &apos;J&apos; signs that she uses.  Please determine this number, or output -1 if there is no valid way to arrange the signs.</p>

### 입력

<ul><li>Line 1: Two integers N and M.</li><li>Lines 2..M+1: Two integers, A_i and B_i indicating that there is a bidirectional path from A_i to B_i.</li></ul>

### 출력

<ul><li>Line 1: A single integer indicating the maximum number of &apos;J&apos; signs that Bessie can use.  If there is no valid solution for arranging the signs, output -1.</li></ul>

### 힌트

<h4>Input Details</h4><p>The pastures and paths form the vertices and edges of a square.</p><h4>Output Details</h4><p>Bessie can either choose to label pastures 1 and 3 with &apos;J&apos; signs, or alternatively pastures 2 and 4.</p>