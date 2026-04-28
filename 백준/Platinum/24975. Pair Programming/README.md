# [Platinum I] Pair Programming - 24975

[문제 링크](https://www.acmicpc.net/problem/24975)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 79, 정답: 60, 맞힌 사람: 44, 정답 비율: 83.019%

### 분류

다이나믹 프로그래밍, 포함 배제의 원리

### 문제 설명

<p>A program consists of a sequence of instructions, each of which is of one of the following forms:</p>

<ol>
	<li>$\times d$, where $d$ is a digit in the range $[0,9]$</li>
	<li>$+s$, where $s$ is a string denoting the name of a variable. Within a program, all variable names must be distinct.</li>
</ol>

<p>The result of executing a program is defined to be the expression that results after applying each instruction in order, starting with $0$. For example, the result of executing the program $[\times 3,+x,+y,\times 2,+z]$ is the expression $(0\times 3+x+y)\times 2+z=2\times x+2\times y+z$. Different programs, when executed may produce the same expressions; for example, executing $[+w,\times 0,+y,+x,\times 2,+z, \times 1]$ would also result in the expression $2\times x+2\times y+z$.</p>

<p>Bessie and Elsie each have programs of $N$ ($1\le N\le 2000$) instructions. They will interleave these programs to produce a new program of length $2N$. Note that there are $\frac{(2N)!}{N!\times N!}$ ways to do this, but not all such programs, when executed, will produce distinct expressions.</p>

<p>Count the number of distinct expressions that may be produced by executing Bessie and Elsie&#39;s interleaved program, modulo $10^9+7$.</p>

<p>Each input contains $T$ ($1\le T\le 10$) test cases that should be solved independently. It is guaranteed that the sum of $N$ over all test cases does not exceed $2000$.</p>

### 입력

<p>The first line of the input contains $T$, the number of test cases.</p>

<p>The first line of each test case contains $N$.</p>

<p>The second line of each test case contains Bessie&#39;s program, represented by a string of length $N$. Each character is either a digit $d\in [0,9]$, representing an instruction of type 1, or the character $+$, representing an instruction of type 2.</p>

<p>The third line of each test case contains Elsie&#39;s program in the same format as Bessie&#39;s.</p>

<p>Within a test case, the variable names among all instructions are distinct. Note that their actual names are not provided, as they do not affect the answer.</p>

### 출력

The number of distinct expressions that may be produced by executing  Bessie and
Elsie's interleaved programs, modulo $10^9+7$.

### 힌트

<p>For the first test case, the two possible interleaved programs are
$[\times 1, \times 0]$  and $[\times 0,\times 1]$. These will both produce the
expression $0$ when executed.

<p>For the second test case, executing an interleaving of $[\times 1,\times 2, +x]$
and $[+y, \times 0,\times 2]$ could produce one of the expressions $0$, $x$, or
$2\times x$.