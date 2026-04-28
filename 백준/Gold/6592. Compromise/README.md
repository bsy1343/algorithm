# [Gold III] Compromise - 6592

[문제 링크](https://www.acmicpc.net/problem/6592)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 74, 정답: 20, 맞힌 사람: 12, 정답 비율: 21.818%

### 분류

다이나믹 프로그래밍, 해싱, 문자열

### 문제 설명

<p>In a few months the European Currency Union will become a reality. However, to join the club, the Maastricht criteria must be fulfilled, and this is not a trivial task for the countries (maybe except for Luxembourg). To enforce that Germany will fulfill the criteria, our government has so many wonderful options (raise taxes, sell stocks, revalue the gold reserves,...) that it is really hard to choose what to do.</p>

<p>Therefore the German government requires a program for the following task:</p>

<p>Two politicians each enter their proposal of what to do. The computer then outputs the longest common subsequence of words that occurs in both proposals. As you can see, this is a totally fair compromise (after all, a common sequence of words is something what both people have in mind).</p>

<p>Your country needs this program, so your job is to write it for us.</p>

### 입력

<p>The input file will contain several test cases.</p>

<p>Each test case consists of two texts. Each text is given as a sequence of lower-case words, separated by whitespace, but with no punctuation. Words will be less than 30 characters long. Both texts will contain less than 100 words and will be terminated by a line containing a single &#39;#&#39;.</p>

<p>Input is terminated by end of file.</p>

### 출력

<p>For each test case, print the longest common subsequence of words occuring in the two texts. If there is more than one such sequence, any one is acceptable. Separate the words by one blank. After the last word, output a newline character.</p>