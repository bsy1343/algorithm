# [Silver III] Defining Moment - 4548

[문제 링크](https://www.acmicpc.net/problem/4548)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 53, 정답: 26, 맞힌 사람: 22, 정답 비율: 48.889%

### 분류

문자열, 많은 조건 분기

### 문제 설명

<p>As a homework assignment, you have been tasked with creating a program that provides the meanings for many different words. As you dislike the idea of writing a program that just prints definitions of words, you decide to write a program that can print definitions of many variations of just a handful of different root words. You do this by recognizing common prefixes and suffixes. Since your program is smart enough to recognize up to one prefix and one suffix per word, it can process many forms of each word, significantly reducing the number of rote definitions required.</p>

<p>For this problem, you&#39;ll be writing the prefix/suffix processing portion of the program.</p>

<p>Valid prefixes and their meanings are:</p>

<table class="table table-bordered" style="width:40%">
	<tbody>
		<tr>
			<td>anti&lt;word&gt;</td>
			<td>against &lt;word&gt;</td>
		</tr>
		<tr>
			<td>post&lt;word&gt;</td>
			<td>after &lt;word&gt;</td>
		</tr>
		<tr>
			<td>pre&lt;word&gt;</td>
			<td>before &lt;word&gt;</td>
		</tr>
		<tr>
			<td>re&lt;word&gt;</td>
			<td>&lt;word&gt; again</td>
		</tr>
		<tr>
			<td>un&lt;word&gt;</td>
			<td>not &lt;word&gt;</td>
		</tr>
	</tbody>
</table>

<p>Valid suffixes and their meanings are:</p>

<table class="table table-bordered" style="width:40%">
	<tbody>
		<tr>
			<td>&lt;word&gt;er</td>
			<td>one who &lt;word&gt;s</td>
		</tr>
		<tr>
			<td>&lt;word&gt;ing</td>
			<td>to actively &lt;word&gt;</td>
		</tr>
		<tr>
			<td>&lt;word&gt;ize</td>
			<td>change into &lt;word&gt;</td>
		</tr>
		<tr>
			<td>&lt;word&gt;s</td>
			<td>multiple instances of &lt;word&gt;</td>
		</tr>
		<tr>
			<td>&lt;word&gt;tion</td>
			<td>the process of &lt;word&gt;ing</td>
		</tr>
	</tbody>
</table>

<p>Note that suffixes are tied more tightly to their root word and should therefore be expanded last. For example, the word &quot;vaporize&quot; would be expanded through the following steps:</p>

<pre>
unvaporize
not vaporize
not change into vapor</pre>

<p>Of course, the definitions are not exactly right, but how much polish does the professor expect for a single homework grade?</p>

### 입력

<p>Input to this problem will begin with a line containing a single integer n indicating the number of words to define. Each of the following n lines will contain a single word. You need to expand at most one prefix and one suffix, and each word is guaranteed to have a non-empty root (i.e., if the prefix and/or suffix are removed, a non-empty string will remain). Each word will be composed of no more than 100 printable characters.</p>

### 출력

<p>For each word in the input, output the expanded form of the word by replacing the prefix and/or suffix with its meaning.</p>