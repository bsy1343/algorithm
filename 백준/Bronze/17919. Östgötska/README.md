# [Bronze II] Östgötska - 17919

[문제 링크](https://www.acmicpc.net/problem/17919)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 229, 정답: 144, 맞힌 사람: 133, 정답 비율: 63.636%

### 분류

구현, 문자열

### 문제 설명

<p>Anders talks in the Swedish dialect of <em>&ouml;stg&ouml;tska</em>. Unfortunately, this makes it somewhat hard to get a programming job in the Swedish capital of Stockholm. The trendy Stockholm hipsters only accept applicants speaking the standard Swedish dialect, <em>rikssvenska</em>.</p>

<p>To increase his chances of passing interviews, he wishes to practice talking rikssvenska. To help him with this, he wants you to write a program that can determine whenever he accidentally reverts to speaking &ouml;stg&ouml;tska.</p>

<p>A simple way of determining if a sentence is written in &ouml;stg&ouml;tska is if at least $40\%$ of the words in the sentence contains the letter <code>&auml;</code>. For simplicity, this is encoded as the letter combination <code>ae</code> (meaning any appearance of the substring \texttt{ae} is to be regarded as an occurrence of the letter <code>&auml;</code>).</p>

### 입력

<p>The first and only line of input contains a sequence of space-separated words. Each word consists only of letters <code>a-z</code>. There are at most $100$ words, and each word contains at most $15$ letters <code>a-z</code> (meaning that the <code>ae</code>&nbsp;combination counts as two letters for this limit).</p>

### 출력

<p>Output &quot;<code>dae ae ju traeligt va&quot;</code>&nbsp;if the input sentence is in &ouml;stg&ouml;tska, otherwise output &quot;<code>haer talar vi rikssvenska</code>&quot;.</p>