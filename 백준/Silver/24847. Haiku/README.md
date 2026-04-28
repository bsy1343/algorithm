# [Silver IV] Haiku - 24847

[문제 링크](https://www.acmicpc.net/problem/24847)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 51, 정답: 39, 맞힌 사람: 25, 정답 비율: 67.568%

### 분류

구현, 문자열, 브루트포스 알고리즘

### 문제 설명

<p>Haiku --- is a type of short form poetry originally from Japan. Traditional haiku consist of three phrases that contains $17$ phonetic units. First $5$ of them are on the first line, next $7$ of them are on the second line, and the last $5$ on the last line.</p>

<p>You have found a big text about haiku. However, there were no line breaks in it. You have already broken the text into words and now you want to find all potential haiku in it: segments of consecutive words that can form a haiku.</p>

<p>For simplicity, the following conventions are adopted in this problem. A word is a sequence of lowercase letters of the English alphabet. A phonetic unit is a sequence of consecutive vowels. Vowels are the letters &quot;<code>a</code>&quot;, &quot;<code>e</code>&quot;, &quot;<code>i</code>&quot;, &quot;<code>o</code>&quot; and &quot;<code>u</code>&quot;. For example, the word &quot;contest&quot; contains two phonetic units, and the word &quot;beautiful&quot; contains three of them.</p>

<p>The problem is to find the number of segments of consecutive words, which, if two line breaks are added to them after any two words, would form a haiku.</p>

<p>For example, there are two potential haiku in the text &quot;if the real beauties of sunset in a suspended moment call for the thunder forever&quot;:</p>

<blockquote>
<p style="text-align: center;">the real beauties of</p>

<p style="text-align: center;">sunset in a suspended</p>

<p style="text-align: center;">moment call for the</p>
</blockquote>

<p>and</p>

<blockquote>
<p style="text-align: center;">beauties of sunset</p>

<p style="text-align: center;">in a suspended moment</p>

<p style="text-align: center;">call for the thunder</p>
</blockquote>

### 입력

<p>The first line of inpit contains integer $n$ --- the number of words in text that you have found ($1 \le n \le {10}^5$). The next $n$ lines contain words of lowercase letters. The length of each word does not exceed $20$. It is guaranteed that each word contains at least one phonetic unit.</p>

### 출력

<p>Output the number of potential haiku in this text.</p>