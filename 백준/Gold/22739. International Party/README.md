# [Gold I] International Party - 22739

[문제 링크](https://www.acmicpc.net/problem/22739)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 34, 정답: 6, 맞힌 사람: 5, 정답 비율: 17.857%

### 분류

자료 구조, 그래프 이론, 그래프 탐색, 너비 우선 탐색, 최단 경로, 비트마스킹, 분리 집합, 역추적

### 문제 설명

<p>Isaac H. Ives is attending an international student party (maybe for girl-hunting). Students there enjoy talking in groups with excellent foods and drinks. However, since students come to the party from all over the world, groups may not have a language spoken by all students of the group. In such groups, some student(s) need to work as interpreters, but intervals caused by interpretation make their talking less exciting.</p>

<p>Needless to say, students want exciting talks. To have talking exciting as much as possible, Isaac proposed the following rule: the number of languages used in talking should be as little as possible, and not exceed five. Many students agreed with his proposal, but it is not easy for them to find languages each student should speak. So he calls you for help.</p>

<p>Your task is to write a program that shows the minimum set of languages to make talking possible, given lists of languages each student speaks.</p>

### 입력

<p>The input consists of a series of data sets.</p>

<p>The first line of each data set contains two integers&nbsp;<i>N</i>&nbsp;(1 &le;&nbsp;<i>N</i>&nbsp;&le; 30) and&nbsp;<i>M</i>&nbsp;(2 &le;&nbsp;<i>M</i>&nbsp;&le; 20) separated by a blank, which represent the numbers of languages and students respectively. The following&nbsp;<i>N</i>&nbsp;lines contain language names, one name per line. The following&nbsp;<i>M</i>&nbsp;lines describe students in the group. The&nbsp;<i>i</i>-th line consists of an integer&nbsp;<i>K<sub>i</sub></i>&nbsp;that indicates the number of languages the&nbsp;<i>i</i>-th student speaks, and&nbsp;<i>K<sub>i</sub></i>&nbsp;language names separated by a single space. Each language name consists of up to twenty alphabetic letters.</p>

<p>A line that contains two zeros indicates the end of input and is not part of a data set.</p>

### 출력

<p>Print a line that contains the minimum number&nbsp;<i>L</i>&nbsp;of languages to be spoken, followed by&nbsp;<i>L</i>&nbsp;language names in any order. Each language name should be printed in a separate line. In case two or more sets of the same size is possible, you may print any one of them. If it is impossible for the group to enjoy talking with not more than five languages, you should print a single line that contains &ldquo;Impossible&rdquo; (without quotes).</p>

<p>Print an empty line between data sets.</p>