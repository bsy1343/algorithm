# [Silver III] Good Messages - 24815

[문제 링크](https://www.acmicpc.net/problem/24815)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 52, 정답: 27, 맞힌 사람: 23, 정답 비율: 54.762%

### 분류

구현, 시뮬레이션, 문자열

### 문제 설명

<p>Boris works at a secret communication station for the government training new employees on how to encode messages. Messages at this station are encoded with a rotation (&quot;Caesar&quot;) cipher that replaces each letter with one at a set offset in the alphabet, e.g., for offset $2$ an &#39;<code>a</code>&#39; is replaced by a &#39;<code>c</code>&#39; and &#39;<code>y</code>&#39; is replaced by &#39;<code>a</code>&#39;. In order to encode a message, this cipher may be applied more than once. Each such application counts as a step in the encoding process. Boris teaches the new employees to encode messages by demonstrating each step of the encoding individually. However, Boris does not does not like seeing messages that contain at least half as many vowels as consonants after applying an encoding step. (Boris considers &#39;<code>a</code>&#39;, &#39;<code>e</code>&#39;, &#39;<code>i</code>&#39;, &#39;<code>o</code>&#39;, &#39;<code>u</code>&#39;, and &#39;<code>y</code>&#39; as vowels). He grows annoyed and more and more unhappy with each step where this situation occurs.</p>

<p>Your job is to encode a given message and determine whether Boris will see fewer steps that annoy him than ones that don&#39;t. &nbsp;Since Boris wants to be happy in his job he will give a message that annoys him too much to a colleague.</p>

### 입력

<p>The input consists of a single test case. The first line of the input contains a single integer $O$ ($1 \le O \le 25$) that represent the offset used for the rotation cipher. The second line contains the message to encode, which consists entirely of lowercase English characters. The length of the message is between $1$ and $80$ characters. The third line will contain an integer $N$ ($1 \le N \le 26$), the number of times the cipher must be applied.</p>

### 출력

<p>Output &#39;<code>Boris</code>&#39; if strictly more steps sound good than bad, and &#39;<code>Colleague</code>&#39; otherwise.</p>