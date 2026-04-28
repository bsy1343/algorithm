# [Gold II] Moon Mooing - 6100

[문제 링크](https://www.acmicpc.net/problem/6100)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 50, 정답: 16, 맞힌 사람: 13, 정답 비율: 43.333%

### 분류

자료 구조, 우선순위 큐, 두 포인터

### 문제 설명

<p>A full moon casts some sort of spell on the cows and, like their cousins the wolves and coyotes, they bay at the moon -- mooing instead of howling, of course.</p>

<p>Each &#39;moo&#39; lasts a certain amount of time. A short &#39;moo&#39; might last time 1; a longer one might last time 24 or even 1,000,000,000 or longer (cows can really moo when they want to). No &#39;moo&#39; will last more than or equal to 2^63.</p>

<p>It should come as no surprise that the cows have a pattern to their moos. &nbsp;Bessie will choose an integer c (1 &lt;= c &lt;= 100) that is the initial length of a moo.</p>

<p>After Bessie moos for length c, the cows calculate times for subsequent moos. They apply two formulae to each moo time to yield even more moo times. The two formulae are:</p>

<pre>
        f1(c)=a1*c/d1+b1 (integer divide, of course) and
        f2(c)=a2*c/d2+b2.</pre>

<p>They then successively use the two new times created by evaluating f1(c) and f2(c) to create even more mooing times. They keep a sorted list of all the possible mooing times (discarding duplicates).</p>

<p>They are allowed to moo a total of N times (1 &lt;= N &lt;= 4,000,000). Please determine the length of the longest moo before they must quit.</p>

<p>The constants in the formulae have these constraints: 1 &lt;= d1 &lt; a1; d1 &lt; a1 &lt;= 20; 0 &lt;= b1 &lt;= 20; 1 &lt;= d2 &lt; a2; d2 &lt; a2 &lt;= 20; 0 &lt;= b2 &lt;= 20.</p>

<p>Consider an example where c=3 and N=10. The constants are:</p>

<pre>
    a1=4    b1=3     d1=3
    a2=17   b2=8     d2=2</pre>

<p>The first mooing time is 3, given by the value of c. The total list of mooing times is:</p>

<pre>
     1. c=3             -&gt;  3       6. f2(3)=17*3/2+8  -&gt; 33
     2. f1(3)=4*3/3+3   -&gt;  7       7. f1(28)=4*28/3+3 -&gt; 40
     3. f1(7)=4*7/3+3   -&gt; 12       8. f1(33)=4*33/3+3 -&gt; 47
     4. f1(12)=4*12/3+3 -&gt; 19       9. f1(40)=4*40/3+3 -&gt; 56
     5. f1(19)=4*19/3+3 -&gt; 28      10. f1(47)=4*47/3+3 -&gt; 65</pre>

<p>The tenth time is 65, which would be the proper answer for this set of inputs.</p>

### 입력

<ul>
	<li>Line 1: Two space-separated integers: c and N</li>
	<li>Line 2: Three space-separated integers: a1, b1, and d1</li>
	<li>Line 3: Three space-separated integers: a2, b2, and d2</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Line 1: A single line which contains a single integer which is the length of the Nth moo</li>
</ul>

<p>&nbsp;</p>