# [Platinum IV] The Genome Database of All Space Life - 4984

[문제 링크](https://www.acmicpc.net/problem/4984)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 26, 정답: 14, 맞힌 사람: 8, 정답 비율: 42.105%

### 분류

구현, 파싱, 재귀, 문자열

### 문제 설명

<p>In 2300, the Life Science Division of Federal Republic of Space starts a very ambitious project to complete the genome sequencing of all living creatures in the entire universe and develop the genomic database of all space life. Thanks to scientific research over many years, it has been known that the genome of any species consists of at most 26 kinds of molecules, denoted by English capital letters (i.e. A to Z).</p>

<p>What will be stored into the database are plain strings consisting of English capital letters. In general, however, the genome sequences of space life include frequent repetitions and can be awfully long. So, for efficient utilization of storage, we compress N-times repetitions of a letter sequence seq into N(seq), where N is a natural number greater than or equal to two and the length of seq is at least one. When seq consists of just one letter c, we may omit parentheses and write Nc.</p>

<p>For example, a fragment of a genome sequence:</p>

<pre>ABABABABXYXYXYABABABABXYXYXYCCCCCCCCCC</pre>

<p>can be compressed into:</p>

<pre>
4(AB)XYXYXYABABABABXYXYXYCCCCCCCCCC</pre>

<p>by replacing the first occurrence of <code>ABABABAB</code> with its compressed form. Similarly, by replacing the following repetitions of <code>XY</code>, <code>AB</code>, and <code>C</code>, we get:</p>

<pre>
4(AB)3(XY)4(AB)3(XY)10C</pre>

<p>Since <code>C</code> is a single letter, parentheses are omitted in this compressed representation. Finally, we have:</p>

<pre>
2(4(AB)3(XY))10C</pre>

<p>by compressing the repetitions of <code>4(AB)3(XY)</code>. As you may notice from this example, parentheses can be nested.</p>

<p>Your mission is to write a program that uncompress compressed genome sequences.</p>

### 입력

<p>The input consists of multiple lines, each of which contains a character string s and an integer i separated by a single space.</p>

<p>The character string s, in the aforementioned manner, represents a genome sequence. You may assume that the length of s is between 1 and 100, inclusive. However, of course, the genome sequence represented by s may be much, much, and much longer than 100. You may also assume that each natural number in s representing the number of repetitions is at most 1,000.</p>

<p>The integer i is at least zero and at most one million.</p>

<p>A line containing two zeros separated by a space follows the last input line and indicates the end of the input.</p>

### 출력

<p>For each input line, your program should print a line containing the i-th letter in the genome sequence that s represents. If the genome sequence is too short to have the i-th element, it should just print a zero. No other characters should be printed in the output lines. Note that in this problem the index number begins from zero rather than one and therefore the initial letter of a sequence is its zeroth element.</p>