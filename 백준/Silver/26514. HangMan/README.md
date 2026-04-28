# [Silver III] HangMan - 26514

[문제 링크](https://www.acmicpc.net/problem/26514)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 59, 정답: 19, 맞힌 사람: 18, 정답 비율: 33.333%

### 분류

구현

### 문제 설명

<p>In the classic blackboard game HangMan you are given a word and attempt to guess the word by choosing a series of letters. In this program, you must determine if the provided letters are contained in the word prior to a body figure being drawn. One body part is added for each letter not contained in the word. The body figure below consists of the head shown by the letter &quot;O&quot;, two body parts &quot;|&quot;, 2 arms shown by equal signs &quot;=&quot;, 2 hands shown by asterisks &quot;*&quot;, and legs shown using a forward slash &quot;/&quot;and a back slash &quot;\&quot;, 9 parts in all, drawn in order, top to bottom - from left to right, as shown below. Once all the letters of the word are found, the game ends and no further letters are read. The game also ends once the figure is completed. If no body parts are drawn, print the word &ldquo;SAFE&rdquo;.</p>

<pre>
  O
*=|=*
  |
 / \
</pre>

### 입력

<p>The first line contains a single positive integer, k, indicating the number of data sets. Each data set is on one line, and consists of a single word S (all capital letters), an integer N, followed by N distinct capital letters.</p>

### 출력

<p>The word and resulting hangman figure, according to the series of guesses provided by the letters. The body parts MUST align as shown, with the &quot;*&quot; on the left edge of the screen, and all other parts aligned accordingly. Exactly one blank line must follow each output.</p>