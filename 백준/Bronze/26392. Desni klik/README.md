# [Bronze III] Desni klik - 26392

[문제 링크](https://www.acmicpc.net/problem/26392)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 328, 정답: 273, 맞힌 사람: 231, 정답 비율: 84.615%

### 분류

구현, 문자열

### 문제 설명

<p>NFP is the future!, this is something all Noa&rsquo;s friends can expect him to say when finance topics come up.</p>

<p>NFP is one of the cryptocurrencies. The value of NFP over the course of s days can be represented with a matrix with r rows and s columns, consisting only of characters <code>.</code> and <code>#</code>. The character <code>#</code> in the i-th column represents the value of NFP on the i-th day, with the value being the number of the row, counted bottom-up.</p>

<pre style="text-align: center;">
....##.
#..#...
.##....
......#</pre>

<p style="text-align: center;">The value of NFP from the second example over the course of 7 days was: 3, 2, 2, 3, 4, 4, 1. The insecurity of this NFP is 3.</p>

<p>The insecurity of NFP is defined as the difference between the maximum and minimum value it achieves over the course of s days.</p>

<p>Noa wants to determine the insecurity for n NFPs, whose values are represented by matrices with r rows and s columns.</p>

<p>Help him determine the insecurity of each of the n NFPs.</p>

### 입력

<p>The first line contains integers n, r and s (1 &le; n &le; 20, 2 &le; r, s &le; 50), the number of NFPs, and the number of rows and colums of the matrices.</p>

<p>n matrices follows, one below another, each with r rows and s columns, representing NFP values. Each column consists only of characters <code>.</code>, except for exactly one character <code>#</code>.</p>

### 출력

<p>Print n lines. In the i-th of n lines print the insecurity od the i-th NFP.</p>

### 힌트

<p>Note: For clarity&rsquo;s sake, in the examples there are blank lines between matrices. In the test cases there will not be blank lines between matrices.</p>

<p>Clarification of the first example: The values of the first and the second NFP do not change over the days, so their insecurities are equal to 0. The value of the third NFP decreases by 1 on the second day, so the insecurity is equal to 1. The value of the fourth NFP increases by 1 on the second day, so the insecurity is equal to 1.</p>

<p>Clarification of the second example: The maximum value NFP has is 5 (on days 6 and 8), and the minimum value is 1 (on day 1). Therefore, the insecurity is equal to 5 &minus; 1 = 4.</p>