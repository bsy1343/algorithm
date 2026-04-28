# [Gold IV] Saruman’s Level Up - 4441

[문제 링크](https://www.acmicpc.net/problem/4441)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 69, 정답: 21, 맞힌 사람: 20, 정답 비율: 38.462%

### 분류

수학, 정수론

### 문제 설명

<p>Saruman&rsquo;s army of orcs and other dark minions continuously mine and harvest lumber out of the land surrounding his mighty tower for N continuous days. On day number i, Saruman either chooses to spend resources on mining coal and harvesting more lumber, or on raising the level (i.e., height) of his tower. He levels up his tower by one unit only on days where the binary representation of i contains a total number of 1&rsquo;s that is an exact multiple of 3. Assume that the initial level of his tower on day 0 is zero.</p>

<p>For example, Saruman will level up his tower on day 7 (binary 111), next on day 11 (binary 1011) and then day 13, day 14, day 19, and so on.</p>

<p>Saruman would like to forecast the level of his tower after N days. Can you write a program to help?</p>

### 입력

<p>The input file will contain multiple input test cases, each on a single line. Each test case consists of a positive integer N &lt; 10<sup>16</sup>, as described above. The input ends on end of file.</p>

### 출력

<p>For each test case, output one line: &ldquo;Day N: Level = L&rdquo;, where N is the input N, and L is the number of levels after N days.</p>