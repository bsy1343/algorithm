# [Gold III] Cryptopangrams - 27772

[문제 링크](https://www.acmicpc.net/problem/27772)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 39, 정답: 15, 맞힌 사람: 11, 정답 비율: 55.000%

### 분류

애드 혹, 임의 정밀도 / 큰 수 연산, 유클리드 호제법, 수학, 정수론

### 문제 설명

<p>On the Code Jam team, we enjoy sending each other <i>pangrams</i>, which are phrases that use each letter of the English alphabet at least once. One common example of a pangram is &quot;the quick brown fox jumps over the lazy dog&quot;. Sometimes our pangrams contain confidential information &mdash; for example, <code>CJ QUIZ: KNOW BEVY OF DP FLUX ALGORITHMS</code> &mdash; so we need to keep them secure.</p>

<p>We looked through a cryptography textbook for a few minutes, and we learned that it is very hard to factor products of two large prime numbers, so we devised an encryption scheme based on that fact. First, we made some preparations:</p>

<ul>
	<li>We chose 26 different prime numbers, none of which is larger than some integer <b>N</b>.</li>
	<li>We sorted those primes in increasing order. Then, we assigned the smallest prime to the letter <code>A</code>, the second smallest prime to the letter <code>B</code>, and so on.</li>
	<li>Everyone on the team memorized this list.</li>
</ul>

<p>Now, whenever we want to send a pangram as a message, we first remove all spacing to form a plaintext message. Then we write down the product of the prime for the first letter of the plaintext and the prime for the second letter of the plaintext. Then we write down the product of the primes for the second and third plaintext letters, and so on, ending with the product of the primes for the next-to-last and last plaintext letters. This new list of values is our ciphertext. The number of values is one smaller than the number of characters in the plaintext message.</p>

<p>For example, suppose that <b>N</b> = 103 and we chose to use the first 26 odd prime numbers, because we worry that it is too easy to factor even numbers. Then <code>A</code> = 3, <code>B</code> = 5, <code>C</code> = 7, <code>D</code> = 11, and so on, up to <code>Z</code> = 103. Also suppose that we want to encrypt the <code>CJ QUIZ</code>... pangram above, so our plaintext is <code>CJQUIZKNOWBEVYOFDPFLUXALGORITHMS</code>. Then the first value in our ciphertext is 7 (the prime for <code>C</code>) times 31 (the prime for <code>J</code>) = <code>217</code>; the next value is <code>1891</code>, and so on, ending with <code>3053</code>.</p>

<p>We will give you a ciphertext message and the value of <b>N</b> that we used. We will not tell you which primes we used, or how to decrypt the ciphertext. Do you think you can recover the plaintext anyway?</p>

### 입력

<p>The first line of the input gives the number of test cases, <b>T</b>. <b>T</b> test cases follow; each test case consists of two lines. The first line contains two integers: <b>N</b>, as described above, and <b>L</b>, the length of the list of values in the ciphertext. The second line contains <b>L</b> integers: the list of values in the ciphertext.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where <code>x</code> is the test case number (starting from 1) and <code>y</code> is a string of <b>L</b> + 1 uppercase English alphabet letters: the plaintext.</p>

### 제한

<ul>
	<li>1 &le; <b>T</b> &le; 100.</li>
	<li>25 &le; <b>L</b> &le; 100.</li>
	<li>The plaintext contains each English alphabet letter at least once.</li>
</ul>