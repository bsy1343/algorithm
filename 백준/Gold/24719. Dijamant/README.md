# [Gold III] Dijamant - 24719

[문제 링크](https://www.acmicpc.net/problem/24719)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 9, 맞힌 사람: 9, 정답 비율: 52.941%

### 분류

다이나믹 프로그래밍, 그래프 이론, 그래프 탐색, 구현

### 문제 설명

<p>Lovro has a table of $n$ rows and $m$ columns, where each cell is either <code>.</code> or <code>#</code>. By rotating a square by 45<sup>◦</sup> a <em>diamond</em> shape is formed in the table. For a part of the table to be considered a diamond, its edge must also consist only of the character <code>#</code>, while its inside must be completely filled with <code>.</code> and it must be nonempty. Outside of a diamond any character is allowed. Diamonds come in different sizes, and the three smallest examples of a diamond are shown in the first sample.</p>

<p>Fabijan asked Lovro to tell him how many diamonds are there in the table, or else Lovro has to give him a cookie. Help Lovro by writing a program which counts the number of diamonds in his table.</p>

### 입력

<p>The first line contains positive integers $n$ and $m$ ($1 &le; n, m &le; 2000$), the number of rows and columns. Each of the next $n$ lines contains $m$ characters <code>.</code> or <code>#</code> which describe the table.</p>

### 출력

<p>In the only line print the number of diamonds in the table.</p>

### 힌트

<p>Clarification of the second example:</p>

<p>There is only one diamond in the table (the one with the smallest possible size). There appears to be another diamond containing it, but it is not considered a diamond because its inside is not completely filled with &#39;<code>.</code>&#39;. The shape on the right side of the table is also not a diamond because it&rsquo;s missing a <code>#</code> character on its edge.</p>