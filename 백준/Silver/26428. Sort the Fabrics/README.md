# [Silver V] Sort the Fabrics - 26428

[문제 링크](https://www.acmicpc.net/problem/26428)

### 성능 요약

시간 제한: 20 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 59, 맞힌 사람: 38, 정답 비율: 66.667%

### 분류

정렬

### 문제 설명

<p>A fabric is represented by three properties:</p>

<ul>
	<li>Color ($\mathbf{C}$), a string consisting of lowercase letters of the English alphabet, representing the color of the fabric.</li>
	<li>Durability ($\mathbf{D}$), an integer representing the durability of the fabric.</li>
	<li>Unique identifier ($\mathbf{U}$), an integer representing the ID of the fabric.</li>
</ul>

<p>Ada and Charles work at the Kick Start fabric factory. Each day they receive $\mathbf{N}$ fabrics, and one of them has to sort it. They sort it using the following criteria:</p>

<ul>
	<li>Ada sorts in lexicographically increasing order by color ($\mathbf{C}$).</li>
	<li>Charles sorts in ascending order by durability ($\mathbf{D}$).</li>
	<li>They break ties by sorting in ascending order by the unique identifier ($\mathbf{U}$).</li>
</ul>

<p>Given $\mathbf{N}$ fabrics, count the number of fabrics which end up in the same position regardless of whether Ada or Charles sort them.</p>

### 입력

<p>The first line of the input gives the number of test cases, $\mathbf{T}$. $\mathbf{T}$ test cases follow.</p>

<p>Each test case begins with one line consisting of an integer $\mathbf{N}$ denoting the number of fabrics. Then $\mathbf{N}$ lines follow, each line with a string $\mathbf{C_i}$, an integer $\mathbf{D_i}$, and an integer $\mathbf{U_i}$: the color, the durability and the unique identifier of the $i$-th fabric respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: y</code>, where $x$ is the test case number (starting from 1) and $y$ is the number of fabrics which end up in the same position regardless of whether a worker sorts them by color or by durability.</p>

### 제한

<ul>
	<li>$1 \le \mathbf{T} \le 100$.</li>
	<li>$1 \le$ length of string $\mathbf{C_i}$ $\le 10$.</li>
	<li>String $\mathbf{C_i}$ consists of only lowercase letters of the English alphabet.</li>
	<li>No two fabrics have same $\mathbf{U_i}$.</li>
</ul>