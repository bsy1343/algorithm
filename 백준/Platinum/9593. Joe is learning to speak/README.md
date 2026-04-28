# [Platinum IV] Joe is learning to speak - 9593

[문제 링크](https://www.acmicpc.net/problem/9593)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 8, 맞힌 사람: 7, 정답 비율: 38.889%

### 분류

자료 구조, 해싱, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 트리, 트라이, 집합과 맵

### 문제 설명

<p>Joe is a 4-year-old child learning to speak his mother tongue. He tried to memorize every possible sentence in the language but he soon realized that the number of different sentences is unbounded. He decided to concentrate on memorizing the subsequences of size up to n and their meaning. Joe understands a sentence if he has previously memorized all its subsequences of size &le; n.</p>

<p>Every afternoon, Joe starts reading sentences one by one. He remembers everything he has learned in the previous days. After reading a sentence, he asks for every word he doesn&rsquo;t know and learns it. If he can&rsquo;t fully understand the sentence he asks for the meaning of the whole sequence. After this, he memorizes every subsequence of size up to n and reads the next sentence.</p>

<p>For example: supose that Joe memorizes only subsequences of 1 or 2 words and he already knows the sentences &ldquo;I live in a house&rdquo; and &ldquo;This is a green house&rdquo;. He will fully understand the sentence &ldquo;I live in a green house&rdquo;, since he already knows all the subsequences of size 1 and 2. However, if he decided to memorize subsequences up to size 3, he will ask for the meaning of the whole sentence because &ldquo;in a green&rdquo; is not a subsequence of size 3 in any previous sentence. Obviously, Joe always knows his name.</p>

### 입력

<p>Input consists of several cases, each case begins with a line indicating the maximum size n (2 &le; n &le; 5) that Joe can memorize.</p>

<p>The next lines contain the sentences with the previous knowledge Joe memorized in the previous days. The character * indicates the end of the previous knowledge. Below the *, there is a text containing several sentences that Joe is going to learn today. The symbol # indicates the end of the sentences that Joe is going to read today.</p>

<p>Both sections have up to 20000 different words. The sentences are separated with any of the following characters that will appear as a separate token in the input: . , : ; ? !</p>

<p>Each word has size at most 20. The maximum number of words per sentence is 100. The maximum number of sentences per section is 1000. Sentences may appear more than once.</p>

<p>All the words contain only roman letters, no numbers or other symbols are used except the sentence separators. Words that differ only on the case of the letters are considered the same. For example: Joe, JOE and joE represent the same word.</p>

### 출력

<p>For each test case, a line with the text Learning case C where C is the number of the case starting by 1. Outputs for different test cases should be separated by a blank line.</p>

<p>For every unknown word W he asks for the meaning with the following question: What does the word &quot;W&quot; mean? For every sentence S not understood by Joe, he asks What does the sentence &quot;S&quot; mean? Output both W and S the same case as they appear. The words in S must be separated with exactly 1 space.</p>