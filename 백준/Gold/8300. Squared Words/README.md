# [Gold III] Squared Words - 8300

[문제 링크](https://www.acmicpc.net/problem/8300)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 135, 정답: 61, 맞힌 사람: 47, 정답 비율: 46.535%

### 분류

다이나믹 프로그래밍, 문자열

### 문제 설명

<p>A squared word is a word of the form <em>xx</em>, i.e., consisting of a sequence of letters repeated twice. Some examples of squared words in English are the words:&nbsp;<i>couscous</i>,&nbsp;<i>murmur</i>&nbsp;(= a low, continuous sound),&nbsp;<i>tartar</i>&nbsp;(= hardened dental plaque) and&nbsp;<i>hotshots</i>. We would like to find out, for a given word, how many letters should be removed from the word for it to become a squared word (however, not necessarily a correct English word).</p>

### 입력

<p>The first line of the standard input contains an integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1000), denoting the length of the word. The second line contains a word consisting of <em>n</em>&nbsp;lower case English letters.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer - the minimal number of letters that should be removed from the word for it to become a squared word. We assume that the empty word is a correct squared word.</p>

### 힌트

<p>If we remove the letters&nbsp;<code>y</code>,&nbsp;<code>s</code>,&nbsp;<code>o</code>,&nbsp;<code>s</code>,&nbsp;<code>k</code>,&nbsp;<code>o</code>&nbsp;and&nbsp;<code>p</code>, we obtain a squared word&nbsp;<code>tachtach</code>. In Polish, this word represents a (not really well known) kind of a coach.</p>