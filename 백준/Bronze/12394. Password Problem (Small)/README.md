# [Bronze I] Password Problem (Small) - 12394

[문제 링크](https://www.acmicpc.net/problem/12394)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 58, 맞힌 사람: 53, 정답 비율: 80.303%

### 분류

수학, 브루트포스 알고리즘, 확률론

### 문제 설명

<p>I have a really long password, and sometimes I make a mistake when I type it. Right now I&#39;ve typed part of my password, but I might have made some mistakes. In particular, I might have pressed the wrong key while typing one or more of the previous characters. Given how likely I was to get each character right, what should I do?</p>

<p>I have three options:</p>

<ol>
	<li>Finish typing the password, then press &quot;enter&quot;. I know I&#39;ll type the rest of the characters perfectly. If it turns out that one of the earlier characters was wrong, I&#39;ll have to retype the whole thing and hit &quot;enter&quot; again -- but I know I&#39;ll get it right the second time.</li>
	<li>Hit &quot;backspace&quot; some number of times, deleting the last character(s) I typed, and then complete the password and press &quot;enter&quot; as in option 1. If one of the characters I didn&#39;t delete was wrong, I&#39;ll have to retype the whole thing and press &quot;enter&quot;, knowing I&#39;ll get it right the second time.</li>
	<li>Give up by pressing &quot;enter&quot;, retyping the password from the start, and pressing &quot;enter&quot; again. I know I&#39;ll get it right this time.</li>
</ol>

<p>&nbsp;</p>

<p>I want to minimize the&nbsp;<em>expected</em>&nbsp;number of keystrokes needed. Each character in the password costs 1 keystroke; each &quot;backspace&quot; costs 1 keystroke; pressing &quot;enter&quot; to complete an attempt or to give up costs 1 keystroke.</p>

<p><em>Note:</em>&nbsp;The &quot;expected&quot; number of keystrokes is the average number of keystrokes that would be needed if the same situation occurred a very large number of times. See the example below.</p>

<h3>Example</h3>

<p>Suppose my password is &quot;guest&quot; and I have already typed the first two characters, but I had a 40% chance of&nbsp;<em>making a mistake</em>&nbsp;when typing each of them. Then there are four cases:</p>

<ul>
	<li>I typed &quot;<code>gu</code>&quot; without error. This occurs with probability 0.6 * 0.6 = 0.36.</li>
	<li>I typed the &#39;g&#39; correctly but I made a mistake typing the &#39;u&#39;. Then I have two letters typed still, but the second one is wrong: &quot;<code>gX</code>&quot;. (Here, the &#39;X&#39; character represents a mistyped letter.) This occurs with probability 0.6 * 0.4 = 0.24.</li>
	<li>I typed the &#39;u&#39; correctly but I made a mistake typing the &#39;g&#39;: &quot;<code>Xu</code>&quot;. This occurs with probability 0.4 * 0.6 = 0.24.</li>
	<li>I made a mistake typing both letters, so I have two incorrect letters: &quot;<code>XX</code>&quot;. This occurs with probability 0.4 * 0.4 = 0.16.</li>
</ul>

<p>&nbsp;</p>

<p>I don&#39;t know how many mistakes I actually made, but for any strategy, I can calculate the&nbsp;<em>expected</em>&nbsp;number of keys required to use it. This is shown in the table below:</p>

<p>&nbsp;</p>

<table cellspacing="0" style="border-collapse:collapse; border-width:0pt; color:#000000; font-family:arial,sans-serif; font-size:small; margin:0px; padding:0px; vertical-align:top">
	<tbody>
		<tr>
			<td style="vertical-align:top">&nbsp;</td>
			<td style="vertical-align:top">&quot;<code>gu</code>&quot;&nbsp;&nbsp;&nbsp;</td>
			<td style="vertical-align:top">&quot;<code>gX</code>&quot;&nbsp;&nbsp;&nbsp;</td>
			<td style="vertical-align:top">&quot;<code>Xu</code>&quot;&nbsp;&nbsp;&nbsp;</td>
			<td style="vertical-align:top">&quot;<code>XX</code>&quot;&nbsp;&nbsp;&nbsp;</td>
			<td style="vertical-align:top">Expected</td>
		</tr>
		<tr>
			<td style="vertical-align:top">Probability</td>
			<td style="vertical-align:top">0.36</td>
			<td style="vertical-align:top">0.24</td>
			<td style="vertical-align:top">0.24</td>
			<td style="vertical-align:top">0.16</td>
			<td style="vertical-align:top">-</td>
		</tr>
		<tr>
			<td style="vertical-align:top">Keystrokes if I keep typing</td>
			<td style="vertical-align:top">4</td>
			<td style="vertical-align:top">10</td>
			<td style="vertical-align:top">10</td>
			<td style="vertical-align:top">10</td>
			<td style="vertical-align:top">7.84</td>
		</tr>
		<tr>
			<td style="vertical-align:top">Keystrokes if I press backspace once</td>
			<td style="vertical-align:top">6</td>
			<td style="vertical-align:top">6</td>
			<td style="vertical-align:top">12</td>
			<td style="vertical-align:top">12</td>
			<td style="vertical-align:top">8.4</td>
		</tr>
		<tr>
			<td style="vertical-align:top">Keystrokes if I press backspace twice&nbsp;&nbsp;</td>
			<td style="vertical-align:top">8</td>
			<td style="vertical-align:top">8</td>
			<td style="vertical-align:top">8</td>
			<td style="vertical-align:top">8</td>
			<td style="vertical-align:top">8</td>
		</tr>
		<tr>
			<td style="vertical-align:top">Keystrokes if I press enter right away</td>
			<td style="vertical-align:top">7</td>
			<td style="vertical-align:top">7</td>
			<td style="vertical-align:top">7</td>
			<td style="vertical-align:top">7</td>
			<td style="vertical-align:top">7</td>
		</tr>
	</tbody>
</table>

<p>&nbsp;</p>

<p>If I keep typing, then there is an 0.36 probability that I will need 4 keystrokes, and an 0.64 probability that I will need 10 keystrokes. If I repeated the trial many times, then I would use 4 keystrokes 36% of the time, and 10 keystrokes the remaining 64% of the time, so the average number of keystrokes needed would be 0.36 * 4 + 0.64 * 10 = 7.84. In this case however, it is better to just press enter right away, which requires 7 keystrokes.</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case begins with a line containing two integers,&nbsp;<strong>A</strong>&nbsp;and&nbsp;<strong>B</strong>.&nbsp;<strong>A</strong>&nbsp;is the number of characters that I have already typed, and&nbsp;<strong>B</strong>&nbsp;is the total number of characters in my password.</p>

<p>This is followed by a line containing&nbsp;<strong>A</strong>&nbsp;real numbers: p<sub>1</sub>, p<sub>2</sub>, ..., p<sub><strong>A</strong></sub>. p<sub>i</sub>&nbsp;represents the probability that I&nbsp;<em>correctly</em>&nbsp;typed the i<sup>th</sup>&nbsp;letter in my password. These real numbers will consist of decimal digits and at most one decimal point. The decimal point will never be the first or the last character in a number.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li>0 &le; p<sub>i</sub>&nbsp;&le; 1 for all i.</li>
	<li>1 &le;&nbsp;<strong>A</strong>&nbsp;&le; 3.</li>
	<li><strong>A</strong>&nbsp;&lt;&nbsp;<strong>B</strong>&nbsp;&le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the expected number of additional keystrokes I need, not counting the letters I have typed so far, and assuming I choose the optimal strategy. y must be correct to within an absolute or relative error of 10<sup>-6</sup>.</p>