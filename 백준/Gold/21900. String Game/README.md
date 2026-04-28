# [Gold II] String Game - 21900

[문제 링크](https://www.acmicpc.net/problem/21900)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 43, 정답: 31, 맞힌 사람: 30, 정답 비율: 71.429%

### 분류

문자열, 이분 탐색, 매개 변수 탐색

### 문제 설명

<p>Little Nastya has a hobby, she likes to remove some letters from word, to obtain another word. But it turns out to be pretty hard for her, because she is too young. Therefore, her brother Sergey always helps her.</p>

<p>Sergey gives Nastya the word $t$ and wants to get the word $p$ out of it. Nastya removes letters in a certain order, which is specified by permutation of letters&#39; indices of the word $t$: $a_1 \ldots a_{|t|}$ . Note that after removing one letter, the indices of other letters don&#39;t change. Sergey knows this permutation. His goal is to stop his sister at some point and continue removing by himself to get the word $p$. Since Nastya likes this activity, Sergey wants to stop her as late as possible. Your task is to determine, how many letters Nastya can remove before she will be stopped by Sergey.</p>

<p>It is guaranteed that the word $p$ can be obtained by removing the letters from word $t$.</p>

### 입력

<p>The first and second lines of the input file contain the words $t$ and $p$, respectively. Words are composed of lowercase letters of the Latin alphabet ($1 \le |p| &lt; |t| \le &nbsp;200 \, 000$) .</p>

<p>Next line contains a permutation $a_1 \ldots a_{|t|}$ of letter indices that specifies the order in which Nastya removes letters of $t$ ($1 \le a_i \le |t|$, all $a_i$ are distinct).</p>

### 출력

<p>Print a single integer number, the maximum number of letters that Nastya can remove.</p>

### 힌트

<p>Sequence of removing made by Nastya looks like this:</p>

<p>&quot;<code>ababcba</code>&quot; $\rightarrow$ &quot;<code>abab<s>c</s>ba</code>&quot; $\rightarrow$ &quot;<code>ab<s>a</s>b<s>c</s>ba</code>&quot; $\rightarrow$ &quot;<code>ab<s>abc</s>ba</code>&quot;&nbsp;</p>

<p>Nastya can not continue, because it is impossible to get word &quot;<code>abb</code>&quot; from word &quot;<code><s>a</s>b<s>abc</s>ba</code>&quot;.</p>

<p>So, Nastya will remove only three letters.</p>