# [Platinum IV] Careful Declaration - 6644

[문제 링크](https://www.acmicpc.net/problem/6644)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 52, 정답: 11, 맞힌 사람: 11, 정답 비율: 25.000%

### 분류

다이나믹 프로그래밍, 최장 공통 부분 수열 문제

### 문제 설명

<p>&ldquo;Do not panic!&rdquo; That is not only the inscription on a famous book cover, but it is also a message that all banks need to deliver to their clients during every and each crisis, whatever negligible. If the clients started to panic, it would mean the end for any bank.</p>

<p>To calm down their clients, the banks and governments may issue various declarations stating that there is really nothing to worry about. It is very important for such declarations to be consistent, otherwise the people may not believe them.</p>

<p>Imagine that we have two declarations, one suggested by a bank and the other coming from the government. They finally decided to merge those two declarations into a single one and issue it together. (People may think there is some problem if there are too many declarations.) Both the bank and the government insist that the common declaration must contain the whole text of their original declarations.</p>

<p>Your task is to create the joint declaration that will be issued at a press conference tonight. The main condition is that the resulting text must contain all words from the two original proposals, in the same order. Also, we have to keep the declaration as short as possible.</p>

### 입력

<p>The input contains several test cases, each consisting of two lines of text giving two original declarations. Both lines contain at least one and at most two thousand words separated by a space. Each of the words is formed by lowercase letters of the English alphabet (a&ndash;z). Each word will contain at least one such letter and no more than 10 letters. There is a single dot (&ldquo;.&rdquo;) after the last word of each declaration, the dot is also preceded by one space.</p>

<p>There is one additional line with a single dot after the last test case in the input.</p>

### 출력

<p>Your program has to output a single line of text for each test case. The line should contain a sequence of words separated by a space. The sequence must have the following properties:</p>

<ol>
	<li>Both input texts are subsequences of the output text, i.e., all words of each original text appear in the result in the same order, though they may be interleaved by other words.</li>
	<li>Among all such possible texts, your output must contain the smallest possible number of words.</li>
	<li>If there are several possibilities of the same length, choose the one that is lexicographically smallest.</li>
</ol>

<p>Output a space and a single dot &ldquo;.&rdquo; after the last word of the declaration.</p>

<p>Text A is called to be lexicographically smaller than text B, if it &ldquo;would be first in a regular dictionary&rdquo;. More exactly, if the first word that is different in both texts is lexicographically smaller in text A than in text B.</p>

<p>Similarly, word C is called to be lexicographically smaller then word D, if (a) for the first letter that is different in both words, the letter in word C comes earlier in the alphabet than the letter in word D, or (b) word C is shorter and it is a prefix of word D.</p>