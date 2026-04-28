# [Bronze II] Mod Inverse - 6930

[문제 링크](https://www.acmicpc.net/problem/6930)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 284, 정답: 221, 맞힌 사람: 190, 정답 비율: 76.923%

### 분류

수학, 브루트포스 알고리즘, 정수론, 모듈로 곱셈 역원

### 문제 설명

<p>In many cryptographic applications, the Modular Inverse is a key point. This question involves finding the modular inverse of a number.</p>

<p>Given $0 &lt; x &lt; m$, where $x$ and $m$ are integers, the modular inverse of $x$ is the unique integer $n$, $0 &lt; n &lt; m$, such that the remainder upon dividing $x \times n$ by $m$ is $1$.</p>

<p>For example, $4 \times 13 = 52 = 17 \times 3 + 1$, so the remainder when $52$ is divided by $17$ is $1$, and thus $13$ is the inverse of $4$ modulo $17$.</p>

<p>You are to write a program which accepts as input the two integers $x$ and $m$, and outputs either the modular inverse $n$, or the statement <code>No such integer exists.</code> if there is no such integer $n$.</p>

### 입력



### 출력



### 제한

<ul>
	<li>$m \le 100$</li>
</ul>