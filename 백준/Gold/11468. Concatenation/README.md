# [Gold I] Concatenation - 11468

[문제 링크](https://www.acmicpc.net/problem/11468)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 121, 정답: 58, 맞힌 사람: 50, 정답 비율: 47.619%

### 분류

구현, 문자열, 애드 혹

### 문제 설명

<p>Famous programmer Gennady likes to create new words. One way to do it is to concatenate existing words. That means writing one word after another. For example, if he has words &ldquo;cat&rdquo; and &ldquo;dog&rdquo;, he would get a word &ldquo;catdog&rdquo;, that could mean something like the name of a creature with two heads: one cat head and one dog head.</p>

<p>Gennady is a bit bored of this way of creating new words, so he has invented another method. He takes a non-empty prefix of the first word, a non-empty suffix of the second word, and concatenates them. For example, if he has words &ldquo;tree&rdquo; and &ldquo;heap&rdquo;, he can get such words as &ldquo;treap&rdquo;, &ldquo;tap&rdquo;, or &ldquo;theap&rdquo;. Who knows what they could mean?</p>

<p>Gennady chooses two words and wants to know how many different words he can create using his new method. Of course, being a famous programmer, he has already calculated the answer. Can you do the same?</p>

### 입력

<p>Two lines of the input file contain words chosen by Gennady. They have lengths between 1 and 100 000 characters and consist of lowercase English letters only.</p>

### 출력

<p>Output one integer &mdash; the number of different words Gennady can create out of words given in the input file.</p>