# [Silver III] Broken Calculator (Small) - 12194

[문제 링크](https://www.acmicpc.net/problem/12194)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 114, 정답: 60, 맞힌 사람: 40, 정답 비율: 46.512%

### 분류

구현, 다이나믹 프로그래밍, 백트래킹

### 문제 설명

<p>Alice is a smart student who is very good at math. She is attending a math class. In this class, the teacher is teaching the students how to use a calculator. The teacher will tell an integer to all of the students, and the students must type that exact number into their calculators. If someone fails to type the number, he or she will be punished for failing such an easy task!</p>

<p>Unfortunately, at the beginning of the class, Alice finds that her calculator is broken! She finds that some of the number buttons are totally broken, and only the &quot;multiply&quot; and &quot;equals&quot; operator buttons are available to use. So she can only use these buttons to get the number quickly.</p>

<p>For instance, the teacher may say the number &quot;60&quot;, while Alice&#39;s calculator can only type &quot;1&quot;, &quot;2&quot; and &quot;5&quot;. She could push the following buttons:</p>

<ul>
	<li>Button &quot;15&quot; (2 clicks)</li>
	<li>Button &quot;multiply&quot; (1 click)</li>
	<li>Button &quot;2&quot; (1 click)</li>
	<li>Button &quot;multiply&quot; (1 click)</li>
	<li>Button &quot;2&quot; (1 click)</li>
	<li>Button &quot;equals&quot; (1 click)</li>
</ul>

<p>This method requires 7 button clicks. However, if Alice uses &quot;12*5=&quot;, only 5 clicks are needed. Of course Alice wants to get the integer as fast as possbile, so she wants to minimize the number of button clicks. Your task is to help her find a way to get the required number quickly.</p>

### 입력

<p>The first line of the input gives a number <strong>T</strong>, the number of integers the teacher says. <strong>T</strong> test cases follow.</p>

<p>Each case contains two lines. The first line contains ten numbers each of which is only 0 or 1. the <strong>i</strong>th number (starting from 0) is &quot;1&quot; if the number <strong>i</strong> can be clicked, or &quot;0&quot; if it is broken. The second line contains only one number <strong>X</strong>, the integer the teacher tells everyone.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li><span style="line-height:1.6em">1 &le; </span><strong style="line-height:1.6em">X</strong><span style="line-height:1.6em"> &le; 100.</span></li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the minimum number of button clicks needed, or &quot;Impossible&quot; if it is not possible to produce the number.</p>

### 힌트

<p>The first sample case is explained in problem statement.</p>

<p>In the second case, all digits are available, so Alice can just press &quot;1&quot;, &quot;2&quot;, &quot;8&quot; and then &quot;equals&quot; to get the result. Please note that she still needs to press &quot;equals&quot; in the last step, even though there are no calculations.</p>

<p>For the last case, it&#39;s impossible since Alice cannot input any even numbers.</p>