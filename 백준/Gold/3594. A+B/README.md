# [Gold II] A+B - 3594

[문제 링크](https://www.acmicpc.net/problem/3594)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 58, 정답: 27, 맞힌 사람: 23, 정답 비율: 47.917%

### 분류

수학, 문자열

### 문제 설명

<p>The <em>Research Institute of Given Strings</em> (RIGS) is a well-known place where people investigate anything about strings. Peter works in the department of string operations of RIGS. His department invents different ways to add, multiply, divide strings and even to take a logarithm of a string based on another one.</p>

<p>Now Peter is involved in the new project concerning orthogonal strings. Peter proposed that two strings P = P<sub>1</sub>P<sub>2</sub>...P<sub>n</sub> and Q = Q<sub>1</sub>Q<sub>2</sub>...Q<sub>n</sub> of equal length n are called orthogonal, if P<sub>i</sub> &ne; Q<sub>i</sub> for each i in the range 1..n. String S of length n is called <em>orthogonal</em> to set of strings V = {V<sub>1</sub>, V<sub>2</sub>, . . . , V<sub>m</sub>} (each of length n too) if S is orthogonal to V<sub>j</sub> for any j in range 1..m.</p>

<p>Peter&rsquo;s task is to invent the operation of <em>orthogonal sum</em> of two given strings. The current Peter&rsquo;s proposal allows to add only strings on a basis of some set, if they are orthogonal to this set. To do this, Peter selects an arbitrary set of strings V such that all strings in V have the same length n. Then Peter takes all strings of length n orthogonal to V over a fixed alphabet and sorts them, thus obtaining a sorted sequence of strings T. Let&rsquo;s denote the length of sequence T as M, and enumerate the elements of this sequence as T<sub>0</sub>, T<sub>1</sub>, . . . , T<sub>M&minus;1</sub>. Now Peter says that the orthogonal sum of two strings A = T<sub>a</sub> and B = T<sub>b</sub>&nbsp;is a string C = T<sub>c</sub> where c = (a + b) mod M.</p>

<p>Your task is to find the orthogonal sum of two given strings A and B on the basis of a given set V over the alphabet of small English letters.</p>

### 입력

<p>The first line of the input file contains two integers: n &mdash; the length of each string (1 &le; n &le; 100 000) and k &mdash; the cardinality of V (1 &le; n &middot; k &le; 100 000). The next k lines contains strings V<sub>1</sub>, V<sub>2</sub>, . . . , V<sub>k</sub>.</p>

<p>The last two lines contain strings A and B of length n. All strings V<sub>j</sub>, A and B consist of small letters of English alphabet. It is guaranteed that A and B are orthogonal to V.</p>

### 출력

<p>Output the orthogonal sum of strings A and B on the basis V .</p>