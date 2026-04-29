# [Gold V] Ramen Packs - 33800

[문제 링크](https://www.acmicpc.net/problem/33800)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 50, 정답: 32, 맞힌 사람: 27, 정답 비율: 71.053%

### 분류

비트마스킹, 수학, 정수론

### 문제 설명

<p>Thomas wants to buy $n$ cups of ramen from Liza. She has two brands that he likes: brand A and brand B. Each brand sells packs of ramen in varying sizes. For each integer $k \ge 1$, there is a brand A pack of size $k$ that contains $k^2$ cups of ramen, and a brand B pack of size $k$ that contains $2k^2$ cups of ramen. Liza has exactly one pack of each type left in stock. Your task is to determine how Thomas can purchase exactly $n$ cups of ramen from Liza, or state that such a thing is not possible.</p>

<p>Note that you do not need to minimize the number of packs.</p>

### 입력

<p>The first line of the input contains a single integer $t$ ($1 \le t \le 10^4$) --- the number of test cases. The description of the test cases follows.</p>

<p>Each test case consists of a single line containing one integer $n$ ($1 \le n \le 10^9$), the number of ramen cups that Thomas wants from Liza.</p>

### 출력

<p>For each test case, output a single line.</p>

<p>If it is not possible for Thomas to buy $n$ cups of ramen from Liza, simply print $0$.</p>

<p>Otherwise, print a positive integer $k$, followed by a list of $k$ pack types. A \it{pack type} is a letter (either A or B) indicating the brand of the ramen pack followed by a positive integer indicating its size. The sum of the number of cups over all packs should be $n$, and no pack type may appear more than once.</p>

### 힌트

<p>In the first test case, Thomas buys just the $A1$ pack from Liza for a total of $1^2 = 1$ cups.</p>

<p>In the second test case, Thomas can buy the $A1$ and $A3$ packs from Liza for a total of $1^2 + 3^2 = 10$ cups.</p>

<p>In the third test case, Thomas can buy the $A2$ and $B2$ packs from Liza for a total of $2^2 + 2*2^2 = 12$ cups.</p>

<p>In the fourth test case, Thomas can buy the $A3$, $B2$, $B1$, and $A1$ packs from Liza for a total of $3^2 + 2*2^2 + 2*1^2 + 1^2 = 20$ cups.</p>