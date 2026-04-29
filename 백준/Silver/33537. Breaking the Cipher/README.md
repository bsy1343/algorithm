# [Silver I] Breaking the Cipher - 33537

[문제 링크](https://www.acmicpc.net/problem/33537)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 33, 정답: 28, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

분할 정복을 이용한 거듭제곱, 브루트포스 알고리즘, 수학, 정수론

### 문제 설명

<p>It has already been years since Alice moved into her new house in the countryside, but only a week ago she suddenly found a mysterious safe, requiring a secret combination to unlock, hidden in her basement. She jumped onto the internet to ask strangers for clues and she received a message from a mysterious man called Bob. He included the combination to Alice's safe, but noted that he had encrypted it with the RSA algorithm using Alice's public key. On the internet you find that the RSA algorithms works as follows:</p>

<blockquote>
<p><strong>Key generation</strong>:</p>

<ol>
	<li>Choose two distinct prime numbers $p$ and $q$.</li>
	<li>Compute $n = pq$.</li>
	<li>Compute $\phi(n) = \phi(p)\cdot \phi(q) = (p - 1)\cdot (q - 1) = n - (p + q - 1)$, where $\phi$ is Euler's totient function.</li>
	<li>Choose an integer $e$ such that $1 &lt; e &lt; \phi(n)$ and gcd$(e, \phi(n)) = 1$; i.e., $e$ and $\phi(n)$ are coprime.</li>
	<li>Determine $d$ as $d \equiv e^{-1} \pmod{\phi(n)}$; i.e., $d \cdot e \equiv 1 \pmod{\phi(n)}$.</li>
</ol>

<p><strong>Encryption:</strong></p>

<p>Suppose that Bob would like to send message $M$ to Alice. He then computes the ciphertext $C$, using Alice's public key $e$, corresponding to \begin{equation*} C \equiv M^e \pmod{n} \end{equation*}</p>

<p><strong>Decryption:</strong></p>

<p>Alice can recover $M$ from $C$ by using her private key exponent $d$ by computing \begin{equation*} M \equiv C^d \pmod{n} \end{equation*} Additionally, Alice has learned that the following congruence could prove to be useful for the decryption process: \begin{equation*} (a \cdot b) \mod{n} \equiv ((a \mod{n}) \cdot (b \mod{n})) \mod{n} \end{equation*}</p>
</blockquote>

<p>Alice has already chosen the integers $p$, $q$, and $e$ accordingly and needs your help to decrypt the message $C$ she has received from Bob.</p>

### 입력

<p>The input to this problem is structured as follows: The first line contains three integers, $1 &lt; p, q, e &lt; 1000$, respectively. The second line contains one integer $C$, the encrypted secret combination to Alice's safe.</p>

### 출력

<p>One line with the (decrypted) combination $M$ to Alice's safe.</p>