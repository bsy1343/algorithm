# [Silver IV] Tavan - 13718

[문제 링크](https://www.acmicpc.net/problem/13718)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 32 MB

### 통계

제출: 218, 정답: 88, 맞힌 사람: 81, 정답 비율: 49.091%

### 분류

수학, 문자열, 정렬, 조합론

### 문제 설명

<p>Little Željko has been reading his grandma&rsquo;s old letters in the attic and has come across a&nbsp;word of length N. Unfortunately, he couldn&rsquo;t make out what it said because of the spilled ink.&nbsp;He rewrote the word on a piece of paper by replacing each of the M illegible letters with the&nbsp;character &lsquo;#&rsquo;. He handed the piece of paper to his grandma and she gave him K different&nbsp;candidates for each of the illegible letters. After that, Željko wrote all the possible words in a&nbsp;notebook and decided to closely look at their properties in order to determine what the&nbsp;original words was. After seeing the words written down in the notebook, his grandma&nbsp;realized that the word they&rsquo;re looking for is the Xth&nbsp;one in alphabetical order. Željko had the&nbsp;sniffles the day they learned the alphabet in school, so he&rsquo;s asking you for your help with&nbsp;determining the original word.&nbsp;</p>

### 입력

<p>The first line of input contains the integers N, M, K and X (1 &le; N &le; 500, 1 &le; M &le; N, 1 &le; K &le; 26,&nbsp;1 &le; X &le; 10<sup>9</sup>).<br />
The second line of input contains the word of length N that Željko wrote on a piece of paper,&nbsp;consisting of lowercase letters of the English alphabet and the character &lsquo;#&rsquo;.&nbsp;Each of the following M lines contains one word of length K, the ith&nbsp;of these words consisting&nbsp;of letters that could replace the ith illegible letter.</p>

<p>Number X will always be less than or equal to the total number of words that can be&nbsp;constructed.&nbsp;</p>

### 출력

<p>The first line of output must contain the Xth word in alphabetical order.&nbsp;</p>

### 힌트

<p>The possible words, in aphabetical order, are: &ldquo;pololjeni&rdquo;, &ldquo;pololjeui&rdquo;, &ldquo;pololjezi&rdquo;, &ldquo;poooljeni&rdquo;, &ldquo;poooljeui&rdquo;,&nbsp;&ldquo;poooljezi&rdquo;, &ldquo;posoljeni&rdquo;, &ldquo;posoljeui&rdquo;, &ldquo;posoljezi&rdquo;.&nbsp;</p>