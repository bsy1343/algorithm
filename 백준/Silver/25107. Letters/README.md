# [Silver III] Letters - 25107

[문제 링크](https://www.acmicpc.net/problem/25107)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 256 MB

### 통계

제출: 71, 정답: 55, 맞힌 사람: 50, 정답 비율: 79.365%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Martin is attending a lecture on linear algebra. It is needless to say that the professor who is giving the lecture is the most boring person in the entire universe. There is a $N &times; M$ matrix written on the blackboard. Some of the entries in the matrix are letters (of the English alphabet) while some other entries are blank. Here is an example of such a matrix of size $6 &times; 8$:</p>

<p>$$\begin{bmatrix} k &amp; &amp; l &amp; &amp; n &amp; d &amp; i &amp; \\ &amp; &amp; &amp; &amp; &amp; c &amp; &amp; \\ &amp; &amp; &amp; &amp; &amp; &amp; i &amp; h \\ j &amp; &amp; &amp; a &amp; &amp; &amp; &amp; \\ &amp; &amp; c &amp; b &amp; &amp; &amp; &amp; \\ &amp; &amp; c &amp; &amp; &amp; &amp; e &amp; f \end{bmatrix} \text{.}$$</p>

<p>Martin has absolutely no idea what this matrix represents. He is so bored that he has not been following the lecture anymore for the last $30$ minutes. However, Martin has an extremely vivid imagination. He is imagining that the matrix is suddenly influenced by gravity and all the letters in it are sliding downwards until each letter either &lsquo;reaches the bottom&rsquo; or &lsquo;hits the letter that is below it&rsquo;. In the first phase, the above matrix becomes:</p>

<p>$$\begin{bmatrix} &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ &amp; &amp; l&amp; &amp; &amp; &amp;i &amp; \\ k &amp; &amp; c&amp; a&amp; &amp; d&amp; i&amp; h\\ j &amp; &amp; c &amp; b &amp; n &amp; c &amp; e &amp; f \end{bmatrix} \text{.}$$</p>

<p>After that, gravity changes direction and is now pulling the letters to the left. We are now in the second phase. Again, all the letters are sliding to the left until each letter either &lsquo;reaches the left bracket&rsquo; or &lsquo;hits the letter on its left&rsquo;. The previous matrix thus becomes:</p>

<p>$$\begin{bmatrix} &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ &amp; &amp; &amp; &amp; &amp; &amp; &amp; \\ l&amp; i&amp; &amp; &amp; &amp; &amp; &amp; \\ k &amp; c&amp; a&amp; d&amp; i&amp; h&amp; &amp; \\ j &amp; c &amp; b &amp; n &amp; c &amp; e &amp; f &amp; \end{bmatrix} \text{.}$$</p>

<p>Martin is carrying out this procedure in his head until the very end of the boring lecture. Of course, after each phase, i.e. after all the letters land at their respective destinations, gravity may change its direction (there are four possibilities for the direction: left, right, up and down).</p>

<p>Write a program that determines the final positions of all letters in the matrix given the precise sequence of the gravity direction changes.</p>

### 입력

<p>The first line contains three integers $N$, $M$ and $K$ where $N &times; M$ is the size of the matrix and $K$ is the number of phases.</p>

<p>The second line contains a string of length $K$ that consists of letters <code>L</code>, <code>R</code>, <code>U</code> and <code>D</code> that represent the direction of gravity in each phase (left, right, up and down, respectively).</p>

<p>The final $N$ lines represent the matrix. Each of the lines contains $M$ characters. The characters are lowercase letters of the English alphabet and &lsquo;<code>.</code>&rsquo; (dot) which represents a blank entry.</p>

### 출력

<p>Output the matrix which Martin obtained at the end of the lecture. The format of the matrix is identic to the one in the input data.</p>

### 제한

<ul>
	<li>$1 &le; N, M &le; 100$</li>
	<li>$0 &le; K &le; 100$</li>
</ul>