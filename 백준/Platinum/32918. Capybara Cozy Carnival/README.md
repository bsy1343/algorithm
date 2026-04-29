# [Platinum I] Capybara Cozy Carnival - 32918

[문제 링크](https://www.acmicpc.net/problem/32918)

### 성능 요약

시간 제한: 4 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 16, 맞힌 사람: 14, 정답 비율: 87.500%

### 분류

다이나믹 프로그래밍, 분할 정복을 이용한 거듭제곱, 수학, 스택, 자료 구조, 조합론

### 문제 설명

<p>Chilling capybaras celebrate Capybara Cozy Carnival. Chairman capybara cuts convex cake. Cake contains $n$ colorful corners. Countless colors comprise $k$ choices. Creating $m$ continuous crossing-free corner-to-corner cuts, chairman cuts cake chunks, catering $m + 1$ comrades. Curiously, consecutive cake chunks corners contain contrasting colors. </p>

<p>Calculate cake corners color combinations, considering cuts conditions.</p>

<p>In other words, you are given a cake in the shape of a regular $n$-sided polygon and $m$ non-intersecting diagonal cuts, which divide it into $m + 1$ slices.</p>

<p>Calculate the number of ways to color each corner of the original cake with one of the $k$ colors, such that no two neighboring corners of the resulting slices have the same color. Two corners are considered neighboring if they are either consecutive in the original cake, or they are the endpoints of the same cut. It is not necessary to use all the colors. As the number of ways might be large, find it modulo $998\,244\,353$.</p>

### 입력

<p>Each test contains multiple test cases. The first line contains the number of test cases $t$ ($1 \le t \le 10^4$). The description of the test cases follows.</p>

<p>The first line of each test case contains three integers $n$, $m$, and $k$, denoting the number of cake corners, the number of cuts, and the number of available colors ($3 \le n \le 10^9$; $0 \le m \le 2\cdot 10^5$; $2 \le k \le 10^6$).</p>

<p>The $i$-th of the following $m$ lines contains two integers $u_i$ and $v_i$, denoting the corners connected by the $i$-th cut ($1 \le u_i &lt; v_i \le n$). No two cuts may coincide or intersect except at the ends of the cuts. All cuts are straight, going strictly inside the cake.</p>

<p>It is guaranteed that the sum of $m$ over all test cases does not exceed $2\cdot 10^5$.</p>

### 출력

<p>For each test case, print the number of ways to color the cake corners such that no two neighboring corners have the same color, modulo $998\,244\,353$. Remember that you don't have to use all the colors.</p>

### 힌트

<p>In the first test case, corner $1$ has one of $3$ colors. Corner $2$ has one of the remaining $2$ colors. Corner $3$ has the remaining color, and corner $4$ has the same color as corner $2$. Thus, there are $6$ ways in total. </p>

<p>In the second test case, we have an odd number of corners and two colors, and every pair of consecutive corners must have different colors; that is impossible.</p>