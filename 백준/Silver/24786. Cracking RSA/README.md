# [Silver II] Cracking RSA - 24786

[문제 링크](https://www.acmicpc.net/problem/24786)

### 성능 요약

시간 제한: 3 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 83, 정답: 58, 맞힌 사람: 48, 정답 비율: 72.727%

### 분류

브루트포스 알고리즘, 수학, 정수론

### 문제 설명

<figure style="float: right;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24786.%E2%80%85Cracking%E2%80%85RSA/4e1b076f.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24786.%E2%80%85Cracking%E2%80%85RSA/4e1b076f.png" data-original-src="https://upload.acmicpc.net/3b16c0d0-bf39-4fe4-bdd9-c935f243c4e0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 200px; height: 100px;" />
<figcaption>Image by Sean MacEntee (<a href="https://flic.kr/p/qi1eYu">Flickr</a>) [<a href="http://creativecommons.org/licenses/by/2.0">CC BY 2.0</a>]</figcaption>
</figure>

<p>RSA is a widely used public-key cryptosystem that allows two parties (such as people or computers) to exchange secret messages without revealing information to anyone else listening on the conversation. Many websites use RSA when visited over a secure <code>https</code> connection. In RSA, each party has two different keys: a <em>public</em> key that is published and a <em>private</em> key that is kept secret. To encrypt a message intended for a specific recipient, the sender will use the recipient&#39;s public key to encrypt the message. The recipient will use their private key to decrypt the message.</p>

<p>An RSA public key $(n, e)$ consists of two numbers $n$ and $e$. The number $n$ is a product of two distinct prime numbers, $p$ and $q$. In real applications, $n$ would be hundreds of decimal digits long for security.</p>

<p>Let $\varphi(n)$ be Euler&#39;s <em>totient</em> function, which in this case is equal to $(p-1) (q-1)$. The private key consists of $(n, d)$, where $n$ is the same as in the public key and $d$ is the solution to the congruence \[de \equiv 1 \bmod \varphi(n)\] Formally, a congruence \[a \equiv b \bmod c\] holds for three integers $a$, $b$, and $c$, if there exists an integer $k$ such that $a - b = k c$.</p>

<p>The sender will encrypt a message $M$ (which, for simplicity, is assumed to be an integer smaller than both $p$ and $q$) by computing $M^e \bmod n$ and sending it to the receiver. The recipient will calculate $(M^e)^d \equiv M^{e d} \equiv M^{k \varphi(n) + 1} \equiv M^{\varphi(n) k} M \equiv M \bmod n$ since by Euler&#39;s theorem $M^{\varphi(n)} \equiv 1 \bmod n$. This will reconstruct the original message. Without the private key, no practical way has been found for a potential attacker to recover $M$ from the knowledge of $M^e \bmod n$ and $(n, e)$.</p>

<p>Your task is to crack RSA by finding the private key related to a specific public key.</p>

### 입력

<p>The first line of input has the number of test cases $T$, ($1 \le T \le 50$). Each test case has one line that contains the two numbers $n$ and $e$. You may assume that $n$ is the product of two primes $p, q$ such that $2 \le p,q &lt; 1000$. Also, $e$ will be chosen so that $d$ exists and is unique, and $1 &lt; d, e &lt; \varphi(n)$. Note that the product $d e$ may not fit into a 32-bit integer (e.g. Java&#39;s <code>int</code> type).</p>

### 출력

<p>For each test case, output the single number $d$.</p>