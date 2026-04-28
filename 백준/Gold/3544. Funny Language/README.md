# [Gold III] Funny Language - 3544

[문제 링크](https://www.acmicpc.net/problem/3544)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 20, 맞힌 사람: 19, 정답 비율: 90.476%

### 분류

자료 구조, 그리디 알고리즘, 문자열, 정렬, 우선순위 큐

### 문제 설명

<p>There is a well know game with words. Given a word you have to write as many other words as possible using the letters from the given word. If the letter repeats multiple times in the original word, you can use it up to as many times in the new words. The order of letters in the original word does not matter. For example, given the word CONTEST you can write NOTE, NET, ON, TEST, SET, etc.</p>

<p>Now you are in charge of writing a new dictionary. Your task is to sneak n new words into it. You know in advance m words W<sub>i</sub> (1 &le; i &le; m) that you will have to play a game with and you need to figure out which new n words to add to the dictionary to maximize the total number of words you can write out of these m words.</p>

<p>More formally, find such a set of nonempty words S where |S| = n, W<sub>i</sub> &notin; S for any i, and &Sigma;<sub>1&le;i&le;m</sub>|S<sub>i</sub>| is maximal, where S<sub>i</sub> &sub; S is the set of words that can be written using letters from W<sub>i</sub>.</p>

### 입력

<p>The first line of the input file contains two integer numbers n (1 &le; n &le; 100) &mdash; the number of new words you can add to the dictionary and m (1 &le; m &le; 1 000) &mdash; the number of words you will play the game with. The following m lines contain original words. Each word consists of at most 100 uppercase letters from A to Z.</p>

### 출력

<p>Write to the output file n lines with a new word on a line.</p>