# [Platinum IV] Jupiter Attacks! - 5689

[문제 링크](https://www.acmicpc.net/problem/5689)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 15, 맞힌 사람: 15, 정답 비율: 57.692%

### 분류

자료 구조, 세그먼트 트리, 해싱

### 문제 설명

<p>Jupiter is invading! Major cities have been destroyed by Jovian spacecrafts and humanity is fighting back. Nlogonia is spearheading the counter-offensive, by hacking into the spacecrafts&rsquo; control system. Unlike Earthling computers, in which usually a byte has 28 possible values, Jovian computers use bytes with \(B\) possible values, {0, 1,...,\(B\)-1}. Nlogonian software engineers have reverse-engineered the firmware for the Jovian spacecrafts, and plan to sabotage it so that the ships eventually self-destruct.</p>

<p>As a security measure, however, the Jovian spacecrafts run a supervisory program that periodically checks the integrity of the firmware, by hashing portions of it and comparing the result against known good values. To hash the portion of the firmware from the byte at position \(i\) to the byte at position \(j\), the supervisor uses the hash function</p>

<p>\[H(f_i, \dots, f_j) = \sum_{k=0}^{j-i}{B^kf_{j-k}} ~~ (\bmod P )\]</p>

<p>where \(P\) is a prime number. For instance, if \(B\) = 20 and \(P\) = 139, while bytes 2 to 5 of the firmware have the values \(f_2\) = 14, \(f_3\) = 2, \(f_4\) = 2, and \(f_5\) = 4, then</p>

<p>\[ \begin{align*} H(f_2, \dots, f_5) &amp; = B^0f_5 + B^1f_4 + B^2f_3 + B^3f_2 ~~(\bmod P) \\ &amp; = 20^0 \times 4 + 20^1 \times 2 + 20^2 \times 2 + 20^3 \times 14 ~~&nbsp;(\bmod 139) \\ &amp; = 4 + 40 + 800 + 112000 ~~&nbsp;(\bmod 139) \\ &amp; = 112844 &nbsp;~~&nbsp;(\bmod 139) \\ &amp; = 115 \end{align*}\]</p>

<p>The Nlogonian cryptologists need to find a way to sabotage the firmware without tripping the supervisor. As a first step, you have been assigned to write a program to simulate the interleaving of two types of commands: editing bytes of the firmware by the Nlogonian software engineers, and computing hashes of portions of the firmware by the Jovian supervisory program. At the beginning of the simulation the value of every byte in the firmware is zero.</p>

### 입력

<p>Each test case is described using several lines. The first line contains four integers \(B\), \(P\), \(L\) and \(N\), where \(B\) is the number of possible values of a Jovian byte, \(P\) is the modulus of the Jovian hash (\(2 \le B &lt; P \le 10^9\) and \(P\) prime), \(L\) is the length (number of Jovian bytes) of the spacecrafts&rsquo; firmware, and \(N\) is the number of commands to simulate (\(1 \le L, N \le 10^5\)). At the beginning of the simulation the value of every byte in the firmware is \(f_i = 0\) for \(1 \le i \le L\). Each of the next \(N\) lines describes a command to simulate. Each command description starts with an uppercase letter that is either &lsquo;E&rsquo; or &lsquo;H&rsquo;, with the following meanings.</p>

<ul>
	<li>&lsquo;E&rsquo; &rarr; The line describes an edit command. The letter is followed by two integers \(I\) and \(V\) indicating that the byte at position \(I\) of the firmware (that is, \(f_I\)) must receive the value \(V\) (\(1 \le I \le L\) and \(0 \le V \le B-1\)).</li>
	<li>&lsquo;H&rsquo; &rarr; The line describes a hash command. The letter is followed by two integers \(I\) and \(J\) indicating that \(H(f_I ,\dots f_J)\) must be computed (\(1 \le I \le J \le L\)).</li>
</ul>

### 출력

<p>For each test case output the results of the hash commands in the input. In the i-th line write an integer representing the result of the i-th hash command. Print a line containing a single character &lsquo;-&rsquo; (hyphen) after each test case.</p>