# [Gold I] Chorus - 9792

[문제 링크](https://www.acmicpc.net/problem/9792)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 24, 맞힌 사람: 16, 정답 비율: 59.259%

### 분류

문자열, 브루트포스 알고리즘

### 문제 설명

<p>You suddenly remember part of a chorus of a song. You wonder which song has it in your list of n song lyrics.</p>

### 입력

<p>There are two parts in the input.</p>

<p>The first line of the first part of the input is an integer n (1&le; n &le;15), the number of songs in your database. Then, you will be given n strings in n lines that only contain lowercase alphabets [a..z].</p>

<p>Each string is a full lyric of a song without spaces, commas, periods, and any other non lowercase alphabet characters. We have simplified this input format to avoid unnecessary errors. We are using real songs in the test data, so you can expect that the length of the longest song in the list is less than 1500 characters.</p>

<p>Then, you will be given the second part of the input which starts with another integer q (1 &le; q &le; 20) that denotes the number of queries. Then, you will be given q short strings in q lines that only contain lowercase alphabets. Each query string is part of the song lyric, but not necessarily from the chorus.</p>

<p>Here we define chorus of a song as &quot;the longest substring in that song lyric that appears more than once&quot;.</p>

### 출력

<p>For each query string, output a list of song indices that have that query string in its chorus in one line. Here we define that a query string is found in a chorus if it is a substring of the chorus. If there are more than one song found, separate their indices by a single space.</p>

<p>Note: There is no space at the end of the output and song number starts from 0. If there is no song with such chorus, output &quot;-1&quot; instead (without the quote).</p>

<p>We guarantee that the output is unique.</p>

### 힌트

<p>To check if your understanding of &quot;chorus&quot; is correct, here are the chorus (without the quotes) of the four songs in the sample input according to our definition of chorus.</p>

<p>Song 0, &quot;<code>thisisthechorus</code>&quot;</p>

<p>Song 1, &quot;<code>chorusishere</code>&quot;</p>

<p>Song 2, &quot;<code>chorus</code>&quot;</p>

<p>Song 3, &quot;<code>againitwasdestinysgameforwhenlovefinallycameonirushedinlineonlytofindthatyouweregone</code>&quot;</p>

<p>Song 0, 1, and 2 are dummy songs to help you understand this problem.</p>

<p>Song 3 is a real song titled &quot;Beautiful Girl&quot;, sung by Filipino &quot;Jose Mari Chan&quot;. This is the song that inspired this problem.</p>