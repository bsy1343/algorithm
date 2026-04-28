# [Platinum V] Extreme Problem - 24642

[문제 링크](https://www.acmicpc.net/problem/24642)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 17, 정답: 10, 맞힌 사람: 9, 정답 비율: 90.000%

### 분류

해 구성하기

### 문제 설명

<p>Many problems given in programming competitions are extreme in this or that regard. Examples include:</p>

<ul>
	<li>a problem that is solved by doing lots of heavy math on paper and then by printing one well-known number, rounded to the number of digits given in the input file;</li>
	<li>a problem that spans more than four pages and requires you to write a simulation system that tracks multiple skills of several secret agents and chooses the best combination of them for each mission;</li>
	<li>a problem for which it is a proven fact that no correct solution will ever exist, but it was still given in a contest.</li>
</ul>

<p>This time you are given a problem that is also extreme, in that it has only eight possible tests. And, of course, it will be about something extreme.</p>

<p>We consider functions of two integer variables, defined on the $[-10;10] \times [-10;10]$ square. It means that you can perform a call to $f(x,y)$ only if $x$ and $y$ are integers and $-10 \le x, y \le 10$. Such a function $f$ is said to have a <em>local minimum</em> at $(x,y)$ if the following statements hold simultaneously:</p>

<ul>
	<li>$f(x,y) &lt; f(x-1,y)$;</li>
	<li>$f(x,y) &lt; f(x+1,y)$;</li>
	<li>$f(x,y) &lt; f(x,y-1)$;</li>
	<li>$f(x,y) &lt; f(x,y+1)$.</li>
</ul>

<p>A <em>local maximum</em> is defined in a similar way, only the inequalities are reversed. A function $f$ is said to have a <em>plateau</em> at $(x,y)$ if at least one of the following statements holds:</p>

<ul>
	<li>$f(x,y) = f(x-1,y)$;</li>
	<li>$f(x,y) = f(x+1,y)$;</li>
	<li>$f(x,y) = f(x,y-1)$;</li>
	<li>$f(x,y) = f(x,y+1)$.</li>
</ul>

<p>Note that all the function invocations above must happen on the points from the function domain, that is, the $[-10;10] \times [-10;10]$ square. In particular, this means that a point on the boundary of this square <strong>cannot be</strong> a local maximum or a local minimum, but can still be a plateau.</p>

<p>You need to find a function which has --- or does not have, depending on the information in the input:</p>

<ul>
	<li>multiple local maxima;</li>
	<li>multiple local minima;</li>
	<li>some plateaus.</li>
</ul>

<p>Note that &quot;multiple&quot; means &quot;at least two&quot;. Also note that your function shall be defined in a specific way; see the Output section for details.</p>

### 입력

<p>The input consists of three lines.</p>

<ul>
	<li>The first line starts with &quot;<code>Multiple local maxima: </code>&quot; and ends with either &quot;<code>Yes</code>&quot; or &quot;<code>No</code>&quot;. This specifies whether your function shall or shall not have multiple local maxima.</li>
	<li>The second line starts with &quot;<code>Multiple local minima: </code>&quot; and ends with either &quot;<code>Yes</code>&quot; or &quot;<code>No</code>&quot;, and similarly deals with local minima.</li>
	<li>The third line starts with &quot;<code>Plateaus: </code>&quot; and also ends with either &quot;<code>Yes</code>&quot; or &quot;<code>No</code>&quot;. This specifies whether your function shall or shall not have plateaus.</li>
</ul>

### 출력

<p>The output shall consist of one line that defines your function.</p>

<p>If no such function can be represented as per the format below, print &quot;<code>No solution</code>&quot;.</p>

<p>Otherwise, print your function using the reverse Polish notation. Recall that the reverse Polish notation is a way to describe a function using some sort of a stack machine: it is a sequence of operations, some of which push values onto the stack, while some pull a few values from the top of the stack, perform some math and push the result back to the stack.</p>

<p>Your function shall contain at most 1000 tokens, separated by single spaces, where each token is one of the following.</p>

<ul>
	<li>An integer constant ranging from <code>-9</code> to <code>+9</code>. This will push the corresponding number onto the stack.</li>
	<li>A variable, either <code>x</code> or <code>y</code>. This will push the value of that variable onto the stack.</li>
	<li>An operation, which can be <code>+</code>, <code>-</code>, <code>*</code>, or <code>^</code>. The asterisk means multiplication, whereas the <code>^</code> character means raising to the power. Each of these operations will take two numbers from the stack, apply the operation and push the result back to the stack. The evaluation order is such that &quot;<code>9 5 -</code>&quot; evaluates to 4, and similarly &quot;<code>x 2 ^</code>&quot; evaluates to $x^2$. As a special case, $0^0$ evaluates to $1$.</li>
</ul>

<p>Note that whenever one of the following things happens:</p>

<ul>
	<li>an operation attempts to take a number from an empty stack;</li>
	<li>the <code>^</code>&nbsp;operation attempts to raise something to a negative power;</li>
	<li>the result of an operation overflows the 32-bit signed integer;</li>
	<li>or at the end of the evaluation the size of the stack is not equal to one ---</li>
</ul>

<p>you receive a Wrong Answer outcome for the test where it happened.</p>

### 힌트

<p>The example answer to the first test encodes the function $(x-3)^4 + (y + (-5))^2$. Note that it has no local maxima, no plateaus, and just one local minimum.</p>