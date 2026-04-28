# [Gold IV] Trending Topic - 9597

[문제 링크](https://www.acmicpc.net/problem/9597)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 29, 맞힌 사람: 25, 정답 비율: 39.062%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 누적 합, 트리를 사용한 집합과 맵, 파싱, 우선순위 큐

### 문제 설명

<p>Imagine you are in the hiring process for a company whose principal activity is the analysis of information in the Web. One of the tests consists in writing a program for maintaining up to date a set of trending topics. You will be hired depending on the efficiency of your solution.</p>

<p>They provide you with text from the most active blogs. The text is organised daily and you have to provide the sorted list of the N most frequent words during the last 7 days, when asked.</p>

### 입력

<p>Each input file contains one test case. The text corresponding to a day is delimited by tag &lt;text&gt;. Queries of top N words can appear between texts corresponding to two different days. A top N query appears as a tag like &lt;top 10 /&gt;. In order to facilitate you the process of reading from input, the number always will be delimited by white spaces, as in the sample.</p>

### 출력

<p>The list of N most frequent words during the last 7 days must be shown given a query. Words must appear in decreasing order of frequency and in alphabetical order when equal frequency. There must be shown all words whose counter of appearances is equal to the word at position N. Even if the amount of words to be shown exceeds N.</p>

### 제한

<ul>
	<li>All words are composed only of lowercase letters of size at most 20.</li>
	<li>The maximum number of different words that can appear is 20000.</li>
	<li>The maximum number of words per day is 20000.</li>
	<li>Words of length less than four characters are considered of no interest.</li>
	<li>The number of days will be at most 1000.</li>
	<li>1 &le; N &le; 20</li>
</ul>