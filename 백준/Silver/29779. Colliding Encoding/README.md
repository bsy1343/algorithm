# [Silver IV] Colliding Encoding - 29779

[문제 링크](https://www.acmicpc.net/problem/29779)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 131, 정답: 86, 맞힌 사람: 45, 정답 비율: 58.442%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Alan just had his first cryptography class in school today. He decided to apply what he learned and come up with his own cipher. He will map each English letter from <code>A</code> to <code>Z</code> to a decimal digit $0$ through $9$. He will then try to encode each word to a string consisting of decimal digits by replacing each letter in the word with its mapped digit.</p>

<p>In his excitement, Alan failed to notice that there are $26$ letters in the English alphabet and only $10$ decimal digits. As a result, there might be collisions, that is, pairs of different words whose encoding is the same.</p>

<p>Given a list of $\mathbf{N}$ words that Alan wants to encode and the mapping that he uses, can you find out if there would be any collisions between words on the list?</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>The first line of each test case contains $26$ decimal digits (integers between $0$ and $9$, inclusve) $\mathbf{D_A}, \mathbf{D_B}, \dots, \mathbf{D_Z}$, representing the mapping that Alan uses. A letter $\alpha$ is mapped to digit $\mathbf{D_\alpha}$.</p>

<p>The second line of each test case contains $\mathbf{N}$, the number of words Alan will encode.</p>

<p>The $i$-th of the last $\mathbf{N}$ lines contains a string $\mathbf{S_i}$, representing the $i$-th word Alan will encode.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is either <code>YES</code>, if there is at least one pair of different words from the list whose encoding coincides, and <code>NO</code> otherwise.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$0 \le \mathbf{D_\alpha} \le 9$, for all $\alpha$.</li>
	<li>$1 \le $ the length of $ \mathbf{S_i} \le 10$, for all $i$.</li>
	<li>Each character of $\mathbf{S_i}$ is an uppercase English letter <code>A</code> through <code>Z</code>, for all $i$.</li>
	<li>$\mathbf{S_i} \ne \mathbf{S_j}$, for all $i \ne j$.</li>
</ul>

### 힌트

<p>In Sample Case #1, the mapping for <code>A</code> is $0$, for <code>B</code> is $1$, for <code>C</code> is $2$, for <code>D</code> is $3$, and for <code>E</code> is $3$. With this mapping, <code>ABC</code> is encoded as $012$, <code>BC</code> is encoded as $12$, <code>BCD</code> as $123$, and <code>CDE</code> as $233$. Since all of these encodings are distinct, there are no collisions.</p>

<p>In Sample Case #2, the mapping for <code>C</code> is $2$, for <code>D</code> is $3$, for <code>E</code> is $3$, for <code>F</code> is $3$, and for <code>G</code> is $3$. With this mapping, <code>CDE</code> is encoded as $233$, <code>DEF</code> as $333$, and <code>EFG</code> as $333$. Since the encoding for <code>DEF</code> and <code>EFG</code> is the same, there is a collision.</p>