# [Gold IV] Ekspert - 26398

[문제 링크](https://www.acmicpc.net/problem/26398)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 21, 정답: 12, 맞힌 사람: 11, 정답 비율: 55.000%

### 분류

분할 정복을 이용한 거듭제곱, 수학

### 문제 설명

<p>The group stage of the World Cup has ended, the teams are ready for the knockout stage, and many experts are trying to figure out the next world champion. One of them is Boris, the man who correctly determined the last four world champions.</p>

<p>Lower the chances of this team because they have a player of Barcelona, raise the chances of that team beacuse they have the captain of Real Madrid... - Boris is calucating - Now I only need to multiply the integers x and y , and the I can announce the next world champion.</p>

<p>The audience suddenly got very quiet. They are impatienly waiting to know if Croatia is going to win.</p>

<p>Boris will multiply x and y using his famous method of four registers.</p>

<p>He has four register: <code>A</code>, <code>B</code>, <code>C</code> and <code>D</code>. Initially they have the values: x, y, 0 and 1, respectively. The only operation he is allowed to do is summing up two registers (possibly the same) and storing the result in one of the registers. Each of the registers can have the value of at most 2 &middot; 10<sup>18</sup>.</p>

<p>He doesn&rsquo;t want the audience to wait too long, so he can make at most 100 of such operations.</p>

<p>Help him determine the operations he needs to do, and in which of the registers will the final result be stored.</p>

### 입력

<p>The first and only line contains positive integers x and y (1 &le; x &middot; y &le; 10<sup>18</sup>), the numbers Boris needs to multiply.</p>

### 출력

<p>In the first line output the integer n (0 &le; n &le; 100), the number of operations Boris needs to do.</p>

<p>In the i-th of the following n lines output the operation in the format <code>R1</code> <code>R2</code> <code>R3</code>, where <code>R</code><sub>j</sub> is the label of the register (<code>A</code>, <code>B</code>, <code>C</code> or <code>D</code>), and the operation means the sum of <code>R1</code> and <code>R2</code> will be stored in <code>R3</code>.</p>

<p>If there are multiple correct solutions, output any of them. The solution doesn&rsquo;t need to have the minimal number of operations.</p>

### 힌트

<p>Clarification of the first example:</p>

<p>The values of the registers (<code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>) after the i-th operation are:</p>

<ul>
	<li>0: (1, 2, 0, 1) - initial state</li>
	<li>1: (2, 2, 0, 1) - after the operation <code>A</code> <code>A</code> <code>A</code></li>
</ul>

<p>The product of 1 and 2 is in the register with label <code>A</code>.</p>

<p>Clarification of the second example:</p>

<p>The values of the registers (<code>A</code>, <code>B</code>, <code>C</code>, <code>D</code>) after the i-th operation are:</p>

<ul>
	<li>0: (3, 2, 0, 1) - initial state</li>
	<li>1: (3, 2, 1, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
	<li>2: (3, 2, 2, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
	<li>3: (3, 2, 3, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
	<li>4: (3, 2, 4, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
	<li>5: (3, 2, 5, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
	<li>6: (3, 2, 6, 1) - after the operation <code>D</code> <code>C</code> <code>C</code></li>
</ul>

<p>The product of 2 and 3 is in the register with label <code>C</code>.</p>