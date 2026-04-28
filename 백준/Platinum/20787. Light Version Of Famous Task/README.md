# [Platinum II] Light Version Of Famous Task - 20787

[문제 링크](https://www.acmicpc.net/problem/20787)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 256 MB

### 통계

제출: 44, 정답: 14, 맞힌 사람: 11, 정답 비율: 28.947%

### 분류

수학, 브루트포스 알고리즘, 정수론, 이분 탐색, 소인수분해

### 문제 설명

<p>The ABC conjecture (also known as the Oesterl&eacute;--Masser conjecture) is a famous conjecture in number theory, first proposed by Joseph Oesterl&eacute; and David Masser. It is formally stated as follows:</p>

<blockquote>
<p>For every positive real number $\varepsilon$, there are only finitely many positive integer triples $(a, b, c)$ such that&nbsp;</p>

<ol>
	<li>$a$ and $b$ are relatively prime;</li>
	<li>$a + b = c$; and</li>
	<li>$c &gt; \text{rad}(abc)^{1+\varepsilon}$,&nbsp;</li>
</ol>

<p>where $$\text{rad}(n) = \prod_{\substack{p|n \\ p \in \text{Prime}}} p$$ is the product of all distinct prime divisors of $n$.&nbsp;</p>
</blockquote>

<p>Shinichi Mochizuki claimed to have proven this conjecture in August 2012. Later, Mochizuki&#39;s claimed proof was announced to be published in <em>Publications of the Research Institute for Mathematical Sciences</em> (RIMS), a journal of which Mochizuki is the chief editor.</p>

<p>Spike is a great fan of number theory and wanted to prove the ABC conjecture as well. However, due to his inability, he turned to work on a weaker version of the ABC conjecture, which is formally stated as follows:</p>

<blockquote>
<p>Given a positive integer $c$, determine if there exists positive integers $a,b$, such that $a+b=c$ and $\text{rad}(a b c)&lt;c$.</p>
</blockquote>

<p>Note that in the original ABC conjecture, the positive integers $a$ and $b$ are required to be relatively prime. However, as Spike is solving an easier version of the problem, this requirement is removed.</p>

### 입력

<p>The first line of input contains one integer $T$ $(1 \leq T \leq 10)$, the number of test cases.</p>

<p>The next lines contain description of the $t$ test cases. Each test case contains one line, including an integer $c$ $(1\leq c \leq 10^{18})$.</p>

### 출력

<p>For each test case, if there exist two positive integers $a,b$ satisfying $a+b=c$ and $\text{rad}(a b c)&lt;c$, then output <code>yes</code> in a line, otherwise output <code>no</code> instead.&nbsp;</p>

### 힌트

<p>For the first test case, we have $2+2=4$ and $\text{rad}(2\times 2\times 4)=2&lt;4$.</p>

<p>For the second test case, we have $6+12=18$ and $\text{rad}(6\times 12\times 18)=6&lt;18$.</p>

<p>For the third test case, there&#39;s no solution.</p>