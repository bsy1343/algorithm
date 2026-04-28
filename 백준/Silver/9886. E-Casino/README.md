# [Silver I] E-Casino - 9886

[문제 링크](https://www.acmicpc.net/problem/9886)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 19, 정답: 15, 맞힌 사람: 14, 정답 비율: 77.778%

### 분류

구현, 브루트포스 알고리즘, 비트마스킹, 슬라이딩 윈도우

### 문제 설명

<p>A <em>pseudo random number generator</em> (PRNG) is a program that, taking an input (known as seed), outputs a sequence of random bits r[0], r[1], . . .. (The value of a bit is either 0 or 1.)</p>

<p>Consider a particular PRNG and a seed. A <em>gambler</em> is a person (or a computer) who has observed the first L bits of the output r[0], r[1], . . ., r[L &minus; 1]. The gambler knows the algorithm of that particular PRNG, and hence is aware of the internal mechanism of random bits generation. However, he does not know the value of the seed. With the knowledge of the PRNG algorithm and the first L bits r[0], r[1], . . ., r[L &minus; 1], the gambler wants to predict the subsequent output bits r[L], r[L + 1], . . ., that follow the observed bits.</p>

<p>It is not easy to design a PRNG that is unpredictable. The company E-Casino employs the following method. First, by observing some natural phenomenon, the company created a long sequence of N random bits S[0], S[1], . . ., S[N &minus; 1]. This array S is made public and everyone, including gamblers, can access it. The seed is a tuple (k, m), which consists of an integer k (0 &le; k &lt; N) and an M-bit sequence m = hm[0], m[1], . . . , m[M &minus; 1]i. For j = 0, 1, 2, . . ., the output bit r[j] is</p>

<p style="text-align: center;">r[j] = S[(k + j) mod N] xor m[j mod M]. (1)</p>

<p>The operator xor is the &ldquo;exclusive or&rdquo; operation. That is, for any bits a, b,</p>

<p style="text-align: center;">a xor b = (a + b) mod 2.</p>

<p>The company <em>always</em> uses</p>

<p style="text-align: center;">N = 2048, M = 32.</p>

<p>But every morning, the managers of E-Casino will collectively choose a secret seed (k, m), which is to be used in generating a random sequence.</p>

<p>Suppose you are the gambler and for a particular day you have observed the first 2M = 64 bits of the output sequence: r[0], r[1], . . ., r[63]. You also know the values of the array S. However, you do not know the value k and the sequence m. Your ultimate goal is to determine the subsequent bits. In order to do that however, you have to first determine the value of k in the secret seed (k, m). In this task, you are to find the smallest possible k.</p>

### 입력

<p>The input contains only one line. The first 2M characters of the input are the observed bits r[0], r[1], . . ., r[2M &minus; 1]. Each bit is represented by the character &lsquo;0&rsquo; or &lsquo;1&rsquo;. The very first character represents r[0], followed by r[1] and so on. Immediately following the 2M characters is the character &lsquo;%&rsquo;, which marks the start of the array S. The array S is represented as a string of &lsquo;0&rsquo; and &lsquo;1&rsquo;. The first character immediately following the marker &lsquo;%&rsquo; is S[0], and the next character is S[1], and so on. In total, the input consists of 2M + 1 + N = 2113 input characters.</p>

<p>Note that for your task it is always N = 2048 and M = 32. But for the given example N = 10 and M = 3.</p>

### 출력

<p>The output file contains an integer, which is the secret k.</p>

### 힌트

<p>The following is a small example with N = 10, k = 4, m[0] = 1, m[1] = 0, m[2] = 1, (i.e., M = 3), to illustrate the computation of r[0], r[1], . . ., r[5] in (1). The array S is shown in the third row of the table. (For clarity, the value of r[6], r[7], r[8], and r[9] are not shown.)</p>

<pre>
          j       | 6 7 8 9 0 1 2 3 4 5
   (k + j) mod N  | 0 1 2 3 4 5 6 7 8 9
---------------------------------------
 S[(k + j) mod N] | 1 1 1 0 0 1 0 1 0 1
     m[j mod M]   |         1 0 1 1 0 1
---------------------------------------
         r[j]     |         1 1 1 0 0 0</pre>

<p>Hence, the first 6 output bits are 1,1,1,0,0,0.</p>

<p>If a gambler sees only the first 6 output bits, but does not know the value k and the array m, he can still verify that the value of k must be 4. This can be verified by listing down all the combinations of k and m, and check which combination gives the 6 output bits. But note that for large N and M, this simple exhaustive search is infeasible.</p>