# [Platinum V] Anagramistica - 21223

[문제 링크](https://www.acmicpc.net/problem/21223)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 41, 정답: 36, 맞힌 사람: 34, 정답 비율: 87.179%

### 분류

조합론, 다이나믹 프로그래밍, 수학, 정수론, 정렬

### 문제 설명

<p>Biljana loves making crosswords. Her favourite type is the so called anagram crossword, where each clue is an anagram of the required solution.</p>

<p>She has a set of n words that she thinks would be good candidates for her next puzzle. We say that two words are <em>similar</em> if one can be obtained from the other by rearranging the letters (i.e. they are anagrams). She wants to select a subset of her words, such that there are <strong>exactly k pairs of similar words</strong> in that subset. Help Biljana determine the number of such subsets.</p>

### 입력

<p>The first line contains integers n (1 &le; n &le; 2000) and k (0 &le; k &le; 2000), the number of words and the required number of similar pairs.</p>

<p>Each of the following n lines contains a word consisting of at most 10 lowercase letters. All words will be distinct.</p>

### 출력

<p>Output the number of described subsets modulo 10<sup>9</sup> + 7.</p>