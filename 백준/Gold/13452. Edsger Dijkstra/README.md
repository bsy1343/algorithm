# [Gold II] Edsger Dijkstra - 13452

[문제 링크](https://www.acmicpc.net/problem/13452)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 44, 정답: 12, 맞힌 사람: 9, 정답 비율: 24.324%

### 분류

자료 구조, 문자열, 애드 혹, 파싱, 스택

### 문제 설명

<p>The Turing award winner Edsger Wybe Dijkstra is a dutch computer scientist who has an annoyingly confusing name that Asians have trouble pronouncing. In 1960s, He gave the following quote.</p>

<p>For a number of years I have been familiar with the observation that the quality of programmers is a decreasing function of the density of go to statements in the programs they produce. More recently I discovered why the use of the go to statement has such disastrous effects, and I became convinced that the go to statement should be abolished from all &ldquo;higher level&rdquo; programming languages. </p>

<p>You don&rsquo;t want to produce low quality codes, do you? However, your source code contains no loop statements. The only kind of flow control statements in your source code is the if-goto. To decrease the density, you have to try and eliminate all the if-goto statements in your source code written in a C-like language and replace them with do-while loops in the following manner.</p>

<ul>
	<li>Assume the if-goto statement looks like &ldquo;if (boolean_expression) goto some_label;&rdquo;.</li>
	<li>Insert a copy of &ldquo;do {&rdquo; right after where some_label is declared.</li>
	<li>Replace &lsquo;if&rsquo; by &lsquo;} while&rsquo;.</li>
	<li>Remove &lsquo;goto some_label&rsquo;.</li>
</ul>

<p>For example, the following code</p>

<pre>
<code>int main() {
    int score;
    get_score:
    scanf(&quot;%d&quot;,&amp;score);
    if (score &lt; 0 || score &gt; 100) goto get_score;
    if (score &lt; 60) goto fail;
    fail:
    puts(&quot;you are failed!&quot;);
    return 0;
}</code></pre>

<p>will be modified into</p>

<pre>
<code>int main() {
int score;
    get_score: do {
    scanf(&quot;%d&quot;,&amp;score);
    } while (score &lt; 0 || score &gt; 100) ;
    } while (score &lt; 60) ;
    fail: do {
    puts(&quot;you are failed!&quot;);
    return 0;
}</code></pre>

<p>It is not too surprising that the code above cannot be compiled. Here is your new task: given a sequences of statements, please determine whether all if-goto statements can be replaced by do-while loops without changing the output of your code. For simplicity, you may assume all statements are either in the following two forms.</p>

<ul>
	<li>Form 1: &ldquo;line_x: puts(&quot;x&quot;);&rdquo; where x is corresponding line number of this statement and &ldquo;puts(&quot;x&quot;);&rdquo; prints the line number x.</li>
	<li>Form 2: &ldquo;if (expr_x()) goto line_y;&rdquo; where x is the corresponding line number of this statement and line_y is a valid label in the program. &ldquo;expr_x()&rdquo; will return true on first x invocations, and it will return false afterward.</li>
</ul>

<p>Note that the output of the program should be considered as different from the original output if the modification makes the code unable to be compiled.</p>

### 입력

<p>In the first line of input, there will be a single integer T (T &le; 20) on a line representing the number of test cases.</p>

<p>Each test case is consists of a sequence of statements. Each statements will be on a single line, which starts on line 1. There can be three kinds of lines: statements in form 1, statements in form 2, and &ldquo;END&rdquo;. &ldquo;END&rdquo; will indicate the end of a test case. It can only be the last line of a test case, and it should not be considered as a part of the program. There are at most 10000 statements in a single test case (END&rsquo;s are excluded).</p>

### 출력

<p>Print &ldquo;good&rdquo; on a single line if replacing all if-goto statements with do-while will not change the output of the program. Otherwise print &ldquo;bad&rdquo;. Note: you should output &ldquo;bad&rdquo; if the program becomes no longer compilable.</p>