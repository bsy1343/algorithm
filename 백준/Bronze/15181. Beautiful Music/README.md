# [Bronze II] Beautiful Music - 15181

[문제 링크](https://www.acmicpc.net/problem/15181)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 348, 정답: 252, 맞힌 사람: 211, 정답 비율: 72.509%

### 분류

구현, 문자열

### 문제 설명

<p>Recently discovered on a distant planet, a race of aliens has music a bit like ours (notes A, B, C, D, E, F and G) but without any sharps or flats. Like our music, after G they start again at A.&nbsp;</p>

<p>To these aliens, beautiful music is any sequence of notes where the difference between 1 note and the next is 2, 4 or 6 notes above the previous note. Anything else is discordant and causes them discomfort.</p>

### 입력

<p>Each line of input contains a set of N notes with no spaces between them (0 &lt; N &lt;= 21). Each note will be one of the upper case letters between A and G inclusive. The final line of input will be a # symbol on its own. Do not process this line.&nbsp;</p>

<p>You must assume that a note is the next note of that letter above the previous note.&nbsp;</p>

### 출력

<p>For each line of input, if the notes follow the rule for being beautiful music, your output should be</p>

<pre>
That music is beautiful.</pre>

<p>Otherwise, the output should be</p>

<pre>
Ouch! That hurts my ears. </pre>