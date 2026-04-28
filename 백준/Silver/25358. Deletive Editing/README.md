# [Silver I] Deletive Editing - 25358

[문제 링크](https://www.acmicpc.net/problem/25358)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 81, 정답: 65, 맞힌 사람: 58, 정답 비율: 79.452%

### 분류

구현, 문자열

### 문제 설명

<p>Daisy loves playing games with words. Recently, she has been playing the following Deletive Editing word game with Daniel.</p>

<p>Daisy picks a word, for example, &quot;<code>DETERMINED</code>&quot;. On each game turn, Daniel calls out a letter, for example, &#39;<code>E</code>&#39;, and Daisy removes <strong>the first occurrence</strong> of this letter from the word, getting &quot;<code>DTERMINED</code>&quot;. On the next turn, Daniel calls out a letter again, for example, &#39;<code>D</code>&#39;, and Daisy removes its first occurrence, getting &quot;<code>TERMINED</code>&quot;. They continue with &#39;<code>I</code>&#39;, getting &quot;<code>TERMNED</code>&quot;, with &#39;<code>N</code>&#39;, getting &quot;<code>TERMED</code>&quot;, and with &#39;<code>D</code>&#39;, getting &quot;<code>TERME</code>&quot;. Now, if Daniel calls out the letter &#39;<code>E</code>&#39;, Daisy gets &quot;<code>TRME</code>&quot;, but there is no way she can get the word &quot;<code>TERM</code>&quot; if they start playing with the word &quot;<code>DETERMINED</code>&quot;.</p>

<p>Daisy is curious if she can get the final word of her choice, starting from the given initial word, by playing this game for zero or more turns. Your task it help her to figure this out.</p>

### 입력

<p>The first line of the input contains an integer $n$ --- the number of test cases ($1 \le n \le 10\,000$). The following $n$ lines contain test cases.</p>

<p>Each test case consists of two words $s$ and $t$ separated by a space. Each word consists of at least one and at most 30 uppercase English letters; $s$ is the Daisy&#39;s initial word for the game; $t$ is the final word that Daisy would like to get at the end of the game.</p>

### 출력

<p>Output $n$ lines to the output --- a single line for each test case. Output &quot;<code>YES</code>&quot; if it is possible for Daisy to get from the initial word $s$ to the final word $t$ by playing the Deletive Editing game. Output &quot;<code>NO</code>&quot; otherwise.</p>