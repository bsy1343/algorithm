# [Silver I] Qizz Quzz (Easy) - 27638

[문제 링크](https://www.acmicpc.net/problem/27638)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 63, 정답: 21, 맞힌 사람: 20, 정답 비율: 40.000%

### 분류

구현, 문자열

### 문제 설명

<p>After a successful presentation of your coding skills on the <a href="https://en.wikipedia.org/wiki/Fizz_buzz">Fizz Buzz problem</a> you have advanced to the second round of interviews for your dream job of code ninja at FizzBuzz Corp. In this interview you will tackle the Generalized Fizz Buzz problem.</p>

<p>Generalized Fizz Buzz is similar to the original Fizz Buzz. The program must print positive integers starting from 1, but some special numbers (and their multiples) should be replaced by strings. If something is divisible by multiple special numbers, it must be replaced by a concatenation of all their strings.</p>

<p>In this problem, your task <strong>isn&rsquo;t</strong> to implement Generalized Fizz Buzz. Instead, you will be given a sequence and you need to decide whether it can be the output of a Generalized Fizz Buzz program.</p>

<p>A particular instance of Generalized Fizz Buzz is defined by the following parameters:</p>

<ul>
	<li>A positive integer <em>n</em>.</li>
	<li>A nonnegative integer <em>k</em>.</li>
	<li>Distinct positive integers <em>d</em><sub>1</sub>, &hellip;, <em>d</em><sub><em>k</em></sub> such that <em>d</em><sub>1</sub> &lt; <em>d</em><sub>2</sub> &lt; ⋯ &lt; <em>d</em><sub><em>k</em></sub>.</li>
	<li>Strings <em>s</em><sub>1</sub>, &hellip;, <em>s</em><sub><em>k</em></sub> of lowercase English letters.</li>
</ul>

<p>Their meaning is as follows:</p>

<ul>
	<li>The number <em>n</em> is the length of the sequence the program should output.</li>
	<li>The number <em>k</em> is the number of replacement rules.</li>
	<li>Each of the replacement rules has the form &ldquo;Instead of multiples of <em>d</em><sub><em>i</em></sub> print the string <em>s</em><sub><em>i</em></sub>.&rdquo;</li>
	<li>If multiple replacement rules apply, the label that should be printed is obtained by concatenating all the corresponding <em>s</em><sub><em>i</em></sub>, ordered <strong>from the smallest to the largest divisor</strong>.</li>
</ul>

<p>For example, the original Fizz Buzz corresponds to <em>k</em> = 2, <em>d</em> = (3, 5), and s = (<code>fizz</code>, <code>buzz</code>). The correct output of that program for <em>n</em> = 17 would be:</p>

<pre>
<code>1 2 fizz 4 buzz fizz 7 8 fizz buzz 11 fizz 13 14 fizzbuzz 16 17</code></pre>

<p>Note that instead of 15 we printed the concatenation of <em>s</em><sub>1</sub> (<code>fizz</code>) and <em>s</em><sub>2</sub> (<code>buzz</code>) because 15 is divisible both by <em>d</em><sub>1</sub> (3) and by <em>d</em><sub>2</sub> (5). Also note that you cannot print <code>buzzfizz</code> for 15 because you cannot change the order of the <em>s</em><sub><em>i</em></sub> when concatenating them.</p>

<p>Samko has written his own implementation of a Generalized Fizz Buzz program. However, Samko&rsquo;s implementation has some additional constraints: It can only handle inputs where <em>k</em> &le; 2 and each of the strings <em>s</em><sub><em>i</em></sub> has length exactly 4.</p>

<p>Samko has shown you a sequence of labels ℓ<sub>1</sub>, &hellip;, ℓ<sub><em>n</em></sub>. Find the largest <em>q</em> such that the prefix ℓ<sub>1</sub>, &hellip;, ℓ<sub><em>q</em></sub> can be the output of Samko&rsquo;s program.</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of two lines. The first line contains a positive integer <em>n</em> &le; 1000: the number of labels in the sequence you were given. The second line contains the sequence: <em>n</em> non-empty tokens ℓ<sub>1</sub>, &hellip;, ℓ<sub><em>n</em></sub> separated by single spaces. Each token will only contain digits and lowercase English letters.</p>

### 출력

<p>For each test case output one line with the corresponding integer <em>q</em>.</p>

### 힌트

<ul>
	<li>In the first example, the first six tokens are the output of a Generalized Fizz Buzz program for <em>k</em> = 1, <em>d</em><sub>1</sub> = 1, and s<sub>1</sub> = <code>mlem</code>. Both Samko&rsquo;s and Monika&rsquo;s program can handle this input, so for each of them the answer is 6.</li>
	<li>In the second example, it&rsquo;s clear that 2 must be replaced with <code>qizz</code> and 3 with <code>quzz</code>. The first five tokens match that sequence, but the next one should be <code>qizzquzz</code> instead of <code>quzzqizz</code>, and the last one should be <code>7</code> instead of <code>007</code>.</li>
	<li>In the third example, <code>hunter2</code> is wrong because it contains both letters and numbers.</li>
	<li>In the fourth example, <em>d</em> = (1, 2) and s = (<code>haha</code>, <code>haha</code>). Note that the strings <em>s</em><sub><em>i</em></sub> do not have to be distinct.</li>
	<li>In the fifth example, <code>bat</code> is already wrong because Samko&rsquo;s program cannot handle a three-character string.</li>
</ul>