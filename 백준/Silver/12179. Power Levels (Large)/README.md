# [Silver I] Power Levels (Large) - 12179

[문제 링크](https://www.acmicpc.net/problem/12179)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 107, 정답: 80, 맞힌 사람: 63, 정답 비율: 77.778%

### 분류

수학, 구현, 시뮬레이션, 임의 정밀도 / 큰 수 연산

### 문제 설명

<p>A&nbsp;<em>multifactorial</em>&nbsp;-- that is, a number N followed by some nonzero number E of exclamation points -- is defined as the product of all&nbsp;<strong>positive</strong>&nbsp;numbers (N - K*E) for which K is a nonnegative integer. Normal factorials meet the definition of multifactorials, for example:<br />
<br />
5! = 5 * (5-1) * (5-2) * (5-3) * (5-4) = 120<br />
<br />
Here are the other multifactorials of 5:<br />
<br />
5!! equals 5 * (5-2) * (5-4) = 15<br />
<br />
5!!! equals 5 * (5-3) = 10<br />
<br />
5!!!! equals 5 * (5-4) = 5<br />
<br />
5 followed by five or more !s = 5<br />
<br />
5 with no exclamation points is not considered a multifactorial.<br />
<br />
The villainous Anima and her underling Minera love three things: multifactorials, yelling &quot;IT&#39;S OVER 9000&quot; followed by some number of exclamation points, and going around the universe looking for people to fight.<br />
<br />
When Anima and Minera encounter a potential opponent, Anima asks Minera to use her scanner device to determine the opponent&#39;s power level, which is always a positive integer that does not begin with any leading zeroes. Today, the display on Minera&#39;s scanner is blurry, and she can only tell Anima the number of digits&nbsp;<strong>D</strong>&nbsp;in the opponent&#39;s power level, and not what any of those digits are.<br />
<br />
Anima wants to yell IT&#39;S OVER followed by a multifactorial of 9000 to accurately describe the opponent&#39;s power level. She will never yell something that might not be true, and she will never use more exclamation points than she needs to. For example, if&nbsp;<strong>D</strong>&nbsp;= 31682, Anima can&#39;t yell IT&#39;S OVER 9000!, because she knows that 9000! also has 31682 digits and the opponent&#39;s power level might be a 31682-digit number that is less than or equal to 9000!. However, since 9000!! has fewer than 31682 digits, she can be confident that the opponent&#39;s power level is greater than 9000!!, so IT&#39;S OVER 9000!! is guaranteed to be true. Although the opponent&#39;s power level is also definitely greater than 9000!!!, 9000!!!!, and so on, she won&#39;t use more exclamation points than she needs to. So, in this example, she will yell IT&#39;S OVER 9000!!<br />
<br />
If there is no multifactorial of 9000 that is definitely less than the opponent&#39;s power level, Anima will remain dramatically silent. We represent dramatic silence as an ellipsis:&nbsp;<code>...</code><br />
<br />
What should Anima say?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;lines follow. Each contains a positive integer&nbsp;<strong>D</strong>, the number of digits in an opponent&#39;s power level.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 100.</li>
	<li>1 &le;&nbsp;<strong>D</strong>&nbsp;&le; 100000.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is either&nbsp;<code>...</code>&nbsp;if Anima must remain silent, or&nbsp;<code>IT&#39;S OVER 9000</code>&nbsp;followed by some positive number of exclamation points. Make sure your output exactly matches these specifications. You may wish to copy our apostrophe character into your code to avoid possible Unicode issues.</p>

### 힌트

<p>Note that sample cases 3 through 5 are outside the range of the Small data set.<br />
<br />
In Case #1, Anima knows that all multifactorials of 9000 are at least 9000, so the opponent&#39;s single-digit power level, whatever it is, can&#39;t exceed any of them.<br />
<br />
The output for Case #2, which is the largest possible input for the Small dataset, has 1990 exclamation points, in case you don&#39;t wish to count them.<br />
<br />
In Case #3, both 9000 with 156 exclamation points and 9000 with 157 exclamation points have 205 digits, whereas 9000 with 155 exclamation points has 207 digits. Anima could make the claim with either 156 or 157, but she always chooses as few exclamation points as possible. This output has 156 exclamation points.</p>