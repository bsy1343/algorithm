# [Gold IV] KMOP - 31761

[문제 링크](https://www.acmicpc.net/problem/31761)

### 성능 요약

시간 제한: 0.5 초, 메모리 제한: 1024 MB

### 통계

제출: 56, 정답: 34, 맞힌 사람: 33, 정답 비율: 61.111%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>You probably know the KMP algorithm. You may also know that &ldquo;<code>KMP</code>&rdquo; is an acronym that stands for &ldquo;<code>Knuth Morris Pratt</code>&rdquo;, who jointly published the algorithm in 1977. How do you pronounce &ldquo;<code>KMP</code>&rdquo;? Of course, you can just say &ldquo;<code>Knuth Morris Pratt</code>&rdquo;, but what about pronouncing the acronym itself? Since &ldquo;<code>KMP</code>&rdquo; is not a pronounceable word, you are forced to say the letters one by one. In this problem we are interested in pronounceable acronyms.</p>

<p>We need a few definitions to formalize the requirement. A phrase is a list of words and a word is a sequence of letters. Each letter is either a vowel or a consonant. Deciding whether a letter is a vowel or a consonant depends on the language and other elements. For simplicity, we say that the six letters &ldquo;<code>A</code>&rdquo;, &ldquo;<code>E</code>&rdquo;, &ldquo;<code>I</code>&rdquo;, &ldquo;<code>O</code>&rdquo;, &ldquo;<code>U</code>&rdquo; and &ldquo;<code>Y</code>&rdquo; are vowels, while all the rest are consonants. Although it is debatable whether a given word is pronounceable, we say that a word is pronounceable when it does not contain more than two contiguous consonants. For instance, &ldquo;<code>LEMPEL</code>&rdquo; is a pronounceable word, while &ldquo;<code>DIJKSTRA</code>&rdquo; is not.</p>

<p>Given a phrase composed of $N$ words, an acronym for the phrase is the concatenation of N prefixes, one prefix for each word, in the order they appear in the phrase. Each prefix must have at least one and at most three letters. Your task is to determine the minimum length a pronounceable acronym can have.</p>

<p>As an example with $N = 3$ consider the phrase &ldquo;<code>KNUTH MORRIS PRATT</code>&rdquo;. There are $27$ possible acronyms for this phrase, such as &ldquo;<code>KMP</code>&rdquo;, &ldquo;<code>KMPR</code>&rdquo;, &ldquo;<code>KMPRA</code>&rdquo;, &ldquo;<code>KMOP</code>&rdquo;, &ldquo;<code>KMOPR</code>&rdquo; and &ldquo;<code>KNUMORPRA</code>&rdquo;, among others. Some of these acronyms are pronounceable (&ldquo;<code>KMOP</code>&rdquo; and &ldquo;<code>KMOPR</code>&rdquo;), while some others not (&ldquo;<code>KMP</code>&rdquo;, &ldquo;<code>KMPR</code>&rdquo;, &ldquo;<code>KMPRA</code>&rdquo; and &ldquo;<code>KNUMORPRA</code>&rdquo;). Since the only three-letter acronym &ldquo;<code>KMP</code>&rdquo; is not pronounceable, it follows that &ldquo;<code>KMOP</code>&rdquo; is a minimum-length pronounceable acronym for the phrase.</p>

### 입력

<p>The first line contains a positive integer $N$ indicating the number of words in the phrase.</p>

<p>Each of the next $N$ lines contains a non-empty string made of uppercase letters representing a word in the phrase. Words are given in the order they appear in the phrase. The sum of the lengths of all the strings is at most $10^6$.</p>

### 출력

<p>Output a single line with an integer indicating the minimum length a pronounceable acronym can have, or the character &ldquo;<code>*</code>&rdquo; (asterisk) if no pronounceable acronym exists for the phrase.</p>