# [Gold III] Syntax Included - 4557

[문제 링크](https://www.acmicpc.net/problem/4557)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 46, 정답: 17, 맞힌 사람: 13, 정답 비율: 61.905%

### 분류

자료 구조, 파싱, 정규 표현식, 스택, 문자열

### 문제 설명

<p>You are writing your first website and seem to be making your fair share of simple HTML syntax errors. You have decided to write an HTML parser to help you determine if your HTML code is syntactically correct based on the following condensed HTML definition:</p>

<table class="table table-bordered table-center-60">
	<tbody>
		<tr>
			<td><b>HTML CODE</b></td>
			<td>&lt;HTML&gt;<i><b>BODY</b></i>&lt;/HTML&gt;</td>
		</tr>
		<tr>
			<td><b>BODY</b></td>
			<td>&lt;BODY&gt;<i><b>TEXT</b></i>&lt;/BODY&gt;</td>
		</tr>
		<tr>
			<td><b>TEXT</b></td>
			<td><i><b>STRING</b></i>&nbsp;|&nbsp;<i><b>STRING TEXT</b></i>&nbsp;|&nbsp;<i><b>TAG</b></i>&nbsp;|&nbsp;<i><b>TAG TEXT</b></i></td>
		</tr>
		<tr>
			<td><b>STRING</b></td>
			<td>possibly empty string of printable characters other than &#39;&lt;&#39; and &#39;&gt;&#39;)</td>
		</tr>
		<tr>
			<td><b>TAG</b></td>
			<td><i><b>BOLD</b></i>&nbsp;|&nbsp;<i><b>ITALICS</b></i>&nbsp;|&nbsp;<i><b>LINK</b></i></td>
		</tr>
		<tr>
			<td><b>BOLD</b></td>
			<td>&lt;B&gt;<i><b>TEXT</b></i>&lt;/B&gt;</td>
		</tr>
		<tr>
			<td><b>ITALICS</b></td>
			<td>&lt;I&gt;<i><b>TEXT</b></i>&lt;/I&gt;</td>
		</tr>
		<tr>
			<td><b>LINK</b></td>
			<td>&lt;A HREF=<i><b>URL</b></i>&gt;<i><b>TEXT</b></i>&lt;/A&gt;</td>
		</tr>
		<tr>
			<td><b>URL</b></td>
			<td>http://<i><b>STRING</b></i>.com</td>
		</tr>
	</tbody>
</table>

### 입력

<p>The first line contains a single integer&nbsp;<i>n</i>&nbsp;indicating the number of data sets.</p>

<p>The following&nbsp;<i>n</i>&nbsp;lines each represent a data set and consists of up to 1000 characters. Spaces can be contained anywhere within the data set.</p>

<p>Note that all tags are case sensitive.</p>

### 출력

<p>If the code is syntactically correct, the following string will be printed:</p>

<p>&quot;Syntax Included&quot;</p>

<p>Otherwise the following string will be printed:</p>

<p>&quot;No Syntax Included&quot;</p>