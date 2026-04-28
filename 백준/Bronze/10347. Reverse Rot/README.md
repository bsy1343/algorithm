# [Bronze II] Reverse Rot - 10347

[문제 링크](https://www.acmicpc.net/problem/10347)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 275, 정답: 231, 맞힌 사람: 197, 정답 비율: 86.404%

### 분류

구현, 문자열

### 문제 설명

<p>A very simplistic scheme, which was used at one time to encode information, is to rotate the characters within an alphabet and rewrite them. ROT13 is the variant in which the characters A-Z are rotated 13 places, and it was a commonly used insecure scheme that attempted to &quot;hide&quot; data in many applications from the late 1990&#39;s and into the early 2000&#39;s.</p>

<p>It has been decided by Insecure Inc. to develop a product that &quot;improves&quot; upon this scheme by first reversing the entire string and then rotating it. As an example, if we apply this scheme to string <kbd>ABCD</kbd> with a reversal and rotation of 1, after the reversal we would have <kbd>DCBA</kbd> and then after rotating that by 1 position we have the result <kbd>EDCB</kbd>.</p>

<p>Your task is to implement this encoding scheme for strings that contain only capital letters, underscores, and periods. Rotations are to be performed using the alphabet order:</p>

<pre>
    <kbd>ABCDEFGHIJKLMNOPQRSTUVWXYZ_.</kbd>
</pre>

<p>Note that underscore follows Z, and the period follows the underscore. Thus a forward rotation of 1 means &#39;A&#39; is shifted to &#39;B&#39;, that is, &#39;A&#39;&rarr;&#39;B&#39;, &#39;B&#39;&rarr;&#39;C&#39;, ..., &#39;Z&#39;&rarr;&#39;_&#39;, &#39;_&#39;&rarr;&#39;.&#39;, and &#39;.&#39;&rarr;&#39;A&#39;. Likewise a rotation of 3 means &#39;A&#39;&rarr;&#39;D&#39;, &#39;B&#39;&rarr;&#39;E&#39;, ..., &#39;.&#39;&rarr;&#39;C&#39;.</p>

### 입력

<p><span style="line-height:1.6em">Each input line will consist of an integer N, followed by a string. N is the amount of forward rotation, such that 1 &le; N &le; 27. The string is the message to be encrypted, and will consist of 1 to 40 characters, using only capital letters, underscores, and periods. The end of the input will be denoted by a final line with only the number 0.</span></p>

### 출력

<p>For each test case, display the &quot;encrypted&quot; message that results after being reversed and then shifted.</p>