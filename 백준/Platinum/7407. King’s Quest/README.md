# [Platinum II] King’s Quest - 7407

[문제 링크](https://www.acmicpc.net/problem/7407)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 19, 정답: 10, 맞힌 사람: 7, 정답 비율: 43.750%

### 분류

이분 매칭, 그래프 이론, 강한 연결 요소

### 문제 설명

<p>Once upon a time there lived a king and he had $N$ sons. And there were $N$ beautiful girls in the kingdom and the king knew about each of his sons which of those girls he did like. The sons of the king were young and light-headed, so it was possible for one son to like several girls.</p>

<p>So the king asked his wizard to find for each of his sons the girl he liked, so that he could marry her. And the king&#39;s wizard did it --- for each son the girl that he could marry was chosen, so that he liked this girl and, of course, each beautiful girl had to marry only one of the king&#39;s sons.&nbsp;</p>

<p>However, the king looked at the list and said: &quot;I like the list you have made, but I am not completely satisfied. For each son I would like to know all the girls that he can marry. Of course, after he marries any of those girls, for each other son you must still be able to choose the girl he likes to marry.&quot;</p>

<p>The problem the king wanted the wizard to solve had become too hard for him. You must save wizard&#39;s head by solving this problem.</p>

### 입력

<p>The first line of the input file contains $N$ --- the number of king&#39;s sons (${1 \le N \le 2000}$). Next $N$ lines for each of king&#39;s sons contain the list of the girls he likes: first $K_i$ --- the number of those girls, and then $K_i$ different integer numbers, ranging from $1$ to $N$ denoting the girls. The sum of all $K_i$ does not exceed~$200\,000$.</p>

<p>The last line of the input file contains the original list the wizard had made --- $N$ different integer numbers: for each son the number of the girl he would marry in compliance with this list. It is guaranteed that the list is correct, that is, each son likes the girl he must marry according to this list.</p>

### 출력

<p>Output $N$ lines. For each king&#39;s son first print $L_i$ --- the number of different girls he likes and can marry so that after his marriage it is possible to marry each of the other king&#39;s sons. After that print $L_i$ different integer numbers denoting those girls, in arbitrary order.</p>