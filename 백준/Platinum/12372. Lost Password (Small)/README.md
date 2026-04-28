# [Platinum II] Lost Password (Small) - 12372

[문제 링크](https://www.acmicpc.net/problem/12372)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 13, 정답: 10, 맞힌 사람: 7, 정답 비율: 70.000%

### 분류

오일러 경로, 오일러 경로 테크닉, 그래프 이론, 그리디 알고리즘, 트리

### 문제 설명

<p>Ashish has forgotten his password. He remembers that he used the following algorithm to create his password: Ashish took up to&nbsp;<strong>k</strong>&nbsp;consecutive words from a passage of text, and took the first letter from each word. Then, he might have changed some of the letters to their &quot;l33tspeak&quot; equivalents. Specifically, he might have changed &quot;o&quot; to &quot;0&quot;, &quot;i&quot; to &quot;1&quot;, &quot;e&quot; to &quot;3&quot;, &quot;a&quot; to &quot;4&quot;, &quot;s&quot; to &quot;5&quot;, &quot;t&quot; to &quot;7&quot;, &quot;b&quot; to &quot;8&quot; and/or &quot;g&quot; to &quot;9&quot;.</p>

<p>For example, if Ashish took his password from the first sentence of The Fellowship of the Ring --&nbsp;<em>&quot;This book is largely concerned with Hobbits, and from its pages a reader may discover much of their character and a little of their history&quot;</em>&nbsp;-- Ashish would have reduced that to &quot;tbilcwhafiparmdmotcaaloth&quot;. Then the password might be &quot;tbilcwh&quot;, &quot;7b1lcwh4f&quot;, &quot;a&quot;, &quot;4&quot;, or &quot;4al07h&quot;, etc.</p>

<p>Ashish has a special extension installed in his browser that will prevent his computer from uploading any string that contains his password. In order to figure out which passage of text he took his password from, Ashish has created a webpage to take advantage of this extension. Every second, the webpage will tell the browser to post a &quot;password string&quot; for a new passage of text: a string that contains all of the possible passwords that Ashish could have chosen from that passage of text. As soon as his browser fails to post such a string, Ashish will know where he took his password from.</p>

<p>For example, if&nbsp;<strong>k</strong>&nbsp;= 2 and the passage of text contains words starting with the letters &quot;google&quot;, then one password string for that passage is &quot;goo0og00gle9o909l3&quot;. All substrings of length &le; 2 from the original string, and all of their l33tspeak equivalents, are contained in the new string.</p>

<p>Given the first letters of the words in a passage of text, what is the minimum number of characters in the &quot;password string&quot; of that passage?</p>

### 입력

<p>The first line of the input gives the number of test cases,&nbsp;<strong>T</strong>.&nbsp;<strong>T</strong>&nbsp;test cases follow. Each test case consists of two lines. The first line contains the integer&nbsp;<strong>k</strong>. The second line contains a string&nbsp;<strong>S</strong>, representing the first letters of the words in a passage of text.&nbsp;<strong>S</strong>&nbsp;contains only the characters &#39;a&#39; - &#39;z&#39;, with no spaces.</p>

<h3>Limits</h3>

<ul>
	<li>1 &le;&nbsp;<strong>T</strong>&nbsp;&le; 20.</li>
	<li><strong>S</strong>&nbsp;will contain at least 2 *&nbsp;<strong>k</strong>&nbsp;characters.</li>
	<li>There will exist a password string with at most 10<sup>18</sup>&nbsp;characters.</li>
	<li><strong style="line-height:1.6em">S</strong><span style="line-height:1.6em">&nbsp;will contain at most 1000 characters.</span></li>
	<li><strong>k</strong>&nbsp;= 2.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the case number (starting from 1) and y is the minimum number of characters in the password string for&nbsp;<strong>S</strong>.</p>

### 힌트

<p>In the first sample input, one possible password string is &quot;0ppop0&quot;.<br />
In the second sample input, one possible password string is &quot;goo0og00gle9o909l3&quot;.</p>