# [Silver IV] Encryptastrophy - 33251

[문제 링크](https://www.acmicpc.net/problem/33251)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 34, 정답: 31, 맞힌 사람: 24, 정답 비율: 100.000%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Alice and Bob are deeply in love, they sometimes like to swap out messages in class because they can't get enough of each other. In order to make sure no-one but them reads these messages, they get together and devise an encryption scheme that is theirs only: Despite what people are saying, security through obscurity <em>does</em> work, right?</p>

<p>To keep things simple, They first map every letter of the alphabet a-z to the numbers 0 to 25.</p>

<p>To encrypt and decrypt, a modular addition cipher is used, which defines the encryption function $E$ and decryption function $D$ as such:</p>

<p>$$ E(k, p) = p + k \mod 26 $$ $$ D(k, c) = c - k \mod 26 $$</p>

<p>$$ c_i = E(k_i, p_i) $$ $$ p_i = D(k_i, c_i) $$</p>

<p>Where $p$ is the plaintext, $c$ is the ciphertext and $k$ is the key.</p>

<p>In order to avoid having to send long keys, they define the key as follows:</p>

<p>$$k_i = p_{i-1} $$</p>

<p>With $k_0$ being predetermined by Bob and Alice.</p>

<p>They feel this is secure and chat away all day long, without a worry in the world.</p>

<p>Eve however, has devised a plan. While spying on them, she's always picked up the last letter of every message that they've sent. She's now bent on figuring out what these messages say.</p>

### 입력

<ul>
	<li>One line with one integer: $1 \leq n \leq 10^3$, the length of the ciphertext string</li>
	<li>One line with the ciphertext string</li>
	<li>One line with the last letter of the plaintext string</li>
</ul>

### 출력

<p>The plaintext string</p>