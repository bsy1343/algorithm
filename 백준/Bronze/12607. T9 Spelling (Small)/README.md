# [Bronze I] T9 Spelling (Small) - 12607

[문제 링크](https://www.acmicpc.net/problem/12607)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 265, 정답: 152, 맞힌 사람: 133, 정답 비율: 63.636%

### 분류

구현, 문자열

### 문제 설명

<p>The Latin alphabet contains 26 characters and telephones only have ten digits on the keypad. We would like to make it easier to write a message to your friend using a sequence of keypresses to indicate the desired characters. The letters are mapped onto the digits as shown below. To insert the character&nbsp;<code>B</code>&nbsp;for instance, the program would press&nbsp;<code>22</code>. In order to insert two characters in sequence from the same key, the user must pause before pressing the key a second time. The space character&nbsp;<code>&#39; &#39;</code>&nbsp;should be printed to indicate a pause. For example,&nbsp;<code>2 2</code>&nbsp;indicates&nbsp;<code>AA</code>&nbsp;whereas&nbsp;<code>22</code>&nbsp;indicates&nbsp;<code>B</code>.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/12607.%E2%80%85T9%E2%80%85Spelling%E2%80%85(Small)/f2d22ae6.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12608/images-27.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

### 입력

<p>The first line of input gives the number of cases,&nbsp;<strong>N</strong>.&nbsp;<strong>N</strong>&nbsp;test cases follow. Each case is a line of text formatted as</p>

<pre>
desired_message</pre>

<p>Each message will consist of only lowercase characters&nbsp;<code>a-z</code>&nbsp;and space characters&nbsp;<code>&#39; &#39;</code>. Pressing zero emits a space.</p>

<p>Limits</p>

<ul>
	<li>1 &le;&nbsp;<strong>N</strong>&nbsp;&le; 100.</li>
	<li>1 &le; length of message in characters &le; 15.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #<strong>x</strong>: &quot; followed by the message translated into the sequence of keypresses.</p>