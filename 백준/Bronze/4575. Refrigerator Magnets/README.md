# [Bronze II] Refrigerator Magnets - 4575

[문제 링크](https://www.acmicpc.net/problem/4575)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 469, 정답: 358, 맞힌 사람: 332, 정답 비율: 80.583%

### 분류

구현, 문자열

### 문제 설명

<p>Like many families with small children, my family&rsquo;s refrigerator is adorned with a set of alphabet magnets:&nbsp; 26 separate magnets, each containing one letter of the alphabet. These magnets can be rearranged to create words and phrases. I feel it is my parental duty to use these magnets to create messages that are witty and insightful, yet at the same time caring and supportive. Unfortunately, I am somewhat hindered in this task by the fact that I can only make phrases that use each letter once.</p>

<p>For example, a nice inspiring message to leave for the children might be, &ldquo;I LOVE YOU.&rdquo; Unfortunately, I cannot make this message using my magnets because it requires two letter &quot;O&quot;s. I can, however, make the message, &ldquo;I LOVE MUSTARD.&rdquo; Admittedly this message isn&#39;t as meaningful, but it does manage to not use any letters more than once.</p>

<p>You are to write a program that will look at a list of possible phrases and report which phrases can be written using refrigerator magnets.</p>

<p>Each line will be 60 characters or less, and will consist of one or more words separated by a single space each, with words using only uppercase letters (A&ndash;Z). There will not be any leading or trailing whitespace, and there will not be any blank lines.</p>

### 입력

<p>The input will consist of one or more lines, ending with a line that contains only the word &ldquo;END&rdquo;.</p>

### 출력

<p>Output only the lines which can be written in refrigerator magnets&mdash;that is, the lines which have no duplicate letters. Output them exactly the same as they were in the input&mdash;white spaces and all. Do not output the final &ldquo;END&rdquo; string.</p>