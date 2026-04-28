# [Bronze III] Counting Sheep - 7366

[문제 링크](https://www.acmicpc.net/problem/7366)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 649, 정답: 415, 맞힌 사람: 400, 정답 비율: 64.309%

### 분류

구현, 문자열

### 문제 설명

<p>After a long night of coding,&nbsp;Charles Pearson Peterson is having trouble sleeping. This is not only because he is still thinking about the problem he is working on but also due to drinking too much java during the wee hours. This happens frequently, so Charles has developed a routine to count sheep. Not the animal, but the word. Specically, he thinks of a list of words, many of which are close in spelling to &quot;sheep&quot;, and then counts how many actually are the word &quot;sheep&quot;. Charles is always careful to be case-sensitive in his matching, so &quot;Sheep&quot; is not a match. You are to write a program that helps Charles count &quot;sheep&quot;.</p>

<p>&nbsp;</p>

### 입력

<p>Input will consist of multiple problem instances. The first line will consist of a single positive integer n &le; 20, which is the number of problem instances. The input for each problem instance will be on two lines. The first line will consist of a positive integer m &le; 10 and the second line will consist of m words, separated by a single space and each containing no more than 10 characters.</p>

### 출력

<p>For each problem instance, you are to produce one line of output in the format:</p>

<p>Case i: This list contains n sheep.</p>

<p>The value of i is the number of the problem instance (we assume we start numbering at 1) and n is the number of times the word &quot;sheep&quot; appears in the list of words for that problem instance. Output lines should be separated by a single blank line.</p>