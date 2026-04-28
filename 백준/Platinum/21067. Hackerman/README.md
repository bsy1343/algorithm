# [Platinum I] Hackerman - 21067

[문제 링크](https://www.acmicpc.net/problem/21067)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 64, 정답: 9, 맞힌 사람: 9, 정답 비율: 42.857%

### 분류

임의 정밀도 / 큰 수 연산, 많은 조건 분기, 중국인의 나머지 정리, 수학, 정수론, 런타임 전의 전처리

### 문제 설명

<p>You, Mr. Hackerman, have gained access to the servers of a secure messaging app. They use a new ciphering method based on the difficulty of factoring the numbers that are products of three big primes.</p>

<p>You are reading the source code and found out how they actually generate these numbers. They define three recurrences:</p>

<ul>
	<li>$x_n = (11 \cdot x_{n-1} + 7) \bmod 611\,953 \quad \forall n &gt; 0$</li>
	<li>$y_n = (13 \cdot y_{n-1} + 5) \bmod 746\,773 \quad \forall n &gt; 0$</li>
	<li>$z_n = (53 \cdot z_{n-1} + 3) \bmod 882\,389 \quad \forall n &gt; 0$</li>
</ul>

<p>The seeds $x_0, y_0, z_0$ seem to be stored in a secure file.</p>

<p>Now they get the three primes $p_k, q_k, r_k$ for the $k$-th user:</p>

<ul>
	<li>$p_k$ is $x_k$-th number in a secure file <code>X.axx</code> (all its numbers are different primes with exactly $31$ decimal digits).</li>
	<li>$q_k$ is $y_k$-th number in a secure file <code>Y.axx</code> (all its numbers are different primes with exactly $32$ decimal digits).</li>
	<li>$r_k$ is $z_k$-th number in a secure file <code>Z.axx</code> (all its numbers are different primes with exactly $33$ decimal digits).</li>
</ul>

<p>Then, they compute the public key $n_k = p_k \cdot q_k \cdot r_k$.</p>

<p>You have temporary access to the public key database, and you can query up to 5 public keys for any user.</p>

<p>You are given two integers $u$ and $v$. You have to intercept communications between the $u$-th user and the $v$-th user. For this task, you will need to compute $p_u, q_u, r_u, p_v, q_v, r_v$; having these values will allow you to completely manipulate communication.</p>

<p>For the sake of input/output simplicity, we ask you to output $p_u + q_u + r_u + p_v + q_v + r_v$ as your answer.</p>

### 입력



### 출력



### 힌트

<p>Solution to the example ($u = 10$ and $v = 20$):</p>

<p>$p_{10} = 6745719728113484794920696767881$</p>

<p>$q_{10} = 54398126832702965410665141463513$</p>

<p>$r_{10} = 523986762172023700466774225430947$</p>

<p>$p_{20} = 6899037085323900149383957179569$</p>

<p>$q_{20} = 76607972465670150189802211467309$</p>

<p>$r_{20} = 520033106839239897778822214813477$</p>

<p>$p_{10} + q_{10} + r_{10} + p_{20} + q_{20} + r_{20} = 1188670725123074098790368447122696$</p>