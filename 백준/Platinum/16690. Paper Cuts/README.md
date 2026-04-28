# [Platinum IV] Paper Cuts - 16690

[문제 링크](https://www.acmicpc.net/problem/16690)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 68, 정답: 28, 맞힌 사람: 25, 정답 비율: 69.444%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Tito has a paper strip with some letters written on it. He would like to rearrange the letters to form some other word. He does this by making some number of vertical cuts and then rearranging the remaining strips of paper. For example, a strip with letters</p>

<pre>
abbaaddccee</pre>

<p>can be cut into four pieces,</p>

<pre>
abb | aa | ddcc | ee</pre>

<p>and be put together in a different order:</p>

<pre>
aaabbeeddcc</pre>

<p>Given Tito&rsquo;s paper strip and the word he wants to form, determine the minimum number of cuts that Tito needs to make in order to construct the desired word.</p>

### 입력

<p>The first line of input contains a single string of lowercase letters, representing Tito&rsquo;s paper strip.</p>

<p>The second line of input contains a single string of lowercase letters, representing the word Tito wants to form by rearranging the letters.</p>

<p>It is guaranteed that the two lines consist of the same number of letters between 1 and 18 (inclusive), and that the letters consisting the two lines are exactly the same, i.e., it is always possible to reach Tito&rsquo;s desired word by rearranging the letters in the paper strip.</p>

### 출력

<p>Print, on a single line, the minimum number of cuts that Tito has to make.</p>