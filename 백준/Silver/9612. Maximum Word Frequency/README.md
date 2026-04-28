# [Silver IV] Maximum Word Frequency - 9612

[문제 링크](https://www.acmicpc.net/problem/9612)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 814, 정답: 624, 맞힌 사람: 572, 정답 비율: 77.193%

### 분류

자료 구조, 문자열, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>Term frequency&ndash;Inverse document frequency (tf-idf) is a numerical statistic which reflects the importance of words in a document collection. It is often used in information retrieval system. The number of times a word appears in the document (word frequency) is one of the major factors to acquire tf-idf.&nbsp;</p>

<p>You are asked to write a program to find the most frequent word in a document.&nbsp;</p>

### 입력

<p>The first line contains an integer n (1&le; n &le; 1000) which determines the number of words. The following n lines include the list of words, one word per line. A word contains only lower-case letters and it can contain up to 20 characters.&nbsp;</p>

### 출력

<p>Print out the word that has the highest frequency and its frequency, separated by a single space. If you get more than 2 results, choose only the one that comes later in the lexicographical order.&nbsp;</p>