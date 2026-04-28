# [Platinum V] Book Borders - 11614

[문제 링크](https://www.acmicpc.net/problem/11614)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 245, 정답: 115, 맞힌 사람: 95, 정답 비율: 49.479%

### 분류

이분 탐색, 누적 합, 조화수

### 문제 설명

<p>A book is being typeset using a fixed width font and a simple greedy algorithm to fill each line. The book contents is just a sequence of words, where each word contains one or more characters.</p>

<p>Before typesetting, we choose a maximum line length and denote this value with m. Each line can be at most m characters long including the space characters between the words. The typesetting algorithm simply processes words one by one and prints each word with exactly one space character between two consecutive words on the same line. If printing the word on the current line would exceed the maximum line length m, a new line is started instead.</p>

<pre>
|its.a.long...|          |its.a.long.way|
|way.to.the...|          |to.the.top.if.|
|top.if.you...|          |you.wanna.rock|
|wanna.rock.n.|          |n.roll........|
|roll.........|
</pre>

<p>Text from the example input with maximum line lengths 13 and 14</p>

<p>You are given a text to be typeset and are experimenting with different values of the maximum line length m. For a fixed m, the leading sentence is a sentence (a sequence of words separated with a single space character) formed by the first words of lines top to bottom. In the example above, when the sample text is typeset with the maximum line length 14, the leading sentence is &ldquo;its to you n&rdquo;.</p>

<p>Given a text and two integers a and b, find the length of the leading sentence for every candidate maximum line length between a and b inclusive. The length of a sentence is the total number of characters it contains including the space characters.</p>

### 입력

<p>The first line contains the text to be typeset &ndash; a sequence of words separated by exactly one space character. Each word is a string consisting of one or more lowercase letters from the English alphabet.</p>

<p>The second line contains two integers a and b &ndash; the edges of the interval we are interested in, as described above.</p>

<p>It is guaranteed that 1 &le; w &le; a &le; b &le; z &le; 500 000, where w is the length of the longest word in the text and z is the total number of characters in the text including the space characters.</p>

### 출력

<p>Output b &minus; a + 1 lines &ndash; the k-th of those lines should contain a single integer &ndash; the total length of the leading sentence when the maximum line length is equal to a &minus; 1 + k.</p>