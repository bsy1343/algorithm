# [Bronze I] W**h y**r mouth out with s**p - 9227

[문제 링크](https://www.acmicpc.net/problem/9227)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 353, 정답: 133, 맞힌 사람: 102, 정답 비율: 42.857%

### 분류

구현, 문자열, 시뮬레이션

### 문제 설명

<p>There are many terms that people find offensive and nowadays it is easy to automate the process of eliminating these words, regardless of where they may occur. These offensive words are usually called four-letter words, chiefly because they are, but for this program we will look at any successive four letters, regardless of whether they are a word on their own or part of a larger word.</p>

<p>Of course, the exact terms that are deemed to be offensive depends on the listener &mdash; I am sure there are many of you who find the word &lsquo;work&rsquo; at least disturbing, if not actually offensive. Thus the list of terms will be specified. Further, because these terms are so offensive, they cannot ever be specified explicitly, so they will in fact be referred to their first and last letters only.</p>

<p>For example, if the list of offensive words included &lsquo;st&rsquo;, &lsquo;fk&rsquo;, &lsquo;dn&rsquo;, and &lsquo;ct&rsquo;, then the sentence: &lsquo;I cantered down to the shuttered shop to buy a fork.&rsquo; becomes&lsquo;I c**tered d**n to the s**ttered shop to buy a f**k.&rsquo;</p>

### 입력

<p>Input will consist of a &lsquo;dictionary&rsquo;, a list of no more than 20 words specified as pairs of lower case letters terminated by a line containing two # characters. This will be followed by a paragraph to be sanitised. Each line of the paragraph will contain no more than 60 characters. No word will straddle a line break. The paragraph will be terminated by a # on a line by itself.</p>

### 출력

<p>Output will be the sanitised version of the given paragraph. Replace all sequences of four letters (no white space, punctuation marks or other characters) which are bounded by one of the pairs given in the dictionary, by ** in the central positions. All other characters, including formatting characters such as tabs and new line characters are to be left untouched. Words will be processed sequentially and overlapping sequences need not be considered.</p>