# [Platinum I] Stephen Cook - 13451

[문제 링크](https://www.acmicpc.net/problem/13451)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 15, 정답: 4, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

다이나믹 프로그래밍, 문자열, 비트마스킹, 파싱, 게임 이론, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Stephen Arthur Cook is a computer scientist and a mathematician who specializes in hard stuffs such as complexity theory. He gave a precise statement of the P versus NP problem in his paper &ldquo;The complexity of theorem-proving procedures&rdquo;, and one of his most famous contribution is proving that Boolean satisfiability problem, a.k.a. SAT, is NP-hard.</p>

<p>Cook won the Turing Award in 1982. Yes, that Turing. If you don&rsquo;t know what I am talking about, go back to problem A. Because you are a nerd also named Cook, so you challenge your equally nerdy friend Levin to play a nerdy game inspired by Stephen Cook together. Here is how it works, you are going to prepare a boolean formula (actually we will prepare it for you). And then, you and Levin will take turns in deciding the value of one variable (true or false). Once the value of every variable is decided, if the formula is satisfied, you win! Otherwise, Levin will win. So, are you nerdy enough to tell me if you can win this game if you pick first? Assuming that Levin plays optimally of course.</p>

### 입력

<p>The first line of the input will be a single integer T (T &le; 20) indicating the number of test cases. Each test case will consist of two lines.</p>

<p>The first line contains an integer n (1 &le; n &le; 10) indicating the number of variables in the boolean formula. The i-th variable will be represented by the i-th English alphabet in upper cases. That is, the first variable is <code>A</code>, and the third variable is <code>C</code>.</p>

<p>For each test case, one boolean formula will be given in its second line which has length no more than 256 characters. A boolean formula must be in one of the following five forms.</p>

<ul>
	<li><code>var</code>: <code>var</code> is a variable.</li>
	<li><code>( formula1 )</code>: <code>formula1</code> is a boolean formula.</li>
	<li><code>not formula1</code>: <code>formula1</code> is a boolean formula.</li>
	<li><code>formula1 or formula2</code>: both of <code>formula1</code> and <code>formula2</code> are boolean formulas.</li>
	<li><code>formula1 and formula2</code>: both of <code>formula1</code> and <code>formula2</code> are boolean formulas.</li>
</ul>

<p>You may assume that there are blanks to separate the variables and operators in the input file.</p>

<p>There are four kinds of boolean operators: <code>and</code>, <code>or</code>, <code>not</code>, and brackets <code>()</code>. Note that the first three kinds of operator are in lower cases. The operator precedence given from high to low as follows: <code>()</code> &gt; <code>not</code> &gt; <code>and</code> &gt; <code>or</code>.</p>

### 출력

<p>Output the winner&rsquo;s name (&ldquo;Cook&rdquo; or &ldquo;Levin&rdquo;).</p>