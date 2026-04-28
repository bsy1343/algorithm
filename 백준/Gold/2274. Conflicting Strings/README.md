# [Gold I] Conflicting Strings - 2274

[문제 링크](https://www.acmicpc.net/problem/2274)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 11, 맞힌 사람: 9, 정답 비율: 33.333%

### 분류

그래프 이론, 휴리스틱, 문자열

### 문제 설명

<p>In 2417 archaeologists discovered a large collection of 20th century text documents of vital historical importance. Although there were many duplicated documents it was soon evident that, as well as the damage due to time making much of the text illegible, there were also some disagreements between them. However, it was noticed that groups of texts could be made consistent, i.e. consistency between texts could be achieved by leaving out some (small) number of texts. For example, the texts:</p>

<p><code>ap***<br />
ab*le<br />
app*e<br />
*p**e </code></p>

<p>(where * denotes an illegible character) can be made consistent by removing just the second text.</p>

### 입력

<p>Input will consist of a sequence of sets of texts. Each set will begin with a line specifying the number of texts in the set, and the maximum number of texts which can be removed. This will be followed by the individual texts, one per line. Each text consists of at least one and no more than 250 characters, either lower case letters or asterisks. All the texts in a set will be the same length and there will be no more than 10,000 texts in a set. The sequence of sets is terminated by a line containing two zeros (0 0).</p>

### 출력

<p>Output for each set consists of a line containing one of the words &lsquo;Yes&rsquo; or &lsquo;No&rsquo; depending on whether or not the set can be made consistent by removing at most the specified number of texts.</p>

### 힌트

<p>&nbsp;</p>

<p>&nbsp;</p>