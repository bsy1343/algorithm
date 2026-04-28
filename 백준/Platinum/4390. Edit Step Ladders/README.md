# [Platinum III] Edit Step Ladders - 4390

[문제 링크](https://www.acmicpc.net/problem/4390)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 5, 맞힌 사람: 4, 정답 비율: 57.143%

### 분류

자료 구조, 트리, 트라이

### 문제 설명

<p>An edit step is a transformation from one word x to another word y such that x and y are words in the dictionary, and x can be transformed to y by adding, deleting, or changing one letter. So the transformation from dig to dog or from dog to do are both edit steps. An edit step ladder is a lexicographically ordered sequence of words w1, w2, ... wn such that the transformation from wi to wi+1 is an edit step for all i from 1 to n-1.</p>

<p>For a given dictionary, you are to compute the length of the longest edit step ladder.</p>

### 입력

<p>The input to your program consists of the dictionary - a set of lower case words in lexicographic order - one per line. No word exceeds 16 letters and there are no more than 25000 words in the dictionary.</p>

### 출력

<p>The output consists of a single integer, the number of words in the longest edit step ladder.</p>