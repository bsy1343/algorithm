# [Platinum III] Catenyms - 4338

[문제 링크](https://www.acmicpc.net/problem/4338)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

그래프 이론, 문자열, 오일러 경로

### 문제 설명

<p>A catenym is a pair of words separated by a period such that the last letter of the first word is the same as the last letter of the second. For example, the following are catenyms:</p>

<pre>
dog.gopher
gopher.rat
rat.tiger
aloha.aloha
arachnid.dog</pre>

<p>A compound catenym is a sequence of three or more words separated by periods such that each adjacent pair of words forms a catenym. For example,</p>

<pre>
aloha.aloha.arachnid.dog.gopher.rat.tiger</pre>

<p>Given a dictionary of lower case words, you are to find a compound catenym that contains each of the words exactly once.</p>

### 입력

<p>The first line of standard input contains t, the number of test cases. Each test case begins with 3 &lt;= n &lt;= 1000 - the number of words in the dictionary. n distinct dictionary words follow; each word is a string of between 1 and 20 lowercase letters on a line by itself.</p>

### 출력

<p>For each test case, output a line giving the lexicographically least compound catenym that contains each dictionary word exactly once. Output &quot;***&quot; if there is no solution.</p>