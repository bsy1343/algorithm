# [Platinum V] So you want to be a 2^n-aire? - 4286

[문제 링크](https://www.acmicpc.net/problem/4286)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 25, 맞힌 사람: 23, 정답 비율: 85.185%

### 분류

수학, 확률론, 미적분학

### 문제 설명

<p>The player starts with a prize of \$1, and is asked a sequence of <em>n</em> questions. For each question, he may</p>

<ul>
	<li>quit and keep his prize.</li>
	<li>answer the question. If wrong, he quits with nothing. If correct, the prize is doubled, and he continues with the next question.</li>
</ul>

<p>After the last question, he quits with his prize. The player wants to maximize his expected prize.</p>

<p>Once each question is asked, the player is able to assess the probability <em>p</em> that he will be able to answer it. For each question, we assume that <em>p</em> is a random variable uniformly distributed over the range <em>t .. 1</em>.</p>

### 입력

<p>Input is a number of lines, each with two numbers: an integer <em>1 &le; n &le; 30</em>, and a real <em>0 &le; t &le; 1</em>. Input is terminated by a line containing <code>0 0</code>. This line should not be processed.</p>

### 출력

<p>For each input <em>n</em> and <em>t</em>, print the player&#39;s expected prize, if he plays the best strategy. Output should be rounded to three fractional digits.</p>