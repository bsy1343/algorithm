# [Silver V] Word Amalgamation - 4675

[문제 링크](https://www.acmicpc.net/problem/4675)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 257, 정답: 172, 맞힌 사람: 143, 정답 비율: 67.453%

### 분류

자료 구조, 문자열, 브루트포스 알고리즘, 정렬, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>In millions of newspapers across the United States there is a word game called Jumble. The object of this game is to solve a riddle, but in order to find the letters that appear in the answer it is necessary to unscramble four words. Your task is to write a program that can unscramble words.</p>

### 입력

<p>The input file contains four parts: 1) a dictionary, which consists of at least one and at most 100 words, one per line; 2) a line containing XXXXXX, which signals the end of the dictionary; 3) one or more scrambled &#39;words&#39; that you must unscramble, each on a line by itself; and 4) another line containing XXXXXX, which signals the end of the file. All words, including both dictionary words and scrambled words, consist only of lowercase English letters and will be at least one and at most six characters long. (Note that the sentinel XXXXXX contains uppercase X&#39;s.) The dictionary is not necessarily in sorted order, but each word in the dictionary is unique.</p>

### 출력

<p>For each scrambled word in the input, output an alphabetical list of all dictionary words that can be formed by rearranging the letters in the scrambled word. Each word in this list must appear on a line by itself. If the list is empty (because no dictionary words can be formed), output the line &quot;NOT A VALID WORD&quot; instead. In either case, output a line containing six asterisks to signal the end of the list.</p>