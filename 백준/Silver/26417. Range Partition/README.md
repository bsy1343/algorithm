# [Silver I] Range Partition - 26417

[문제 링크](https://www.acmicpc.net/problem/26417)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 49, 정답: 27, 맞힌 사람: 24, 정답 비율: 60.000%

### 분류

수학, 그리디 알고리즘, 정수론, 해 구성하기

### 문제 설명

<p>Alan and Barbara suddenly felt like playing with numbers. Alan chooses a non-empty subset from the set of first $N$ positive integers ($1,2,\dots ,N$). Barbara takes the rest of the numbers (if any) from the set. And then they both calculate the sum of the elements in their respective sets.</p>

<p>Alan believes in a magic ratio, which is $X:Y$. Hence, Alan wants to choose the subset in such a way that the ratio between the sum of Alan&#39;s subset and the sum of Barbara&#39;s subset is exactly $X:Y$.</p>

<p>Can you help Alan to choose a subset that can achieve the desired ratio?</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow.</p>

<p>Each test case has a single line containing three integers, $N$, $X$ and $Y$, as described above.</p>

### 출력

<p>For each test case, output the first line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is <code>POSSIBLE</code>, if Alan can choose such a non-empty subset, and <code>IMPOSSIBLE</code> otherwise.</p>

<p>If you print <code>POSSIBLE</code>, then output two more lines for that test case.</p>

<p>In the second line, print a single integer, which denotes the size of Alan&#39;s subset.</p>

<p>In the third line, print the integers present in Alan&#39;s subset.</p>

<p>If there are multiple solutions, you can print any of them.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;X&le;10^8$.</li>
	<li>$1&le;Y&le;10^8$.</li>
	<li>$\gcd(X,Y)=1$, where gcd is <a href="https://en.wikipedia.org/wiki/Greatest_common_divisor" target="_blank">Greatest common divisor</a>.</li>
</ul>