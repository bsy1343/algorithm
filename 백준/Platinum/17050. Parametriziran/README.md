# [Platinum IV] Parametriziran - 17050

[문제 링크](https://www.acmicpc.net/problem/17050)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 18, 맞힌 사람: 14, 정답 비율: 51.852%

### 분류

비트마스킹, 자료 구조, 해시를 사용한 집합과 맵, 문자열, 집합과 맵

### 문제 설명

<p>A string of characters consisting of lowercase letters of the English alphabet and question marks is called a parameterized word (e.g., a??cd, bcd, ??). Two parameterized words are considered similar if the question mark symbols in both words can be replaced by arbitrary lowercase letters of the english alphabet so that the resulting strings are the same. For example, parameterized words a??? and ?b?a are similar because by replacing the question marks in both words it is possible to obtain the word abba.</p>

<p>Mirko has recently bought a collection of parametrized words. Among the N words found in the collection, Mirko is interested in how many pairs of similar parameterized words exist. All the words in the collection have the same number of characters, M, and it is possible that a word occurs multiple times in the collection.</p>

### 입력

<p>The first line contains the integer numbers N (1 &le; N &le; 50 000) and M (1 &le; M &le; 6).</p>

<p>Each of the following N lines contains one parameterized word from the collection with exactly M characters.</p>

### 출력

<p>Print the total number of similar pairs of parameterized words.</p>