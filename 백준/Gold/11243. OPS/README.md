# [Gold V] OPS - 11243

[문제 링크](https://www.acmicpc.net/problem/11243)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 72, 정답: 40, 맞힌 사람: 31, 정답 비율: 63.265%

### 분류

수학, 정수론, 소수 판정, 에라토스테네스의 체

### 문제 설명

<p>The Odd Prime Space (OPS) is a space that consists of specific kind of vector. Every<br />
element of vector in OPS is odd prime number. For example, \(\begin{pmatrix} &nbsp;3 \\ 5 &nbsp;\end{pmatrix}\), \(\begin{pmatrix} &nbsp;7 \\ 11 \\ 13 &nbsp;\end{pmatrix}\) are in OPS but, \(\begin{pmatrix} &nbsp;2 \\ 3 &nbsp;\end{pmatrix}\), \(\begin{pmatrix} &nbsp;4 \\ 5 \\ 6 &nbsp;\end{pmatrix}\) are not. In this problem, we are talking about three-dimensional OPS (3D-OPS).&nbsp;</p>

<p>\[\text{3D-OPS} = \{ \begin{pmatrix} &nbsp;p_1 \\ p_2 \\ p_3 \end{pmatrix}; p_1, p_2, p_3 \text{ are odd prime number}\}\]</p>

<p>Mac Picc, the computer scientist, is currently working on project that involve in 3DOPS. He discovers that, he can map 3D-OPS to simple one-dimensional space call Odd Space (OS) and then dealing with OS is much easier than 3D-OPS.</p>

<p>\[\text{OS} = \{ x; x \text{ is odd number that greater than } 7\}\]</p>

<p>The mapping function is very simple. Combining three odd prime numbers together and get odd number that greater than 7. However, the hard part of this idea is that, how to reverse from OS to 3D-OPS. Does every member in OS can map into 3D-OPS? As we known so far it can!!! This mysterious called Goldbach&rsquo;s conjecture, a conundrum problem since 18th century that no one can prove or disprove.</p>

<p>Another problem is that, mapping from OS to 3D-OPS could be more than one solution. For instance, 15 = 5 + 5 + 5, 3 + 5 + 7 and 17 = 3 + 3 + 11, 5 + 5 + 7. However, Mr.Mac is not a heartless guy that force you to print every solution, he only want a solution that maximize infinity norm (explanation is in next section) and print it&rsquo;s value.</p>

<p>In linear algebra, norm is a function that assigns strictly positive length or size to vector. These are some norm that you might already know. (for this problem, n=3)</p>

<p>\[\text{Manhattan norm; } \left\| x \right\| _1 = \sum_{i=1}^{n}{|x_i|} \\ \text{Euclidean norm; } \left\| x \right\| _2 = \sqrt{{x_1}^2 + {x_2}^2 + \cdots + {x_n}^2} \\ p \text{-norm; } \left\| x \right\| _p = \left(\sum_{i=1}^{n}{{|x_i|}^p} \right) ^ {1/p}\]</p>

<p>The infinity norm is a special case of p-norm, which is &infin;-norm. To compute the value of infinity norm you have to use limit, a basic of calculus.</p>

<p>\[\infty \text{-norm; } = \lim _{ p &nbsp;\to \infty } {\left(\sum_{i=1}^{n}{{|x_i|}^p} \right) ^ {1/p} }\]</p>

### 입력

<p>The first line contains a single integer T indicate number of test cases (1 &le; T &le; 5 000) Each of next T lines contains one odd integer M (7 &lt; M &lt; 1 000 000)</p>

### 출력

<p>For each test case, print one line contains value of maximum infinity norm of vector \( \begin{pmatrix} &nbsp;p_1 \\ p_2 \\ p_3 \end{pmatrix}\) where &nbsp;\(p_1+p_2+p_3=m\)</p>